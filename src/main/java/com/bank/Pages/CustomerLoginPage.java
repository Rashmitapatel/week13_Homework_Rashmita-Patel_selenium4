package com.bank.Pages;

import org.openqa.selenium.By;
import com.bank.utility.Utility;

public class CustomerLoginPage extends Utility {
    By yourNameLink = By.xpath("//select[@id='userSelect']");
    By loginLink = By.xpath("//button[@type='submit']");
  By logoutBtn = By.xpath("//button[@class='btn logout']");

    By yourName = By.xpath("//label[normalize-space()='Your Name :']");



    public void selectYourNameDropDown(String value){
        selectByVisibleTextFromDropDown(yourNameLink,value);
    }

    public void clickOnLogin(){
        clickOnElement(loginLink);
    }



    public String verifyYourNameTExt(){
        return getTextFromElement(yourName);
    }

    public boolean verifyThatLogoutIsDisplayed(){
        boolean button=driver.findElement(logoutBtn).isDisplayed();
        if (button) {
            return true;
        } else {
            return false;
        }
    }
}



