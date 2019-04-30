package it306project;
/**
 * @author Tariq Ullah & Ashraf Ullah
 *
 */
public class Student extends User {
	
	private String fname;
	private String lname;
	private String studentID;
	private String[] schedule = new String[10];
	private int ctr = 0;
	
	/**
	 * @param fname
	 * @param lname
	 * @param studentID
	 */
	public Student(String fname, String lname, String studentID) {
		this.fname = fname;
		this.lname = lname;
		this.studentID = studentID;
	}
	
	/**
	 * @param course
	 */
	public void setCourse(String course) {
		schedule[ctr] = course;
	}
	
	/**
	 * 
	 */
	public void getCourses() {
		for(int i=0; i < schedule.length; i++) {
			System.out.println(schedule[i]);
		}
	}
	
	/**
	 * @return first and last name of student
	 */
	public String getName() {
		return fname + " " + lname; 
	}
	
	/**
	 * @return student ID
	 */
	public String getID() {
		return studentID;
	}
	
}
