package POJO;

/**
 * @author Priya
 *  student class is a POJO class for student details.
 */
public class Student
{
	protected String firstName, lastName, fatherName, email, className, age;
	protected int studentId;

	/**
	 * @return the studentId of the student.
	 */
	public int getStudentId()
	{
		return studentId;
	}

	/**
	 * @param studentId set the studentId of the student.
	 */
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}

	/**
	 * @return the firstName of the student.
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @param firstName set the firstName of the student.
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * @return the lastName of the student.
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @param lastName set the lastName of the student.
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/**
	 * @return the fatherName of the student.
	 */
	public String getFatherName()
	{
		return fatherName;
	}

	/**
	 * @param fatherName set the fatherName of the student.
	 */
	public void setFatherName(String fatherName)
	{
		this.fatherName = fatherName;
	}

	/**
	 * @return the email of the student.
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * @param email set the email of the student.
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * @return the className of the student.
	 */
	public String getClassName()
	{
		return className;
	}

	/**
	 * @param className set the className of the student.
	 */
	public void setClassName(String className)
	{
		this.className = className;
	}

	/**
	 * @return the age of the student.
	 */
	public String getAge()
	{
		return age;
	}

	/**
	 * @param age set the age of the student.
	 */
	public void setAge(String age)
	{
		this.age = age;
	}
}