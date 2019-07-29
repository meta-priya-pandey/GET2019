package zooManagementSystem;

/**
 * @author Priya Pandey
 * Crocodile class inherits the properties of Reptile class.
 *
 */
public class Crocodile extends Reptile {
	public String type = "crocodile";

	public Crocodile(String name, int age, double weight) {
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
		String sound = "growls";
		return sound;
	}

	@Override
	public String getType() {
		return type;
	}
}