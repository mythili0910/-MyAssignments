package week2.day4;

public class MethodOverride extends Sclass {

	public void add(int a,int b) {
		super.add(a,b);
		System.out.println("Printing from sub class");
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverride mo =new MethodOverride();
		mo.add(4, 5);
	
		
	}

}
