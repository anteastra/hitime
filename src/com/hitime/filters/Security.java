package com.hitime.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class Security implements Filter{

	FilterConfig config;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession sess = req.getSession();
		Boolean auth = (Boolean) sess.getAttribute("authenticated");
		if (auth == null || (!auth.equals(true))){
			StringBuffer buf = req.getRequestURL();
			String reqStr = buf.toString();
			if (!(reqStr.endsWith(".css")||reqStr.endsWith(".ico")||reqStr.endsWith(".js")||reqStr.endsWith("/authenticate.do"))){
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else {
				chain.doFilter(request, response);
			}
			
		}else {			
			chain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig fconfig) throws ServletException {
		config = fconfig;		
	}

	@Override
	public void destroy() {
				
	}
}
