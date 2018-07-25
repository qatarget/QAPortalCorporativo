package qa.target.portalcorporativo.core;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {

        private static WebDriver driver;

        @Before
        public static WebDriver getDriver()
        {
            if (driver == null)
                System.setProperty("webdriver.gecko.driver", "/home/target/driver/chromedriver"); //- utilizar no linux
                //driver = new FirefoxDriver();
                //driver = new ChromeDriver();

            return driver;
        }

        public static void killDriver()
        {
            if (driver != null)
            {
                driver.quit();
                driver = null;

            }
        }
}


