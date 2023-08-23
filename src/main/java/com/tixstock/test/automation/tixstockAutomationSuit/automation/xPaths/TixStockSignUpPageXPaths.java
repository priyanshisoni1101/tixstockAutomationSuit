package com.tixstock.test.automation.tixstockAutomationSuit.automation.xPaths;

import org.springframework.stereotype.Component;

@Component
public class TixStockSignUpPageXPaths {
    //Flow : Sign up, Page : SignIn/SignUp
    public String signUpButton = "//*[contains(text(),'Create an account')]";

    //Flow : Sign up, Page : Your Details
    public String Business_id = "Business";
    public String Business_button_xPath = "//*[contains(text(),'Business')]";
    public String Individual_id = "Individual";
    public String Individual_button_xPath = "//*[contains(text(),'Individual')]";
    public String userName_id = "username";
    public String password_id = "password";
    public String confirm_password_id = "confirm_password";
    public String firstname_id = "firstname";
    public String lastname_id = "lastname";
    public String email_first_id = "email_first";
    public String email_confirm_id = "email_confirm";
    public String countryCode_dropdownMenuButton_id = "dropdownMenuButton";
    public String countryCode_dropdownMenuButton_options_xPath = "//*[@id='dropdownMenuButton']/parent::div/ul/*[contains(text(),'+')]";
    public String phoneNumber_name = "phone";
    public String company_id = "company";
    public String country_xpath = "//*[contains(text(),'Country')]";
    public String country_options_xpath = "//*[@class='all_dropdown__indicators css-1wy0on6']";
    public String country_options_byIndex_xpath = "//*[@class='all_dropdown__option css-1og8mwm-option'][";
    public String address_line_1_id = "address_line_1";
    public String address_line_2_id = "address_line_2";
    public String city_id = "city";
    public String postcode_id = "postcode";
    public String submitButton_xpath = "//*[contains(text(),'Continue to next step') and @type='submit']";
    public String saveButton_xpath = "//*[contains(text(),'Save progress') and @type='button']";

    //Flow : Sign up, Page : Payments
    public String fundingBankName_id = "funding_bank_name";
    public String fundingHolderName_id = "funding_ac_holder_name";
    public String fundingIBAN_NO_xpath = "//*[@for='funding-iban-no']/h4";
    public String fundingIBAN_NO_ACC_id = "funding_ac_number";
    public String fundingIBAN_NO_SortCode_id = "funding_sort_code";
    public String fundingIBAN_YES_xpath = "//*[@for='funding-iban-yes']/h4";
    public String fundingIBAN_YES_IBAN_id = "funding_iban";
    public String fundingIBAN_YES_SWIFT_id = "funding_swift";
    public String useSameAcc_xpath = "//*[@name='use_as_same' and @id='default-checkbox']";
    public String withdrawal_BankName_id = "withdrawal_bank_name";
    public String withdrawal_AccHolderName_id = "withdrawal_ac_holder_name";
    public String withdrawalIBAN_YES_xpath = "//*[@for='withdrawal-iban-yes']/h4";
    public String withdrawalIBAN_YES_IBAN_id = "withdrawal_iban";
    public String withdrawalIBAN_YES_SWIFT_id = "withdrawal_swift";
    public String withdrawalIBAN_NO_xpath = "//*[@for='withdrawal-iban-no']/h4";
    public String withdrawalIBAN_NO_ACC_id = "withdrawal_ac_number";
    public String withdrawalIBAN_NO_SortCode_id = "withdrawal_sort_code";
    public String cardNumber_xpath = "Field-numberInput";
    public String cardExpiryInput_id = "Field-expiryInput";
    public String cardCVV_id = "Field-cvcInput";
    public String country_dropdown_xpath = "//*[@for='Field-countryInput']/parent::div/div/div/div";
    public String country_field_xpath = "//*[@for='Field-countryInput']/parent::div/div/div/select";
    public String baseCurrency_dropDown_xpath = "//*[@class='all_dropdown__indicator all_dropdown__dropdown-indicator css-yjbq0y-indicatorContainer']";
    public String baseCurrency_dropDown_byIndex_xpath = "//*[@class='scrollbar-thin scrollbar-thumb-violet-800 scrollbar-thumb-rounded-full all_dropdown__menu-list css-12gthpx']/div["; //Partial
    public String baseCurrency_dropDown_byName_xpath = "//*[@class='scrollbar-thin scrollbar-thumb-violet-800 scrollbar-thumb-rounded-full all_dropdown__menu-list css-12gthpx']//*[contains(text(),'";//Partial
    public String revenue_dropDown_class = "all_dropdown__indicator all_dropdown__dropdown-indicator css-ugaxsa-indicatorContainer";
    public String revenue_dropDown_byIndex_xpath = "//*[@class='scrollbar-thin scrollbar-thumb-violet-800 scrollbar-thumb-rounded-full all_dropdown__menu-list css-12gthpx']/div[";//Partial
    public String vatRegistered_xpath = "//*[@name='vat_registered']/parent::label/h4[contains(text(),'";//Partial
    public String uploadFile_xpath = "//*[@class='upload_file']/div[1]";
    public String termsButton_xpath = "//*[contains(text(),'Read and sign terms and conditions')]/parent::button";
    public String saveProgress_Button_xpath = "//*[contains(text(),'Save progress')]";
    public String completeAccountSignUp_Button_xpath = "//*[contains(text(),'Complete account sign up')]";
    public String agreementCheckBox_xpath = "//*[contains(text(),'I agree to use electronic')]/parent::div/input";
    public String agreementContinue_xpath = "//*[@track='continue-button']";
    public String agreementClose_xpath = "//*[@aria-label='Close']";

}
