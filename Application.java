package it306Project2;

import java.awt.Dimension;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Application {

	private static ArrayList<String> coursedb = new ArrayList<String>();

	private static int studentIndex;
	private static ArrayList<Student> studentdb = new ArrayList<Student>();

	private static int professorIndex;
	private static ArrayList<Professor> professordb = new ArrayList<Professor>();

	// ====================================================================================================================================
	// course methods
	// ====================================================================================================================================
	public static void writeCoursesToFile(ArrayList<String> courseList) {
		String currentDirectory = System.getProperty("user.dir");
		System.out.println(currentDirectory);

		FileWriter writer;
		try {
			writer = new FileWriter(currentDirectory + "/courseList.txt");
			int size = courseList.size();

			for (int i = 0; i < size; i++) {
				String str = courseList.get(i).toString();
				writer.write(str);
				if (i < (size - 1))
					writer.write("\n");
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addCourseDB(String course) {
		coursedb.add(course);
	}

	public static String dropCourseDB(String course) {
		try {
			coursedb.remove(coursedb.indexOf(course));
		} catch (NullPointerException e) {
			return "Course not found in database";
		}
		return "Successfully removed the course from the database";
	}

	public static String viewCourseDB() {
		String txt = "";
		for (int i = 0; i < coursedb.size(); i++) {
			txt += coursedb.get(i) + "\n";
		}

		return txt;
	}

	// ====================================================================================================================================
	// Student methods
	// ====================================================================================================================================
	public static void writeStudentsToFile(ArrayList<Student> studentList) {
		String currentDirectory = System.getProperty("user.dir");
		FileWriter writer;
		try {
			writer = new FileWriter(currentDirectory + "/studentList.txt");
			int size = studentList.size();
			

			for (int i = 0; i < size; i++) {
				String str = studentList.get(i).viewStudentInfo();
				writer.write(str);
				if (i < (size - 1))
					writer.write("\n");

			}

			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String viewStudentDB() {

		String txt = "";
		for (int i = 0; i < studentdb.size(); i++) {
			txt += studentdb.get(i).viewStudentInfo();
		}
		return txt;

	}

	public static boolean searchStudentPass(String pass) {
		int i;
		for (i = 0; i < studentdb.size(); i++) {
			if (studentdb.get(i).getPassword().equals(pass))
				return true;
		}
		return false;
	}

	public static boolean searchStudentName(String name) {
		for (int i = 0; i < studentdb.size(); i++) {
			if (studentdb.get(i).getFullName().equals(name))
				return true;
		}

		return false;
	}

	public static void initStudentIndex(String name) {
		for (int i = 0; i < studentdb.size(); i++) {
			if (studentdb.get(i).getFullName().equals(name))
				studentIndex = i;

		}

	}

	public static void removeStudent(String name) {
		for (int i = 0; i < studentdb.size(); i++) {
			if (studentdb.get(i).getFullName().equals(name))
				studentdb.remove(i);
		}
	}

	// ====================================================================================================================================
	// Professor methods
	// ====================================================================================================================================
	public static void removeProfessor(String name) {
		for (int i = 0; i < professordb.size(); i++) {
			if (professordb.get(i).getFullName().equals(name))
				professordb.remove(i);
		}
	}
	
	public static void writeProfsToFile(ArrayList<Professor> profList) {
		String currentDirectory = System.getProperty("user.dir");
		FileWriter writer;
		try {
			writer = new FileWriter(currentDirectory + "/profList.txt");
			int size = profList.size();

			for (int i = 0; i < size; i++) {
				String str = profList.get(i).viewProfessorInfo();
				writer.write(str);
				if (i < (size - 1))
					writer.write("\n");

			}

			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String viewProfessorDB() {

		String txt = "";
		for (int i = 0; i < professordb.size(); i++) {
			txt += professordb.get(i).viewProfessorInfo();
		}

		return txt;

	}

	public static boolean searchProfessorPass(String pass) {
		int i;
		for (i = 0; i < professordb.size(); i++) {
			if (professordb.get(i).getPassword().equals(pass))
				return true;
		}
		return false;
	}

	public static boolean searchProfessorName(String name) {
		for (int i = 0; i < professordb.size(); i++) {
			if (professordb.get(i).getFullName().equals(name))
				return true;
		}

		return false;
	}

	public static void initProfessorIndex(String name) {
		for (int i = 0; i < professordb.size(); i++) {
			if (professordb.get(i).getFullName().equals(name))
				professorIndex = i;

		}

	}

	public static void main(String[] args) {
		// ====================================================================================================================================
		// Populate University Course List
		// ====================================================================================================================================
		addCourseDB("IT101");
		addCourseDB("IT102");
		addCourseDB("IT103");
		addCourseDB("IT104");
		addCourseDB("IT105");
		addCourseDB("IT106");
		addCourseDB("IT207");
		addCourseDB("IT293");
		addCourseDB("IT304");
		addCourseDB("IT305");
		addCourseDB("IT306");
		addCourseDB("IT307");
		addCourseDB("IT312");
		addCourseDB("IT356");
		addCourseDB("IT378");
		addCourseDB("IT311");
		addCourseDB("IT396");
		addCourseDB("IT397");
		addCourseDB("IT398");
		addCourseDB("IT399");
		addCourseDB("IT101");
		addCourseDB("IT102");
		addCourseDB("IT103");
		addCourseDB("IT104");
		addCourseDB("IT105");
		addCourseDB("IT106");
		addCourseDB("IT207");
		addCourseDB("IT293");
		addCourseDB("IT304");
		addCourseDB("IT305");
		addCourseDB("IT306");
		addCourseDB("IT307");
		addCourseDB("IT312");
		addCourseDB("IT356");
		addCourseDB("IT378");
		addCourseDB("IT311");
		addCourseDB("IT396");
		addCourseDB("IT397");
		addCourseDB("IT398");
		addCourseDB("IT399");
		addCourseDB("IT101");
		addCourseDB("IT102");
		addCourseDB("IT103");
		addCourseDB("IT104");
		addCourseDB("IT105");
		addCourseDB("IT106");
		addCourseDB("IT207");
		addCourseDB("IT293");
		addCourseDB("IT304");
		addCourseDB("IT305");
		addCourseDB("IT306");
		addCourseDB("IT307");
		addCourseDB("IT312");
		addCourseDB("IT356");
		addCourseDB("IT378");
		addCourseDB("IT311");
		addCourseDB("IT396");
		addCourseDB("IT397");
		addCourseDB("IT398");
		addCourseDB("IT399");
		addCourseDB("IT101");
		addCourseDB("IT102");
		addCourseDB("IT103");
		addCourseDB("IT104");
		addCourseDB("IT105");
		addCourseDB("IT106");
		addCourseDB("IT207");
		addCourseDB("IT293");
		addCourseDB("IT304");
		addCourseDB("IT305");
		addCourseDB("IT306");
		addCourseDB("IT307");
		addCourseDB("IT312");
		addCourseDB("IT356");
		addCourseDB("IT378");
		addCourseDB("IT311");
		addCourseDB("IT396");
		addCourseDB("IT397");
		addCourseDB("IT398");
		addCourseDB("IT399");

		// ====================================================================================================================================
		// Populate University Student List
		// ====================================================================================================================================
		Student ash = new Student("Ashraf", "Ullah", "Pokemon-1", "9075");
		studentdb.add(ash);
		ash.addCourse("IT399");
		ash.addCourse("IT399");
		ash.addCourse("IT675");
		ash.addCourse("IT254");

		Student tar = new Student("Tariq", "Ullah", "Pokemon-1", "4783");
		studentdb.add(tar);
		tar.addCourse("IT399");
		tar.addCourse("IT399");
		tar.addCourse("IT675");

		Student rah = new Student("Rahima", "Shafiq", "Pokemon-1", "1896");
		studentdb.add(rah);
		rah.addCourse("IT399");

		Student jas = new Student("Jasmin", "Ullah", "Pokemon-1", "9965");
		studentdb.add(jas);
		jas.addCourse("IT399");
		jas.addCourse("IT399");
		jas.addCourse("IT675");
		jas.addCourse("IT254");
		jas.addCourse("IT399");

		Student yas = new Student("Yasmin", "Shafiq", "Pokemon-1", "6743");
		studentdb.add(yas);
		yas.addCourse("IT399");
		yas.addCourse("IT399");
		yas.addCourse("IT675");
		yas.addCourse("IT254");

		Student rok = new Student("Rokeya", "Ullah", "Pokemon-1", "9723");
		studentdb.add(rok);
		rok.addCourse("IT399");
		rok.addCourse("IT399");

		// ====================================================================================================================================
		// Populate University Professor List
		// ====================================================================================================================================

		Professor mar = new Professor("Mark", "Snyder", "Pokemon-1", "4562");
		professordb.add(mar);
		mar.addCourse("IT765");
		mar.addCourse("IT780");
		mar.addCourse("IT336");

		Professor bob = new Professor("Bob", "Marley", "Pokemon-1", "7842");
		professordb.add(bob);
		bob.addCourse("IT778");
		bob.addCourse("IT985");
		bob.addCourse("IT736");

		Professor ahm = new Professor("Ahmed", "Hakeem", "Pokemon-1", "7659");
		professordb.add(ahm);
		ahm.addCourse("IT738");
		ahm.addCourse("IT985");
		ahm.addCourse("IT796");

		Professor jan = new Professor("Jane", "Foster", "Pokemon-1", "5431");
		professordb.add(jan);
		jan.addCourse("IT790");
		jan.addCourse("IT921");
		jan.addCourse("IT767");

		System.out.println(viewStudentDB());
		System.out.println(viewProfessorDB());
		System.out.println(viewCourseDB());

		String mainMenu = "Enter 1 if you are a Student \nEnter 2 if you are a Professor \nEnter 3 if you are an Admin \nEnter 4 to exit";
		int choice = 0;

		do {

			try {
				studentIndex = 0;
				professorIndex = 0;
				choice = Integer.parseInt(JOptionPane.showInputDialog(mainMenu));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, " Please enter an integer between 1-4");
			}

			switch (choice) {
			case 1:
				String userName = null;
				while (searchStudentName(userName) != true) {
					userName = JOptionPane
							.showInputDialog("Please enter your first name and last name (ex. Tariq Ullah) ");

				}

				String pass = null;
				while (searchStudentPass(pass) != true) {

					JPasswordField pwd = new JPasswordField(10);
					int action = JOptionPane.showConfirmDialog(null, pwd, "Enter Your Password",
							JOptionPane.OK_CANCEL_OPTION);
					if (action < 0)
						JOptionPane.showMessageDialog(null, "Cancel, X or escape key selected");
					String passConvert = new String(pwd.getPassword());
					pass = passConvert;
					// else JOptionPane.showMessageDialog(null,"Your password is "+new
					// String(pwd.getPassword()));
					// System.exit(0);

				}

				// set the index for a given student's session
				initStudentIndex(userName);

				String n = null;
				do {

					n = JOptionPane.showInputDialog(
							"Enter 1 to add course\nEnter 2 to drop course\nEnter 3 to view roster\nEnter 4 to view available Courses\nEnter 5 to Logout");

					if (n.equals("1")) {
						String input = JOptionPane.showInputDialog("Enter the course you want to add (ex. IT106)");
						studentdb.get(studentIndex).addCourse(input);

					}

					else if (n.equals("2")) {
						String input = JOptionPane.showInputDialog("Enter the course you want to drop (ex. IT106)");
						studentdb.get(studentIndex).dropCourse(input);

					}

					else if (n.equals("3")) {
						JOptionPane.showMessageDialog(null, studentdb.get(studentIndex).viewRoster());

					}

					else if (n.equals("4")) {

						JTextArea textArea = new JTextArea(viewCourseDB());
						JScrollPane scrollPane = new JScrollPane(textArea);
						textArea.setLineWrap(true);
						textArea.setWrapStyleWord(true);
						scrollPane.setPreferredSize(new Dimension(500, 500));
						JOptionPane.showMessageDialog(null, scrollPane, "University Courses",
								JOptionPane.YES_NO_OPTION);

					}

				} while (!n.equals("5"));

				break;

			case 2:
				String profName = null;
				while (searchProfessorName(profName) != true) {
					profName = JOptionPane
							.showInputDialog("Please enter your first name and last name (ex. Tariq Ullah) ");

				}

				String profPass = null;
				while (searchProfessorPass(profPass) != true) {
					JPasswordField pwd = new JPasswordField(10);
					int action = JOptionPane.showConfirmDialog(null, pwd, "Enter Your Password",
							JOptionPane.OK_CANCEL_OPTION);
					if (action < 0)
						JOptionPane.showMessageDialog(null, "Cancel, X or escape key selected");
					String passConvert = new String(pwd.getPassword());
					profPass = passConvert;

				}

				// set the index for a given professor's session
				initProfessorIndex(profName);

				String m = null;
				do {

					m = JOptionPane.showInputDialog(
							"Enter 1 to add course\nEnter 2 to drop course\nEnter 3 to view roster\nEnter 4 to view available Courses\nEnter 5 to Logout");

					if (m.equals("1")) {
						String input = JOptionPane.showInputDialog("Enter the course you want to add (ex. IT106)");
						professordb.get(professorIndex).addCourse(input);

					}

					else if (m.equals("2")) {
						String input = JOptionPane.showInputDialog("Enter the course you want to drop (ex. IT106)");
						professordb.get(professorIndex).dropCourse(input);

					}

					else if (m.equals("3")) {
						JOptionPane.showMessageDialog(null, professordb.get(professorIndex).viewRoster());

					}

					else if (m.equals("4")) {

						JTextArea textArea = new JTextArea(viewCourseDB());
						JScrollPane scrollPane = new JScrollPane(textArea);
						textArea.setLineWrap(true);
						textArea.setWrapStyleWord(true);
						scrollPane.setPreferredSize(new Dimension(500, 500));
						JOptionPane.showMessageDialog(null, scrollPane, "University Courses",
								JOptionPane.YES_NO_OPTION);

					}

				} while (!m.equals("5"));

				break;

			case 3:

				String verify = JOptionPane.showInputDialog("Enter the administrator password: ");
				while (!verify.equals("admin")) {// hard coded admin password
					JOptionPane.showMessageDialog(null, "You entered the incorrect password");
					verify = JOptionPane.showInputDialog("Enter the administrator password: ");
				}

				Integer adminChoice;

				do {
					String adminMenu = "Enter 1 to add a new course to the database\nEnter 2 to delete a course from the database\n"
							+ "Enter 3 to view the student database\nEnter 4 to add a new student\nEnter 5 to drop an existing student\n"
							+ "Enter 6 to view the professor database\nEnter 7 to add a professor\nEnter 8 to remove an existing professor\n"
							+ "Enter 9 to view the course database\nEnter 10 to logout ";
					adminChoice = Integer.parseInt(JOptionPane.showInputDialog(adminMenu));

					if (adminChoice == 1) {
						String add = JOptionPane.showInputDialog(
								"Enter the name of the course you want to add to the course database (ex. IT106) ");
						addCourseDB(add);

					} else if (adminChoice == 2) {
						String remove = JOptionPane.showInputDialog(
								"Enter the name of the course you want to remove from the course database (ex. IT106) ");
						dropCourseDB(remove);

					} else if (adminChoice == 3) {
						JTextArea textArea = new JTextArea(viewStudentDB());
						JScrollPane scrollPane = new JScrollPane(textArea);
						textArea.setLineWrap(true);
						textArea.setWrapStyleWord(true);
						scrollPane.setPreferredSize(new Dimension(500, 500));
						JOptionPane.showMessageDialog(null, scrollPane, "University Courses",
								JOptionPane.YES_NO_OPTION);
					} else if (adminChoice == 4) {
						// add a new student
						String fName = null, lName = null, studPass = null, studID = null, course = null;
						Student addNew = new Student();

						fName = JOptionPane.showInputDialog("Enter the student's first name");
						addNew.setFname(fName);

						lName = JOptionPane.showInputDialog("Enter the student's last name");
						addNew.setLname(lName);

						studPass = JOptionPane.showInputDialog("Enter the student's password");
						addNew.setPassword(studPass);

						Random rand = new Random();
						int id = rand.nextInt(9999 - 1000 + 1) + 1000;
						studID = Integer.toString(id);
						addNew.setId(studID);

						// yes = 0, no = 1
						int n1 = JOptionPane.showConfirmDialog(null, "Would you like to add a course for this student",
								"add course", JOptionPane.YES_NO_OPTION);
						// System.out.println(n1);
						while (n1  == 0) {
							course = JOptionPane.showInputDialog("Enter the name of the course you would like to add");
							addNew.addCourse(course);
							n1 = JOptionPane.showConfirmDialog(null, "Would you like to add another course for this student",
									"add course", JOptionPane.YES_NO_OPTION);
						}

						studentdb.add(addNew);

					} else if (adminChoice == 5) {
						String remove = JOptionPane.showInputDialog(
								"Enter the name of the student you want to remove from the student database (ex. Tariq Ullah) ");
						removeStudent(remove);

					} else if (adminChoice == 6) {
						JTextArea textArea = new JTextArea(viewProfessorDB());
						JScrollPane scrollPane = new JScrollPane(textArea);
						textArea.setLineWrap(true);
						textArea.setWrapStyleWord(true);
						scrollPane.setPreferredSize(new Dimension(500, 500));
						JOptionPane.showMessageDialog(null, scrollPane, "University Courses",
								JOptionPane.YES_NO_OPTION);
					} else if (adminChoice == 7) {
						// add a new professor
						String fName = null, lName = null, profPass1 = null, profID = null, course = null;
						Professor addNew = new Professor();

						fName = JOptionPane.showInputDialog("Enter the professor's first name");
						addNew.setFname(fName);

						lName = JOptionPane.showInputDialog("Enter the professor's last name");
						addNew.setLname(lName);

						profPass1 = JOptionPane.showInputDialog("Enter the professor's password");
						addNew.setPassword(profPass1);

						Random rand = new Random();
						int id = rand.nextInt(9999 - 1000 + 1) + 1000;
						profID = Integer.toString(id);
						addNew.setId(profID);

						// yes = 0, no = 1
						int n1 = JOptionPane.showConfirmDialog(null, "Would you like to add a course for this professor?",
								"add course", JOptionPane.YES_NO_OPTION);
						// System.out.println(n1);
						while (n1  == 0) {
							course = JOptionPane.showInputDialog("Enter the name of the course you would like to add");
							addNew.addCourse(course);
							n1 = JOptionPane.showConfirmDialog(null, "Would you like to add another course for this professor?",
									"add course", JOptionPane.YES_NO_OPTION);
						}

						professordb.add(addNew);
						
					} else if (adminChoice == 8) {
						//remove a professor from the database
						String remove = JOptionPane.showInputDialog(
								"Enter the name of the professor you want to remove from the professor database (ex. Tariq Ullah) ");
						removeProfessor(remove);
					} else if (adminChoice == 9) {
						JTextArea textArea = new JTextArea(viewCourseDB());
						JScrollPane scrollPane = new JScrollPane(textArea);
						textArea.setLineWrap(true);
						textArea.setWrapStyleWord(true);
						scrollPane.setPreferredSize(new Dimension(500, 500));
						JOptionPane.showMessageDialog(null, scrollPane, "University Courses",
								JOptionPane.YES_NO_OPTION);
					}

				} while (adminChoice != 10);

				break;

			case 4:
				// Write everything into the text files before system exit

				// Write all of the courses to a txt file:
				writeCoursesToFile(coursedb);

				// Write Students to a txt file
				writeStudentsToFile(studentdb);

				// Write list of professors to file
				writeProfsToFile(professordb);

				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, mainMenu);
			}

		} while (choice != 4);

	}

}
