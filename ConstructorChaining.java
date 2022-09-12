package InClassCodes;

public class ConstructorChaining {

	ConstructorChaining() {

		this(5);
		System.out.println("This is Default constructor");
	}

	ConstructorChaining(int x) {

		this(5, 15);
		System.out.println(x);
	}

	// parameterized constructor 3
	ConstructorChaining(int x, int y) {
		System.out.println(x * y);
	}

	public static void main(String args[]) {

		ConstructorChaining con=	new ConstructorChaining();

	}

}
