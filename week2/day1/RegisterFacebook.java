package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();

driver.get("https://en-gb.facebook.com");

driver.manage().window().maximize();

driver.findElement(By.partialLinkText("Create new account")).click();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

driver.findElement(By.name("firstname")).sendKeys("Nalan");
driver.findElement(By.name("lastname")).sendKeys("Anand");
driver.findElement(By.name("reg_email__")).sendKeys("Nalan2812@gmail.com");
driver.findElement(By.name("reg_passwd__")).sendKeys("Abcd@1234");

WebElement bday = driver.findElement(By.name("birthday_day"));
Select dd_day = new Select(bday);
dd_day.selectByValue("28");

WebElement bmon = driver.findElement(By.name("birthday_month"));
Select dd_mon = new Select(bmon);
dd_mon.selectByVisibleText("Dec");

WebElement byear = driver.findElement(By.name("birthday_year"));
Select dd_yr = new Select(byear);
dd_yr.selectByValue("1980");
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

driver.findElement(By.linkText("Female")).click();



//driver.close();
	}

}
