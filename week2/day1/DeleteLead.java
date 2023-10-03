package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'crmsfa')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("912");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("778");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("5567");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).click();
		
		

	}

}
