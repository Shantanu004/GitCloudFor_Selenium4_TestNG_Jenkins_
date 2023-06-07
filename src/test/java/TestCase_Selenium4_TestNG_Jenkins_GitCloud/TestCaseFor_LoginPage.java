package TestCase_Selenium4_TestNG_Jenkins_GitCloud;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TestClass_Selenium4_TestNG_Jenkins_GitCloud.ClassFor_LoginPage;

public class TestCaseFor_LoginPage extends ClassFor_LoginPage {

	@Test
	public void validUsernamePasswordForLoginPage() {

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		System.out.println("Sucessfully Login");		
	}

	@Test
	public void InvalidUsernameValidPasswordForLoginPage() {

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user1");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		System.out.println("Login Fail");		
	}

	@Test
	public void validUsernameInvalidPasswordForLoginPage() {

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce1");
		driver.findElement(By.id("login-button")).click();

		System.out.println("Login Fail");		
	}
	
	@Test
	public void InvalidUsernameInvalidPasswordForLoginPage() {

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user1");
		driver.findElement(By.id("password")).sendKeys("secret_sauce1");
		driver.findElement(By.id("login-button")).click();

		System.out.println("Login Fail");		
	}
}
