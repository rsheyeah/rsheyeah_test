package co.uk.rsheyeah.qa.util;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.Map;
import java.util.concurrent.TimeUnit;


/**
 * This class is used for setting up multiple browsers,
 * could include methods to  setup Firefox, setup Chrome,
 * and setup BrowerStack.
 */
public class TAWebDriver extends WebDriverException {
	private static WebDriver driver;
	private static final String PROPERTIES_FILE_USER = "user.properties";
	private static final String BROWSER              = "browser";
	private static final String CHROME               = "chrome";
	private static final String FIREFOX              = "firefox";
	private static final String BROWSERSTACK         = "browserstack";
	private static final String ERRORMSG_SLNI        = "Selenium client is not initialized";
	private static final String WEBDRIVER_NAME       = "webdriver_name";
	private static final String WEBDRIVER_LOCATION   = "webdriver_location";
	private static final String CAPABILITY_NAME      = "capability_name";
	private static final String CAPABILITY_VALUE  = "capability_value";

	private static Map<String, Object> userMap = ReadPropertiesFile.readFile(PROPERTIES_FILE_USER);

	@Before
	public static void setUp() throws Exception {
		String browser = userMap.get(BROWSER).toString();
		if (browser.equalsIgnoreCase(CHROME)) {
			//setChromeDriver();
		} else if (browser.equalsIgnoreCase(FIREFOX)) {
			setFirefoxDriver();
		} else if (browser.equalsIgnoreCase(BROWSERSTACK)) {
			//setBrowserStack();
		} else {
			//setFirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * @return the browser instance
	 */
	@SuppressWarnings("finally")
	public static WebDriver getDriver() {
		if (driver == null) {
			throw new IllegalStateException(ERRORMSG_SLNI);
		}
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			return driver.switchTo().defaultContent();
		}
	}

	/**
	 * Set the Firefox driver and the profile to set the browser in Javascript
	 * or non-Javascript mode
	 */
	public static void setFirefoxDriver() {

		System.setProperty(userMap.get(WEBDRIVER_NAME).toString(),userMap.get(WEBDRIVER_LOCATION).toString());
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(userMap.get(CAPABILITY_NAME).toString(), userMap.get(CAPABILITY_VALUE));
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	/**
	 * Set the chrome driver
	 * @throws Exception
	 */
	public static void setChromeDriver() throws Exception {

	}

	/**
	 * Set the browser stack
	 * @throws Exception
	 */
	public static void setBrowserStack() throws Exception {

	}

}
