package com.tixstock.test.automation.tixstockAutomationSuit.automation.testClasses;

import com.tixstock.test.automation.tixstockAutomationSuit.automation.testBase.TestBase;
import com.tixstock.test.automation.tixstockAutomationSuit.automation.tixstockPages.TixStockSignUpPage;
import com.tixstock.test.automation.tixstockAutomationSuit.automation.tixstockPages.TixStockSignUpPaymentsPage;
import com.tixstock.test.automation.tixstockAutomationSuit.automation.tixstockPages.TixStockSignUpPersonalDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.tixstock.test.automation.tixstockAutomationSuit.automation.constants.GlobalConstants.*;
import static com.tixstock.test.automation.tixstockAutomationSuit.automation.utilities.CommonUtilities.*;
import static com.tixstock.test.automation.tixstockAutomationSuit.automation.utilities.TestData.*;

public class TixStockSignUpTests extends TestBase {

    @Autowired
    TixStockSignUpPage signUpPage;
    @Autowired
    TixStockSignUpPersonalDetails personalDetailPage;
    @Autowired
    TixStockSignUpPaymentsPage paymentsPage;

    WebDriverWait wait;
    By signUpButton, business_RadioButton;
    String tixStockUrl;
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\nikhilsoni\\Downloads\\geckodriver");
        tixStockUrl = getFieldFromPropertiesFile(environment_url_variableName);
        driver.get(tixStockUrl);
        //driver.manage().window().fullscreen();
        signUpPage = new TixStockSignUpPage(driver);
        personalDetailPage = new TixStockSignUpPersonalDetails(driver);
        paymentsPage = new TixStockSignUpPaymentsPage(driver);
        signUpButton = signUpPage.getSignUpButton();
        business_RadioButton = personalDetailPage.getBusiness_RadioButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(signUpButton));
        Assert.assertTrue(driver.findElement(signUpButton).isDisplayed(), "Validate if page loaded and click button is visible");

    }

    //@BeforeMethod
    public void beforeMethod() {
    }

    @AfterClass
    public void afterClass() {
        //driver.quit();
    }

    @Test(enabled = true, priority = 0)
    public void TC01_Validate_SignUpPage_CreateAccountButton() {
        signUpPage.clickSignUpButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(business_RadioButton));
        Assert.assertEquals(driver.getCurrentUrl(), tixStock_YourDetails_url, "Validate if page loaded and click button is visible");
    }

    @Test(enabled = true, priority = 1)
    public void TC02_YourDetailsPage_SetFields() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(personalDetailPage.getBusiness_RadioButton_2()));

        personalDetailPage.selectIndividualAccountType();
        personalDetailPage.selectBusinessAccountType();
        personalDetailPage.enterUserName(userName);
        personalDetailPage.enterPassword(password);
        personalDetailPage.confirmPassword(password);
        personalDetailPage.enterFirstName(firstName);
        personalDetailPage.enterLastName(lastName);
        personalDetailPage.enterEmail(email);
        personalDetailPage.confirmEmail(email);
        personalDetailPage.enterCompany(companyName);
        personalDetailPage.enterCountryCode(countyCode);
        personalDetailPage.enterAddressLine1(addressLine1);
        personalDetailPage.enterAddressLine2(addressLine2);
        personalDetailPage.enterCity(city);
        personalDetailPage.enterPostCode(postalCode);
        personalDetailPage.enterPhone(phone);
        personalDetailPage.enterCountry(2);
        personalDetailPage.enterCountry(country);

        Assert.assertEquals(driver.findElement(personalDetailPage.getUserName_TextField()).getAttribute("value"), userName, "Validate if userName field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getPassword_TextField()).getAttribute("value"), password, "Validate if Password field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getConfirm_password_TextField()).getAttribute("value"), password, "Validate if confirm Password field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getFirstname_TextField()).getAttribute("value"), firstName, "Validate if firstName field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getLastname_TextField()).getAttribute("value"), lastName, "Validate if lastName field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getEmail_TextField()).getAttribute("value"), email, "Validate if email field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getEmail_confirm_TextField()).getAttribute("value"), email, "Validate if confirmEmail field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getAddress_line_1_TextField()).getAttribute("value"), addressLine1, "Validate if addressLine1 field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getAddress_line_2_TextField()).getAttribute("value"), addressLine2, "Validate if addressLine2 field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getCity_TextField()).getAttribute("value"), city, "Validate if city field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getPostcode_TextField()).getAttribute("value"), postalCode, "Validate if postalCode field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getCompany_TextField()).getAttribute("value"), companyName, "Validate if companyName field action performed");




    }

    @Test(enabled = true, priority = 2)
    public void TC03_ValidateSaveButtonAction(){
        personalDetailPage.pressSaveButton();
        Assert.assertEquals(driver.getCurrentUrl(), tixStock_YourDetails_url, "Validate if page loaded and click button is visible");

        Assert.assertEquals(driver.findElement(personalDetailPage.getUserName_TextField()).getAttribute("value"), userName, "Validate if userName field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getPassword_TextField()).getAttribute("value"), password, "Validate if Password field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getConfirm_password_TextField()).getAttribute("value"), password, "Validate if confirm Password field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getFirstname_TextField()).getAttribute("value"), firstName, "Validate if firstName field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getLastname_TextField()).getAttribute("value"), lastName, "Validate if lastName field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getEmail_TextField()).getAttribute("value"), email, "Validate if email field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getEmail_confirm_TextField()).getAttribute("value"), email, "Validate if confirmEmail field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getAddress_line_1_TextField()).getAttribute("value"), addressLine1, "Validate if addressLine1 field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getAddress_line_2_TextField()).getAttribute("value"), addressLine2, "Validate if addressLine2 field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getCity_TextField()).getAttribute("value"), city, "Validate if city field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getPostcode_TextField()).getAttribute("value"), postalCode, "Validate if postalCode field action performed");
        Assert.assertEquals(driver.findElement(personalDetailPage.getCompany_TextField()).getAttribute("value"), companyName, "Validate if companyName field action performed");

    }

    @Test(enabled = true,priority = 3)
    public void TC04_ValidateSubmitButtonAction() {
        personalDetailPage.pressSubmitButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(paymentsPage.getFundingBankName()));
        Assert.assertEquals(driver.getCurrentUrl(), tixStock_paymentsPage_url, "Validate if page loaded and click button is visible");

    }

    @Test(enabled = true,priority = 4)
    public void TC05_PaymentsPage_SetFields(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(paymentsPage.getFundingBankName()));
        Assert.assertEquals(driver.getCurrentUrl(), tixStock_paymentsPage_url, "Validate if page loaded and click button is visible");

        paymentsPage.enterFundingBankName(fundingBankName);
        paymentsPage.enterFundingHolderName(fundingHolderName);
        paymentsPage.enterFundingIbanNO();
        paymentsPage.enterFundingIbanNOACC(IbanAcc);
        paymentsPage.enterFundingIbanNoSortCode(SortCode);
        paymentsPage.enterUseSameAcc();
        wait.until(ExpectedConditions.visibilityOfElementLocated(paymentsPage.getCardNumber()));
        paymentsPage.enterCardNumber(cardNumber);
        paymentsPage.enterCardExpiryInput(ExpiryInput);
        paymentsPage.enterCardCVV(cardCvv);
        paymentsPage.enterCountryDropdown(India);
        paymentsPage.enterBaseCurrencyDropDownByIndex(1);
        paymentsPage.enterBaseCurrencyDropDownByName(USD);
        paymentsPage.enterIsVatRegistered(No);
        paymentsPage.enterUploadFile(filePath1);
        paymentsPage.enterUploadFile(filePath2);
        paymentsPage.enterTermsButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(paymentsPage.getAgreementCheckBox()));
        paymentsPage.enterAgreementCheckBox();
        paymentsPage.enterAgreementContinue();
        paymentsPage.enterAgreementClose();
        wait.until(ExpectedConditions.visibilityOfElementLocated(paymentsPage.getSaveProgress_Button()));
        paymentsPage.enterSaveProgressButton();
        paymentsPage.enterCompleteAccountSignUpButton();
    }

}
