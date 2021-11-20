package arrStrinPract;

public class LcmNo {

	public static void main(String[] args) {
		// lcm is between min. two nos ,lcm is first common among these numbers
		
	int a =12, b= 18,lcm=0;
	lcm= (a>b)? a:b; //it is ternary operator. its shorthand for certain kinds
	//if statements.In that expression within the parenthesis is evaluated as a
	// boolean,if condition true, then lcm =a otherwise lcm = b;

	while(true)
	{
		if(lcm%a==0 && lcm%b==0) // 60%20==0 60%30==00
		{
			System.out.println(lcm);
			break;
		}
		++lcm;
	}
	}

}
