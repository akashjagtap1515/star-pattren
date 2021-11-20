package practice1;

public class Super {
	public int a= 1; //default constructor values
	public int b= 2;
	
	 public Super() //used to assign values of zero constructor
		{
		   a =33;
			  b=44;
		}
	 
	public void m2() //method no relation with this and super
	{
		 int a =85;
		int b = 75;
		
		 System.out.println(a);
		 System.out.println(b);
	}
}
