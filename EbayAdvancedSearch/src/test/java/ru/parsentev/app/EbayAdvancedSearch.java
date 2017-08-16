package ru.parsentev.app;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import junit.framework.TestCase;

public class EbayAdvancedSearch extends TestCase {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new HtmlUnitDriver();
		String baseUrl = "http://www.google.com/";
		// selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testEbayAdvancedSearch() throws Exception {

		driver.get("http://www.google.com");
		// Locate the searchbox using its name
		WebElement element = driver.findElement(By.name("q"));

		// Enter a search query
		element.sendKeys("Guru99");

		// Submit the query. Webdriver searches for the form using the text
		// input element automatically
		// No need to locate/find the submit button
		element.submit();

		// This code will print the page title
		System.out.println("Page title is: " + driver.getTitle());
		// assertTrue( driver.getTitle().compareTo("xzx")==0 );

	}

	@After
	public void tearDown() throws Exception {

		if (driver != null) {
			driver.close();
		}
	}

}