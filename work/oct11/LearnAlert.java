package work.oct11;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::button[contains(@class,'left ui-button-success')]")).click();
		Alert alert = driver.switchTo().alert();   
		 System.out.println(alert.getText());
		 alert.sendKeys("mythili");
	     alert.accept();
		 String str=driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		 System.out.println(str);
		 
		 driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::button[contains(@class,'left ui-button-success')]")).click();
			Alert alert1 = driver.switchTo().alert();   
			 System.out.println(alert1.getText());
			 alert1.sendKeys("mythili");
			 alert1.dismiss();
			 String str1=driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
			 System.out.println(str1);
		 
	}

}
