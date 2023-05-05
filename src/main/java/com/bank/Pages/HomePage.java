package com.bank.Pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    // click on "Customer Login" Tab
  public   By customerLoginBtn = By.xpath("//button[normalize-space()='Customer Login']");

    public void ClickOnCustomerLogin() {
        clickOnElement(customerLoginBtn);
    }

   // click On "Bank Manager Login" Tab
    By bankManagerLogin = By.xpath("//button[@class='btn btn-primary btn-lg'][text()='Bank Manager Login']");

    public void clickonbankManagerLoginTab(){

        clickOnElement(bankManagerLogin);
    }
    By homeLink = By.xpath("//button[contains(text(),'Home')]");
    public void clickOnHome(){
        clickOnElement(homeLink);
    }

}
