package practice2;

public class SubMoh extends Task{
	
	public void m1()
	{
		System.out.println("sub m1");
	}
	
	public void m3()
	{
		System.out.println("sub m3");
	}

	
	public static void main(String[] args) {
		Task r = new Task(); //super class name Task
	//	r.m1();
		//r.m2();
		//r.m3(); not in Task class
		
		SubMoh s = new SubMoh(); // sub class name SubMoh
	//	s.m1(); // override non static
	//	s.m2(); //static method stored in static way not override
	//	s.m3(); // from sub normal call
		
		
		Task t = new SubMoh();// upcasting
		t.m1();
		t.m2();
	//	t.m3();
		t.m4();
		
		
	//	means in upcasting we can access only super class method and also overriden 
	//	method but not methods from sub class 
		
	}
}
