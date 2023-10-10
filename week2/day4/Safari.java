package week2.day4;

public class Safari extends Browser{
	public  void OpenIncognito(){
		System.out.println("OpenIncognito loaded successfully");
	}
	public  void clearCache(){
		System.out.println("clearCache loaded successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Safari sf=new Safari();
sf.OpenIncognito();
sf.clearCache();
sf.openURL();
sf.navigateBack();
sf.closeBrowser();
	}

}
