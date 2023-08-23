package com.tixstock.test.automation.tixstockAutomationSuit.automation.constants;

import org.springframework.stereotype.Component;

@Component
public class GlobalConstants {
    //Counters
    public static int PAGE_RELOAD_RETRY_COUNT= 3;
    public static int PAGE_RELOAD_RETRY_DELAY= 3000;

    //Env constants
    public static String environment_url_variableName = "tixStock.env.url";
    public static String currentTestingEnv_variableName = "tixstock.testing.env";
    public static String getDriverPath = "firefox.driver.path";

    public static String Dashboard= "Dashboard";
    public static String tixStock_YourDetails_url= "https://sandbox-new.tixstock.com/your-details";
    public static String tixStock_paymentsPage_url= "https://sandbox-new.tixstock.com/payments";


}
