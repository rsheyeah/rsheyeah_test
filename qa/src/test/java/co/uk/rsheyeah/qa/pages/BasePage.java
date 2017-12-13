package co.uk.rsheyeah.qa.pages;

import co.uk.rsheyeah.qa.pages.mendeley.*;
import co.uk.rsheyeah.qa.util.Helper;
import co.uk.rsheyeah.qa.util.ReadPropertiesFile;
import co.uk.rsheyeah.qa.util.TAWebDriver;
import org.openqa.selenium.By;

import java.util.Map;

/**
 * This class models the base page of the website and has ref to the diff screen components
 * like the menu bar for navigation, Sign In, Register, Welcome , Mendeley feed pages.
 */
public class BasePage {
	private static final String HOMEPAGE = "http://www.mendeley.com";
	private static final By HOMEPAGE_TITLE = By.xpath("html/head/title");
	protected static final String PROPERTIES_FILE_USER = "user.properties";
	protected static Map<String, Object> userMap = ReadPropertiesFile.readFile(PROPERTIES_FILE_USER);
	protected static final String PAGE_TITLE_XPATH = "PAGE_TITLE_XPATH";
	protected static final By PAGE_TITLE = By.xpath(userMap.get(PAGE_TITLE_XPATH).toString());

	private TAWebDriver driver;
	private MenuBar theMenu;
	private GSignIn gSignIn;
	private Register registration;
	private Welcome welcomepg;
	private Helper helper;
	private MendeleyFeed mFeed;

	public BasePage() {

	}

	public BasePage(TAWebDriver driver){
		this.driver = driver;
		this.theMenu = new MenuBar(driver);
		this.gSignIn = new GSignIn(driver);
		this.helper = new Helper(driver);
		this.registration = new Register(driver);
		this.welcomepg = new Welcome(driver);
		this.mFeed = new MendeleyFeed(driver);
	}

	public BasePage open(){
		driver.getDriver().get(HOMEPAGE);
		return this;
	}
	public MenuBar menuBar(){
		return theMenu;
	}

	public GSignIn signIn(){
		return gSignIn;
	}

	public Register register(){
		return registration;
	}

	public Welcome welcome(){
		return welcomepg;
	}

	public MendeleyFeed mendeleyFeed(){
		return mFeed;
	}
}
