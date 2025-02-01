package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Driver;

public class LoginPage {

	private WebDriver driver;

	AdminPage adminPage = new AdminPage();

	public LoginPage() {
		this.driver = Driver.getDriver();
	}

	@Given("User Land into Login Page")
	public void userLandIntoLoginPage() {
		this.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		System.out.println("Navigated to Login Page");
	}

	@And("User Enter the Username <{string}>")
	public void userEnterTheUsername(String username) {
		this.driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		System.out.println("Username Entered");
	}

	@And("User Enter the Password <{string}>")
	public void userEnterThePassword(String password) {
		this.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		System.out.println("Password Entered");
	}

	@When("User clicks on Login button")
	public void userClicksOnLoginButton() {
		this.driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		System.out.println("Clicked on Login Button");
	}

	@Then("<{string}> should be displayed")
	public void DashboardshouldBeDisplayed(String dashboard) {
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String text = this.driver.findElement(By.xpath("//span/h6")).getText();
		System.out.println("Text displayed : " + text);
		Assert.assertEquals(text, dashboard);
		System.out.println("Dashboard Displayed");
	}

}
