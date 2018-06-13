package org.c3.util;

import javax.servlet.http.HttpServletRequest;

public class SessionHelper {
	
	public static String ACCESS_TOKEN_STR = "tokenName";
	public static String USER_STR = "user";
	public static String ROLE_STR = "Role";
	public static String TENANT_NAME ="spaceName";
	public static String ORG_NAME ="orgName";

	
	
	public static boolean hasValidToken(HttpServletRequest req) {
		
		boolean hasValidToken = false;
		String user = (String) req.getSession().getAttribute(ACCESS_TOKEN_STR);
		if(user!=null) hasValidToken = true;
		return hasValidToken;
		
	}
	
	public static String getTenantName(HttpServletRequest req) {
		return (String) req.getSession().getAttribute(TENANT_NAME);
	}
	
	public static void setTenantName(HttpServletRequest req,String name) {
		 req.getSession().setAttribute(TENANT_NAME,name);
	}
	
	public static String getToken(HttpServletRequest req) {
		return (String) req.getSession().getAttribute(ACCESS_TOKEN_STR);
	}
	public static void setToken(HttpServletRequest req,String name) {
		req.getSession().setAttribute(ACCESS_TOKEN_STR,name);
	}
	public static String getUser(HttpServletRequest req) {
		return (String) req.getSession().getAttribute(USER_STR);
	}
	public static void setUser(HttpServletRequest req,String name) {
		req.getSession().setAttribute(USER_STR,name);
	}
	public static String getRole(HttpServletRequest req) {
		return (String) req.getSession().getAttribute(ROLE_STR);
	}
	public static void setRole(HttpServletRequest req,String name) {
		req.getSession().setAttribute(ROLE_STR,name);
		
	}
	
	public static String getOrgName(HttpServletRequest req) {
		return (String) req.getSession().getAttribute(ORG_NAME);
	}
	
	public static void setOrgName(HttpServletRequest req,String name) {
		 req.getSession().setAttribute(ORG_NAME,name);
	}
	
	public static void invalidateSession(HttpServletRequest req) {
	  //invalidate all the session variables.
		setTenantName(req, null);
		setToken(req,null);
		setUser(req, null);
		setRole(req, null);
		setOrgName(req, null);
		req.getSession().invalidate();
	}

}
