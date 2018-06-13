package servlets;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthAuthzResponse;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.c3.util.SessionHelper;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import pojo.apps.Apps;
import pojo.developer.Developers;
import pojo.manager.Manager;
import pojo.organizations.Orgs;
import pojo.spaces.Resources;
import pojo.spaces.Spaces;
import pojo.userdecodeInfo.UserDetails;

@WebServlet("/UAARedirectServlet")
public class UAARedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());

		try {
			TestLoginServlet.setCertificate();
			String accessToken = getAccessToken(request);
			if (accessToken == null || "".equals(accessToken)) {
				SessionHelper.invalidateSession(request);
				RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
				rd.forward(request, response);

			} else {
				
				//space name.
				
				SessionHelper.setToken(request, accessToken);
				List<Resources> spaceResources = getResourceSpace(accessToken);
				String spaceName = spaceResources.get(0).getEntity().getName();
				SessionHelper.setTenantName(request, spaceName);
				String space_guid = spaceResources.get(0).getMetadata().getGuid();
				
				//org name
				String orgName = getRequestOrgs(request, accessToken);
				//****************
				
				// Get user name
				String userName = getUserName(accessToken);
				SessionHelper.setUser(request, userName);
				getUserRole(request, space_guid, userName, accessToken);

				System.out.println("Token: " + SessionHelper.getToken(request));
				System.out.println("Space: " + SessionHelper.getTenantName(request));
				System.out.println("User: " + SessionHelper.getUser(request));
				System.out.println("Role: " + SessionHelper.getRole(request));
				System.out.println("ORG: " + SessionHelper.getOrgName(request));
				//**************
				
				if(TestLoginServlet.org.equals(orgName)) {
					if(TestLoginServlet.space.equals(spaceName)) {
						List<String> appList = getApps(accessToken, space_guid); 
						request.getSession().setAttribute("appList", appList);
						/*RequestDispatcher rd = request.getRequestDispatcher("/appList.jsp");
						rd.forward(request, response);*/
						System.out.println("happened");
						response.sendRedirect("/helloworld.jsp");
						
					}
					else {
						response.sendRedirect("/error2.jsp");
					}
				}
				else {
					response.sendRedirect("/error2.jsp");
				}
					//anything else then error
					
				
				
				
			}

		} catch (OAuthProblemException e) {
			e.printStackTrace();
		} catch (OAuthSystemException e) {
			e.printStackTrace();
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String getRequestOrgs(HttpServletRequest request, String accessToken)
			throws IOException, JsonParseException, JsonMappingException {
		Request requestOrgs = new Request.Builder().url("http://api.bosh-lite.com/v2/organizations").get()
				.addHeader("authorization", "bearer " + accessToken).addHeader("Accept", "application/json")
				.addHeader("Content-Type", "application/json").build();

		OkHttpClient clientOrgs = new OkHttpClient();
		Response responseOrgs = clientOrgs.newCall(requestOrgs).execute();
		String jsonOrgs = responseOrgs.body().string();
		ObjectMapper mapperOrgs = new ObjectMapper();
		Orgs orgObj = mapperOrgs.readValue(jsonOrgs, Orgs.class);
		List<pojo.organizations.Resources> orgResources = orgObj.getResources();
		String orgName = orgResources.get(0).getEntity().getName();
		SessionHelper.setOrgName(request, orgName);
		return orgName;
	}

	// Get Access Token
	public String getAccessToken(HttpServletRequest request) throws OAuthProblemException, OAuthSystemException {
		OAuthAuthzResponse oar;
		oar = OAuthAuthzResponse.oauthCodeAuthzResponse(request);
		String code = oar.getCode();
		System.out.println(code);
		OAuthClientRequest oAuthRequest = OAuthClientRequest.tokenLocation(TestLoginServlet.token_url)
				.setGrantType(GrantType.AUTHORIZATION_CODE).setClientId(TestLoginServlet.client_id)
				.setClientSecret(TestLoginServlet.client_secret)
				.setRedirectURI("http://helloworld1.bosh-lite.com/UAARedirectServlet").setCode(code)
				.buildQueryMessage();
		oAuthRequest.addHeader("Accept", "application/json");
		oAuthRequest.addHeader("Content-Type", "application/json");
		OAuthClient oAuthClient = new OAuthClient(new URLConnectionClient());
		OAuthJSONAccessTokenResponse oAuthResponse = oAuthClient.accessToken(oAuthRequest, OAuth.HttpMethod.POST);
		String accessToken = oAuthResponse.getAccessToken();
		return accessToken;
	}

	// Get Space Resources
	public List<Resources> getResourceSpace(String accessToken) throws IOException {
		Request request1 = new Request.Builder().url("http://api.bosh-lite.com/v2/spaces").get()
				.addHeader("authorization", "bearer " + accessToken).addHeader("Accept", "application/json")
				.addHeader("Content-Type", "application/json").build();

		OkHttpClient client = new OkHttpClient();
		Response response1 = client.newCall(request1).execute();
		String json1 = response1.body().string();
		ObjectMapper mapper1 = new ObjectMapper();
		Spaces spaceobj = mapper1.readValue(json1, Spaces.class);
		List<Resources> resources = spaceobj.getResources();
		return resources;
	}

	// Get User Name
	public static String getUserName(String accessToken) throws JsonParseException, JsonMappingException, IOException {
		String[] split_string = accessToken.split("\\.");
		String base64EncodedHeader = split_string[0];
		String base64EncodedBody = split_string[1];

		System.out.println("~~~~~~~~~ JWT Header ~~~~~~~");

		Base64.Decoder decoder = Base64.getDecoder();
		String header = new String(decoder.decode(base64EncodedHeader));
		System.out.println("JWT Header : " + header);

		System.out.println("~~~~~~~~~ JWT Body ~~~~~~~");
		String body = new String(decoder.decode(base64EncodedBody));
		System.out.println("JWT Body : " + body);
		ObjectMapper uimapperAuditors = new ObjectMapper();
		UserDetails userDetails = uimapperAuditors.readValue(body, UserDetails.class);
		return userDetails.getUser_name();

	}

	//Get User Role
	public String getUserRole(HttpServletRequest request, String space_guid, String userName, String accessToken)
			throws IOException {
		String userRole = null;
		Request request3 = new Request.Builder().url("http://api.bosh-lite.com/v2/spaces/" + space_guid + "/developers")
				.get().addHeader("authorization", "bearer " + accessToken).build();
		OkHttpClient uiClientDevelopers = new OkHttpClient();
		Response uiResponseDevelopers = uiClientDevelopers.newCall(request3).execute();
		String uiJsonDevelopers = uiResponseDevelopers.body().string();
		ObjectMapper uimapperDevelopers = new ObjectMapper();
		Developers userobjDevelopers = uimapperDevelopers.readValue(uiJsonDevelopers, Developers.class);

		List<pojo.developer.Resources> listResources = userobjDevelopers.getResources();

		boolean isSpaceDeveloper = false;
		for (pojo.developer.Resources resource : listResources) {
			if (resource.getEntity().getUsername().equals(userName)) {
				userRole = "spaceDeveloper";
				SessionHelper.setRole(request, "spaceDeveloper");
				isSpaceDeveloper = true;
				break;
			}
		}

		if (!isSpaceDeveloper) {

			Request request5 = new Request.Builder()
					.url("http://api.bosh-lite.com/v2/spaces/" + space_guid + "/auditors").get()
					.addHeader("authorization", "bearer " + accessToken).build();
			OkHttpClient uiClientAuditors = new OkHttpClient();
			Response uiResponseAuditors = uiClientAuditors.newCall(request5).execute();
			String uiJsonAuditors = uiResponseAuditors.body().string();
			ObjectMapper uimapperAuditors = new ObjectMapper();
			Manager userobjAuditors = uimapperAuditors.readValue(uiJsonAuditors, Manager.class);

			List<pojo.manager.Resources> listAuditorsResources = userobjAuditors.getResources();

			boolean isSpaceAuditor = false;
			for (pojo.manager.Resources resource : listAuditorsResources) {
				if (resource.getEntity().getUsername().equals(userName)) {
					userRole = "spaceAuditor";
					SessionHelper.setRole(request, "spaceAuditor");
					isSpaceAuditor = true;
					break;
				}
			}

			if (!isSpaceAuditor) {
				Request request4 = new Request.Builder()
						.url("http://api.bosh-lite.com/v2/spaces/" + space_guid + "/managers").get()
						.addHeader("authorization", "bearer " + accessToken).build();
				OkHttpClient uiClientManagers = new OkHttpClient();
				Response uiResponseManagers = uiClientManagers.newCall(request4).execute();
				String uiJsonManagers = uiResponseManagers.body().string();
				ObjectMapper uimapperManagers = new ObjectMapper();
				Manager userobjManagers = uimapperManagers.readValue(uiJsonManagers, Manager.class);

				List<pojo.manager.Resources> listManagerResources = userobjManagers.getResources();

				for (pojo.manager.Resources resource : listManagerResources) {
					if (resource.getEntity().getUsername().equals(userName)) {
						userRole = "spaceManager";
						SessionHelper.setRole(request, "spaceManager");
						break;
					}

				}
			}

		}
		return userRole;

	}
	
	public List<String> getApps(String accessToken, String space_guid) throws IOException {
		
		Request request1 = new Request.Builder().url("http://api.bosh-lite.com/v2/spaces/"+space_guid+"/apps").get()
				.addHeader("authorization", "bearer " + accessToken).addHeader("Accept", "application/json")
				.addHeader("Content-Type", "application/json").build();

		OkHttpClient client = new OkHttpClient();
		Response response1 = client.newCall(request1).execute();
		String json1 = response1.body().string();
		ObjectMapper mapper1 = new ObjectMapper();
		Apps apps = mapper1.readValue(json1, Apps.class);
		List<pojo.apps.Resources> resources = apps.getResources();
		List<String> appNames = new ArrayList<>();
		for(pojo.apps.Resources r : resources) {
			appNames.add(r.getEntity().getName());
		}
		return appNames;
	}

}
