package it306project;
/**
 * @author Tariq Ullah & Ashraf Ullah
 *
 */
public class Course {
	String courseName;
	String courseTime;
	String courseProf;
	
	/**
	 * @param name
	 * @param time
	 * @param prof
	 */
	public Course(String name, String time, String prof) {
		this.courseName = name;
		this.courseTime = time;
		this.courseProf = prof;
	}
	
	/**
	 * @return
	 */
	public String getName() {
		return courseName;
	}
	
	/**
	 * @return
	 */
	public String getTime() {
		return courseTime;
	}
	
	/**
	 * @return
	 */
	public String getProf() {
		return courseProf;
	}
	
	
	
	/**
	 * return a string of the course info
	 */
	public String toString() {
		return "Course Name: " + courseName + " | " + "Course Time: " + courseTime + " | " + "Professor: " + courseProf + "\n";
	}
	
}
