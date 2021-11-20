package practice2;

public class Araay2 {

	public static void main(String[] args) {
int a[] = {12,36,75,65,85,14};
int b[]= new int [a.length];
int c= (a.length-1);
System.out.println("reverse of a");

for(int i=c; i>=0; i--)
{
	b[c-i]=a[i];
	
}
for(int x=0; x<=c; x++)
{

a=b;
System.out.println(a[x]);
}
	}

}
