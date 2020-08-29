/*TC_001_GoogleTest: - 1. To verify that the Google web page is launched successful
Author   :Bhagayshree kamble
Date     :29 july 2020
Version  :Oxygen.3a Release (4.7.3a)
Build id :20180405-1200
*/

package GoogleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTC_001 {

	@Test(priority=1)
	public static void verifyGoogleLaunch()
	{
		
    System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\CoreJava\\SeleniumWebdriver\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.google.co.in/");
    
    String expectedPageTitle = "Google";
    
    String actualTitle = driver.getTitle();
    
    if(expectedPageTitle.equals(actualTitle))
    
    {
        
    	System.out.println("Google web page is launched successful");
    }
    else
    {
    	System.out.println("Google web page is launched unsuccessful");
    	
    }
    }
  

}
