package dev.selenium.hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/home/jenkins/agent/workspace/");

        // Initialize the WebDriver
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
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
