package counseling;

public class Student {
	public String StudentName;
	public  String[] Preference = new String[100];
	
	public Student(String name, String[] pref){
		this.Preference = pref;
		for(String ele : Preference)
			System.out.println(ele);
		this.StudentName = name;
	}
	
	/**
	 * @return Student Name
	 */
	public String getName(){
		return StudentName;
	}
	
	/**
	 * @return preference of the Student
	 */
	public String[] getPreference(){
		return Preference;
	}
}