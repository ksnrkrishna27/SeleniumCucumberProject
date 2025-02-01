package utils;

import java.io.File;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoDownloadDrivers {

	public static void deleteAndDownloadDriver() {
		File chromeDriverFile = new File("./Resources/drivers/chromiumDrivers");

		if (chromeDriverFile.list() != null && chromeDriverFile.list().length > 0) {
			System.out.println("Deleting chromeDriver...");
			deleteDirectory(chromeDriverFile);
		}

		WebDriverManager.chromedriver().cachePath("./Resources/drivers/chromiumDrivers").setup();

		File chromeVersion = new File("./Resources/drivers/chromiumDrivers/chromedriver/win64");

		System.out.println("New chromeDriver Version Downloaded : " + chromeVersion.list()[0]);

		System.setProperty("webdriver.chrome.driver", "./Resources/drivers/chromiumDrivers/chromedriver/win64/"
				+ chromeVersion.list()[0] + "/chromedriver.exe");

	}

	public static void deleteDirectory(File file) {
		String[] files = file.list();
		if (files != null) {
			if (files.length > 0) {
				File subFolder = new File(file, files[0]);
				deleteDirectory(subFolder);
			}
		}
		file.delete();

	}

}
