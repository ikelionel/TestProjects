package PageObjects;

import Misc.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ike.lionel on 09/01/2017.
 */
public class CreateSupplierAccount_Page {

    WebDriver driver;

    WebElement myDynamicElement;

    Utilities util;

    @FindBy(xpath="//span[text()='Account Name']/../following-sibling::input")
    WebElement accountnameTxt;

    @FindBy(xpath="//span[text()='Account Status']/../following-sibling::div/div/div/div/a")
    WebElement accountstatusSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Live']")
    WebElement statusliveSelect;

    @FindBy(xpath="//div/ul/li/a[@title='In Implementation']")
    WebElement statusinimplemSelect;

    @FindBy(xpath="//div/ul/li/a[@title='In Sales']")
    WebElement statusinsalesSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Known']")
    WebElement statusknownSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Refer To Buyer']")
    WebElement statusrefertobuyerSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Ready To Transact']")
    WebElement statusreadytransactSelect;

    @FindBy(xpath="//span[text()='Type']/../following-sibling::div/div/div/div/a")
    WebElement typeSelect;

    @FindBy(xpath="//div/ul/li/a[@title='interop']")
    WebElement typeinteropSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Customer']")
    WebElement typecustomerSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Corporate']")
    WebElement typecorporateSelect;

    @FindBy(xpath="//span[text()='Supplier Type']/../following-sibling::div/div/div/div/a")
    WebElement suppliertypeSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Not Set']")
    WebElement suppliertypenotsetSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Single Entity']")
    WebElement suppliertypesingleentitySelect;

    @FindBy(xpath="//div/ul/li/a[@title='New Corporate / Group']")
    WebElement suppliertypenewcorpgroupSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Second Corporate / Group']")
    WebElement suppliertypesecondcorpgroupSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Interop']")
    WebElement suppliertypeInteropSelect;

    @FindBy(xpath="//div/ul/li/a[@title='eBiller']")
    WebElement suppliertypebillerSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Special project']")
    WebElement suppliertypespecialprojectSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Special project']")
    WebElement suppliertypespecialtariffSelect;

    @FindBy(xpath="//span[text()='Company Registration Number']/../following-sibling::input")
    WebElement companyregnumTxt;

    @FindBy(xpath="//span[text()='Vat Registration Number']/../following-sibling::input")
    WebElement vatregnumTxt;

    @FindBy(xpath="//span[text()='Ledger Assigned']/../following-sibling::input")
    WebElement ledgerassignedTxt;

    @FindBy(xpath="//span[text()='Overdue Amount']/../following-sibling::input")
    WebElement overdueamountTxt;

    @FindBy(xpath="//span[text()='R1 Start Date']/../following-sibling::div/input")
    WebElement r1startdateTxt;

    @FindBy(xpath="//span[text()='R2 Start Date']/../following-sibling::div/input")
    WebElement r2startdateTxt;

    @FindBy(xpath="//span[text()='R3 Start Date']/../following-sibling::div/input")
    WebElement r3startdateTxt;

    @FindBy(xpath="//span[text()='Payment Method']/../following-sibling::div/div/div/div/a")
    WebElement paymentmethodSelect;

    @FindBy(xpath="//div/ul/li/a[@title='ACCOUNT']")
    WebElement paymentmethodaccountSelect;

    @FindBy(xpath="//div/ul/li/a[@title='BANK']")
    WebElement paymentmethodbankSelect;

    @FindBy(xpath="//div/ul/li/a[@title='SRI']")
    WebElement paymentmethodsriSelect;

    @FindBy(xpath="//div/ul/li/a[@title='BACS']")
    WebElement paymentmethodbacsSelect;

    @FindBy(xpath="//div/ul/li/a[@title='CASH']")
    WebElement paymentmethodcashSelect;

    @FindBy(xpath="//div/ul/li/a[@title='CC']")
    WebElement paymentmethodccSelect;

    @FindBy(xpath="//div/ul/li/a[@title='CHEQUE']")
    WebElement paymentmethodchequeSelect;

    @FindBy(xpath="//div/ul/li/a[@title='DD']")
    WebElement paymentmethodddSelect;


    @FindBy(xpath="//span[text()='Account Currency']/../following-sibling::div/div/div/div/a")
    WebElement accountcurrencySelect;

    // Manual Override Status
    @FindBy(xpath="//span[text()='Auto Stop Manual Override']/../following-sibling::input")
    WebElement manualoverrideChk;

    @FindBy(xpath="//span[text()='Auto Stop Manual Override End Date']/../following-sibling::div/input")
    WebElement manualoverrideenddateTxt;

    @FindBy(xpath="//span[text()='Auto Stop Manual Override Reason']/../following-sibling::div/div/div/div/a")
    WebElement manualoverridreasonSelect;

    @FindBy(xpath="//div/ul/li/a[@title='--None--']")
    WebElement manualoverridreasonnoneSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Credit and reissue same value requested (by credit controller)']")
    WebElement manualoverridreasoncreditreissueSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Disputed invoice']")
    WebElement manualoverridreasondisputedSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Credit/write off/refund requested (by credit controller)']")
    WebElement manualoverridreasoncreditwriteoffSelect;

    @FindBy(xpath="//div/ul/li/a[@title='Reason 4']")
    WebElement manualoverridreasonreason_4Select;

    @FindBy(xpath="//span[text()='Auto Stop Manual Override Reason']/../following-sibling::div/div/div/div/a")
    WebElement manualoverrideUserTxt;

    // Promise To Pay
    @FindBy(xpath="//span[text()='Promise to Pay']/../following-sibling::input")
    WebElement promisetopayChk;

    @FindBy(xpath="//span[text()='Promise to Pay Start Date']/../following-sibling::div/input")
    WebElement promisetopaystartdateTxt;

    @FindBy(xpath="//button[@title='Close this window']")
    WebElement closewindowBtn;

    @FindBy(xpath="//span[text()='Save & New']")
    WebElement Save_NewBtn;

    @FindBy(xpath="//button[@title='Save']")
    WebElement SaveBtn;

    @FindBy(xpath="//span[text()='Auto Stop Manual Override']/../following-sibling::div/a")
    WebElement EditBtn;

    @FindBy(xpath="//span[text()='Reload']")
    WebElement ReloadBtn;

    @FindBy(xpath="//span[text()='Cancel']")
    WebElement cancelBtn;

    @FindBy(xpath="//h2[text()='Create Account: Supplier']")
    WebElement modalTitle;

    @FindBy(xpath="//span[text()='Auto Stop Status']/../following-sibling::div/div/span")
    WebElement autostopstatusTxt;

    @FindBy(xpath="//span[text()='Details']")
    WebElement detailsBtn;

    @FindBy(xpath="//span[text()='Related']")
    WebElement relatedBtn;

    public CreateSupplierAccount_Page(WebDriver driver){
        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);

        this.util = new Utilities();
    }

    //Set account name in textbox
    public void setAccountName(String strAccName){
        util.sleep(4000L);
        myDynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(accountnameTxt));
        accountnameTxt.sendKeys(strAccName);
    }

    //Set Company Registration Number in textbox
    public void setCompanyRegNum(String strComRegNum){
        companyregnumTxt.sendKeys(strComRegNum);
    }

    //Set VAT Registration Number in textbox
    public void setVatRegNum(String strVatRegNum){
        vatregnumTxt.sendKeys(strVatRegNum);
    }

    //Select account status
    public void selectAccountStatus(String status){

        accountstatusSelect.click();

        switch(status) {
            case "Live" :
                statusliveSelect.click();
                break;
            case "In Implementation" :
                statusinimplemSelect.click();
                break;
            case "Ready To Transact" :
                statusreadytransactSelect.click();
                break;
            case "Known" :
                statusknownSelect.click();
                break;
            case "In Sales" :
                statusinsalesSelect.click();
                break;
            case "Refer To Buyer" :
                statusrefertobuyerSelect.click();
                break;
            default :
                System.out.println("Invalid choice!!");
        }

        //Select accSelect = new Select(accountstatusSelect);
        // accSelect.selectByVisibleText(status);
    }

    //Select Account Type
    public void selectAccountType(String type) {

        typeSelect.click();

        switch(type) {
            case "Customer" :
                typecustomerSelect.click();
                break;
            case "Interop" :
                typeinteropSelect.click();
                break;
            case "Corporate" :
                typecorporateSelect.click();
                break;
            default :
                System.out.println("Invalid choice!!");
        }
    }

    //Select Account Type
    public void selectSupplierType(String suppliertype) {

        suppliertypeSelect.click();

        switch(suppliertype) {
            case "Not Set" :
                suppliertypenotsetSelect.click();
                break;
            case "Interop" :
                suppliertypeInteropSelect.click();
                break;
            case "New Corporate / Group" :
                suppliertypenewcorpgroupSelect.click();
                break;
            case "Second Corporate / Group" :
                suppliertypesecondcorpgroupSelect.click();
                break;
            case "Single Entity" :
                suppliertypesingleentitySelect.click();
                break;
            default :
                System.out.println("Invalid choice!!");
        }
    }

    //Select manual override Reason
    public void selectManualOverrideReason(String reason) {

        JavascriptExecutor js;

        switch(reason) {
            case "NONE" :
                js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", manualoverridreasonSelect);
                js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", manualoverridreasonnoneSelect);
                break;
            case "DISPUTE" :
                js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", manualoverridreasonSelect);
                js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", manualoverridreasondisputedSelect);
                break;
            case "REISSUE" :
               // myDynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(manualoverridreasonSelect));
                js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", manualoverridreasonSelect);
                js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", manualoverridreasoncreditreissueSelect);
                break;
            case "CREDIT" :
                js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", manualoverridreasonSelect);
                js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", manualoverridreasoncreditwriteoffSelect);
                break;
            case "Reason_4" :
                js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", manualoverridreasonSelect);
                js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", manualoverridreasonreason_4Select);
                break;
            default :
                System.out.println("Invalid choice!!");
        }
    }

    //Select Payment method
    public void selectPaymentMethod(String paymentmethod) {

        paymentmethodSelect.click();

        switch(paymentmethod) {
            case "ACCOUNT" :
                paymentmethodaccountSelect.click();
                break;
            case "BANK" :
                paymentmethodbankSelect.click();
                break;
            case "BACS" :
                paymentmethodbacsSelect.click();
                break;
            case "CHEQUE" :
                paymentmethodchequeSelect.click();
                break;
            case "DD" :
                paymentmethodddSelect.click();
                break;
            default :
                System.out.println("Invalid choice!!");
        }
    }

    //Set Ledger Assigned in textbox
    public void setLedgerAssigned(String strLedgerAssigned){
        ledgerassignedTxt.sendKeys(strLedgerAssigned);
    }

    //Set Overdue Amount in textbox
    public void setOverdueAmount(String strOverdueAmount){
        overdueamountTxt.sendKeys(strOverdueAmount);
    }

    //Set R1 Start Date in textbox
    public void setR1StartDate(String strR1StartDate){
        //myDynamicElement = (new WebDriverWait(driver, 30))
               // .until(ExpectedConditions.elementToBeClickable(r1startdateTxt));
        util.sleep(5000L);
        r1startdateTxt.clear();
        r1startdateTxt.sendKeys(strR1StartDate);
    }

    //Set R2 Start Date in textbox
    public void setR2StartDate(String strR2StartDate){
        util.sleep(5000L);
        r2startdateTxt.clear();
        r2startdateTxt.sendKeys(strR2StartDate);
    }

    //Set R3 Start Date in textbox
    public void setR3StartDate(String strR3StartDate){
        util.sleep(5000L);
        r3startdateTxt.clear();
        r3startdateTxt.sendKeys(strR3StartDate);
    }

    //Check Auto Stop Manual override
    public void checkManualOverride(){
        util.sleep(5000L);
        myDynamicElement = (new WebDriverWait(driver, 50))
                .until(ExpectedConditions.elementToBeClickable(manualoverrideChk));
        manualoverrideChk.click();
    }

    //Set Auto Stop manual Override End Date
    public void setManualOverrideDate(String strManOvenDdate) {
        manualoverrideenddateTxt.click();
        manualoverrideenddateTxt.clear();
        util.sleep(2000L);
        manualoverrideenddateTxt.sendKeys(strManOvenDdate);
        util.sleep(1000L);
    }

    //Click on close modal window
    public void closeModal(){
        closewindowBtn.click();
    }

    //Click on Save
    public void clickSave(){
        SaveBtn.click();
    }

    //Click on Reload
    public void clickReload(){
        myDynamicElement = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.elementToBeClickable(SaveBtn));
        ReloadBtn.click();
    }

    //Check for Reload button
    public void checkReload() {
        //myDynamicElement = (new WebDriverWait(driver, 20))
        //        .until(ExpectedConditions.elementToBeClickable(ReloadBtn));
        util.sleep(3000L);
        try {
            if (ReloadBtn.isEnabled())
                ReloadBtn.click();
        }
        catch(Exception ex) {}
    }

    //Check Auto Stop Promise To Pay
    public void checkPromiseToPay(){
        util.sleep(5000L);
        myDynamicElement = (new WebDriverWait(driver, 50))
                .until(ExpectedConditions.elementToBeClickable(promisetopayChk));
        promisetopayChk.click();
    }

    //Set Auto Stop manual Override End Date
    public void setPromiseToPayStartDate(String strPromise2Paydate) {
        promisetopaystartdateTxt.clear();
        promisetopaystartdateTxt.sendKeys(strPromise2Paydate);
    }

    //Click on Save and New
    public void clickSavNew(){
        myDynamicElement = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.elementToBeClickable(Save_NewBtn));
        Save_NewBtn.click();
    }

    //Click on cancel
    public void clickCancel(){
        myDynamicElement = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.elementToBeClickable(cancelBtn));
        cancelBtn.click();
    }

    public void clickEdit() {
        util.sleep(5000L);
        myDynamicElement = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Auto Stop Manual Override']/../following-sibling::div/button")));
        util.sleep(3000L);
        try {
            driver.findElement(By.xpath("//span[text()='Auto Stop Manual Override']/../following-sibling::div/button")).click();
        }
        catch(Exception ex){driver.findElement(By.xpath("//span[text()='Auto Stop Manual Override']/../following-sibling::div/button")).click();}
        //EditBtn.click();
    }

    //Get the title of the new account modal
    public String getLoginTitle(){
        return modalTitle.getText();
    }

    public void clickDetails() {
        util.sleep(5000L);

        myDynamicElement = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.elementToBeClickable(detailsBtn));
        detailsBtn.click();
    }

    public String getAutoStopStatus() {
        util.sleep(7000L);
        myDynamicElement = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.elementToBeClickable(autostopstatusTxt));
        return autostopstatusTxt.getText();
    }

    public void R1_R2SupplierAccount(String straccname,String straccstatus, String strtype, String strsupptype, String strcomprn, String strvatrn, String paytype, String strledgass, String stroverdueamt, String strr1startdate){
        try{
        //Fill account name
        this.setAccountName(straccname);

        //Select account status
        this.selectAccountStatus(straccstatus);


        //Select Account Type
        this.selectAccountType(strtype);

        //Select Supplier Type
        this.selectSupplierType(strsupptype);

        //Fill Company Registration Number
        this.setCompanyRegNum(strcomprn);

        //Fill VAT Registration Number
        this.setVatRegNum(strvatrn);

        //Fill Payment Type
        selectPaymentMethod(paytype);

        //Fill Ledger Assigned
        this.setLedgerAssigned(strledgass);

        //Fill Overdue Amount
        this.setOverdueAmount(stroverdueamt);

        //Fill R1 Start Date
        this.setR1StartDate(strr1startdate);

        //Click Save button
        this.clickSave();
    }
        catch(Exception ex) {
        System.out.print("Failed!!");
    }
    }

    public void R3SupplierAccount(String straccname,String straccstatus, String strtype, String strsupptype, String strcomprn, String strvatrn, String paytype, String strledgass, String stroverdueamt, String strr1startdate, String strr2startdate){
        try {
            //Fill account name
            this.setAccountName(straccname);

            //Select account status
            this.selectAccountStatus(straccstatus);

            //Select Account Type
            this.selectAccountType(strtype);

            //Select Supplier Type
            this.selectSupplierType(strsupptype);

            //Fill Company Registration Number
            this.setCompanyRegNum(strcomprn);

            //Fill VAT Registration Number
            this.setVatRegNum(strvatrn);

            //Select Account Type
            this.selectPaymentMethod(paytype);

            //Fill Ledger Assigned
            this.setLedgerAssigned(strledgass);

            //Fill Overdue Amount
            this.setOverdueAmount(stroverdueamt);

            //Fill R1 Start Date
            this.setR1StartDate(strr1startdate);

            //Fill R2 Start Date
            this.setR2StartDate(strr2startdate);

            //Click Save button
            this.clickSave();
        }
        catch(Exception ex) {
            System.out.print("Failed!!");
        }
    }

    public void R3SupplierAccountWithP2P(String straccname,String straccstatus, String strtype, String strsupptype, String strcomprn, String strvatrn, String paytype, String strledgass, String stroverdueamt, String strr1startdate, String strr2startdate, String strr3startdate, boolean checkpromisetopay, String promisetopaydate){
        try {
        //Fill account name
        this.setAccountName(straccname);

        //Select account status
        this.selectAccountStatus(straccstatus);

        //Select Account Type
        this.selectAccountType(strtype);

        //Select Supplier Type
        this.selectSupplierType(strsupptype);

        //Fill Company Registration Number
        this.setCompanyRegNum(strcomprn);

        //Fill VAT Registration Number
        this.setVatRegNum(strvatrn);

        //Select Account Type
        this.selectPaymentMethod(paytype);

        //Fill Ledger Assigned
        this.setLedgerAssigned(strledgass);

        //Fill Overdue Amount
        this.setOverdueAmount(stroverdueamt);

        //Fill R1 Start Date
        this.setR1StartDate(strr1startdate);

        //Fill R2 Start Date
        this.setR2StartDate(strr2startdate);

        //Fill R3 Start Date
        this.setR3StartDate(strr3startdate);

        // Check promise to pay as true
        if (checkpromisetopay == true)
            this.checkPromiseToPay();

        // Set Promise to pay start date
        this.setPromiseToPayStartDate(promisetopaydate);

        //Click Save button
        this.clickSave();
        }
        catch(Exception ex) {
            System.out.print("Failed!!");
        }
    }

    public void R3SupplierAccount(String straccname,String straccstatus, String strtype, String strsupptype, String strcomprn, String strvatrn, String paytype, String strledgass, String stroverdueamt, String strr1startdate, String strr2startdate, String strr3startdate){
        try {
        //Fill account name
        this.setAccountName(straccname);

        //Select account status
        this.selectAccountStatus(straccstatus);

        //Select Account Type
        this.selectAccountType(strtype);

        //Select Supplier Type
        this.selectSupplierType(strsupptype);

        //Fill Company Registration Number
        this.setCompanyRegNum(strcomprn);

        //Fill VAT Registration Number
        this.setVatRegNum(strvatrn);

        //Select Account Type
        this.selectPaymentMethod(paytype);

        //Fill Ledger Assigned
        this.setLedgerAssigned(strledgass);

        //Fill Overdue Amount
        this.setOverdueAmount(stroverdueamt);

        //Fill R1 Start Date
        this.setR1StartDate(strr1startdate);

        //Fill R2 Start Date
        this.setR2StartDate(strr2startdate);

        //Fill R3 Start Date
        this.setR3StartDate(strr3startdate);

        //Click Save button
        this.clickSave();
        }
        catch(Exception ex) {
            System.out.print("Failed!!");
        }
    }

    public void SetManualOverride(boolean checkmanualoverride, String manualoverridedate, String manualoverridereason) {
        util.sleep(4000L);
        if (driver.findElement(By.xpath("//span[text()='Manual Override Status']/parent::button")).getAttribute("aria-expanded").equals("false"))
            driver.findElement(By.xpath("//span[text()='Manual Override Status']/parent::button")).click();

        this.clickEdit();
        util.sleep(4000L);
        if (checkmanualoverride == true)
            this.checkManualOverride();
        this.setManualOverrideDate(manualoverridedate);
        this.selectManualOverrideReason(manualoverridereason);
        this.clickSave();
        this.checkReload();

        // Redo manual override
        this.clickEdit();
        if (checkmanualoverride == true) {
            this.checkManualOverride();
            //this.checkManualOverride();
            this.setManualOverrideDate(manualoverridedate);
            this.selectManualOverrideReason(manualoverridereason);
            this.clickSave();
        }
    }

    public void setReminderDateForManualOverride(String reminderdate, String reminderstage) {
        // change R1 Start Date
        util.sleep(5000L);
        this.clickEdit();

        switch(reminderstage) {
            case "R1" :
                this.setR1StartDate(reminderdate);
                break;
            case "R2" :
                this.setR2StartDate(reminderdate);
                break;
            case "R3" :
                this.setR3StartDate(reminderdate);
                break;
            default :
                System.out.println("Invalid choice!!");
        }

        this.clickSave();
    }

    public void SetPromiseToPay(boolean checkpromisetopay, String promisetopaydate) {
        this.clickEdit();
        util.sleep(4000L);
        if (checkpromisetopay == true)
            this.checkPromiseToPay();
        this.setPromiseToPayStartDate(promisetopaydate);
        this.clickSave();
        this.checkReload();

        // Redo Promise To Pay
        this.clickEdit();
        if (checkpromisetopay == true)
            this.checkPromiseToPay();
        this.setPromiseToPayStartDate(promisetopaydate);
        this.clickSave();
    }
}
