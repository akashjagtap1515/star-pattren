package practice2;

public class SubSub  extends SubMoh{

	public void m1()
	{
		System.out.println("sub sub m1");
	}
	
	public void m5()
	{
		System.out.println("sub sub m5");
	}
	
	public static void main(String[] args) {
		 
		Task d =  new SubSub();
	//	d.m1();
		//d.m2();
	//	d.m4();
		//d.m3();
	//	d.m5();
		
		SubMoh f =  new SubSub();
		f.m1();
	//	f.m2();
	//	f.m3();
	//	f.m4();
	//	f.m5();
		
		SubMoh g= new SubMoh();
	//	g.m1();
	//	g.m2();
	//	g.m3();
	//	g.m4();
		//g.m5();
		
		
	}
}
