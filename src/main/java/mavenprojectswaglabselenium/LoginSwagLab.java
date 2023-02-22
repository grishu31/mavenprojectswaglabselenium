package mavenprojectswaglabselenium;
	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class LoginSwagLab {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			 
			 driver.get("https://www.saucedemo.com/");
			 WebElement username=driver.findElement(By.id("user-name"));
				username.sendKeys("standard_user");
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.id("login-button")).click();
		
		
	}
		}


