<%@ page import="java.util.*" %>
<%@ page import="com.hitime.model.*" %>
<html>
<head>
<meta charset="utf-8">
<title>Hitime - jsp</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-responsive.css" rel="stylesheet">
<link href="css/hitime.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">

</head>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<h3 class="text-info">
				Show Tasks
			</h3>
		</div>
	</div>
	<div class="row-fluid">
		<div class="span4">
			<ul class="nav nav-list well">
				<li class="nav-header">
					Projects
				</li>
				<%
					List projects = (List) request.getAttribute("projects");
					Iterator it = projects.iterator();
					while (it.hasNext()){
						out.print("<li ");
						Project pr = (Project)it.next();
						if (pr.isSelected){
							out.print("class=\"active\"");
						}
						out.print("><a href=\"#\">");
						out.print(pr.name);
						out.print("</a></li>");
					}				
				%>
			</ul>
		</div>
		<div class="span8">
			<ul class="nav nav-list">
				<li class="nav-header">
					Tasks
				</li>
				<%
					List tasks = (List) request.getAttribute("tasks");
					Iterator ittask = tasks.iterator();
					while (ittask.hasNext()){
						out.print("<li ");
						Task task = (Task)ittask.next();
						if (task.isSelected){
							out.print("class=\"active\"");
						}
						out.print("><a href=\"#\">");
						out.print(task.name);
						out.print("</a></li>");
					}				
				%>
			</ul>
		</div>
	</div>
</div>
</body>
</html>
