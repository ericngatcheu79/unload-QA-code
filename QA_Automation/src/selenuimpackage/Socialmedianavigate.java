package selenuimpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Socialmedianavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of WebDriver to perform navigate on icons through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
	        WebDriver browserObject=new ChromeDriver();
		// 3. Open the web page https://www.itlearn360.com/
	        browserObject.get("https://www.itlearn360.com/");
	        browserObject.findElement(By.className("fa-facebook")).click();
	        browserObject.navigate().back();
	        browserObject.findElement(By.className("fa-twitter")).click();
	        browserObject.navigate().back();
	        browserObject.findElement(By.className("fa-instagram")).click();
	        browserObject.navigate().back();
	        browserObject.findElement(By.className("fa-whatsapp")).click();
	        browserObject.navigate().back();
	        browserObject.findElement(By.className("fa-linkdin")).click();
	        browserObject.navigate().back();
	        browserObject.close();
	        
	        

	}

}
