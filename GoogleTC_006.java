/*To open and close the browser
 Author   :Bhagayshree kamble
Date     :29 july 2020
Version  :Oxygen.3a Release (4.7.3a)
Build id :20180405-1200
 */
package GoogleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTC_006 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\CoreJava\\SeleniumWebdriver\\chromedriver.exe");
	    
		 WebDriver driver = new ChromeDriver();
		    
		 driver.get("https://www.google.co.in/");
		 
		 Thread.sleep(3000);
		 
	     driver.close();

	}

}
