package com.hitime.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Projects extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		//getServletContext().getRequestDispatcher("/projects.html").forward(req, res);
		getServletContext().getRequestDispatcher("/projects_view").forward(req, res);
	}
}
