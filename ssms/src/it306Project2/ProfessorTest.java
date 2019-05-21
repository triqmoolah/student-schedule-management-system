package it306Project2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Tariq Ullah & Ashraf Ullah
 * testing class for the Professor class
 */
class ProfessorTest {
	@Test
	void testStudent() {
		Professor test = new Professor("test", "test","test","test");
		assertNotNull(test);
	}

	@Test
	void testGetFname() {
		Professor test = new Professor("test", "test","test","test");
		assertNotNull(test.getFname());
		assertTrue(test.getFname().equals("test"));
		
	}

	@Test
	void testSetFname() {
		Professor test = new Professor("test", "test","test","test");
		test.setFname("Tariq");
		assertTrue(test.getFname().equals("Tariq"));
	}

	@Test
	void testGetLname() {
		Professor test = new Professor("test", "test","test","test");
		assertNotNull(test.getLname());
		assertTrue(test.getLname().equals("test"));
	}

	@Test
	void testSetLname() {
		Professor test = new Professor("test", "test","test","test");
		test.setLname("Tariq");
		assertTrue(test.getLname().equals("Tariq"));
	}

	@Test
	void testGetPassword() {
		Professor test = new Professor("test", "test","test","test");
		assertNotNull(test.getPassword());
		assertTrue(test.getPassword().equals("test"));
	}

	@Test
	void testSetPassword() {
		Professor test = new Professor("test", "test","test","test");
		test.setPassword("Tariq");
		assertTrue(test.getPassword().equals("Tariq"));
	}

	@Test
	void testGetId() {
		Professor test = new Professor("test", "test","test","test");
		assertNotNull(test.getId());
		assertTrue(test.getId().equals("test"));
		
	}

	@Test
	void testSetId() {
		Professor test = new Professor("test", "test","test","test");
		test.setId("1234");
		assertTrue(test.getId().equals("1234"));
	}


	@Test
	void testAddCourse() {
		Professor test = new Professor("test", "test","test","test");
		test.addCourse("ITTest");
		assertNotNull(test.viewRoster());
	}

	@Test
	void testDropCourse() {
		Professor test = new Professor("test", "test","test","test");
		test.addCourse("IT106");
		assertTrue(test.searchCourses("IT106"));
		test.dropCourse("IT106");
		assertFalse(test.searchCourses("IT106"));
	}

	@Test
	void testSearchCourses() {
		Professor test = new Professor("test", "test","test","test");
		test.addCourse("ITTest");
		assertTrue(test.searchCourses("ITTest"));
	}

	@Test
	void testViewStudentInfo() {
		Professor test = new Professor("test", "test","test","test");
		assertNotNull(test.viewProfessorInfo());
	}

	@Test
	void testGetFullName() {
		Professor test = new Professor("test", "test","test","test");
		assertTrue(test.getFullName().equals("test test"));
	}


}
