package week2.day4;

public class MethodOverride extends Sclass {
	public void message() {
	System.out.println("Printing from sub class");
	}
	public void add(int a,int b) {
		
		System.out.println(a+b);
		super.message();//calls superclass method
		message();//calls current class method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverride mo =new MethodOverride();
		mo.add(4, 5);
		
		
	}
	
}
