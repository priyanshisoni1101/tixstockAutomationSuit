package com.tixstock.test.automation.tixstockAutomationSuit.automation.tixstockPages;

import com.google.common.base.FinalizablePhantomReference;
import com.tixstock.test.automation.tixstockAutomationSuit.automation.xPaths.TixStockSignUpPage_xPaths;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Data
@Component
public class TixStockSignUp_payments {

    TixStockSignUpPage_xPaths xPaths = new TixStockSignUpPage_xPaths();
    private final WebDriver driver;


    public TixStockSignUp_payments(WebDriver driver){
        this.driver=driver;
    }

}
