package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    WebDriver driver;

    @FindBy(id="username")
    WebElement usernameSF;

    @FindBy(id="password")
    WebElement passwordSF;

    @FindBy(tagName="title")
    WebElement titleText;

    @FindBy(id="Login")
    WebElement loginBtn;

    public Login_Page(WebDriver driver){
        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    //Set user name in textbox
    public void setUserName(String strUserName){
        usernameSF.sendKeys(strUserName);
    }

    //Set password in password textbox
    public void setPassword(String strPassword){
        passwordSF.sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
        loginBtn.click();
    }

    //Get the title of Login Page
    public String getLoginTitle(){
        return titleText.getText();
    }

    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */
    public void loginToSalesForce(String strUserName,String strPasword){
        //Fill user name
        this.setUserName(strUserName);

        //Fill password
        this.setPassword(strPasword);

        //Click Login button
        this.clickLogin();
    }
}