package week1.day2;

public class FindFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;int count=10;
int c;
System.out.println("The Fibonnacci series are :");
System.out.print(a+" "+b);
for(int i=2;i<=count;i++)
{
	c=a+b;
	System.out.print(" "+c);
	a=b;
	b=c;
}

	}

}
