package selenuimpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yoanfill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of WebDriver to perform google search through chrome web browser. 
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				// 2. Initialize WebDriver object through ChromeDriver class.
				WebDriver browserObject = new ChromeDriver();
				// 3. Open the web page www.google.com
				browserObject.get("https://www.google.com/");
				browserObject.findElement(By.name("q")).sendKeys("selenium python");
				browserObject.findElement(By.name("gLFyf")).submit();
				
				
	}

}
