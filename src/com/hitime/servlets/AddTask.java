package com.hitime.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddTask extends HttpServlet{	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String project = req.getParameter("project");
		String description = req.getParameter("description");
		
		out.print("<html>" +
				"	<p>project "+ project +" added</p>" +
				"	<p>task "+ name +" added</p>" +
				"	<p>"+ description +" </p>" +
				"</html>");
		out.close();
	}
}