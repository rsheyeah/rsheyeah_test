package co.uk.rsheyeah.qa.pages.mendeley;

import co.uk.rsheyeah.qa.pages.BasePage;
import co.uk.rsheyeah.qa.util.Helper;
import co.uk.rsheyeah.qa.util.TAWebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.testng.Assert.assertTrue;

/**
 * This class is used to setup the feed component of the page, and
 * contains methods to check if the profile, and relevant text/buttons are
 * displayed correctly.
 */
public class MendeleyFeed extends BasePage{
	private TAWebDriver driver;
	private Helper helper;
	private static final String PROFILE_XPATH = "PROFILE_XPATH";
	private static final String MENDELEY_FEED_MESSAGE = "MENDELEY_FEED_MESSAGE";
	private static final String SIGNED_IN_USER_PROFILE_NAME = "SIGNED_IN_USER_PROFILE_NAME";
	private static final By PROFILE_NAME = By.xpath(userMap.get(PROFILE_XPATH).toString());

	public MendeleyFeed(TAWebDriver driver) {
		this.driver = driver;
		this.helper = new Helper(driver);
	}

	public boolean isMendeleyFeedPageTitleDisplayed() {
		if(helper.isWebElementDisplayed(PAGE_TITLE)) {
			String titleText = driver.getDriver().findElement(PAGE_TITLE).getText();
			Assert.assertEquals(titleText, userMap.get(MENDELEY_FEED_MESSAGE).toString());
		}
		return helper.isWebElementDisplayed(PAGE_TITLE);
	}

	public boolean isProfileDisplayed() {
		if(helper.isWebElementDisplayed(PAGE_TITLE)) {
			String titleText = driver.getDriver().findElement(PROFILE_NAME).getText();
			Assert.assertEquals(titleText, userMap.get(SIGNED_IN_USER_PROFILE_NAME).toString());
		}
		return helper.isWebElementDisplayed(PROFILE_NAME);
	}

}
