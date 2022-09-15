package InClassCodes;

public class Constructor1 {
	
	int id;
	String name;
	int rollno;
	String add;
	
	Constructor1(int id)
	{
		System.out.println(id);
			
	}
	
	Constructor1(int id,String name)
	{
		System.out.println(id+" "+name);
			
	}
	Constructor1(int id,String name, int rollno)
	{
		System.out.println(id+" "+name+" "+rollno);
			
	}
	
	Constructor1(int id,String name, int rollno, String add)
	{
		System.out.println(id+" "+name+" "+rollno+" "+add);
			
	}

	public static void main(String[] args) {
	
		Constructor con = new Constructor(20);
		Constructor con1 = new Constructor(20,"Amrendra Bahubali");
		Constructor con2 = new Constructor(20,"Amrendra Bahubali",1010);
		Constructor con3 = new Constructor(20,"Amrendra Bahubali",1010,"Maheshmati");
		
		
	}

}
