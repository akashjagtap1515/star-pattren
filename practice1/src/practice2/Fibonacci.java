package practice2;

public class Fibonacci {
	
	//fibonacci series is sum of previous two numbers

	public static void main(String[] args) {
		int b = 1;
		int a=0;
		System.out.print(a+ " "+b); // for printing first  2 values
		
		int c;
for(int x=1; x<=10; x++)
{
	c=a+b;
	System.out.print(" " +c); // for printing next values
	a=b;
	b=c;
}

	}

}
