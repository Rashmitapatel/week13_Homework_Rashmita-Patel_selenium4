package com.bank.Pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    //click On "Add Customer" Tab
    By addCustomer = By.xpath("////button[normalize-space()='Add Customer']");

    //enter FirstName
    By firstName = By.xpath("//input[@placeholder='First Name']");

    public void enterFirstName(String value) {
        sendTextToElement(firstName, value);
    }

    // enter LastName
    By LastName = By.xpath("//input[@placeholder='Last Name']");

    public void enterLastName(String value) {
        sendTextToElement(LastName, value);

    }

    By postcode = By.xpath("//input[@placeholder='Post Code']");

    public void enterPostcode(String value) {
        sendTextToElement(postcode, value);

    }

    //click On "Add Customer" Button
    By customerButton = By.xpath("//button[@type='submit']");

    public void clickOnAddCustomerButton() {
        clickOnElement(customerButton);
    }

    //verify message "Customer added successfully"
    //get text from popup
    public String getTextfromCustomerAddedSuccessfully() {
        return getTextFromAlert();

    }


    //click on "ok" button on popup.
    public void acceptpopAlert() {
        acceptAlert();


    }
}






