package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WorkTypePage extends Utility {
    /**
     * 2.WorkTypePage - nextStepButton, selectJobtypeList locators and create methods  'void selectJobType(String job)'
     *   and 'void clickNextStepButton()'
     */
@CacheLookup
    @FindBy(css ="#response-0")
    WebElement selectJobtypeList;

public void selectJobType(String job){
    clickOnElement(selectJobtypeList);
    Reporter.log("select job type"+selectJobtypeList.toString());
    CustomListeners.test.log(Status.PASS,"select job type"+selectJobtypeList);
}
@CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextstepButton;

public void clickNextStepButton(){
    clickOnElement(nextstepButton);
    Reporter.log("select next btn"+nextstepButton.toString());
    CustomListeners.test.log(Status.PASS,"select next btn"+nextstepButton);
}
}
