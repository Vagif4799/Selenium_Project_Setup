package org.example.test_classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ApplePageTest {

    private WebDriver driver;
    public String baseUrl = "https://www.apple.com/";

    @BeforeTest
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openPage() {
        driver.get(baseUrl);
        Assert.assertEquals("Apple", driver.getTitle());
    }

    @AfterTest
    public void teardownTest() {
        if (driver != null) {
            driver.quit();
        }
    }

}