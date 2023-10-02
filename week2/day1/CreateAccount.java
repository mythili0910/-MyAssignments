package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;

public class CreateAccount {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Initialize Web driver
			String text1="mythilitest account08";
			ChromeDriver driver=new ChromeDriver();
			
			//Load URL
			driver.get("http://leaftaps.com/opentaps/control/main/");
			
			//Maximize the browser window
			driver.manage().window().maximize();
			
			//Login
			
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			System.out.println(driver.findElement(By.tagName("h2")).getText());
			//driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.partialLinkText("CRM")).click();
			
			System.out.println(driver.getTitle());
			
			driver.findElement(By.linkText("Accounts")).click();
			driver.findElement(By.linkText("Create Account")).click();
			//Wait(1000);
			driver.findElement(By.id("accountName")).sendKeys(text1);
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			
			
			//driver.close();
		    //Select dd = new Select(source);
		    
		    //using the visible text
		    
//		    dd.selectByVisibleText("Direct Mail");
		    
		    //using the value attribute
		    
//		    dd.selectByValue("LEAD_DIRECTMAIL");
		    
		    //using index
		    //dd.selectByIndex(5);
		    
		    //driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("7500000");
		    
		    WebElement industry = driver.findElement(By.name("industryEnumId"));
		    Select dd_ind = new Select(industry);
		    dd_ind.selectByVisibleText("Computer Software");
		    
		    WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		    Select dd_own = new Select(ownership);
		    dd_own.selectByVisibleText("S-Corporation");
		    
		    WebElement source = driver.findElement(By.id("dataSourceId"));
		    Select dd_src = new Select(source);
		    dd_src.selectByValue("LEAD_EMPLOYEE");
		    
		    WebElement mcampaign = driver.findElement(By.id("marketingCampaignId"));
		    Select dd_cpn = new Select(mcampaign);
		    dd_cpn.selectByIndex(5);
		    
		    WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		    Select dd_sp = new Select(state);
		    dd_sp.selectByValue("TX");
		    
		    WebElement ca= driver.findElement(By.className("smallSubmit"));
		    ca.click();
		   
		    
		    //driver.findElement(By.partialLinkText("Account Details")).getText();
		    		    
		    System.out.println("Account created successfully with name :"+text1);
		   driver.close();
		    	    
					}

	}


	
