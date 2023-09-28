package week1.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.AbstractDriverOptions;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main/");
		//driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		
		//driver.close();
//Thread.sleep(20);
		//driver.close();
	}

}
