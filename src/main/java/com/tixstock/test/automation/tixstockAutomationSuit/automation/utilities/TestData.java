package com.tixstock.test.automation.tixstockAutomationSuit.automation.utilities;

import org.springframework.stereotype.Component;

import java.util.Random;

import static com.tixstock.test.automation.tixstockAutomationSuit.automation.utilities.CommonUtilities.*;

@Component
public class TestData {

    public static String userName = "BusinessAccount1" + getRandomIntString(3),
            password = "Pass" + getRandomIntString(3),
            firstName = "SomeBusiness" + getRandomIntString(3),
            lastName = "Last" + getRandomIntString(3),
            email = "somebusiness" + getRandomIntString(3) + "@gmail.com",
            phone = "9" + getRandomIntString(9),
            companyName = "Some Business Company" + getRandomIntString(3),
            postalCode = getRandomIntString(6),
            country = "Spain",
            city = "London", countyCode = "+44",
            addressLine1 = "Some Street" + getRandomIntString(3),
            addressLine2 = "Some Block" + getRandomIntString(3);

    public static String fundingBankName = "American Express",
            fundingHolderName= userName,No = "No",Yes="Yes",
            IbanAcc =getRandomIntString(10),
            SortCode= getRandomIntString(4),
            cardNumber=getRandomIntString(16),
            ExpiryInput="06/29",
            cardCvv=getRandomIntString(3),
            India="India",INR="INR",USD="USD",
            filePath1=System.getProperty("user.dir")+"src/reports/someFile.pdf",
            filePath2=System.getProperty("user.dir")+"src/reports/someFile.pdf";

}
