package practice2;

public class Sub1  {
	
	public void m3()
	{
		System.out.println("m3 sub");
	}
	
	public void m1() //override
	{
		System.out.println("m1 sub");
	}
	
	public static void main(String[] args) {
		
		Sub1 s = new Sub1(); //normal inheritance
	//	s.m1(); 
	//	s.m2();
	//	s.m3();
		
		Super1 d=new Super1(); // normal
	//	d.m1();
		
		
		
	
		
		
		
		
		
	}

}
