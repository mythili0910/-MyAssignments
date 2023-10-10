package week2.day4;

public class MethodOverload {

	public void reportStep(String  msg,String stat) {
		System.out.println(msg+" "+stat);
	}
	
	public void reportStep(String  msg,String stat,boolean snap) {
		System.out.println(msg+" "+stat+" "+snap);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverload mo=new MethodOverload();
mo.reportStep("msg1", "Stat1");
mo.reportStep("msg2", "Stat2", false);

	}

}
