package com.bank.Pages;

import org.openqa.selenium.By;
import com.bank.utility.Utility;

public class BankManagerLoginPage extends Utility {

//click on Add Customer Tab

By addCustomerTab = By.xpath("//button[normalize-space()='Add Customer']");
public void ClickOnAddCustomerTab(){
    clickOnElement(addCustomerTab);
}


   //click On "Open Account" Tab
   By openAccountTab =By.xpath("//button[normalize-space()='Open Account']");

   public void ClickOnopenAccountTab(){
       clickOnElement(openAccountTab);
   }

}
