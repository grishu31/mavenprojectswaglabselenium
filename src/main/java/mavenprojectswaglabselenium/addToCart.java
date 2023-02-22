package mavenprojectswaglabselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addToCart {
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
	public void clickOnCart() {
		//Configure the browser driver
		WebDriverManager.chromedriver().setup();
		//Step 1- Open the bowser
		WebDriver driver= new ChromeDriver();
		//Step 2- Open the URL/Application
		driver.get("https://www.saucedemo.com/");
		//step 3- Enter user-name
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		//step 4- Enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//Step 5- Click on login button
		driver.findElement(By.id("login-button")).click();
		//add to cart
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//check product is added or not 
		driver.findElement(By.id("shopping_cart_container")).click();
	}
	

}
