package com.tixstock.test.automation.tixstockAutomationSuit.automation.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.tixstock.test.automation.tixstockAutomationSuit.automation.CustomExceptions.CustomExpection;
import com.tixstock.test.automation.tixstockAutomationSuit.automation.testBase.TestBase;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.Properties;
import java.util.Random;

import static com.tixstock.test.automation.tixstockAutomationSuit.automation.CustomExceptions.CustomExpection.booleanFalseException;
import static com.tixstock.test.automation.tixstockAutomationSuit.automation.constants.GlobalConstants.*;

@Component
public class CommonUtilities extends TestBase {
    private static final String INT = "123456789";
    static Random random = new Random();

    public static String getRandomIntString(int lenght) {
        StringBuilder token = new StringBuilder(lenght);
        for (int i = 0; i < lenght; i++) {
            token.append(INT.charAt(random.nextInt(INT.length())));
        }
        return token.toString();
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

    public static void takeScreenshot(WebDriver driver, String folderName, String filename ){
        TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
        File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);
        String randomKey = RandomString.make(5);
        String destinationPath = "src/reports/"+folderName+"/"+ filename+"-"+randomKey+".png";

        try {
            FileUtils.copyFile(screenshotFile, new File(destinationPath));
            System.out.println("Screenshot saved: " + destinationPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
