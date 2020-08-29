/*To verify that clicking on the language links (Hindi, Marathi etc) launches Google in respective language
Author   :Bhagayshree kamble
Date     :29 july 2020
Version  :Oxygen.3a Release (4.7.3a)
Build id :20180405-1200 */

package GoogleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleTC_005 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\CoreJava\\SeleniumWebdriver\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.google.co.in/");
	    
	    WebElement lang = driver.findElement(By.xpath("//*[@id='SIvCob']"));
	    
	    List<WebElement> langlist = lang.findElements(By.tagName("a"));
	    
          int Size = langlist.size();
		
		System.out.println("Size: "+Size);
		
		for (WebElement langtext : langlist)
		 {
			System.out.println(langtext.getText());
		 }
         
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'हिन्दी')]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[2]"));
		
		String expectedtext = "आज मेरी किस्मत अच्छी है";
		    
		    String actualtext = "आज मेरी किस्मत अच्छी है";
		    
		    if(expectedtext.equals(actualtext))
		    
		    {
		        
		    	System.out.println("text is changed");
		    }
		    else
		    {
		    	System.out.println("text is not changed");
		    	
		    }

		WebElement langs = driver.findElement(By.xpath("//*[@id='SIvCob']"));
		    
		    List<WebElement> langlists = langs.findElements(By.tagName("a"));
		    
	          for (WebElement langtexts : langlists)
			 {
				System.out.println(langtexts.getText());
			 }


	}

}
