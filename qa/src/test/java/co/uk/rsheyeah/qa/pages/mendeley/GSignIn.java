package co.uk.rsheyeah.qa.pages.mendeley;

import co.uk.rsheyeah.qa.pages.BasePage;
import co.uk.rsheyeah.qa.util.Helper;
import co.uk.rsheyeah.qa.util.TAWebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.testng.Assert.assertTrue;

/**
 * This class is used to setup the Sign in component of the page, and
 * contains methods to check if the sign in page, and relevant text/buttons are
 * displayed correctly.
 */
public class GSignIn extends BasePage {
	private TAWebDriver driver;
	private Helper helper;

	private static final By EMAIL = By.xpath("//*[@id=\"email\"]");
	private static final By CONTINUE = By.xpath("//*[@id=\"els-continue\"]");
	private static final String ELSEVIER_SIGN_IN_MESSAGE = "ELSEVIER_SIGN_IN_MESSAGE" ;


	public GSignIn(TAWebDriver driver) {
		this.driver = driver;
		this.helper = new Helper(driver);
	}

	public boolean isSignInTitleDisplayed() {
		if(helper.isWebElementDisplayed(PAGE_TITLE)) {
			String titleText = driver.getDriver().findElement(PAGE_TITLE).getText();
			Assert.assertEquals(titleText, userMap.get(ELSEVIER_SIGN_IN_MESSAGE).toString());
		}
		return helper.isWebElementDisplayed(PAGE_TITLE);
	}

	public void findAndClick_Continue() {
		assertTrue(helper.isWebElementDisplayed(CONTINUE));
		driver.getDriver().findElement(CONTINUE).click();
	}

	public void setEmail(String emailText) {
		driver.getDriver().findElement(EMAIL).sendKeys(emailText);
	}
}
