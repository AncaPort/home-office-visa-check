package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    /**
     * 5.ReasonForTravelPage - nextStepButton, reasonForVisitList locators and create methods  'void selectReasonForVisit(String reason)'
     * and  'void clickNextStepButton()'
     */
    @CacheLookup
    @FindBy(xpath = "//input[@name='response']")
    List<WebElement> radioButton;

    public void selectReasonForVisit(String reason) {
        System.out.println();
        for (WebElement option : radioButton) {
            System.out.println(option.getText());
            if (option.getAttribute("value").equalsIgnoreCase(reason)) {
                option.click();
                break;
            }
        }
    }
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void clickNextStepButton() {
        Reporter.log("click on continue"+nextStepButton.toString());
        CustomListeners.test.log(Status.PASS,"click on continue"+nextStepButton);
        clickOnElement(nextStepButton);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-!-margin-bottom-6']/h2")
    WebElement text1;

    public String verifyText() {
        return getTextFromElement(text1);
    }
}