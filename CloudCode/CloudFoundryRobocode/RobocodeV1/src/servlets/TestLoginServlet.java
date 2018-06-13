package servlets;


import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;


//@WebServlet("/TestLoginServlet")
public class TestLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String client_id = "testlogin";
	public static String client_secret = "testlogin";
	public static String authorization_base_url = "https://uaa.bosh-lite.com/oauth/authorize/";
	public static String token_url = "https://uaa.bosh-lite.com/oauth/token";
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		
		OAuthClientRequest request;
		try {
			setCertificate();
			request = OAuthClientRequest
					   .authorizationLocation(authorization_base_url)
					   .setClientId(client_id)
					   .setRedirectURI("http://robocode.bosh-lite.com/UAARedirectServlet")
					   .buildQueryMessage();
			request.getLocationUri();
			response.sendRedirect(request.getLocationUri());
		} catch (OAuthSystemException e) {
			e.printStackTrace();
		}catch (KeyManagementException | NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void setCertificate() throws NoSuchAlgorithmException, KeyManagementException {
		/*Managing the Certificate Issue */
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
		      public java.security.cert.X509Certificate[] getAcceptedIssuers() {
		        //return null;
		    	  /*InputStream inStream;
				try {
					inStream = new FileInputStream("cacerts");
					 CertificateFactory cf = CertificateFactory.getInstance("X.509");
			    	 X509Certificate cert = (X509Certificate)cf.generateCertificate(inStream);
			    	 inStream.close();
			    	 X509Certificate [] certs = {cert};
			    	 return certs;
				} catch (Exception e) {
					e.printStackTrace();
				}*/
		    	return null; 
		      }

		      public void checkClientTrusted(X509Certificate[] certs, String authType) {
		      }

		      public void checkServerTrusted(X509Certificate[] certs, String authType) {
		      }
		    } 
		};

		    SSLContext sc = SSLContext.getInstance("SSL");
		    sc.init(null, trustAllCerts, new java.security.SecureRandom());
		    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		    
	}

}
