package it306project;

import javax.swing.JOptionPane;

import javax.swing.JDialog;
import javax.swing.JOptionPane;


/**
 * @author Tariq Ullah & Ashraf Ullah
 *
 */
public class UniversityApplication {

	public static void main(String[] args) {
		
		System.out.println();
		
		University georgeMason = new University();
		//==================================================================
		// TESTING STUDENT METHODS
		//==================================================================
		System.out.println("//TESTING STUDENT METHODS//");
		Student tar = new Student("Tariq", "Ullah", "11345"); 
		Student ash = new Student("Ashraf", "Ullah", "11472");
		Student jas = new Student("Jasmin", "Ullah", "11046");
		Student yas = new Student("Yasmin", "Shafiq", "11724");
		Student aph = new Student("Rahima", "Ullah", "11342");
		
		georgeMason.addStudent(tar);
		georgeMason.addStudent(ash);
		georgeMason.addStudent(jas);
		georgeMason.addStudent(yas);
		georgeMason.addStudent(aph);
		
		georgeMason.writeStudentList();
		georgeMason.readStudentList();
		System.out.println(georgeMason.searchStudentName("Tariq Ullah"));
		System.out.println(georgeMason.searchStudentID("11046"));
		
		//==================================================================
		// TESTING PROFESSOR METHODS
		//==================================================================
		System.out.println("//TESTING PROFESSOR METHODS//");
		Professor jay = new Professor("Jayn", "Desk", "00456");
		Professor ali = new Professor("Ali", "Ron", "00557");
		Professor ahm = new Professor("Ahmed", "Saleem", "00986");
		Professor kar = new Professor("Kareem", "Kabbar", "00945");
		Professor cla = new Professor("Claudia", "Cable", "00315");
		
		georgeMason.addProf(jay);
		georgeMason.addProf(ali);
		georgeMason.addProf(ahm);
		georgeMason.addProf(kar);
		georgeMason.addProf(cla);
		
		georgeMason.writeProfList();
		georgeMason.readProfList();
		System.out.println(georgeMason.searchProfName("Ahmed Saleem"));
		System.out.println(georgeMason.searchProfID("00315"));
		
		
		//==================================================================
		// TESTING COURSE METHODS
		//==================================================================
		System.out.println("//TESTING COURSE METHODS//");
		Course it101 = new Course("IT101", "10:00AM - 12:00PM", "Ahmed Saleem");
		Course it306 = new Course("IT306", "12:30PM - 02:00PM", "Kareem Kabbar");
		Course it209 = new Course("IT209", "01:00PM - 03:00PM", "Ali Ron");
		Course it207 = new Course("IT207", "10:00PM - 11:00PM", "Claudia Cable");
		Course it410 = new Course("IT410", "08:00PM - 10:00PM", "Jayn Desk");
		
		georgeMason.addCourse(it101);
		georgeMason.addCourse(it306);
		georgeMason.addCourse(it209);
		georgeMason.addCourse(it207);
		georgeMason.addCourse(it410);
		
		georgeMason.writeCourseList();
		georgeMason.readCourseList();
		
		System.out.println(georgeMason.searchCourses("IT101"));
		
		//==================================================================
		// JOPTION DIALOG
		//==================================================================
		
		//still being implemented
		
		String menu = "Enter 1 if you are a Student \nEnter 2 if you are a Professor \nEnter 3 if you are an Admin \nEnter 4 to exit"; 
		String studentMenu = "Enter 1 to view all available courses\n ";
		int choice = 0;
		
		do {
			
			try {
				choice = Integer.parseInt(JOptionPane.showInputDialog(menu)); 
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, " Please enter an integer between 1-4");
			}
			
			
			
			
			switch(choice) {
			//student can search for classes, add a class to their schedule, or delete a course from their schedule.
			case 1:
				String studentID = JOptionPane.showInputDialog("Please enter your student id number: ");

			//Professor can search for classes.
			case 2:
				String profID = JOptionPane.showInputDialog("Please enter your professor id number: ");
				
			//Admin can add students, drop students, add professors, drop professor, view courses and delete courses.
			case 3: 
				String adminID = JOptionPane.showInputDialog("Please enter your admin id number: ");
			//Exit
			case 4:
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, menu);
			}
			
			
			
		} while(choice != 4);
		
		

		

	}

}
