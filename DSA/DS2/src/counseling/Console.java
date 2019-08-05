package counseling;

import java.io.IOException;

public class Console {

	public static void main(String[] args) throws IOException {
		Counseling c = new Counseling();
		c.addProgram();
		c.addStudent();
		c.allocate();
		c.writeBook();
	}
}
