package counseling;

public class Program {
	public String ProgramName;
	public int Capacity;
	public Program(String name,int capacity){
		this.ProgramName = name;
		this.Capacity = capacity;
		
	}
	
	/**
	 * Set the capacity of the program
	 * @param capacity
	 */
	public void setCapacity(int capacity){
		this.Capacity = capacity;
	}
	
	/**
	 * @return capacity of the program
	 */
	public int getCapacity(){
		return Capacity;
	}
	
	/**
	 * @return name of the program
	 */
	public String getName(){
		return ProgramName;
	}
}