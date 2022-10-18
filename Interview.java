package InClassCodes;

public class Interview implements Test1 {
	
	void method2() {
		
		System.out.println("child class method");
		
	}
	
	public void method1() {
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		
		Test1 t=new Interview();
		((Interview)t).method2();
		t.method1();
		
	}

}



