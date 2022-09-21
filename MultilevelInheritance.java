package InClassCodes;

public class MultilevelInheritance extends SingleInheritance {

	MultilevelInheritance() {
		super(20, 20);
		System.out.println("this is default constructor of MultilevelInheritance class ");
	}

	public static void main(String[] args) {
		MultilevelInheritance obj2 = new MultilevelInheritance();
		System.out.println(obj2.number);
		System.out.println(obj2.s);
		obj2.methode1();
		obj2.method2();
		obj2.method3();

	}

}
