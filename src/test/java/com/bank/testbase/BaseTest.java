package com.bank.testbase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.bank.propertyreader.PropertyReader;
import com.bank.utility.Utility;


public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeClass
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterClass
    public void tearDown() {
        closeBrowser();
    }

}
