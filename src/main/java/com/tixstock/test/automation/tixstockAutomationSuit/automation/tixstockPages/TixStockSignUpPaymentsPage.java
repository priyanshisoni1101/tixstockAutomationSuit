package com.tixstock.test.automation.tixstockAutomationSuit.automation.tixstockPages;

import com.tixstock.test.automation.tixstockAutomationSuit.automation.xPaths.TixStockSignUpPageXPaths;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Data
@Component
public class TixStockSignUpPaymentsPage {
    TixStockSignUpPageXPaths xPaths = new TixStockSignUpPageXPaths();

    private final WebDriver driver;
    private final By fundingBankName = By.id(xPaths.fundingBankName_id);
    private final By fundingHolderName = By.id(xPaths.fundingHolderName_id);
    private final By fundingIBAN_NO = By.xpath(xPaths.fundingIBAN_NO_xpath);
    private final By fundingIBAN_NO_ACC = By.id(xPaths.fundingIBAN_NO_ACC_id);
    private final By fundingIBAN_NO_SortCode = By.id(xPaths.fundingIBAN_NO_SortCode_id);
    private final By fundingIBAN_YES = By.xpath(xPaths.fundingIBAN_YES_xpath);
    private final By fundingIBAN_YES_IBAN = By.id(xPaths.fundingIBAN_YES_IBAN_id);
    private final By fundingIBAN_YES_SWIFT = By.id(xPaths.fundingIBAN_YES_SWIFT_id);
    private final By useSameAcc = By.xpath(xPaths.useSameAcc_xpath);
    private final By withdrawal_BankName = By.id(xPaths.withdrawal_BankName_id);
    private final By withdrawal_AccHolderName = By.id(xPaths.withdrawal_AccHolderName_id);
    private final By withdrawalIBAN_YES = By.xpath(xPaths.withdrawalIBAN_YES_xpath);
    private final By withdrawalIBAN_YES_IBAN = By.id(xPaths.withdrawalIBAN_YES_IBAN_id);
    private final By withdrawalIBAN_YES_SWIFT = By.id(xPaths.withdrawalIBAN_YES_SWIFT_id);
    private final By withdrawalIBAN_NO = By.xpath(xPaths.withdrawalIBAN_NO_xpath);
    private final By withdrawalIBAN_NO_ACC = By.id(xPaths.withdrawalIBAN_NO_ACC_id);
    private final By withdrawalIBAN_NO_SortCode = By.id(xPaths.withdrawalIBAN_NO_SortCode_id);
    private final By cardNumber = By.id(xPaths.cardNumber_xpath);
    private final By cardExpiryInput = By.id(xPaths.cardExpiryInput_id);
    private final By cardCVV = By.id(xPaths.cardCVV_id);
    private final By country_dropdown = By.xpath(xPaths.country_dropdown_xpath);
    private final By country_field = By.xpath(xPaths.country_field_xpath);
    private final By baseCurrency_dropDown = By.xpath(xPaths.baseCurrency_dropDown_xpath);
    private By baseCurrency_dropDown_byIndex;
    private By baseCurrency_dropDown_byName;
    //private final By revenue_dropDown = By.className(xPaths.revenue_dropDown_class);
    private By revenue_dropDown_byIndex_xpath;
    private By vatRegistered;
    private final By uploadFile = By.xpath(xPaths.uploadFile_xpath);
    private final By saveProgress_Button = By.xpath(xPaths.saveProgress_Button_xpath);
    private final By completeAccountSignUp_Button = By.xpath(xPaths.completeAccountSignUp_Button_xpath);
    private final By agreementCheckBox = By.xpath(xPaths.agreementCheckBox_xpath);
    private final By agreementContinue = By.xpath(xPaths.agreementContinue_xpath);
    private final By agreementClose = By.xpath(xPaths.agreementClose_xpath);
    private final By termsButton = By.xpath(xPaths.termsButton_xpath);


    public TixStockSignUpPaymentsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String enterFundingBankName(String value) {
        driver.findElement(fundingBankName).sendKeys(value);
        return driver.findElement(fundingBankName).getAttribute("value");
    }

    public String enterFundingHolderName(String value) {
        driver.findElement(fundingHolderName).sendKeys(value);
        return driver.findElement(fundingHolderName).getAttribute("value");
    }

    public boolean enterFundingIbanNO() {
        driver.findElement(fundingIBAN_NO).click();
        return driver.findElement(fundingIBAN_NO).isSelected();
    }

    public String enterFundingIbanNOACC(String value) {
        driver.findElement(fundingIBAN_NO_ACC).sendKeys(value);
        return driver.findElement(fundingIBAN_NO_ACC).getAttribute("value");
    }

    public String enterFundingIbanNoSortCode(String value) {
        driver.findElement(fundingIBAN_NO_SortCode).sendKeys(value);
        return driver.findElement(fundingIBAN_NO_SortCode).getAttribute("value");
    }

    public boolean enterFundingIbanYES() {
        driver.findElement(fundingIBAN_YES).click();
        return driver.findElement(fundingIBAN_YES).isSelected();
    }

    public String enterFundingIbanYesIBAN(String value) {
        driver.findElement(fundingIBAN_YES_IBAN).sendKeys(value);
        return driver.findElement(fundingIBAN_YES_IBAN).getAttribute("value");
    }

    public String enterFundingIbanYesSWIFT(String value) {
        driver.findElement(fundingIBAN_YES_SWIFT).sendKeys(value);
        return driver.findElement(fundingIBAN_YES_SWIFT).getAttribute("value");
    }

    public boolean enterUseSameAcc() {
        driver.findElement(useSameAcc).click();
        return driver.findElement(useSameAcc).isSelected();
    }

    public String enterWithdrawalBankName(String value) {
        driver.findElement(withdrawal_BankName).sendKeys(value);
        return driver.findElement(withdrawal_BankName).getAttribute("value");
    }

    public String enterWithdrawalAccHolderName(String value) {
        driver.findElement(withdrawal_AccHolderName).sendKeys(value);
        return driver.findElement(withdrawal_AccHolderName).getAttribute("value");
    }

    public String enterWithdrawalIbanYES(String value) {
        driver.findElement(withdrawalIBAN_YES).sendKeys(value);
        return driver.findElement(withdrawalIBAN_YES).getAttribute("value");
    }

    public String enterWithdrawalIbanYesIBAN(String value) {
        driver.findElement(withdrawalIBAN_YES_IBAN).sendKeys(value);
        return driver.findElement(withdrawalIBAN_YES_IBAN).getAttribute("value");
    }

    public String enterWithdrawalIbanYesSWIFT(String value) {
        driver.findElement(withdrawalIBAN_YES_SWIFT).sendKeys(value);
        return driver.findElement(withdrawalIBAN_YES_SWIFT).getAttribute("value");
    }

    public boolean enterWithdrawalIbanNO() {
        driver.findElement(withdrawalIBAN_NO).click();
        return driver.findElement(withdrawalIBAN_NO).isSelected();
    }

    public String enterWithdrawalIbanNoACC(String value) {
        driver.findElement(withdrawalIBAN_NO_ACC).sendKeys(value);
        return driver.findElement(withdrawalIBAN_NO_ACC).getAttribute("value");
    }

    public String enterWithdrawalIbanNoSortCode(String value) {
        driver.findElement(withdrawalIBAN_NO_SortCode).sendKeys(value);
        return driver.findElement(withdrawalIBAN_NO_SortCode).getAttribute("value");
    }

    public String enterCardNumber(String value) {
        driver.findElement(cardNumber).sendKeys(value);
        return driver.findElement(cardNumber).getAttribute("value");
    }

    public String enterCardExpiryInput(String value) {
        driver.findElement(cardExpiryInput).sendKeys(value);
        return driver.findElement(cardExpiryInput).getAttribute("value");
    }

    public String enterCardCVV(String value) {
        driver.findElement(cardCVV).sendKeys(value);
        return driver.findElement(cardCVV).getAttribute("value");
    }

    public boolean enterCountryDropdown(String value) {
        driver.findElement(country_dropdown).click();
        return driver.findElement(country_dropdown).isSelected();
    }

    public String enterCountryField(String value) {
        driver.findElement(country_field).sendKeys(value);
        return driver.findElement(country_field).getAttribute("value");
    }

    public String enterBaseCurrencyDropDownByIndex(int index) {
        driver.findElement(baseCurrency_dropDown).click();
        baseCurrency_dropDown_byIndex = By.xpath(xPaths.baseCurrency_dropDown_byIndex_xpath + index + "]");
        driver.findElement(baseCurrency_dropDown_byIndex).click();
        return driver.findElement(baseCurrency_dropDown_byIndex).getAttribute("value");
    }

    public boolean enterBaseCurrencyDropDownByName(String value) {
        driver.findElement(baseCurrency_dropDown).click();
        baseCurrency_dropDown_byName = By.xpath(xPaths.baseCurrency_dropDown_byName_xpath + value + "')]");
        driver.findElement(baseCurrency_dropDown_byName).click();
        return driver.findElement(baseCurrency_dropDown_byName).isSelected();
    }

    public boolean enterRevenueDropDownByIndex(int index) {
       // driver.findElement(revenue_dropDown).click();
        revenue_dropDown_byIndex_xpath = By.xpath(xPaths.revenue_dropDown_byIndex_xpath + index + "]");
        driver.findElement(revenue_dropDown_byIndex_xpath).click();
        return driver.findElement(revenue_dropDown_byIndex_xpath).isSelected();
    }

    public boolean enterIsVatRegistered(String value) {
        vatRegistered = By.xpath(xPaths.vatRegistered_xpath + value + "')]");
        driver.findElement(vatRegistered).click();
        return driver.findElement(vatRegistered).isSelected();
    }

    public String enterUploadFile(String value) {
        driver.findElement(uploadFile).sendKeys(value);
        return driver.findElement(uploadFile).getAttribute("value");
    }

    public boolean enterSaveProgressButton() {
        driver.findElement(saveProgress_Button).click();
        return driver.findElement(saveProgress_Button).isSelected();
    }

    public boolean enterCompleteAccountSignUpButton() {
        driver.findElement(completeAccountSignUp_Button).click();
        return driver.findElement(completeAccountSignUp_Button).isSelected();
    }

    public boolean enterAgreementCheckBox() {
        driver.findElement(agreementCheckBox).click();
        return driver.findElement(agreementCheckBox).isSelected();
    }

    public boolean enterAgreementContinue() {
        driver.findElement(agreementContinue).click();
        return driver.findElement(agreementContinue).isSelected();
    }

    public boolean enterAgreementClose() {
        driver.findElement(agreementClose).click();
        return driver.findElement(agreementClose).isSelected();
    }

    public boolean enterTermsButton() {
        driver.findElement(termsButton).click();
        return driver.findElement(termsButton).isSelected();
    }
}
