package InClassCodes;

public class MethodCalling {

	public static int multiplication1() {
		int num1 = 50;
		int num2 = 2;
		int num3 = 45;

		int mulresult = num1 * num2 * num3;
		return mulresult;

	}

	public static int multiplication2() {
		int num1 = 58;
		int num2 = 3;

		int mulresult2 = num1 * num2;
		return mulresult2;

	}

	public static int addition() {
		int num1 = 10;
		int num2 = 5;
		int add = num1 + num2;
		return add;
	}

	public static void main(String[] args) {

		int result1 = MethodCalling.multiplication1();
		int result2 = MethodCalling.multiplication2();
		int result3 = MethodCalling.addition();

		int finalresult = result1 + result2 + result3;
		System.out.println(finalresult);

	}

}
