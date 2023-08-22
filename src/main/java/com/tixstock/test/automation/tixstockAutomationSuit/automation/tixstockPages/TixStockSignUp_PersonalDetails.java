package com.tixstock.test.automation.tixstockAutomationSuit.automation.tixstockPages;

import com.tixstock.test.automation.tixstockAutomationSuit.automation.xPaths.TixStockSignUpPage_xPaths;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tixstock.test.automation.tixstockAutomationSuit.automation.xPaths.TixStockSignUpPage_xPaths.*;

@Component
@Data
public class TixStockSignUp_PersonalDetails {
    TixStockSignUpPage_xPaths xPaths = new TixStockSignUpPage_xPaths();

    private final WebDriver driver;
    private final By business_RadioButton = By.id(xPaths.Business_id);
    private final By business_RadioButton_2 = By.xpath(xPaths.Business_button_xPath);
    private final By individual_RadioButton_2 = By.xpath(xPaths.Individual_button_xPath);
    private final By individual_RadioButton = By.id(xPaths.Individual_id);
    private final By userName_TextField = By.id(xPaths.userName_id);
    private final By password_TextField = By.id(xPaths.password_id);
    private final By confirm_password_TextField = By.id(xPaths.confirm_password_id);
    private final By firstname_TextField = By.id(xPaths.firstname_id);
    private final By lastname_TextField = By.id(xPaths.lastname_id);
    private final By email_TextField = By.id(xPaths.email_first_id);
    private final By email_confirm_TextField = By.id(xPaths.email_confirm_id);
    private final By countryCode_TextField = By.id(xPaths.countryCode_dropdownMenuButton_id);
    private final By countryCode_dropdownMenuButton_options = By.id(xPaths.countryCode_dropdownMenuButton_options_xPath);
    private final By phoneNumber_TextField = By.name(xPaths.phoneNumber_name);
    private final By company_TextField = By.id(xPaths.company_id);
    private final By country_TextField = By.xpath(xPaths.country_xpath);
    private final By country_options_DropDown_button = By.xpath(xPaths.country_options_xpath);
    private final By address_line_1_TextField = By.id(xPaths.address_line_1_id);
    private final By address_line_2_TextField = By.id(xPaths.address_line_2_id);
    private final By city_TextField = By.id(xPaths.city_id);
    private final By postcode_TextField = By.id(xPaths.postcode_id);
    private final By submit_Button = By.xpath(xPaths.submitButton_xpath);
    private final By save_Button = By.xpath(xPaths.saveButton_xpath);


    public TixStockSignUp_PersonalDetails(WebDriver driver) {
        this.driver = driver;
    }

    public boolean selectBusinessAccountType() {
        if (!driver.findElement(business_RadioButton_2).isSelected())
            driver.findElement(business_RadioButton_2).click();
        return driver.findElement(business_RadioButton_2).isSelected();

    }

    public boolean selectIndividualAccountType() {
        driver.findElement(individual_RadioButton_2).click();
        return driver.findElement(individual_RadioButton_2).isSelected();
    }

    public String enterUserName(String userName) {
        driver.findElement(userName_TextField).sendKeys(userName);
        return driver.findElement(userName_TextField).getAttribute("value");
    }

    public String enterPassword(String password) {
        driver.findElement(password_TextField).sendKeys(password);
        return driver.findElement(password_TextField).getAttribute("value");
    }

    public String confirmPassword(String password) {
        driver.findElement(confirm_password_TextField).sendKeys(password);
        return driver.findElement(confirm_password_TextField).getAttribute("value");
    }

    public String enterFirstName(String firstName) {
        driver.findElement(firstname_TextField).sendKeys(firstName);
        return driver.findElement(firstname_TextField).getAttribute("value");
    }

    public String enterLastName(String lastName) {
        driver.findElement(lastname_TextField).sendKeys(lastName);
        return driver.findElement(lastname_TextField).getAttribute("value");
    }

    public String enterEmail(String email) {
        driver.findElement(email_TextField).sendKeys(email);
        return driver.findElement(email_TextField).getAttribute("value");
    }

    public String confirmEmail(String email) {
        driver.findElement(email_confirm_TextField).sendKeys(email);
        return driver.findElement(email_confirm_TextField).getAttribute("value");
    }

    public String enterCountryCode(String countryCode) {
        driver.findElement(countryCode_TextField).sendKeys(countryCode);
        return driver.findElement(countryCode_TextField).getAttribute("value");
    }

    public String enterPhone(String phone) {
        driver.findElement(phoneNumber_TextField).sendKeys(phone);
        return driver.findElement(phoneNumber_TextField).getAttribute("value");
    }

    public String enterCompany(String companyName) {
        driver.findElement(company_TextField).sendKeys(companyName);
        return driver.findElement(company_TextField).getAttribute("value");
    }

    public String enterCountry(String country) {
        driver.findElement(country_options_DropDown_button).click();
        By country_options_byName= By.xpath("//*[contains(text(),'"+country+"')]");
        driver.findElement(country_options_byName).click();
        return driver.findElement(country_TextField).getAttribute("value");
    }
    public String enterCountry(int selectIndex) {
        driver.findElement(country_options_DropDown_button).click();
        By country_options_byIndex = By.xpath(xPaths.country_options_byIndex_xpath+selectIndex+"]");
        driver.findElement(country_options_byIndex).click();
        return driver.findElement(country_TextField).getAttribute("value");
    }

    public String enterAddressLine1(String addressLine1) {
        driver.findElement(address_line_1_TextField).sendKeys(addressLine1);
        return driver.findElement(address_line_1_TextField).getAttribute("value");
    }

    public String enterAddressLine2(String addressLine2) {
        driver.findElement(address_line_2_TextField).sendKeys(addressLine2);
        return driver.findElement(address_line_2_TextField).getAttribute("value");
    }

    public String enterCity(String city) {
        driver.findElement(city_TextField).sendKeys(city);
        return driver.findElement(city_TextField).getAttribute("value");
    }

    public String enterPostCode(String postCode) {
        driver.findElement(postcode_TextField).sendKeys(postCode);
        return driver.findElement(postcode_TextField).getAttribute("value");
    }

    public void pressSaveButton(){
        driver.findElement(save_Button).click();
    }

    public void pressSubmitButton(){
        driver.findElement(submit_Button).click();
    }

}
