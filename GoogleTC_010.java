//To verify the total no. of emails received by the user

package GoogleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleTC_010 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Software Testing\\CoreJava\\SeleniumWebdriver\\geckodriver.exe");
	    
	    WebDriver driver = new FirefoxDriver();
	    
	    driver.get("https://mail.google.com/");
	    
	    WebElement userID = driver.findElement(By.xpath("//*[@type='email']"));

	    userID.sendKeys("selenium.waytwoautomation@gmail.com");

	    WebElement idNxtBtn = driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[2]"));

	    idNxtBtn.click();

	    new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='password']"))).sendKeys("selenium@123");

	    WebElement passNxtBtn = driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/div[2]"));

	    passNxtBtn.click();
	    
        driver.findElement(By.linkText("Inbox")).click();
        
	    WebElement receive = driver.findElement(By.xpath("//*[@id=':1\']/div/div/div[4]/div[2]"));
	  
	    List<WebElement> received_email = receive.findElements(By.tagName("tr"));
	     
	    int Size = received_email.size();
		
		System.out.println("received_email count is: "+Size);
	}

}
