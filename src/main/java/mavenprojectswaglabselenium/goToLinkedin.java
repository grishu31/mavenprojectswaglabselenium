package mavenprojectswaglabselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class goToLinkedin {
	@BeforeTest
	public void startBrowser() {
		//configure the browser deriver
				WebDriverManager.chromedriver().setup();
				//open the browser
				WebDriver driver = new ChromeDriver();
				//open the url application
				driver.get("https://www.saucedemo.com/");	
	}
	@AfterTest
	public void closeBrowser() {
		 WebDriver driver = new ChromeDriver();
		// Close the browser 
	    driver.quit();	
	}
	@Test
	public void scrollTwitter() {
		WebDriver driver= new ChromeDriver(); 
		 driver.get("https://www.saucedemo.com/");
		 WebElement username=driver.findElement(By.id("user-name"));
			username.sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.xpath("//a[text()=\"LinkedIn\"]")).click();

	}
	
}
