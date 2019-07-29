package zooManagementSystem;

/**
 * @author Priya Pandey
 * Peacock class inherits the properties of Bird class.
 *
 */
public class Peacock extends Bird {
	public String type = "peacock";

	public Peacock(String name, int age, double weight) {
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
	public String getType() {
		return type;
	}

	@Override
	public String getSound() {
		String sound = "scream";
		return sound;
	}

}