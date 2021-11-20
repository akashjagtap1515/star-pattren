package practice2;

public class Armstrong {

	public static void main(String[] args) {
		
int no1=2;
int no2=5;
int no3=3;
 int d= no1* no1* no1;
 int e= no2* no2* no2;
 int f=no3* no3* no3;
 
 int	sum=no1*100+no2*10+no3;
 
 if(d+e+f==sum)
 {
	 System.out.println("no is armstrong no.");
 }
 else {
	 System.out.println("no is not armstrong");
 }
	}

}
