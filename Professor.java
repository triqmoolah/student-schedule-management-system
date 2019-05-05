package it306Project2;

import java.util.ArrayList;

public class Professor {

	private String fname;
	private String lname;
	private String password;
	private String id;
	private ArrayList<String> roster = new ArrayList<String>();
	
	public Professor(String fname, String lname, String password, String id) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.id = id;
	}

	public String getFname() { return fname; }

	public void setFname(String fname) { this.fname = fname; }

	public String getLname() { return lname; }

	public void setLname(String lname) { this.lname = lname; }

	public String getPassword() { return password; }

	public void setPassword(String password) { this.password = password; }

	public String getId() { return id; }

	public void setId(String id) { this.id = id; }

	public String viewRoster() { 
		
		StringBuilder builder = new StringBuilder();
		for (String value : roster) {
		    builder.append(value + " \n");
		}
		
		String text = builder.toString();
		return text;
	}

	public void addCourse(String course) { roster.add(course); }
	
	public void dropCourse(String course) {
		
		for(int i=0; i<roster.size(); i++) {
			if(roster.get(i).equals(course))
				roster.remove(i);
			
		} 
	}
	
	
	public boolean searchCourses(String course) {
		for(int i=0; i<roster.size(); i++) {
			if(roster.get(i).equals(course))
				return true;
		} return false;
	}
	
	public String viewProfessorInfo() {
		return "Name: " + fname + " " + lname + " || " + "Professor ID: " + id + " || Password: " + password + "\nCourses:\n" + viewRoster() + "\n";
	}
	
	public String getFullName() {
		return fname + " " + lname;
	}
	
	

}