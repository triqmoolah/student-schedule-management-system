package it306project;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Tariq Ullah & Ashraf Ullah
 *
 *         The admin has access to all methods in all classes.
 */
public class University {

	private ArrayList<Student> students = new ArrayList<Student>(); // Array List for the students in the university.
	FileWriter studentList; // writes the Array List of students to a text file to be locally stored.

	private ArrayList<Professor> profs = new ArrayList<Professor>(); // Array List for the professors in the university.
	FileWriter profList; // writes the Array List of professors to a text file to be locally stored.

	private ArrayList<Course> courses = new ArrayList<Course>(); // courses available at the university
	FileWriter courseList;

	/**
	 * Constructor for the university class.
	 */
	public University() {

	}

	// ================================================================================
	// Course Section
	// ================================================================================

	public void addCourse(Course course) {
		courses.add(course);
	}

	public void writeCourseList() {
		try {
			courseList = new FileWriter("src/it306project/courseList.txt");

			for (int i = 0; i < courses.size(); i++) {
				courseList.write(courses.get(i).toString());
			}
			courseList.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readCourseList() {

		try {
			String fileName = "src/it306project/courseList.txt";
			File file = new File(fileName);

			FileReader fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				// process the line
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public boolean searchCourses(String search) {
		for (int i = 0; i < courses.size(); i++) {
			if (courses.get(i).getName().equals(search))
				return true;
		}
		return false;
	}

	public String findCourseInfo(String course) {

		String line = null;
		try {
			String fileName = "src/it306project/courseList.txt";
			File file = new File(fileName);

			FileReader fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);

			
			while ((line = br.readLine()) != null) {
				if (line.contains(course)) {
					JOptionPane.showMessageDialog(null, line);
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return line;
	}

	// ================================================================================
	// Student Section
	// ================================================================================

	/**
	 * writes the student Array List to a text file to be stored on the local
	 * machine.
	 */
	public void writeStudentList() {

		try {

			studentList = new FileWriter("src/it306project/studentList.txt");
			for (int i = 0; i < students.size(); i++) {
				studentList.write(
						"Name: " + students.get(i).getName() + " | " + "Student ID: " + students.get(i).getID() + " | \n");
			}
			studentList.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * reads the text file of the student list database
	 */
	public void readStudentList() {

		try {
			String fileName = "src/it306project/studentList.txt";
			File file = new File(fileName);

			FileReader fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				// process the line
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * reads info on a specific student
	 */
	public String studentInfo(String id) {

		String line = null;
		try {
			String fileName = "src/it306project/studentList.txt";
			File file = new File(fileName);

			FileReader fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);

			while ((line = br.readLine()) != null) {
				if (line.contains(id)) {
					JOptionPane.showMessageDialog(null, line);
				}
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return line;
	}

	/**
	 * @param student to be enrolled in the university; requires a Student object.
	 * @return string message confirming the enrollment.
	 */
	public String addStudent(Student student) {
		students.add(student);
		return "Succesfully enrolled " + student.getName();
	}

	/**
	 * @param name of the student that is being searched for
	 * @return boolean value if the students name exists in the database.
	 */
	public boolean searchStudentName(String name) {

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name))
				return true;
		}
		return false;
	}

	/**
	 * @param id of the student that is being searched for
	 * @return boolean value if the students id exists in the database.
	 */
	public boolean searchStudentID(String id) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getID().equals(id))
				return true;
		}
		return false;
	}


	// ================================================================================
	// Professor Section
	// ================================================================================

	/**
	 * writes the Professor Array List to a text file to be stored on the local
	 * machine.
	 */
	public void writeProfList() {

		try {

			profList = new FileWriter("src/it306project/profList.txt");
			for (int i = 0; i < profs.size(); i++) {
				profList.write("Name: " + profs.get(i).getName() + " | " + "Prof ID: " + profs.get(i).getID() + " | \n");
			}
			profList.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * reads the text file of the professors list database
	 */
	public void readProfList() {

		try {
			String fileName = "src/it306project/profList.txt";
			File file = new File(fileName);

			FileReader fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				// process the line
				System.out.println(line);
			}
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param professor to be added to the university; requires a professor object.
	 * @return string message confirming the hire
	 */
	public String addProf(Professor prof) {
		profs.add(prof);
		return "Succesfully enrolled " + prof.getName();

	}

	/**
	 * @param name of the professor that is being searched for
	 * @return boolean value if the professors name exists in the database.
	 */
	public boolean searchProfName(String name) {

		for (int i = 0; i < profs.size(); i++) {
			if (profs.get(i).getName().equals(name))
				return true;
		}
		return false;
	}

	/**
	 * @param id of the professor that is being searched for
	 * @return boolean value if the professors id exists in the database.
	 */
	public boolean searchProfID(String id) {
		for (int i = 0; i < profs.size(); i++) {
			if (profs.get(i).getID().equals(id))
				return true;
		}
		return false;
	}

	public String profInfo(String id) {

		

		String line = null;
		try {
			String fileName = "src/it306project/profList.txt";
			File file = new File(fileName);

			FileReader fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);

			while ((line = br.readLine()) != null) {
				if (line.contains(id)) {
					JOptionPane.showMessageDialog(null, line);
				}
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return line;
	}
}
