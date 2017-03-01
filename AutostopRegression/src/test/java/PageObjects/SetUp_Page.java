package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ike.lionel on 17/01/2017.
 */
public class SetUp_Page {

    WebDriver driver;

    @FindBy(tagName = "title")
    WebElement titleText;

    @FindBy(xpath = "//span[@class='icon-settings']")
    WebElement setupBtn;

    @FindBy(xpath = "//li/a[text()='Setup Home']")
    WebElement setuphomeBtn;

    @FindBy(xpath = "//input[@placeholder='Quick Find']")
    WebElement quickfindTxt;

    @FindBy(xpath = "//li/a/mark[text()='Custom Settings']")
    WebElement customsettingsLnk;


    public SetUp_Page(WebDriver driver) {
        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    //Click on setup tab
    public void clickSetup() {
        setupBtn.click();
    }

    //Go to Setup Home
    public void clickSetupHome() {
        setuphomeBtn.click();
    }

    //Search quick
    public void searchSetupHome(String strQuickFind) {
        quickfindTxt.clear();
        quickfindTxt.sendKeys(strQuickFind);
    }

    //Click Custom Settings
    public void clickCustomSettings() {
        customsettingsLnk.click();
    }

    public void gotoCustomSettings()
    {
        clickSetupHome();
        searchSetupHome("Custom Settings");
        clickCustomSettings();
    }

    //Get the title of Login Page
    public String getLoginTitle() {
        return titleText.getText();
    }
}
