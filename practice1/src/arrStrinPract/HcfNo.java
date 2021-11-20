package arrStrinPract;

public class HcfNo {

	public static void main(String[] args) {
		// hcf is highest commom factor between two number
		//formula lcm *hcf = no1* no2 (to find lcm and hcf in another way)
		
		int a =12, b= 18,hcf=0;
		hcf= (a>b)? b:a; 
	
		
		while(true)
		{
			if(a % hcf==0 && b % hcf==0)
			{
				System.out.println(hcf);
				break;
			}
			--hcf;
		
		}

	}

}
