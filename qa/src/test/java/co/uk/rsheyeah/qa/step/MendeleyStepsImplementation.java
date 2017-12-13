package co.uk.rsheyeah.qa.step;

import co.uk.rsheyeah.qa.pages.BasePage;
import co.uk.rsheyeah.qa.util.Helper;
import co.uk.rsheyeah.qa.util.ReadPropertiesFile;
import co.uk.rsheyeah.qa.util.TAWebDriver;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * This class is for implementing the Gherkin step definitions defined in the feature file.
 */
public class MendeleyStepsImplementation {

	public static Logger LOGGER = LoggerFactory.getLogger("StaticLogger" );
	protected Logger classlogger = LoggerFactory.getLogger(getClass());
	private static TAWebDriver driver;
	private BasePage basePage;
	private static final String ELSEVIER_SIGN_IN_MESSAGE = "ELSEVIER_SIGN_IN_MESSAGE" ;
	private static final String REGISTER_MESSAGE = "REGISTER_MESSAGE";
	private static final String WELCOME_MESSAGE = "WELCOME_MESSAGE";
	private static final String CONTINUE_MESSAGE = "CONTINUE_MESSAGE";
	private static final String CONTINUE_TO_MENDELEY_MESSAGE ="CONTINUE_TO_MENDELEY_MESSAGE";
	private static final String SKIP_THIS_STEP_MESSAGE = "SKIP_THIS_STEP";
	protected static final String PROPERTIES_FILE_USER = "user.properties";
	protected static Map<String, Object> userMap = ReadPropertiesFile.readFile(PROPERTIES_FILE_USER);


	@Before()
	public static void setUp() throws Exception {
		driver.setUp();
	}

	@Given("^the user is on the mendeley homepage$")
	public void the_user_is_on_the_mendeley_homepage() throws Throwable {
		basePage = new BasePage(driver).open();
		basePage.menuBar().isNavigationBarDisplayed();
	}

	@Given("^the user clicks on the \"([^\"]*)\" link$")
	public void the_user_clicks_on_the_link(String arg1) throws Throwable {
		basePage.menuBar().isNavigationBarDisplayed();
		basePage.menuBar().findAndClick_CreateAccount();
	}

	@Given("^the user is on the \"([^\"]*)\" page$")
	public void the_user_is_on_the_page(String text) throws Throwable {
		if(text.equals(userMap.get(ELSEVIER_SIGN_IN_MESSAGE).toString())) {
			basePage.signIn().isSignInTitleDisplayed();
		}else if(text.equals(userMap.get(REGISTER_MESSAGE).toString())){
			LOGGER.info("In the register page");
			basePage.register().isRegisterPageTitleDisplayed();
		}else if(text.equals(userMap.get(WELCOME_MESSAGE).toString())){
			LOGGER.info("In the welcome page");
		}
	}

	@Given("^the user enters the \"([^\"]*)\" id$")
	public void the_user_enters_the_id(String text) throws Throwable {
		Random random = new Random();
		basePage.signIn().setEmail(text+ Helper.generateRandomString(random, 9)+"@gmail.com");
	}

	@Given("^the user clicks on the \"([^\"]*)\"$")
	public void the_user_clicks_on_the_button(String text) throws Throwable {
		if(text.equals(userMap.get(CONTINUE_MESSAGE).toString())) {
			basePage.signIn().findAndClick_Continue();
			Helper.sleepForSeconds(10);
		} else if(text.equals(userMap.get(REGISTER_MESSAGE).toString())) {
			basePage.register().findAndClick_Register();
			Helper.sleepForSeconds(10);
		} else if(text.equals(userMap.get(CONTINUE_TO_MENDELEY_MESSAGE).toString())) {
			basePage.register().findAndClick_RegisterContinue();
			Helper.sleepForSeconds(10);
		} else if(text.equals(userMap.get(SKIP_THIS_STEP_MESSAGE).toString())) {
			basePage.welcome().findAndClick_SkipThisStep();
			Helper.sleepForSeconds(10);
		}

	}

	@Then("^the user enters the following information$")
	public void the_user_enters_the_following_information(DataTable data) throws Throwable {
		List<String> dataString = data.asList(String.class);
		basePage.register().setGivenName(dataString.get(3));
		basePage.register().setFamilyName(dataString.get(4));
		basePage.register().setPassword(dataString.get(5));
	}

	@Then("^the user sees the \"([^\"]*)\" message displayed$")
	public void the_user_sees_the_message_displayed(String text) throws Throwable {
		if(text.equals("You are registered")) {
			basePage.register().isRegistrationTextDisplayed();
		}
	}

	@Then("^the user sees the profile link on the top right corner of the page$")
	public void the_user_sees_the_profile_link_on_the_top_right_corner_of_the_page() throws Throwable {
		basePage.mendeleyFeed().isMendeleyFeedPageTitleDisplayed();
		basePage.mendeleyFeed().isProfileDisplayed();
	}
}
