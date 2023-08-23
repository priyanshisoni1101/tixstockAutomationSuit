package com.tixstock.test.automation.tixstockAutomationSuit.automation.tixstockPages;

import com.tixstock.test.automation.tixstockAutomationSuit.automation.testBase.TestBase;
import com.tixstock.test.automation.tixstockAutomationSuit.automation.xPaths.TixStockSignUpPageXPaths;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Component
@Data
public class TixStockSignUpPage extends TestBase {

    TixStockSignUpPageXPaths xPaths = new TixStockSignUpPageXPaths();

    private final WebDriver driver;
    private final By signUpButton = By.xpath(xPaths.signUpButton);

    public TixStockSignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignUpButton() {
        driver.findElement(signUpButton).click();
    }


}
