package marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuytheValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement electronics=driver.findElement(By.xpath("//a[@title='ELECTRONICS']"))	;
		
		Actions build =new Actions(driver);
		build.moveToElement(electronics).perform();
		
		driver.findElement(By.xpath("//a[@title='Mobiles & Accessories']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@href='https://buythevalue.in/collections/smartphones']/img")).click();
			
		 String windowHandle = driver.getWindowHandle();
	        System.out.println(windowHandle);// address of the current window where the driver has control
	        //price.get(3).click();
	        
	        Set<String> windowHandles = driver.getWindowHandles();
	        
	        List<String> winHand = new ArrayList<String>(windowHandles);
	        // switch to the child window
	        driver.switchTo().window(winHand.get(1));
	        System.out.println(driver.getTitle());
	        
	        driver.findElement(By.xpath("//a[@class='product-title']")).click();
	        
	        //Set <WebElement> p=LinkedSet<>driver.findElements(By.xpath("//div[@id='collapse-tab1']/p"));
	        
	        WebElement phoneDetails = driver.findElement(By.xpath("//div[@id='collapse-tab1']/p"));     
	        List<WebElement> paras = phoneDetails.findElements(By.tagName("p"));

	        System.out.println("Size = " + paras.size() + "   " + paras.toString() );

	        for (WebElement para : paras) {
	          System.out.println(para.getText());}
	        
	        
	        String details =driver.findElement(By.xpath("//div[@class='shop-detail-content buy-now']//h1")).getText();
	        System.out.println(details);
	        
	        // switch back to the parent
	       // driver.switchTo().window(winHand.get(0));
	        
	        //Enter a Zipcode.


	    	driver.findElement(By.xpath("//input[@id='wk_zipcode']")).sendKeys("638104");
	    	
	    	//Click on the "Check" button.

	    	driver.findElement(By.xpath("//input[@value='Check']")).click();
	    	
	    	//Click on "Add to Cart."

	    	driver.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();
	    
	    	//Click on the "View" button.
	    	WebElement viewbutton = driver.findElement(By.xpath("//div[@class='ajax-success-cbox cbox']"));
	    	JavascriptExecutor js = (JavascriptExecutor) driver;  
	    	js.executeScript("arguments[0].style.visibility='visible'", viewbutton);
	    	viewbutton.click();
	    	
   	
	    	//driver.findElement(By.xpath("//a[text()='View Cart']")).click();
	    	//driver.findElement(By.xpath("//span[@data-hover='View Cart']")).click();
	    	
//	    	Click on the "Checkout" button.
	    	driver.findElement(By.xpath("//input[@id='checkout']")).click();
//	    	Handle any alerts or pop-up dialogs that appear.
	    	Alert alert = driver.switchTo().alert();   
			 System.out.println(alert.getText());
			 alert.accept();
//	    	Click on the checkbox to agree to the terms and conditions.
			 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//	    	Click on the "Checkout" button.
			 driver.findElement(By.xpath("//input[@id='checkout']")).click();
//	    	Close the web browser.
			 
		driver.quit();
	
	}

}
