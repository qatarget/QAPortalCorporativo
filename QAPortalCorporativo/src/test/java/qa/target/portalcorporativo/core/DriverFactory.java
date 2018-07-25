package qa.target.portalcorporativo.core;

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
		if (driver == null)
			System.setProperty("webdriver.gecko.driver", "/home/target/driver/geckodriver"); // - utilizar no linux
			driver.manage().window().maximize();
		// driver = new FirefoxDriver();
		// driver = new ChromeDriver();
		// driver = new InternetExplorerDriver(); 

		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;

		}
	}
}
