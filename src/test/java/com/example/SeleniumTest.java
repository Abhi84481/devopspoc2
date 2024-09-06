package dev.selenium.hello;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Initialize the WebDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testOpenWebsite() {
        // Perform the test
        driver.get("https://selenium.dev");
    }

    @AfterEach
    public void tearDown() {
        // Clean up
        if (driver != null) {
            driver.quit();
        }
    }
}
