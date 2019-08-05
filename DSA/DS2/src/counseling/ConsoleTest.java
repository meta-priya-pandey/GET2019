package counseling;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ConsoleTest {

	/**
	 * This test method test allocateCourses method of AddmissionManagement
	 * Class
	 * @throws IOException 
	 */
	@Test
	public void allocateCoursesPositiveCasesTest() throws IOException {

		Counseling addmissionManagement = new Counseling();
		addmissionManagement.addProgram();
		addmissionManagement.addStudent();
		boolean allocate = addmissionManagement.allocate();
		addmissionManagement.writeBook();
		assertTrue(allocate);				
	}
}