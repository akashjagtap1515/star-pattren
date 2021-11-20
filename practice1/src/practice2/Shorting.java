package practice2;

public class Shorting {

	public static void main(String[] args) {
int a[]= {5,2,9,4,8};
int temp;
for(int i=0; i<a.length;i++)
{
	for(int j=0; j<a.length; j++)
	{
		if(a[i]<a[j])
		{
		temp = a[i];
		a[i] =a[j];
		a[j] = temp;
	}
}
}
for(int x=0; x<a.length; x++)
{
	
System.out.println(a[x]);
}

	}

}
