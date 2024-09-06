package dev.selenium.hello;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Initialize the WebDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testOpenWebsite() {
        // Perform the test
        driver.get("https://selenium.dev");
    }

    @After
    public void tearDown() {
        // Clean up
        if (driver != null) {
            driver.quit();
        }
    }
}
