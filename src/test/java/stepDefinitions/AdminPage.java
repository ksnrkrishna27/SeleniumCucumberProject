package stepDefinitions;

import org.openqa.selenium.WebDriver;

import utils.Driver;

public class AdminPage {
	private WebDriver driver;


	public AdminPage() {
		this.driver = Driver.getDriver();
	}

	public void inAdminPage() {
		System.out.println("In Admin class");
	}

}
