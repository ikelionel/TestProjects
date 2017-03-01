import Misc.Environment;
import Misc.Utilities;
import PageObjects.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class AutoStopTestCases {

    private WebDriver driver;
    private WebElement myDynamicElement;
    Environment env;
    private Utilities utils;
    String date;
    private Login_Page loginpage;
    private Home_Page homepage;
    private Account_Page accountpage;
    private NewAccount_Page newaccpage;
    private SetUp_Page setuppage;
    private CreateSupplierAccount_Page createsupplier;
    private CustomSettings_Page customsettingspage;




    @Test
    public void testAutostop_AS1() {  //Set todays date
        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R1_R2SupplierAccount(utils.generateName(),"Live","Customer", "Not Set",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"),"CHEQUE","UK","25.01",utils.setDate(0));
        createsupplier.clickDetails();
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals("R1"));

        //  Click AAA Number new button -- driver.findElement(By.xpath("//article[contains(@class,'AAA Numbers')]/div/div/div/ul/li/a")).click()

    }

    @Test
    public void testAutostop_AS2() {  // set past date

        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R1_R2SupplierAccount( utils.generateName(),"Live","Customer", "Not Set",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"),"CHEQUE","UK","234.99",utils.setDate(-2));
        createsupplier.clickDetails();
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals("R2"));
    }

    @Test
    public void testAutostop_AS4() {  //Set todays date  ...There seems to have been a code change raise bug for Rasesh
        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R1_R2SupplierAccount(utils.generateName(),"Live","Customer", "Not Set",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"),"CHEQUE","UK","25",utils.setDate(0));
        createsupplier.clickDetails();
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals("R1"));
    }

    @Test
    public void testAutostop_AS5() {  //Set todays date
        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R1_R2SupplierAccount(utils.generateName(),"Live","Customer", "Not Set",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"),"CHEQUE","UK","24.99",utils.setDate(0));
        createsupplier.clickDetails();
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals(""));
    }

    @Test
    public void testAutostop_AS6() {  // set date using date field, perhaps create a method in utility class

        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R1_R2SupplierAccount(utils.generateName(),"Ready To Transact","Customer", "Not Set",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"), "DD","UK","789.92",utils.setDate(0));
        createsupplier.clickDetails();
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals(""));
    }

    @Test
    public void testAutostop_AS7() {  // set date using date field, perhaps create a method in utility class

        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R3SupplierAccount(utils.generateName(),"Live","Customer", "Not Set",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"),"CHEQUE","UK","234.99",utils.setDate(-3),utils.setDate(-2));
        createsupplier.clickDetails();
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals("R3"));
    }

    @Test
    public void testAutostop_AS8() {  // set date using date field, perhaps create a method in utility class

        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R1_R2SupplierAccount(utils.generateName(),"Ready To Transact","Customer", "Not Set",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"), "CHEQUE","UK","24.99",utils.setDate(-2));
        createsupplier.clickDetails();
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals(""));
    }

    @Test
    public void testAutostop_AS9_I1() {  // set date using date field, perhaps create a method in utility class

        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R1_R2SupplierAccount(utils.generateName(),"In Implementation","Customer", "Single Entity",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"), "CHEQUE","UK","456.99",utils.setDate(0));
        createsupplier.clickDetails();
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals("I1"));
    }

    @Test
    public void testAutostop_AS9_I2() {  // set date using date field, perhaps create a method in utility class

        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R1_R2SupplierAccount(utils.generateName(),"In Implementation","Customer", "Single Entity",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"), "CHEQUE","UK","456.99",utils.setDate(-2));
        createsupplier.clickDetails();
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals("I2"));
    }

    @Test
    public void testAutostop_AS9_I3() {

        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R3SupplierAccount(utils.generateName(),"In Implementation","Customer", "Not Set",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"),"CHEQUE","UK","234.99",utils.setDate(-3),utils.setDate(-2));
        createsupplier.clickDetails();
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals("I3"));
    }

    @Test
    public void testAutostop_AS10() {  // set date using date field, perhaps create a method in utility class

        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R1_R2SupplierAccount(utils.generateName(),"In Implementation","Customer", "Single Entity",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"), "CHEQUE","UK","25",utils.setDate(0));
        createsupplier.clickDetails();
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals("I1"));
    }

    @Test
    public void testAutostop_AS11() {

        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R1_R2SupplierAccount(utils.generateName(),"In Implementation","Customer", "Single Entity",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"), "CHEQUE","UK","24.99",utils.setDate(0));
        createsupplier.clickDetails();
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals(""));
    }

    @Test
    public void testAutostop_AS13() {
        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R1_R2SupplierAccount(utils.generateName(),"Live","Customer", "Not Set",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"),"CHEQUE","UK","25.01",utils.setDate(0));
        createsupplier.clickDetails();
        createsupplier.SetManualOverride(true,utils.setDate(2),"REISSUE");
        createsupplier.setReminderDateForManualOverride(utils.setDate(-2),"R1");
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals("R1"));
    }

    @Test
    public void testAutostop_AS14() {
        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R1_R2SupplierAccount(utils.generateName(),"Live","Customer", "Not Set",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"),"CHEQUE","UK","25.01",utils.setDate(-2));
        createsupplier.clickDetails();
        createsupplier.SetManualOverride(true,utils.setDate(2),"REISSUE");
        createsupplier.setReminderDateForManualOverride(utils.setDate(-2),"R2");
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals("R2"));
    }

    @Test
    public void testAutostop_AS15() {
        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R3SupplierAccount(utils.generateName(),"Live","Customer", "Not Set",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"),"CHEQUE","UK","234.99",utils.setDate(-10),utils.setDate(-9));
        createsupplier.clickDetails();
        createsupplier.SetManualOverride(true,utils.setDate(2),"CREDIT");
        createsupplier.setReminderDateForManualOverride(utils.setDate(-7),"R3");
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals("R3"));
    }

    @Test
    public void testAutostop_AS16() {
        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();
        accountpage.createNewAccount();
        newaccpage.selectSupplier();
        newaccpage.clickNext();
        createsupplier.R3SupplierAccountWithP2P(utils.generateName(),"Live","Customer", "Not Set",utils.generateRegistrationNumber("CRN"),utils.generateRegistrationNumber("VRN"),"CHEQUE","UK","234.99",utils.setDate(-10),utils.setDate(-9),utils.setDate(-8),true,utils.setDate(-7));
        createsupplier.clickDetails();
        createsupplier.SetPromiseToPay(false, utils.setDate(-7));
        utils.sleep(3000L);
        createsupplier.SetManualOverride(true,utils.setDate(-3),"CREDIT");
        Assert.assertTrue(createsupplier.getAutoStopStatus().equals("R3 P2P"));
    }


    //@Test
    public void testAutostop_Custom_Settings() {
        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickSetup();
        setuppage.gotoCustomSettings();
        customsettingspage.updateAccountStatus("Ready To Transact");

       // Assert.assertTrue(createsupplier.getAutoStopStatus().contains("R1"));
    }

    @Test
    public void testAutostop_DeleteAll() {
        //loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
        homepage.clickAccount();

        driver.findElement(By.xpath("//span[@class='uiOutputText' and text()='Accounts']/../../../following-sibling::h1/a/div/span/span")).click();

        myDynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=' virtualAutocompleteOptionText' and text()='My Accounts']/parent::a/parent::li")));
        utils.sleep(3000L);
        driver.findElement(By.xpath("//span[@class=' virtualAutocompleteOptionText' and text()='My Accounts']/parent::a/parent::li")).click();
        utils.sleep(3000L);
        driver.findElement(By.xpath("//span[@class=' virtualAutocompleteOptionText' and text()='My Accounts']/parent::a/parent::li")).click();
       // List<WebElement> list_accounts =  driver.findElements(By.xpath("//table/tbody/tr"));
        myDynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='triggerLinkText selectedListView uiOutputText' and text()='My Accounts']")));


        for (int i = 0; i<=210; i++){
           // WebElement ele = list_accounts.get(i);
            if (driver.findElement(By.xpath("//p[text()='No items to display.']")).isDisplayed())
            {
                break;
            }
           if (driver.findElement(By.xpath("//table/tbody/tr/th/span/a")).getText().contains("IkeLionel"))
            {
                utils.sleep(2000L);

                if (driver.findElement(By.xpath("//p[text()='No items to display.']")).isDisplayed())
                {
                    break;
                }

                driver.findElement(By.xpath("//table/tbody/tr/th/span/a")).click();
                utils.sleep(1000L);
                driver.findElement(By.xpath("//a[@title='Delete' and @class='forceActionLink']")).click();
                //driver.findElement(By.xpath("//table/tbody/tr/td/div/div/a/span")).click();
                utils.sleep(1000L);
               // myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Delete' and @aria-disabled='false']")));
                //driver.findElement(By.xpath("//a[@title='Delete' and @aria-disabled='false']")).click();
                //utils.sleep(3000L);
                driver.findElement(By.xpath("//button/span[text()='Delete']")).click();
                utils.sleep(1000L);
            }
            else {break;}
        }
    }

    public void testAutostop_Delete() {
                driver.findElement(By.xpath("//a[@title='Delete' and @class='forceActionLink']")).click();
                utils.sleep(3000L);
                driver.findElement(By.xpath("//button/span[text()='Delete']")).click();
                utils.sleep(1000L);
    }

    @BeforeMethod
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        env = new Environment("environment","SFEnvironmentUAT");
        driver.get(env.getEnvironment());
        loginpage = new Login_Page(driver);
        System.out.print(loginpage.getLoginTitle());
        homepage = new Home_Page(driver);
        accountpage = new Account_Page((driver));
        newaccpage  = new NewAccount_Page(driver);
        createsupplier = new CreateSupplierAccount_Page(driver);
        setuppage = new SetUp_Page(driver);
        customsettingspage = new CustomSettings_Page(driver);
        utils = new Utilities();
        loginpage.loginToSalesForce(env.getUsername("SFEnvironmentUAT_username"), env.getPassword("SFEnvironmentUAT_password"));
    }

    @AfterMethod
    public void afterTestCase(ITestResult testResult) throws IOException {
            if (testResult.getStatus() == ITestResult.FAILURE) {
                System.out.println(testResult.getStatus());
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("C:\\Users\\ike.lionel\\Desktop\\Screenshot\\" + utils.generateScreenshotName("TakescreenShot")));
            }

        //testAutostop_Delete();
        //Logout
        driver.quit();

    }
}
