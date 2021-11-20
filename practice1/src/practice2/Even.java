package practice2;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter no. of values");
		int no =s.nextInt();
	if(no%2==0)
	{
		System.out.println("no is even");
	}
	else {
		
	System.out.println("no. is odd");
	}
	}

}
