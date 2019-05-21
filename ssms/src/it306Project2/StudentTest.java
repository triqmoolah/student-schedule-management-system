package it306Project2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Tariq Ullah & Ashraf Ullah
 * testing class for the Student class
 */
class StudentTest {

	@Test
	void testStudent() {
		Student test = new Student("test", "test","test","test");
		assertNotNull(test);
	}

	@Test
	void testGetFname() {
		Student test = new Student("test", "test","test","test");
		assertNotNull(test.getFname());
		assertTrue(test.getFname().equals("test"));
		
	}

	@Test
	void testSetFname() {
		Student test = new Student("test", "test","test","test");
		test.setFname("Tariq");
		assertTrue(test.getFname().equals("Tariq"));
	}

	@Test
	void testGetLname() {
		Student test = new Student("test", "test","test","test");
		assertNotNull(test.getLname());
		assertTrue(test.getLname().equals("test"));
	}

	@Test
	void testSetLname() {
		Student test = new Student("test", "test","test","test");
		test.setLname("Tariq");
		assertTrue(test.getLname().equals("Tariq"));
	}

	@Test
	void testGetPassword() {
		Student test = new Student("test", "test","test","test");
		assertNotNull(test.getPassword());
		assertTrue(test.getPassword().equals("test"));
	}

	@Test
	void testSetPassword() {
		Student test = new Student("test", "test","test","test");
		test.setPassword("Tariq");
		assertTrue(test.getPassword().equals("Tariq"));
	}

	@Test
	void testGetId() {
		Student test = new Student("test", "test","test","test");
		assertNotNull(test.getId());
		assertTrue(test.getId().equals("test"));
		
	}

	@Test
	void testSetId() {
		Student test = new Student("test", "test","test","test");
		test.setId("1234");
		assertTrue(test.getId().equals("1234"));
	}


	@Test
	void testAddCourse() {
		Student test = new Student("test", "test","test","test");
		test.addCourse("ITTest");
		assertNotNull(test.viewRoster());
	}

	@Test
	void testDropCourse() {
		Student test = new Student("test", "test","test","test");
		test.addCourse("IT106");
		assertTrue(test.searchCourses("IT106"));
		test.dropCourse("IT106");
		assertFalse(test.searchCourses("IT106"));
	}

	@Test
	void testSearchCourses() {
		Student test = new Student("test", "test","test","test");
		test.addCourse("ITTest");
		assertTrue(test.searchCourses("ITTest"));
	}

	@Test
	void testViewStudentInfo() {
		Student test = new Student("test", "test","test","test");
		assertNotNull(test.viewStudentInfo());
	}

	@Test
	void testGetFullName() {
		Student test = new Student("test", "test","test","test");
		assertTrue(test.getFullName().equals("test test"));
	}

}
