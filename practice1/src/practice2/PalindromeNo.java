package practice2;

public class PalindromeNo {

	public static void main(String[] args) {
		
		// using for loop
		int i =141;
		int b=0; 
		for(int a=i; a>0; a=a/10) 
		{
			
			int c= a%10; //3 2 1
			b= b*10+c; // 
				
		}
		 System.out.println(b);
		 
		 if (i==b)
			 System.out.println(i+ " is palindrome");
		 else
			 System.out.println(i+ " is not palindrome");
		
	}
}
