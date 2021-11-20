package arrStrinPract;

import java.util.Scanner;

public class No_of_charWord_InStr {
	

	public static void main(String[] args) {
 
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String ");
	String a = s.nextLine();
	
	//a=Akash
	
	int b= (a.length());
	
	System.out.println(b); //no. of length including space
	
	String c = a.replace(" ", "");
	
	System.out.println(c.length());// no. of length without space
	int count =1;
	
	//no. of words present in string
	
	String d = a.toLowerCase();
	System.out.println(d);
	for(int i =0; i<d.length(); i++)
	{
	
	if((d.charAt(i) ==' ') &&(d.charAt(i+1)!=' '))
	{
		count++ ;
	}
	
	}
	System.out.println(count);
		
	
	
	}

}


