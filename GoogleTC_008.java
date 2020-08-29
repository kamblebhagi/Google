//To verify the Google apps/products on Google products webpage.

package GoogleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTC_008 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\CoreJava\\SeleniumWebdriver\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.google.co.in/");
	    
	    driver.findElement(By.xpath("//*[@id='gbwa']/div/a")).click();

		driver.switchTo().frame(0);
		
	    driver.findElement(By.linkText("More from Google")).click();
				 


		 
		
		
	    

	}

}
