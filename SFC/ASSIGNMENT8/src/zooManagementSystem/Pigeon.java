package zooManagementSystem;

/**
 * @author Priya Pandey
 * Pigeon class extends the properties of Bird class.
 *
 */
public class Pigeon extends Bird {
	public String type = "pigeon";

	public Pigeon(String name, int age, double weight) {
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
		String sound = "coo";
		return sound;
	}

	@Override
	public String getType() {
		return type;
	}
}
