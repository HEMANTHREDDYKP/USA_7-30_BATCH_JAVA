
//Example for static blocks
public class BlocksInJava {

	static int age;

	static {
		age = 45;
		System.out.println("Hello 2");
	}

	public static void main(String[] args) {

		System.out.println("Hi");

	}

	static {
		System.out.println("Hello 1");
	}
}
