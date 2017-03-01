package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ike.lionel on 05/01/2017.
 */
public class Account_Page {

    WebDriver driver;

    @FindBy(xpath="//div[@title='New']")
    WebElement newBtn;

    @FindBy(tagName="title")
    WebElement titleText;

    public Account_Page(WebDriver driver){
        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    //Click on createnew account
    public void createNewAccount(){
        newBtn.click();
    }

    //Get the title of Login Page
    public String getLoginTitle(){
        return titleText.getText();
    }
}
