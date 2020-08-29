//To verify that the user is able to Sign-in into all the Google apps
package GoogleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTC_004 {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.gecko.driver", "E:\\Software Testing\\CoreJava\\SeleniumWebdriver\\geckodriver.exe");
     
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.google.com/");
     
     
	}

}
