package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;


//@WebServlet("/TestLoginServlet")
public class TestLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String client_id = "triallogin";
	public static String client_secret = "trial";
	public static String authorization_base_url = "https://uaa.bosh-lite.com/oauth/authorize/";
	public static String token_url = "https://uaa.bosh-lite.com/oauth/token";
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AADFDSFSF");
		OAuthClientRequest request;
		try {
			request = OAuthClientRequest
					   .authorizationLocation(authorization_base_url)
					   .setClientId(client_id)
					   .setRedirectURI("http://localhost:8080/RobocodeV1/UAARedirectServlet")
					   .buildQueryMessage();
			request.getLocationUri();
			response.sendRedirect(request.getLocationUri());
		} catch (OAuthSystemException e) {
			e.printStackTrace();
		}
	}

}
