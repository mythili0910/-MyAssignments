package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSeMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://leafgrounds.com/xhtml");
driver.manage().window().maximize();
WebElement text=driver.findElement(By.name("j_idt88:j_idt91"));
System.out.println(text.getAttribute("value"));
//Thread.sleep(2000);
text.clear();
driver.close();
	}

}
