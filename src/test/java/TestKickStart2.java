import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestKickStart2 {

	WebDriver driver;

	@Test
	public void testFirst() {
		System.setProperty("webdriver.gecko.driver", "E://FirefoxBrowserGecko/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("https://www.broadcom.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Broadcom Inc. | Connecting Everything";
		assertEquals(actualTitle, expectedTitle, "title is wrong");
	}

	@Test
	public void testSec() {
		System.setProperty("webdriver.gecko.driver", "E://FirefoxBrowserGecko/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("https://www.broadcom.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Broadcom Inc. | Connecting Everything";
		assertEquals(actualTitle, expectedTitle, "title is wrong");

	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {

		driver.close();
	}

}
