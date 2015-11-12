package com.telran.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by
 */
public class DrugRecomendationPage extends Page {

    //private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    //fields
    @FindBy(xpath = "//div [id='ctl00_MainContent_ctl10_RadTreeList1_ctl02_RLB_Answers']//input")
    WebElement group1_checkAll;

    @FindBy(xpath = "//li[id='ctl00_MainContent_ctl10_RadTreeList1_ctl02_RLB_Answers_i0']//input")
    WebElement passwordField;


    @FindBy(id = "ctl00_MainContent_ctl10_RadTreeList1_ctl03_TxtPlan")
    WebElement group2_textArea;

    @FindBy(id = "ctl00_MainContent_ctl10_RadTreeList1_ctl03_Add")
    WebElement group2_link_add;

    @FindBy(id = "ctl00_MainContent_ctl10_RadTreeList1_ctl04_TxtPlan")
    WebElement group3_textArea;

    @FindBy(id = "ctl00_MainContent_ctl10_RadTreeList1_ctl04_Add")
    WebElement group3_link_add;


    //Alerts
    @FindBy(xpath = "//*[@id='MainContent_LoginUser_LoginUserValidationSummary']/ul/li[contains(text(),('שם משתמש חובה'))]")
    WebElement wrongUserNameAlert;

    @FindBy(xpath = "//*[@id='MainContent_LoginUser_LoginUserValidationSummary']/ul/li[contains(text(),('סיסמא חובה.'))]")
    WebElement wrongPasswordAlert;


    //public ProfilePage profilePage;

    public DrugRecomendationPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://dhclinicappv2stg.item-soft.co.il/Login.aspx";
        PageFactory.initElements(driver, this);
    }


    public DrugRecomendationPage openLoginPage(WebDriver driver) {
        driver.get(PAGE_URL);
        return this;
    }

//Fill the fileds

    public DrugRecomendationPage fillUsernameField(String username) {
        //  setElementText(usernameField, username);
        return this;
    }


    public DrugRecomendationPage fillPasswordField(String password) {
        setElementText(passwordField, password);
        // Log.info("entering password from the list: " + password + " ");
        return this;
    }


   /* public DrugRecomendationPage waitUntilLoginPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(loginButton);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }*/

    public void clickOnLoginButton() {
        //clickElement(loginButton);

    }

    public void openRegistrationPage() {
        // clickElement(goToRegLink);

    }


    public void openForgotPassPage() {
        // clickElement(forgotPassLink);

    }

    /*public boolean isOnLoginPage() {
        return exists(loginButton);
    }
*/

    //check alert presence

    public boolean alertMessageNotValidUserName() {
        return exists(wrongUserNameAlert);
    }

    public boolean alertMessageNotValidFirsrName() {
        return exists(wrongPasswordAlert);
    }

}