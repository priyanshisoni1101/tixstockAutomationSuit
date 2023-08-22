package com.tixstock.test.automation.tixstockAutomationSuit.automation.utilities;

import com.tixstock.test.automation.tixstockAutomationSuit.automation.CustomExceptions.CustomExpection;
import com.tixstock.test.automation.tixstockAutomationSuit.automation.testBase.TestBase;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.Properties;

import static com.tixstock.test.automation.tixstockAutomationSuit.automation.CustomExceptions.CustomExpection.booleanFalseException;
import static com.tixstock.test.automation.tixstockAutomationSuit.automation.constants.GlobalConstants.*;

@Component
public class CommonUtilities extends TestBase {

    public static boolean validateUrl(WebDriver driver, String expectedUrl){

        int i;
        for(i =0;i<PAGE_RELOAD_RETRY_COUNT;i++) {
            try {
                booleanFalseException(driver.getCurrentUrl().equals(expectedUrl));break;
            } catch (CustomExpection e) {
                Reporter.log("Element is not visible hence wait for "+PAGE_RELOAD_RETRY_DELAY+" milliseconds");
                Assert.assertEquals(expectedUrl, driver.getCurrentUrl(), "Validate if element is visible now");
            }
        }
        return i < PAGE_RELOAD_RETRY_COUNT;
    }
    public static String getFieldFromPropertiesFile(String fieldName){
        Properties prop = new Properties();
        try{
            FileReader reader = new FileReader(System.getProperty("user.dir")+"/src/main/resources/application.properties");
            prop.load(reader);
            String currentEnv = prop.getProperty(currentTestingEnv_variableName);
            reader = new FileReader(System.getProperty("user.dir")+"/src/main/resources/application-"+currentEnv+".properties");
            prop.load(reader);
        } catch (Exception e) {
            Reporter.log("invalid file path or env value");
            throw new RuntimeException(e);
        }
        return prop.getProperty(fieldName);
    }
}
