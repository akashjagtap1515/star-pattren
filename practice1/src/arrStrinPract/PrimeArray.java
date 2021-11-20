package arrStrinPract;

public class PrimeArray {
	
	//find prime number from array

	public static void main(String[] args) {
   //int a[] = {10,15,26,17,9,11,25,13,47,43,90};
     
     
     int a[ ] = new int[5];
     a[0]= 15;
     a[1]= 17;
     a[2]= 25;
     a[3]= 9;
     a[4]= 11;
     
     
     
     for(int i = a.length-1; i>0; i-- ) 
    	 
     {
    	 if((a[i]%2!=0)&& (a[i]%3!=0) &&(a[i]%5!=0)&& (a[i]%7!=0))
    	 {
    		 System.out.println(" prime number is"  +a[i]);
    	 }
    	 
     }
     
	}

}
