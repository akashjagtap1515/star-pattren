package practice2;

public class ArmstrongNo {

	public static void main(String[] args) {
//int a= 153;
//int b=0;
//int c;
//while (a>0) 
//{
	//c= a % 10; //
	//b = c*c*c+b; 
	//a= a / 10; // 
//}
//System.out.println(b+ " is armstrong no");
	


		int b=0; // using for loop
		int i =1634;
		for(int a=i; a>0; a=a/10)
		{
			
			int c;
			c= a%10;
			b= c*c*c*c+b;
			
		}
		
		if(i==b)
		{
		System.out.println(i + " is armsrong");
		}
		else
		{
			System.out.println(i + " is not armstrong");
		}
		}

	}
