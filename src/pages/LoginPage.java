package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locator for username field
	By uName = By.id("userName");
		
	//Locator for password field
	By pswd = By.id("password");
		
	//Locator for login button
	By loginBtn = By.id("login");
	
	public void enterUsername(String userName) {
		driver.findElement(uName).sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		driver.findElement(pswd).sendKeys(password);
	}
	
	public void loginBtn() {
		driver.findElement(loginBtn).click();
	}

}
