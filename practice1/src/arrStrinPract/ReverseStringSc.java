package arrStrinPract;

import java.util.Scanner;

public class ReverseStringSc {
	//Reverse the string using scanner class.
	

	
	
	public static void main(String[] args) {
		
		Scanner v= new Scanner(System.in);
		System.out.println("Enter the String");
		 String a = v.nextLine();
		
		
		int b =(a.length()-1);
		String c = "" ;
		
		for(int i =b ; i>=0; i--)
		{
		c=c + a.charAt(i);
		}
		System.out.println("Reverse of String is: "+ c);
 
		
		

	}

}
