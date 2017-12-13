package co.uk.rsheyeah.qa.pages.mendeley;

import co.uk.rsheyeah.qa.pages.BasePage;
import co.uk.rsheyeah.qa.util.Helper;
import co.uk.rsheyeah.qa.util.TAWebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static org.testng.Assert.assertTrue;

/**
 * This class is used to setup the Cookie Bar component of the Hompage, and
 * contains methods to check if the Cookie Bar, and relevant text/buttons are
 * displayed correctly.
 */
public class Register extends BasePage {
	private TAWebDriver driver;
	private Helper helper;
	private static final By REGISTERPAGE_TITLE = By.xpath("html/head/title");
	private static final By GIVEN_NAME = By.xpath("//*[@id=\"givenName\"]");
	private static final By FAMILY_NAME = By.xpath("//*[@id=\"familyName\"]");
	private static final By PASSWORD = By.xpath("//*[@id=\"password\"]");
	private static final By REGISTER_BUTTON = By.xpath("html/body/div/form[2]/section/main/button");
	private static final By YOU_ARE_REGISTERED_TEXT = By.cssSelector(".els-flow-msg");// By.xpath("html/body/div/form[2]/section/main/h1");
	private static final By CONTINUE_BUTTON = By.xpath("//*[@id=\"register_continue\"]");



	public Register(TAWebDriver driver) {
		this.driver = driver;
		this.helper = new Helper(driver);
	}

	public void findAndClick_Register() {

		assertTrue(helper.isWebElementDisplayed(REGISTER_BUTTON));
		driver.getDriver().findElement(REGISTER_BUTTON).click();
	}

	public void findAndClick_RegisterContinue() {
		assertTrue(helper.isWebElementDisplayed(CONTINUE_BUTTON));
		driver.getDriver().findElement(CONTINUE_BUTTON).click();
	}

	public void setGivenName(String givenNameText) {
		driver.getDriver().findElement(GIVEN_NAME).sendKeys(givenNameText);
	}

	public void setFamilyName(String familyNameText) {
		driver.getDriver().findElement(FAMILY_NAME).sendKeys(familyNameText);
	}

	public void setPassword(String passwordText) {
		driver.getDriver().findElement(PASSWORD).sendKeys(passwordText);
	}

	public boolean isRegistrationTextDisplayed() {
		if(helper.isWebElementDisplayed(REGISTERPAGE_TITLE)) {
			String titleText = driver.getDriver().findElement(YOU_ARE_REGISTERED_TEXT).getText();
			Assert.assertEquals(titleText, "You are registered");
		}
		return helper.isWebElementDisplayed(YOU_ARE_REGISTERED_TEXT);
	}

	public boolean isRegisterPageTitleDisplayed() {
		if(helper.isWebElementDisplayed(REGISTERPAGE_TITLE)) {
			String titleText = driver.getDriver().findElement(REGISTERPAGE_TITLE).getText();
			Assert.assertEquals(titleText, "Elsevier global signin");
		}
		return helper.isWebElementDisplayed(REGISTERPAGE_TITLE);
	}

}
