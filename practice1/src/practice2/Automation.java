package practice2;

public class Automation {
	int a=1;
	Automation()
	{
      a=3;
	}
	
	Automation(int x)
	{
      a=7;
	}
	
	Automation(char x)
	{
      a=8;
	}
	
	Automation(char x,int y)
	{
      a='w';
	}
	
	char b='z';
	Automation(char y,char q)
	{
      a=10;
      b='s';
	}
	
	
	
public static void main(String[] args) {
	Automation d=new Automation();
	System.out.println(d.a);
	
	Automation e=new Automation(5);
	System.out.println(e.a);

	Automation f=new Automation('1');
	System.out.println(f.a);
	
	Automation g=new Automation('1',6);
	System.out.println(g.a);
	
	Automation h=new Automation('1','6');
	System.out.println(h.a);
	System.out.println(h.b);
	
}
}
