package com.bank.Pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    //  Search customer that created in first test
    By selectCustomerLink = By.xpath(" //option[@value=6]");

    public void searchCustomer(String name) {
        selectByVisibleTextFromDropDown(selectCustomerLink,name);
    }

    // Select currency "Pound"
    By selectCurrency = By.xpath("//option[@value=\"Pound\"]");

    public void selectCurrencyDropdown(String currency) {
        selectByVisibleTextFromDropDown(selectCurrency,currency);
    }

    // click on "process" button
    By clickprocessBtn = By.xpath("//button[@type='submit']");

    public void clickProcessBtn() {
        clickOnElement(clickprocessBtn);
    }


    //  verify message "Account created successfully"
    public String getTextfromAccountcreatedsuccessfully() {
        return getTextFromAlert();

    }


    // click on "ok" button on popup.
    public void acceptpopAlert() {
        acceptAlert();


    }


}

