package practice1;
public class ThisAndSuper extends Super {
	static int a =10;
	int b = 20;
	
	public void m1()
	{
		 int a= 15;
		 int b = 25;
		 System.out.println(a);
		 System.out.println(b);
		 
		 System.out.println(ThisAndSuper.a);
		 System.out.println(this.b);  //this keyword
		 
		 System.out.println(super.a); //super keyword
		 System.out.println(super.b);		
	}

	public static void main(String[] args) {
		
		 ThisAndSuper o =new ThisAndSuper(); //obj calling for nonstatic method
		 o.m1();
		 
		 ThisAndSuper s =new ThisAndSuper(); //obj calling for super method call
		s.m2();
		
		
	}
	
	

}
