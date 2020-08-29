//To verify and count the read emails in an INBOX
package GoogleTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleTC_012 {

	public static void main(String[] args) throws InterruptedException {
		
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
	    
	    driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div")).click();
	   




		   


	    
}

}
