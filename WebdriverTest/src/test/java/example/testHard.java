package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by ike.lionel on 22/12/2016.
 */
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
        driver = new FirefoxDriver();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}