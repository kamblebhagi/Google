/*To verify all the Google apps (My Account, Search, Maps, YouTube, Play, News, Gmail, Drive, Google+, Translate, Photos) in the dialog box 
Author   :Bhagayshree kamble
Date     :29 july 2020
Version  :Oxygen.3a Release (4.7.3a)
Build id :20180405-1200
*/
package GoogleTest;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTC_002 {



	@Test(priority=1)
	public static void verifyGoogleApps()
	
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\CoreJava\\SeleniumWebdriver\\chromedriver.exe");
		    
		 WebDriver driver = new ChromeDriver();
		    
		 driver.get("https://www.google.co.in/");
		    
		 driver.findElement(By.xpath("//*[@id='gbwa']/div/a")).click();

		 driver.switchTo().frame(0);
		 
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 
		 System.out.println(allLinks.size());
		 
		 for (WebElement actualLinks : allLinks)
		 {
			System.out.println(actualLinks.getText());
		 }
		
	    String expectedLinks[] = {"Account",
	    		"Search",
	    		"Maps",
	    		"YouTube",
	    		"Play",
	    		"News",
	    		"Gmail",
	    		"Meet",
	    		"Contacts",
	    		"Drive",
	    		"Calendar",
	    		"Translate",
	    		"Photos",
	    		"Duo",
	    		"Shopping",
	    		"Docs",
	    		"Sheets",
	    		"Slides",
	    		"Books",
	    		"Blogger",
	    		"Hangouts",
	    		"Keep",
	    		"Jamboard",
	    		"Earth",
	    		"Collections",
	    		"Arts and Culture",
	    		"More from Google"};
	   
	 
		/*if (expectedLinks.equals(actualLinks))
	    {
	    	System.out.println("Pass");
		}
	    else {
	    	
	    	System.out.println("Failed");
	    }*/
				
	}
}
