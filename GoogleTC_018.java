//To verify that the new label is properly created

package GoogleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleTC_018 {

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
 
	    driver.findElement(By.xpath("//*[@class='n6']")).click();
	   
	    Thread.sleep(2000);
	   
	    driver.findElement(By.linkText("Create new label")).click();
	    
	    driver.findElement(By.className("xx")).sendKeys("Team");
	    
	    driver.findElement(By.name("ok")).click();
	   
	}

}
