package it306Project2;

import java.util.ArrayList;

/**
 * @author Tariq Ullah & Ashraf Ullah
 *
 * This class allows a student to be created with a first name, last
 * name, password, and id as well as add/drop courses to their roster
 */
public class Student {

	private String fname;
	private String lname;
	private String password;
	private String id;
	private ArrayList<String> roster = new ArrayList<String>();

	/**
	 * default constructor
	 */
	public Student() {
		
	}
	
	/**
	 * constructor for student
	 * @param fname
	 * @param lname
	 * @param password
	 * @param id
	 */
	public Student(String fname, String lname, String password, String id) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.id = id;
	}

	/**
	 * get thr first name of the student
	 * @return
	 */
	public String getFname() {
		return fname;
	}

	/** 
	 * set the first name of the student
	 * @param fname
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * return the last name of the student
	 * @return
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * set the last name of the student
	 * @param lname
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * get the pass of the student
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * set the pass of the student
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * get the id of the student
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * set the id of the student
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * view a students list of classes
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
	 * add a course to the student roster
	 * @param course
	 */
	public void addCourse(String course) {
		roster.add(course);
	}

	/**
	 * drop a course from the students roster
	 * @param course
	 */
	public void dropCourse(String course) {

		for (int i = 0; i < roster.size(); i++) {
			if (roster.get(i).equals(course))
				roster.remove(i);

		}
	}

	/**
	 * search for a course in the roster
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
	 * view the full details of the student
	 * @return
	 */
	public String viewStudentInfo() {
		return "Name: " + fname + " " + lname + " || " + "Student ID: " + id + " || Password: " + password
				+ "\nCourses:\n" + viewRoster() + "\n";
	}

	/**
	 * return the full name of the student
	 * @return
	 */
	public String getFullName() {
		return fname + " " + lname;
	}

}
