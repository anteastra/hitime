package com.hitime.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddProjectShow extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.print("<html>" +
				"	<p>add project</p>" +
				"	<form action=\"AddProject\" method=\"post\" >" +
				"		Name: <input type=\"text\" name=\"name\" size=\"40\"/>" +
				"		<br>" +
				"		Description:" +
				"		<br>" +
				"		<textarea name=\"description\" cols=\"40\" rows=\"3\"></textarea>" +
				"		<br>" +
				"		<input type=\"submit\" value=\"create\" />" +
				"	</form>" +
				"</html>");
		out.close();
	}
}