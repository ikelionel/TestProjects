package example;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
    private HtmlUnitDriver driver;

    @Test
    public void testEasy() {
        driver.get("http://www.guru99.com/selenium-tutorial.html");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Free Selenium Tutorials"));
        //sssssss
    }

    @BeforeTest
    public void beforeTest() {
        driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
