package selenuimpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextclass {

	private static ChromeDriver browserObject;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of WebDriver to perform "linktext" through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 2. Initialize WebDriver object through ChromeDriver class.
        browserObject = new ChromeDriver();
       
	// 3. Open the web page https://www.google.com/
        browserObject.get("https://www.google.com/");
        WebElement bloglink =browserObject.findElement(By.linkText("Gmail"));
		if (bloglink.isDisplayed() ){
        	System.out.println("Gmail link is displayed usinglinktext");
        	
        }else {
        	System.out.println("unable to find Gmail");
        	
        }
        browserObject.close();
        
	}

}
