package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Driver {

	private static WebDriver driver = new ChromeDriver();

	@BeforeAll
	public static void createDriver() throws InterruptedException {

		AutoDownloadDrivers.deleteAndDownloadDriver();
		System.out.println("**********New Driver created**********");

	}

	public static WebDriver getDriver() {

		return driver;
	}

	@AfterAll
	public static void quitDriver() {

		driver.quit();
		System.out.println("**********Driver Closed**********");

	}

}
