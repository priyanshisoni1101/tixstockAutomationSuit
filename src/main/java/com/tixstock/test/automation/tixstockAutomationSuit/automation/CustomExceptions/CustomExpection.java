package com.tixstock.test.automation.tixstockAutomationSuit.automation.CustomExceptions;

public class CustomExpection extends Exception{
    public CustomExpection (String message) {super(message);}
    public static void booleanTrueException(Boolean booleanOutcome) throws CustomExpection{
        if(booleanOutcome) throw new CustomExpection("true");
    }
    public static void booleanFalseException(Boolean booleanOutcome) throws CustomExpection{
        if(booleanOutcome) throw new CustomExpection("false");
    }
}
