package com.hitime.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hitime.model.Project;
import com.hitime.model.Task;

public class ShowTasks extends HttpServlet{
	
		
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
				
		List<Project> projects = Project.getProjects();
		List<Task> tasks = projects.get(0).getTasks();
		
		req.setAttribute("projects", projects);
		req.setAttribute("tasks", tasks);
		
		req.getRequestDispatcher("jsp/showtasks.jsp").forward(req, res);
		/*
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		
		
		out.println("<html>");
		out.println("<head>");
		printHeader(out);
		out.println("</head>");
		out.println("<body>");
		printBody(out);
		out.println("</body>");
		
		out.println("</html>");
		out.close();*/
	}

	private void printHeader(PrintWriter out) {
		out.println("<meta charset=\"utf-8\">");
		out.println("<title>Bootstrap, from Twitter</title>");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		out.println("<meta name=\"description\" content=\"\">");
		out.println("<meta name=\"author\" content=\"\">");
		out.println("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">");
		out.println("<link href=\"css/bootstrap-responsive.css\" rel=\"stylesheet\">");
		out.println("<link href=\"css/hitime.css\" rel=\"stylesheet\">");
		out.println("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">");
		out.println("");
		
	}

	private void printBody(PrintWriter out){
		out.println("<div class=\"container-fluid\">");
		out.println("	<div class=\"row-fluid\">");
		out.println("		<div class=\"span12\">");
		out.println("			<h3 class=\"text-info\">");
		out.println("				Show Tasks");
		out.println("			</h3>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("	<div class=\"row-fluid\">");
		out.println("		<div class=\"span4\">");
		out.println("			<ul class=\"nav nav-list well\">");
		out.println("				<li class=\"nav-header\">");
		out.println("					Projects");
		out.println("				</li>");		
		printProjects(out);						
		out.println("			</ul>");
		out.println("		</div>");
		
		out.println("		<div class=\"span8\">");
		out.println("			<ul class=\"nav nav-list\">");
		out.println("				<li class=\"nav-header\">");
		out.println("					Tasks");
		out.println("				</li>");
		printTasks(out);			
		out.println("			</ul>");
		out.println("		</div>");
		out.println("	</div>");
		out.println("</div>");
	}

	private void printTasks(PrintWriter out) {
		
		Project p = new Project();
		List<Task> list = p.getTasks();
		
		for (int i =0; i<list.size(); i++){
			if (i==0) {
				out.println("<li class=\"active\">");
			} else{
				out.println("<li>");
			}				
			out.println("	<a href=\"#\">"+list.get(i).name+"</a>");	
			out.println("</li>");
		}
	}

	private void printProjects(PrintWriter out) {
		
		List<Project> projects = Project.getProjects();
		
		for (int i =0; i<projects.size(); i++){
			if (i==0) {
				out.println("<li class=\"active\">");
			} else{
				out.println("<li>");
			}
			out.println("<a href=\"#\">"+projects.get(i).name+"</a>");
			out.println("</li>");			
		}
		
		
		
	}
}
