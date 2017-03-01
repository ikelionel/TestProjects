package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ike.lionel on 05/01/2017.
 */
public class NewAccount_Page {

    WebDriver driver;

    @FindBy(xpath="//span[text()='Supplier']/../preceding-sibling::div")
    WebElement supplierRb;

    @FindBy(xpath="//span[text()='Buyer']/../preceding-sibling::div")
    WebElement buyerRb;

    @FindBy(xpath="//span[text()='Buyer & Supplier']/../preceding-sibling::div")
    WebElement buyersupplierRb;

    @FindBy(xpath="//span[text()='Goldvision']/../preceding-sibling::div")
    WebElement goldvisionRb;

    @FindBy(xpath="//span[text()='Partner']/../preceding-sibling::div")
    WebElement partnerRb;

    @FindBy(xpath="//button[@title='Close this window']")
    WebElement closewindowBtn;

    @FindBy(xpath="//span[text()='Next']")
    WebElement nextBtn;

    @FindBy(xpath="//span[text()='Cancel']")
    WebElement cancelBtn;

    @FindBy(xpath="//h2[text()='New Account']")
    WebElement modalTitle;

    public NewAccount_Page(WebDriver driver){
        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    //Select record type Supplier
    public void selectSupplier(){
        supplierRb.click();
    }

    //Select record type Buyer
    public void selectBuyer(){
        buyerRb.click();
    }

    //Select record type Buyer & Supplier
    public void selectBuyer_Supplier(){
        buyersupplierRb.click();
    }

    //Select record type Goldvision
    public void selectGoldvision(){
        goldvisionRb.click();
    }

    //Select record type Partner
    public void selectPartner(){
        partnerRb.click();
    }

    //Click on close modal window
    public void closeModal(){
        closewindowBtn.click();
    }

    //Click on next
    public void clickNext(){
        nextBtn.click();
    }

    //Click on cancel
    public void clickCancel(){
        cancelBtn.click();
    }

    //Get the title of the new account modal
    public String getLoginTitle(){
        return modalTitle.getText();
    }

}
