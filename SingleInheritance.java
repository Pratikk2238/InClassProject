package InClassCodes;

public class SingleInheritance extends InheritanceExample{
	SingleInheritance(){
		
		System.out.println("this is default constructor of SingleInheritance class ");
		
	}
	SingleInheritance(int a , int b){
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
	public void method3() {
		System.out.println("this is method3 of SingleInheritance class");
	}
	

	public static void main(String[] args) {
		
		SingleInheritance obj=new SingleInheritance();
		System.out.println(obj.number);
		System.out.println(obj.s);
		obj.methode1();
		obj.method2();
		obj.method3();
		
		
		
	
	}

}
