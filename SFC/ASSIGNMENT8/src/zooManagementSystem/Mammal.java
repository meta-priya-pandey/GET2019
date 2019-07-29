package zooManagementSystem;

/**
 * @author Priya Pandey
 * Mammal is an abstract class which inherits the properties of Animal class.
 *
 */
public abstract class Mammal extends Animal {
	public String category = "mammal";

	public Mammal(String name, int age, double weight) {
		super(name, age, weight);
	}

	@Override
	public String getCategory() {
		return category;
	}

}