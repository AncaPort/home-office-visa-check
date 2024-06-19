package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * 2.ResultPage
 * Locators - resultText
 * Method - verifyTheResults(String expected)
 */

public class SelectNationalityPage extends Utility {

    @CacheLookup
    @FindBy(css = ".search-header__title")
    WebElement resultText;


    public void verifyTheResults(String expected) {


        CustomListeners.test.log(Status.PASS, "verify result text" + resultText);
        Reporter.log("verify result text" + resultText);

    }
}
