package work.oct11;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryItFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
        driver.switchTo().frame(1);//frame index starts with zero
        //element is inside the frame
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Alert alert1 =driver.switchTo().alert();
       alert1.accept();
       
        //to get completely out of the frame to main content 
       // driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText());
        
	}

}
