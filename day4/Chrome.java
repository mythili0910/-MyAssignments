package week2.day4;

public class Chrome extends Browser{
	public  void OpenIncognito(){
		System.out.println("OpenIncognito loaded successfully");
	}
	public void clearCache(){
		System.out.println("clearCache loaded successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chrome ch=new Chrome();
		ch.openURL();
		ch.navigateBack();
		ch.closeBrowser();
		ch.OpenIncognito();
		ch.clearCache();
		System.out.println(ch.browserVersion);
	}

}
