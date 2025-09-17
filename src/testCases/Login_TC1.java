package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;

public class Login_TC1 {
	
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/books");
		driver.manage().window().maximize();
		
		HomePage home = new HomePage(driver);
		
		LoginPage login = new LoginPage(driver);
		
		home.clickLogin();
		
		
		login.enterUsername("gunjankaushik");
		login.enterPassword("Password@123");
		
		login.loginBtn();
		
	}

}
