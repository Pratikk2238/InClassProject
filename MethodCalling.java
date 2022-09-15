package InClassCodes;

public class MethodCalling {

	public static int result() {
		int number = 10 + ((50 * 2) * 45) + 5 + (58 * 3);
		return number;
	}

	public static void main(String[] args) {

		int result = MethodCalling.result();
		System.out.println(result);
	}

}
