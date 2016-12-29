package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class testHard {

    private WebDriver driver;
    @Test
    public void testEasy() {
        driver.get("http://www.google.com");
        String title = driver.getTitle();
        Assert.assertFalse(title.contains("Free Selenium Tutorials"));
    }
    @BeforeTest
    public void beforeTest() {
        driver = new HtmlUnitDriver();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}