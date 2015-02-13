public class Teacher extends Person {
	public Teacher(String name, String address) {
		super(name, address);
	}

	public String toString() {
		return "Teacher:" + super.getName() + "(" + super.getAddress() + ")";
	}

	private static void verifyString(String message, String expected, String actual) {
		if (expected.equals(actual)) {
			System.out.println("Passed:" + message);
		} else {
			System.out.println("Failed" + message + "Expected: " + expected + "; Actual:" + actual);
		}
	}

	public static void main(String[] args) {
		Teacher t = new Teacher("Mr. Lindy", "123 Main Street");
		verifyString("getAddress", "123 Main Street", t.getAddress());
		verifyString("getName", "Mr. Lindy", t.getName());

	}

}
