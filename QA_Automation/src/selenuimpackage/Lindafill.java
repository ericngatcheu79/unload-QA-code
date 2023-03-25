package selenuimpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lindafill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 // 2. Initialize Webdriver object through ChromeDriver class.
	    ChromeDriver browserObject = new ChromeDriver();
	    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
	    browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
	    browserObject.findElement(By.name("name")).sendKeys("Linda");
	    browserObject.findElement(By.name("email")).sendKeys("linda@gmail.com");
	    browserObject.findElement(By.name("website")).sendKeys("www.linda.com");
	    browserObject.findElement(By.name("comment")).sendKeys("I like this website");
	    browserObject.findElement(By.name("submit")).click();
	    
	    
	}

}
