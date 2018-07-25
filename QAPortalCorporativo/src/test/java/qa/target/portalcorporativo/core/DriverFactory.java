package qa.target.portalcorporativo.core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {
	}

	@Before
	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "/home/target/driver/chromedriver"); // Driver Chrome
			// System.setProperty("webdriver.gecko.driver",
			// "/home/target/driver/geckodriver"); //Driver Firefox
			driver = new ChromeDriver();
			// WebDriver driver = new FirefoxDriver();
		}

		return driver;
	}

	@After
	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;

		}
	}
}
