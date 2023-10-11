package work.oct11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBrowserNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.switchTo().frame(0);		
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);		
		driver.switchTo().frame("frame2");	
		driver.findElement(By.id("Click")).click();
		
	}

}
