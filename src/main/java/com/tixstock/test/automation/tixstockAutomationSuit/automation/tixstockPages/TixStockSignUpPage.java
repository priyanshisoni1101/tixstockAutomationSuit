package com.tixstock.test.automation.tixstockAutomationSuit.automation.tixstockPages;

import com.tixstock.test.automation.tixstockAutomationSuit.automation.testBase.TestBase;
import com.tixstock.test.automation.tixstockAutomationSuit.automation.xPaths.TixStockSignUpPage_xPaths;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class TixStockSignUpPage extends TestBase {

    TixStockSignUpPage_xPaths xPaths = new TixStockSignUpPage_xPaths();

    private final WebDriver driver;
    private final By signUpButton = By.xpath(xPaths.signUpButton);

    public TixStockSignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignUpButton() {
        driver.findElement(signUpButton).click();
    }


}
