package com.bank.Pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    //click on "Deposit" Tab
    By deposit = By.xpath("//button[@class='btn btn-lg tab btn-primary']");
    //Enter amount 100
    By  amountToBeDeposited  = By.xpath("////input[@placeholder='amount']");
    //click on "Deposit" Button
    By Deposit= By.xpath("//button[@type='submit']");
    //verify message "Deposit Successful"
    By depositsucessfulText =By.xpath("//span[@class='error ng-binding']");
  // verify message "Transaction Successful"
    By transactionSuccessfulText = By.xpath("//span[@class='error ng-binding']");
    //  click on "Withdrawl" Tab
    By withdrawl = By.xpath("//button[normalize-space()='Withdrawl']");
    // Enter amount 50
    By amountToBEWithdrawl = By.xpath("//input[@placeholder='amount']");
    //click on "Withdraw" Button
    By WithdrawlBtn = By.xpath("//button[@type='submit']");


    public void clickOndepositTab(){
        clickOnElement(deposit);
    }
    public void enterAmountToBEDeposited(String value){
        sendTextToElement (amountToBeDeposited,value);
    }
    public void clickOnDepositBtn(){
        clickOnElement(Deposit);
    }
   public String verifyTextDepositSuccessful(){
        return getTextFromElement(depositsucessfulText);
   }

   public void clickonWithdrawlTab(){
        clickOnElement(withdrawl);
   }
   public void withdrawAmount(String value){
        sendTextToElement(amountToBEWithdrawl ,"amount");
   }
   public void clickOnwithdrawlBtn(){
        clickOnElement(WithdrawlBtn);
   }
    public String verifyTextTransactionSuccessful(){
        return getTextFromElement(transactionSuccessfulText);
    }


}
