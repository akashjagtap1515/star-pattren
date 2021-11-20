package arrStrinPract;

import java.util.Scanner;
public class SequenceString {
	//Write character of string in alphabet sequence
	
	public static void main(String [] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String");
	String a =s.nextLine();
	
	String b= a.toUpperCase();
	System.out.println(b);
	
	char [] c = b.toCharArray();
	int d = c.length;//20
	char temp;
	
	for(int i =1; i<d; i++)
	{
		for(int j= 0; j<d-i; j++)
		{
			if(c[j] >c[j+1]) 
			{
				temp = c[j];
				c[j]= c[j+1];
				c[j+1]= temp;
			}
		}
	}
	System.out.println(c);
	

	}
}