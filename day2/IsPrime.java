package week1.day2;
import java.util.Scanner;//imports scanner class.
public class IsPrime {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
Scanner myObj = new Scanner(System.in)) {
	System.out.print("Enter the Number you would like to check:\n");
		int a=myObj.nextInt();
		int flag=0;
		int i;
		if (a==0 ||a==1) flag=1;// 1 and 0 are not prime
		for(i=2;i<=a/2;i++) {
			if(a%i==0) {
			flag=1;
			break;
			}
		}
			if (flag==1) System.out.println(a+" Is not prime number");
			else System.out.println(a+" Is a prime number");
}
	}
	

}

