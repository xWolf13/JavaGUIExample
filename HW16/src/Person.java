public class Person {
	String name;
	String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public String getName() {
		return this.name;
	}

	private static void verifyString(String message, String expected, String actual) {
		if (expected.equals(actual)) {
			System.out.println("Passed:" + message);
		} else {
			System.out.println("Failed" + message + "Expected: " + expected + "; Actual:" + actual);
		}
	}

	public static void main(String[] args) {
		// Test getAddress method
		Person p = new Person("Lyndon Johnson", "1600 Pennsylvania Ave");

		verifyString("getAddress", "1600 Pennsylvania Ave", p.getAddress());
		verifyString("getName", "Lyndon Johnson", p.getName());
	}
}