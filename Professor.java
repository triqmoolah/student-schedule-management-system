package it306project;

/**
 * @author Tariq Ullah & Ashraf Ullah
 *
 */
public class Professor {

	private String profID;
	private String[] schedule = new String[10];
	private int ctr = 0;
	private String fname;
	private String lname;
	
	
	/**
	 * @param fname
	 * @param lname
	 * @param profID
	 */
	public Professor(String fname, String lname, String profID) {
		this.fname = fname;
		this.lname = lname;
		this.profID = profID;
	}
	
	/**
	 * @param course to be added to the professors schedule
	 */
	public void setCourse(String course) {
		schedule[ctr] = course;
	}
	
	/**
	 * @return
	 */
	public String getName() {
		return fname + " " + lname; 
	}
	
	/**
	 * @return
	 */
	public String getID() {
		return profID;
	}
	
	/**
	 * 
	 */
	public void getCourses() {
		for(int i=0; i < schedule.length; i++) {
			System.out.println(schedule[i]);
		}
	}


}
