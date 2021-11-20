package arrStrinPract;

import java.util.Scanner;

public class LargestNo_Array {

	public static void main(String[] args) {
		
		//  find Largest number from array 
		
		int a [] = {51, 2, 13 , 74 ,8, 50};

		  int b= a[0];
		   for(int i =0; i<6; i++)
		     {
			if(a[i]>b)
				b=a[i];
		      }
		   System.out.println("largest number is " +b);

	}

}
