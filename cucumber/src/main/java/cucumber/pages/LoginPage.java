package cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	/*
	 * Page Objects
	 * 
	 */
	By loginlink = By.cssSelector("ul li a.ico-login");
	By uname = By.id("Email");
	By password = By.id("Password");
	/*
	 * Page Object Methods
	 */
	
	public void clickLoginLink() {
		driver.findElement(loginlink).click();
	}
	
	public void enterEmail(String email) {
		driver.findElement(uname).clear();
		driver.findElement(uname).sendKeys(email);
	}

	public void enterPassword(String pass) {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
	}
}
