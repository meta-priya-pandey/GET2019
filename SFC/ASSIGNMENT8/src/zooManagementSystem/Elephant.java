package zooManagementSystem;

/**
 * @author Priya Pandey
 * Elephant class inherits the properties of Mammal class.
 *
 */
public class Elephant extends Mammal {
	public String type = "elephant";

	public Elephant(String name, int age, double weight) {
		super(name, age, weight);
	}

	@Override
	public String getInfo() {
		String information = "Name:" + name + " age:" + age + " weight:"
				+ weight + " sound:" + getSound() + " type:" + type
				+ " category:" + category;
		return information;
	}

	@Override
	public String getSound() {
		String sound = "Trumpet";
		return sound;
	}

	@Override
	public String getType() {
		return type;
	}
}