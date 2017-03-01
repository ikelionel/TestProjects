package PageObjects;

import Misc.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ike.lionel on 05/01/2017.
 */
public class Home_Page {

    WebDriver driver;

    Utilities utils;

    @FindBy(xpath="//a[@title='Home']")
    WebElement homeTab;

    @FindBy(tagName="title")
    WebElement titleText;

    @FindBy(xpath="//a[@title='Accounts']")
    WebElement accountTab;

    @FindBy(xpath="//span[@class='icon-settings']")
    WebElement setupBtn;

    public Home_Page(WebDriver driver){
        this.driver = driver;
        this.utils = new Utilities();

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    //Click on home tab
    public void clickHome(){
        homeTab.click();
    }

    //Click on account tab
    public void clickAccount(){
        utils.sleep(5000L);
        if (!driver.getCurrentUrl().contains(".lightning"))
        {
            if (driver.findElement(By.id("userNavLabel")).isDisplayed()) {
                driver.findElement(By.id("userNavLabel")).click();
                //driver.findElement(By.id("userNav-menuItems"))
                driver.findElement(By.xpath("//div[@id='userNav-menuItems']/a[text()='Switch to Lightning Experience']")).click();
            }
        }
        accountTab.click();
    }

    //Click on setup tab
    public void clickSetup(){
        setupBtn.click();
    }


    //Get the title of Login Page
    public String getLoginTitle(){
        return titleText.getText();
    }

}
