package co.uk.rsheyeah.qa.pages.mendeley;

import co.uk.rsheyeah.qa.pages.BasePage;
import co.uk.rsheyeah.qa.util.TAWebDriver;
import co.uk.rsheyeah.qa.util.Helper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * This class is used to setup the Cookie Bar component of the Hompage, and
 * contains methods to check if the Cookie Bar, and relevant text/buttons are
 * displayed correctly.
 */
public class MenuBar extends BasePage {
	private TAWebDriver driver;
	private Helper helper;
	private static final By CREATE_ACCOUNT = By.xpath("html/body/div/header/div/div/nav/ul/li[3]/a");
	private static final By NAVMENUBARSTRIP = By.xpath("html/body/div/header/div/div");

	/*
	private static final By NAVMENUBARSTRIP = By.xpath("html/body/div/header/div/div");
	private static final By COOKIE_NOTIFICATION = By.xpath("html/body/div[3]/div[2]/div[2]/div/div[1]/p");
	private static final By NO_PROBLEM = By.cssSelector(".accept-cookies.btn-primary.accept-btn");
	private static final By MORE_COOKIES_LINK = By.className("cs-cookie__more-info");
    */
	public MenuBar(TAWebDriver driver) {
		this.driver = driver;
		this.helper = new Helper(driver);
	}

	public boolean isNavigationBarDisplayed() throws NoSuchElementException {
		return helper.isWebElementDisplayed(NAVMENUBARSTRIP);
	}

	public void findAndClick_CreateAccount() {
		assertTrue(helper.isWebElementDisplayed(CREATE_ACCOUNT));
		driver.getDriver().findElement(CREATE_ACCOUNT).click();
	}

	/*
	public boolean isNotificationTextDisplayed() throws NoSuchElementException {
		if(helper.isWebElementDisplayed(COOKIE_NOTIFICATION)) {
			String notificationsText = driver.getDriver().findElement(COOKIE_NOTIFICATION).getText();
			Assert.assertEquals(notificationsText, "We use cookies to improve your experience.");
		}
		return helper.isWebElementDisplayed(COOKIE_NOTIFICATION);
	}

	public boolean isMoreCookiesLinkDisplayed() throws NoSuchElementException {
		return helper.isWebElementDisplayed(MORE_COOKIES_LINK);
	}


	public void cookieIsSet(){
		String cookieValue = driver.getDriver().manage().getCookieNamed("CS_ACCEPT_COOKIES").getValue();
		assertEquals(cookieValue,"true");
	}*/

}
