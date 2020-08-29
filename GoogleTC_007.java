/*To validate that the Google performs the search operation properly.
Author   :Bhagayshree kamble
Date     :29 july 2020
Version  :Oxygen.3a Release (4.7.3a)
Build id :20180405-1200
*/
package GoogleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTC_007 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\CoreJava\\SeleniumWebdriver\\chromedriver.exe");
		    
		    WebDriver driver = new ChromeDriver();
		    
		    driver.get("https://www.google.co.in/");
		    
		    driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		   
	         String expectedtext="selenium";
	         
	          String actualtext="selenium";
	         
	          if(expectedtext.equals(actualtext))
	        	    
	          {
	              
	          	System.out.println("selenium link open");
	          }
	          else
	          {
	          	System.out.println("selenium link not open");
	          	
	          }
	}

}
