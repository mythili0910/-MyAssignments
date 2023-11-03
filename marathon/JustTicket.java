package marathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class JustTicket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//*ChromeOptions code to handle the browser notification
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);

		driver.get("https://www.justickets.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.className("search")).sendKeys("Chennai");
		
		List<WebElement> city=driver.findElements(By.xpath("//div[@class='city shadow-small']"));
		
		for(int i=0;i<city.size();i++)
		{
			String cityName=city.get(i).getText();
			if(cityName.equalsIgnoreCase("Chennai")){
				city.get(i).click();
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains (@class,'poster')][1]")).click();
	
		WebElement movieName=driver.findElement(By.xpath("//div[@class='header']/h2"));
		if(movieName.isDisplayed()) {
		System.out.println("MovieName: "+movieName.getText());
		}
		else {
			System.out.println("MovieName is not visible ");
		}
		
		WebElement bookDay=driver.findElement(By.xpath("(//div[@class='date shadow-small undefined'][1]/span)[1]"));
		System.out.println("Booking Day "+bookDay.getText());
		
		WebElement bookDate=driver.findElement(By.xpath("(//div[@class='date shadow-small undefined'][1]/span)[2]"));
		System.out.println("Booking Date "+bookDate.getText());
		
		WebElement bookTime=driver.findElement(By.xpath("//a[@class='schedule available'][1]"));
		System.out.println("Booking Time "+bookTime.getText());
		bookTime.click();
		
		//driver.switchTo().alert().accept();		
		driver.findElement(By.xpath("//button[@class='swal2-confirm swal-confirm styled']")).click();
		
		/*
		List< WebElement> element = driver.findElements(By.xpath("//div[@class='label']"));
		int count = element.size();
		int seatcount=0;
		for (int i=1; i <= count && seatcount<2; i++){
		    // now make an unique XPATH element using brackets 
		   
		    if (element.get(i).isEnabled()) 
		    {
		        element.get(i).click();
		        seatcount++;
		    }
		}
		*/
		Actions build = new Actions(driver);
		
		
		WebElement seat1=driver.findElement(By.xpath("//div[text()='J09']"));
		WebElement seat2=driver.findElement(By.xpath("//div[text()='J08']"));
	
		Thread.sleep(5000);
		build.keyDown(Keys.CONTROL).click(seat1).click(seat2).keyUp(Keys.CONTROL).perform();
		
		
//		if (seatcount<2){
//			System.out.println("Seats not available");
//					}
		driver.findElement(By.xpath("//div[@class='box progress enabled']/span")).click();
		

List<WebElement> ele=driver.findElements(By.xpath("//div[@class='box']"));
//for (int i=0; i <= 2; i++){
//build.moveToElement(ele.get(i)).perform();
//System.out.println(ele.get(i).getText());
//}
System.out.println(ele.get(0).getText());
System.out.println(ele.get(1).getText());
System.out.println(ele.get(2).getText());

//String totalCost=driver.findElement(By.xpath("//div[@class='heading grand-total']/span)[2]")).getText();
//System.out.println("Total Cost"+totalCost);

Thread.sleep(5000);
driver.findElement(By.xpath("//div[text()='Pay with  Credit / Debit Card ']")).click();

driver.findElement(By.xpath("//div[@class='card']/input")).sendKeys("1234567890");

driver.findElement(By.xpath("//label[text()='Expiry Date']/following::input")).sendKeys("08/29");
driver.findElement(By.xpath("//label[text()='CVV']/following::input")).sendKeys("987");
driver.findElement(By.xpath("//label[text()='Name']/following::input")).sendKeys("Arun");
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("arun2334@gmail.com");
driver.findElement(By.xpath("//span[text()='+91']/following::input")).sendKeys("9876543201");
WebElement makePaymentButton=driver.findElement(By.xpath("//span[text()='Enter Valid Card Number']"));
//if(!makePaymentButton.isEnabled()) {
//	System.out.println("Enter Valid Card Details");
//}

driver.close();

	}
}
