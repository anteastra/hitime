package com.hitime.model;

import java.util.ArrayList;
import java.util.List;

public class Project {
	
	public int id = 0;
	public String name = "";
	public String description = "";

	public static List<Project> getProjects(){
		
		List<Project> result = new ArrayList<Project>();
		
		Project res = new Project();
		res.id = 1;
		res.name = "first";
		res.description = "first project";
		result.add(res);
		
		res = new Project();
		res.id = 2;
		res.name = "second";
		res.description = "second project";
		result.add(res);
		
		res = new Project();
		res.id = 3;
		res.name = "third";
		res.description = "third project";
		result.add(res);
		
		
		return result;		
	}
	
	public List<Task> getTasks(){
		
		List<Task> result = new ArrayList<Task>();
		
		Task res = new Task();
		res.id = 1;
		res.name = "first task";
		res.description = "first task description";
		result.add(res);
		
		res = new Task();
		res.id = 2;
		res.name = "second task";
		res.description = "second task description";
		result.add(res);
		
		res = new Task();
		res.id = 3;
		res.name = "third task";
		res.description = "third task description";
		result.add(res);		
		
		return result;		
	}
}
