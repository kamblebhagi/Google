/*To verify that all the Google apps (My Account, Search, Maps, YouTube, Play, News, Gmail, Drive, Calender, Google+, Translate, Photos) are launched properly.
Author   :Bhagayshree kamble
Date     :29 july 2020
Version  :Oxygen.3a Release (4.7.3a)
Build id :20180405-1200
*/
package GoogleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class GoogleTc_003 {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\CoreJava\\SeleniumWebdriver\\chromedriver.exe");
		    
		 WebDriver driver = new ChromeDriver();
		    
		 driver.get("https://www.google.co.in/");
		 
		 
		 driver.findElement(By.xpath("//*[@id='gbwa']/div/a")).click();

		 driver.switchTo().frame(0);
		 
		 List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		 
		 
		 for (int i = 0; i < alllinks.size(); i++) {
			
			 alllinks.get(i).click();
			 
			 Thread.sleep(1000);
			 
			 driver.navigate().back();
			 
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath("//*[@id='gbwa']/div/a")).click();
			
		}
		 
		 

		 for(WebElement cl:alllinks)
		 {
		     System.out.println(cl.getText());
		     if(cl.getText()!="")
		     {
		    	 Actions action = new Actions(driver); 
		    	 
	             action.keyDown(Keys.CONTROL).moveToElement(cl).click().perform();
	             
	             action.keyUp(Keys.CONTROL).perform();
	         

		     }

			 
	}

	}
	}
