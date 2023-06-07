package TestClass_Selenium4_TestNG_Jenkins_GitCloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassFor_LoginPage {
	
	public static WebDriver driver = null;
	
    @BeforeMethod
	public void setup() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
	}
	
    @AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
