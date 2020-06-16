package com.ucmo.groupproject.SE5910.retailapplication.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

// 51. 
@Component
public class CustomizeAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	// 52.
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// set our response to OK status
		response.setStatus(HttpServletResponse.SC_OK);

		for (GrantedAuthority auth : authentication.getAuthorities()) {
			if ("ADMIN".equals(auth.getAuthority())) {
				response.sendRedirect("/notes");
			}
		}
	}

}
