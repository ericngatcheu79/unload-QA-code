package selenuimpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stivoclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
	        browserObject.findElement(By.name("name")).sendKeys("Francis");
	        browserObject.findElement(By.name("email")).sendKeys("francis@gmail.com");
	        browserObject.findElement(By.name("website")).sendKeys("www.francis.com");
	        browserObject.findElement(By.name("comment")).sendKeys("i like the website");
	        browserObject.findElement(By.name("submit")).click();
	}

}
