package work.oct9;

//import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPhonePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		

		
		// WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		   
		List<WebElement> searchLink=driver.findElements(By.xpath("//input[@class='nav-input nav-progressive-attribute']"));
		searchLink.get(0).sendKeys("Phones",Keys.ENTER);
		
		
		//
		List<WebElement> phoneName=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<String> pNameList= new ArrayList<String>();
		
		for(int i=0;i<phoneName.size()-1;i++)
		{
			//System.out.println(phoneName.get(i).getText());
			String text=phoneName.get(i).getText().substring(0,20);
			pNameList.add(text);
			
		}
		
		//System.out.println(pNameList);
		
		List<WebElement> price=driver.findElements(By.xpath("//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-whole']"));
		
		List<Integer> priceList= new ArrayList<Integer>();
		
		
		for(int i=0;i<price.size()-1;i++)
		{
			//System.out.println(phoneName.get(i).getText());
			String plist =price.get(i).getText();
			plist=plist.replaceAll(",", "");
			int number=Integer.parseInt(plist);
			priceList.add(number);
		}
		
		//System.out.println(priceList);
		
		for(int i=0;i<priceList.size();i++)
		{
			System.out.println(pNameList.get(i)+"-->"+priceList.get(i));
			
		}
		
		
	}

}
