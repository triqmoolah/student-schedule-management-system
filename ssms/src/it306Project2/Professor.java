package it306Project2;

import java.util.ArrayList;

/**
 * @author Tariq Ullah & Ashraf Ullah
 * This class allows a professor to be created with a first name, last
 * name, password, and id as well as add/drop courses to their roster
 *
 */
public class Professor {

	private String fname;
	private String lname;
	private String password;
	private String id;
	private ArrayList<String> roster = new ArrayList<String>();

	public Professor() {
		
	}
	
	/**
	 * @param fname
	 * @param lname
	 * @param password
	 * @param id
	 */
	public Professor(String fname, String lname, String password, String id) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String viewRoster() {

		StringBuilder builder = new StringBuilder();
		for (String value : roster) {
			builder.append(value + " \n");
		}

		String text = builder.toString();
		return text;
	}

	/**
	 * @param course
	 */
	public void addCourse(String course) {
		roster.add(course);
	}

	/**
	 * @param course
	 */
	public void dropCourse(String course) {

		for (int i = 0; i < roster.size(); i++) {
			if (roster.get(i).equals(course))
				roster.remove(i);

		}
	}

	/**
	 * @param course
	 * @return
	 */
	public boolean searchCourses(String course) {
		for (int i = 0; i < roster.size(); i++) {
			if (roster.get(i).equals(course))
				return true;
		}
		return false;
	}

	/**
	 * @return
	 */
	public String viewProfessorInfo() {
		return "Name: " + fname + " " + lname + " || " + "Professor ID: " + id + " || Password: " + password
				+ "\nCourses:\n" + viewRoster() + "\n";
	}

	/**
	 * @return
	 */
	public String getFullName() {
		return fname + " " + lname;
	}

}