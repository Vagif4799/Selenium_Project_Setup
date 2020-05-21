package org.example.untitled;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class MainPageTest {

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
        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void teardownTest() {
        if (driver != null) {
            driver.quit();
        }
    }

}