package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ike.lionel on 17/01/2017.
 */
public class CustomSettings_Page {

    WebDriver driver;

    WebDriverWait wait;

    WebElement myDynamicElement;

    @FindBy(tagName = "title")
    WebElement titleText;

    @FindBy(xpath = "//a[text()='Autostop Entry Criteria']")
    WebElement autostopentrycriteriaLnk;

    @FindBy(xpath = "//input[@value='Manage']")
    WebElement manageBtn;

    // Account Status Links
    @FindBy(xpath = "//a[text()='Account Status']")
    WebElement accountstatusLnk;

    @FindBy(xpath = "//a[text()='Account Status']/../following-sibling::td")
    WebElement accountstatusvaluesTxt;

    @FindBy(xpath = "//a[text()='Edit' and contains(@title,'Account Status')]")
    WebElement editaccountstatusLnk;

    @FindBy(xpath = "//a[text()='Del' and contains(@title,'Account Status')]")
    WebElement delaccountstatusLnk;

    // Ledger Assigned Links
    @FindBy(xpath = "//a[text()='Ledger Assigned']")
    WebElement ledgerassignedLnk;

    @FindBy(xpath = "//a[text()='Ledger Assigned']/../following-sibling::td")
    WebElement ledgerassignedvaluesTxt;

    @FindBy(xpath = "//a[text()='Edit' and contains(@title,'Ledger Assigned')]")
    WebElement editledgerassignedLnk;

    @FindBy(xpath = "//a[text()='Del' and contains(@title,'Ledger Assigned')]")
    WebElement delledgerassignedLnk;

    // Overdue Balance Links
    @FindBy(xpath = "//a[text()='Overdue Balance']")
    WebElement overduebalanceLnk;

    @FindBy(xpath = "//a[text()='Overdue Balance']/../following-sibling::td")
    WebElement overduebalancevaluesTxt;

    @FindBy(xpath = "//a[text()='Edit' and contains(@title,'Overdue Balance')]")
    WebElement editoverduebalanceLnk;

    @FindBy(xpath = "//a[text()='Del' and contains(@title,'Overdue Balance')]")
    WebElement deloverduebalanceLnk;

    // Payment Method Links
    @FindBy(xpath = "//a[text()='Payment Method']")
    WebElement paymentmethodLnk;

    @FindBy(xpath = "//a[text()='Payment Method']/../following-sibling::td")
    WebElement paymentmethodsvaluesTxt;

    @FindBy(xpath = "//a[text()='Edit' and contains(@title,'Payment Method')]")
    WebElement editpaymentmethodLnk;

    @FindBy(xpath = "//a[text()='Del' and contains(@title,'Payment Method')]")
    WebElement delpaymentmethodLnk;

    // Supplier Type Links
    @FindBy(xpath = "//a[text()='Supplier Type']")
    WebElement suppliertypeLnk;

    @FindBy(xpath = "//a[text()='Supplier Type']/../following-sibling::td")
    WebElement suppliertypevaluesTxt;

    @FindBy(xpath = "//a[text()='Edit' and contains(@title,'Supplier Type')]")
    WebElement editsuppliertypeLnkLnk;

    @FindBy(xpath = "//a[text()='Del' and contains(@title,'Supplier Type')]")
    WebElement delsuppliertypeLnk;

    @FindBy(xpath = "//input[@placeholder='Quick Find']")
    WebElement quickfindTxt;

    @FindBy(xpath = "//li/a[text()='Custom Setting']")
    WebElement customsettingsLnk;


    public CustomSettings_Page(WebDriver driver) {
        this.driver = driver;

        this.wait = new WebDriverWait(driver, 200);

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public void switchtoFrame() {
        //now use the switch command
        driver.switchTo().frame(0);
        sleep(2000L);
    }

    public void switchbackfromFrame() {
        //Switch back to the main window
        driver.switchTo().defaultContent();
        sleep(2000L);
    }

    public void clickAutoStopEntryCriteria() {
        autostopentrycriteriaLnk.click();
    }

    public void clickManage() {
        myDynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(manageBtn));
        manageBtn.click();
    }

    public void clickAccountStatus() {
        accountstatusLnk.click();
    }

    public String getAccountStatus() {
        return accountstatusvaluesTxt.getText();
    }

    public void clickEditAccountStatus() {
        editaccountstatusLnk.click();
    }

    public void clickDelAccountStatus() {
        delaccountstatusLnk.click();
    }

    public void clickLedgerAssigned() {
        ledgerassignedLnk.click();
    }

    public String getLedgerAssigned() {
        return ledgerassignedvaluesTxt.getText();
    }

    public void clickEditLedgerAssigned() {
        editledgerassignedLnk.click();
    }

    public void clickDelLedgerAssigned() {
        delledgerassignedLnk.click();
    }

    public void clickOverdueBalance() {
        overduebalanceLnk.click();
    }

    public String getOverdueBalance() {
        return overduebalancevaluesTxt.getText();
    }

    public void clickEditOverdueBalance() {
        editoverduebalanceLnk.click();
    }

    public void clickDelOverdueBalance() {
        deloverduebalanceLnk.click();
    }

    public void clickPaymentMethod() {
        paymentmethodLnk.click();
    }

    public String getPaymentMethod() {
        return paymentmethodsvaluesTxt.getText();
    }

    public void clickEditPaymentMethod() {
        editpaymentmethodLnk.click();
    }

    public void clickDelPaymentMethod() {
        delpaymentmethodLnk.click();
    }

    public void clickSupplierType() {
        suppliertypeLnk.click();
    }

    public String getSupplierType() {
        return suppliertypevaluesTxt.getText();
    }

    public void clickEditSupplierType() {
        editsuppliertypeLnkLnk.click();
    }

    public void clickDelSupplierType() {
        delsuppliertypeLnk.click();
    }

    public Boolean confirmAccountStatus(String status) {
        clickAutoStopEntryCriteria();
        clickManage();
        switchbackfromFrame();
        String accstatus = getAccountStatus();
        Boolean statuspresent = false;
        if (accstatus.contains(status))
            statuspresent = true;

        return statuspresent;
    }

    public void waitforframe(int index) {

        while (driver.findElements(By.tagName("iframe")).size() != index) {
            System.out.println("Count is: " + driver.findElements(By.tagName("iframe")).size());

        }
    }

    public void sleep(Long time) {
        try {

            //sleep 5 seconds
            Thread.sleep(time);

           // System.out.println("Testing..." + new Date());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void updateAccountStatus(String status) {
        switchtoFrame();
        clickAutoStopEntryCriteria();
        switchbackfromFrame();
        switchtoFrame();
        clickManage();
        switchbackfromFrame();
        switchtoFrame();
        clickEditAccountStatus();
        switchbackfromFrame();
        switchtoFrame();
        driver.findElement(By.xpath("//input[@id='CS_Edit:CS_Form:thePageBlock:thePageBlockSection:Value__c']")).clear();
        driver.findElement(By.xpath("//input[@id='CS_Edit:CS_Form:thePageBlock:thePageBlockSection:Value__c']")).sendKeys("Ready");
        switchbackfromFrame();
        //waitforframe(1);
        //driver.findElements(By.xpath("//iframe[@id='vfFrameId_1484825224128']")).size()
        //WebDriverWait wait = new WebDriverWait(driver, 20);
        //wait.until( ExpectedConditions.frameToBeAvailableAndSwitchToIt("vfFrameId_1484823581237"));
        //wait = new WebDriverWait(frame, 30);
    }


    //Get the title of Login Page
    public String getLoginTitle() {
        return titleText.getText();
    }
}
