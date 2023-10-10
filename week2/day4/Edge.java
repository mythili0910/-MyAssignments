package week2.day4;

public class Edge extends Browser {
	public  void takeSnap(){
		System.out.println("takeSnap loaded successfully");
	}
	public  void clearCookies(){
		System.out.println("clearCookies loaded successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Edge ed=new Edge();
ed.openURL();
ed.navigateBack();
ed.takeSnap();
ed.clearCookies();
	}

}
