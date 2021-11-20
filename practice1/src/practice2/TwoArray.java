package practice2;

public class TwoArray {
public static void main(String[] args) {
	       int [] a= {12,14,36,75,98,31};
	       int[] b = {2,4,6,8,10,12};
	       int c=(a.length-1);
	       int d[] = {0,0,0,0,0,0};
	for(int y=0; y<=c; y++ )
       {
		  d[y]=b[y];
    	}
	System.out.println("value of b is below");
	
    for(int y=0; y<=c;y++)
	  {
		b[y]=a[y];
		System.out.println(b[y]);
	  }

	System.out.println("value of a is below");
	
	for(int y=0; y<=c;y++)
	  {
		a[y]=d[y];
		System.out.println(a[y]);
	  }	
	}
}



