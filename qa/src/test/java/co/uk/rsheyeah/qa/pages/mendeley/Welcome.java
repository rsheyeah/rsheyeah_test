package co.uk.rsheyeah.qa.pages.mendeley;

import co.uk.rsheyeah.qa.pages.BasePage;
import co.uk.rsheyeah.qa.util.Helper;
import co.uk.rsheyeah.qa.util.TAWebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.testng.Assert.assertTrue;

/**
 * This class is used to setup the Welcome component of the Hompage, and
 * contains methods to check if the Cookie Bar, and relevant text/buttons are
 * displayed correctly.
 */
public class Welcome extends BasePage {
	private TAWebDriver driver;
	private Helper helper;
	private static final By HOMEPAGE_TITLE = By.xpath("html/head/title");
	private static final By CONTINUE_TO_MENDELEY_BUTTON = By.xpath("html/body/div/section/div/div/div/div/form/button");
	private static final By SKIP_THIS_STEP = By.xpath("html/body/div/section/div/div/div/div/form/a");

	public Welcome(TAWebDriver driver) {
		this.driver = driver;
		this.helper = new Helper(driver);
	}

	public void findAndClick_ContinueToMendeley() {
		assertTrue(helper.isWebElementDisplayed(CONTINUE_TO_MENDELEY_BUTTON));
		driver.getDriver().findElement(CONTINUE_TO_MENDELEY_BUTTON).click();
	}

	public void findAndClick_SkipThisStep() {
		assertTrue(helper.isWebElementDisplayed(CONTINUE_TO_MENDELEY_BUTTON));
		driver.getDriver().findElement(SKIP_THIS_STEP).click();
	}

	public boolean isWelcomePageTitleDisplayed() {
		if(helper.isWebElementDisplayed(HOMEPAGE_TITLE)) {
			String titleText = driver.getDriver().findElement(HOMEPAGE_TITLE).getText();
			Assert.assertEquals(titleText, "Welcome to Mendeley");
		}
		return helper.isWebElementDisplayed(HOMEPAGE_TITLE);
	}

}
