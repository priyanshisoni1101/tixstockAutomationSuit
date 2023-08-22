package com.tixstock.test.automation.tixstockAutomationSuit.automation.testBase;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootConfiguration
@PropertySource(value = {"classpath:application-${tixstock.testing.env}.properties","classpath:application.properties"})
public class TestBase {
    protected WebDriver driver;
    @Autowired
    protected static Environment env;




}
