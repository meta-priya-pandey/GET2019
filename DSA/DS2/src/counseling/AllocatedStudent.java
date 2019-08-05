package counseling;

/**
 * @author Priya Pandey
 * Allocated Student class allocates the student with their choices.
 */
public class AllocatedStudent {
	public String studentName;
	public String allocateProgram;
	
	/**
	 * @param name
	 * @param program
	 */
	public AllocatedStudent(String name,String program){
		this.studentName = name;
		this.allocateProgram = program;
	}
	
	/**
	 * @return Student Name
	 */
	public String getStudentName(){
		return studentName;
	}
	
	/**
	 * @return Program Name
	 */
	public String getProgramName(){
		return allocateProgram;
	}
}
