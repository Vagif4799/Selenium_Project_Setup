package org.example.test_classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class E_OlympTest {

    public WebDriver driver;
    public String baseUrl = "https://www.e-olymp.com/en/";
    public JavascriptExecutor js;
    public ChromeOptions options;

    @BeforeTest
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
    }

    @Test
    public void openPage() {
        // Test name: E_Olymp_Test
        // Step # | name | target | value
        // 1 | open | /en/ |
        driver.get(baseUrl);
        // 2 | setWindowSize | 1440x802 |
        driver.manage().window().setSize(new Dimension(1440, 802));
        // 3 | click | linkText=Signin |
        driver.findElement(By.linkText("Signin")).click();
        // 4 | click | id=username |
        driver.findElement(By.id("username")).click();
        // 5 | type | id=username | Quliyev4799
        driver.findElement(By.id("username")).sendKeys("Quliyev4799");
        // 6 | click | id=password |
        driver.findElement(By.id("password")).click();
        // 7 | type | id=password | qaqash99
        driver.findElement(By.id("password")).sendKeys("qaqash99");
        // 8 | click | css=.mdl-button |
        driver.findElement(By.cssSelector(".mdl-button")).click();
        // 9 | click | linkText=Problems |
        driver.findElement(By.linkText("Problems")).click();
        // 10 | click | linkText=Match’s model |
        driver.findElement(By.linkText("Match’s model")).click();
    }

    @AfterTest
    public void teardownTest() {
        if (driver != null) {
            driver.quit();
        }
    }

}