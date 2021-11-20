package arrStrinPract;
import java.util.Scanner;
public class DescArray {
     // Arrange array in descending order using Scanner
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter no. of values");
		int no =s.nextInt();
		
		int [] a = new int[no];
         System.out.println("Enter the Array Element");	
         for(int x =0; x<no; x++)
         {
        	a[x]=s.nextInt();
         }
		
		
		
		
		
//int a [] = {1,10,25,85,51,45,67,5,100};
int temp;
for(int i = 0; i<a.length; i++)
{
	for (int j= i+1; j<a.length;j++)
	{
		if(a[i] <a[j])
		{
			temp=a[i];
			a[i]= a[j];
			a[j]= temp;
		}
	}
}
for(int k = 0; k<a.length;k++)
{
	System.out.println(a[k]);
}





	}

}
