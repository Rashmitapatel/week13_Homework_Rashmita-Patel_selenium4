package com.bank.testsuite;

import com.bank.Pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomersPage customerPage = new CustomersPage();
    AccountPage accountPage = new AccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();


    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickonbankManagerLoginTab();
        bankManagerLoginPage.ClickOnAddCustomerTab();
        addCustomerPage.enterFirstName("Prime");
        addCustomerPage.enterLastName("Testing");
        addCustomerPage.enterPostcode("AB34CD");
        addCustomerPage.clickOnAddCustomerButton();
        Assert.assertTrue(addCustomerPage.getTextFromAlert().contains("Customer added successfully"));
        addCustomerPage.acceptAlert();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
     homePage.clickOnHome();

        // click On "Bank Manager Login" Tab
        homePage.clickonbankManagerLoginTab();
        bankManagerLoginPage.ClickOnopenAccountTab();
        openAccountPage.searchCustomer("Harry Potter");
        openAccountPage.selectCurrencyDropdown("100");
        openAccountPage.clickProcessBtn();
        Assert.assertTrue(openAccountPage.getTextfromAccountcreatedsuccessfully().contains("Account created successfully"));
        openAccountPage.acceptAlert();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnHome();

        homePage.ClickOnCustomerLogin();

        customerLoginPage.selectYourNameDropDown("Harry Potter");
        customerLoginPage.clickOnLogin();
        // CustomerLoginPage.verifyThatLogoutIsDisplayed();
       customerLoginPage.verifyThatLogoutIsDisplayed();
       customerPage.clickOnLogout();
       // customerLoginPage.acceptAlert();
        Assert.assertTrue(customerLoginPage.verifyYourNameTExt().contains("Your Name"), "Field does not contain Your Name");
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnHome();
        //click on "Customer Login" Tab
        homePage.ClickOnCustomerLogin();
        //search customer that you created
        customerLoginPage.selectYourNameDropDown("Harry Potter");
        // click on "Login" Button
        customerLoginPage.clickOnLogin();
        // click on "Deposit" Tab
        accountPage.clickOnDepositBtn();
        // Enter amount 100
        accountPage.enterAmountToBEDeposited("100");
        // click on "Deposit" Button
        accountPage.clickOndepositTab();
        //verify message "Deposit Successful"
        Assert.assertTrue(customerLoginPage.verifyYourNameTExt().contains("Rashmita Patel"), "Field dosent contain your name");

    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnHome();

        // click on "Customer Login" Tab
        customerLoginPage.clickOnLogin();
        //  search customer that you created.
        customerLoginPage.selectYourNameDropDown("Harry Potter");
        //  click on "Login" Button
        customerLoginPage.clickOnLogin();
        //  click on "Withdrawl" Tab
        accountPage.clickOndepositTab();
        // Enter amount 50
        accountPage.withdrawAmount("50");
        //click on "Deposit" Button
        accountPage.clickOnwithdrawlBtn();
        //verify message "Transaction Successful"
        Assert.assertTrue(accountPage.verifyTextTransactionSuccessful().contains("Transcation Successful"), "Text is not verified");
    }

}