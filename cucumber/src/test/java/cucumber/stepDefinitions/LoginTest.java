package cucumber.stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	public static WebDriver driver;
	public static LoginPage loginPage;

	@Given("user navigate to site url {string}")
	public void user_navigate_to_site_url(String string) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\alpha\\cucumber\\cucumber\\drivers\\chromedriver.exe");
//    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
	}

	@When("user click on login link")
	public void user_click_on_login_link() throws InterruptedException {
		loginPage.clickLoginLink();
		Thread.sleep(2000);
	}

	@When("user enter email address {string}")
	public void user_enter_email_address(String uname) {
		loginPage.enterEmail(uname);
	}

	@When("user enter password {string}")
	public void user_enter_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("click on login button")
	public void click_on_login_button() {

	}

	@Then("validate login success")
	public void validate_login_success() {
		driver.quit();
	}

	@When("user login to app with username and password")
	public void user_login_to_app_with_username_and_password(DataTable usercredentials) throws Throwable {

		// Write the code to handle Data Table
		List<List<String>> data = usercredentials.cells();
		for (int i = 0; i < usercredentials.cells().size(); i++) {
			loginPage.enterEmail(data.get(i).get(0));
			loginPage.enterPassword(data.get(i).get(1));
			Thread.sleep(500);
		}
		// This is to get the first data of the set (First Row + First Column)

	}

}
