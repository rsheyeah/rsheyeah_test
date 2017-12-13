package co.uk.rsheyeah.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class contains all the common methods to interact with elements on a page.
 */
public class Helper {

	private TAWebDriver driver;
	public static final Logger logger = Logger.getLogger(Helper.class.toString());

	public Helper(TAWebDriver driver) {
		this.driver = driver;
	}

	public boolean isWebElementDisplayed(By by){
		try {
			return driver.getDriver().findElement(by).isDisplayed();
		}
		catch (NoSuchElementException e) {
			throw new RuntimeException(by + " is not present");
		}
	}

	public static String generateRandomString(Random random, int length){
		return random.ints(48,122)
				.filter(i-> (i<57 || i>65) && (i <90 || i>97))
				.mapToObj(i -> (char) i)
				.limit(length)
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				.toString();
	}

	/**
	 * Sleeps for specified time in seconds
	 * @param timeInSeconds
	 */
	public static void sleepForSeconds(int timeInSeconds) {
		try {
			Thread.sleep(timeInSeconds * 1000);
		} catch (InterruptedException e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
	}
}
