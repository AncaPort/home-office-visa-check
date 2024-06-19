package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.testng.Reporter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {
    /**
     * 1.HomePage -
     * Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
     * Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance), clickOnMoreSearchOptionLink(),
     * enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType), selectJobType(String jobType),
     * clickOnFindJobsButton().
     */
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void enterJobTitle(String jobTitle) {
        clickOnElement(this.jobTitle);
        sendTextToElement(this.jobTitle, jobTitle);
        CustomListeners.test.log(Status.PASS, "Enter job title" + jobTitle);
        Reporter.log("Enter job title" + jobTitle.toString());
    }

    public void enterLocation(String location) {
        clickOnElement(this.location);
        sendTextToElement(this.location, location);
        CustomListeners.test.log(Status.PASS, "Enter location" + location);
        Reporter.log("Enter location" + location.toString());
    }

    public void selectDistance(String distance) {
        clickOnElement(distanceDropDown);
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
        CustomListeners.test.log(Status.PASS, "select distance" + distanceDropDown);
        Reporter.log("Enter location" + distanceDropDown.toString());
    }

    public void enterMinSalary(String minSalary) {
        clickOnElement(salaryMin);
        sendTextToElement(salaryMin, minSalary);
        CustomListeners.test.log(Status.PASS, "Salary minimum" + salaryMin);
        Reporter.log("Salary minimum" + salaryMin.toString());
    }

    public void clickOnMoreSearchOptionLink() {
        mouseHoverToElementAndClick(moreSearchOptionsLink);
        Reporter.log("click on more option " + moreSearchOptionsLink.toString());
        CustomListeners.test.log(Status.PASS, "click on more option" + moreSearchOptionsLink);
    }

    public void enterMaxSalary(String maxSalary) {
        clickOnElement(salaryMax);
        sendTextToElement(salaryMax, maxSalary);
        CustomListeners.test.log(Status.PASS, "salary max" + salaryMax);
        Reporter.log("salary max " + salaryMax.toString());
    }

    public void selectSalaryType(String sType) {
        clickOnElement(salaryTypeDropDown);
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
        CustomListeners.test.log(Status.PASS, "salary type dropdown" + salaryTypeDropDown);
        Reporter.log("salary type dropdown " + salaryTypeDropDown.toString());
    }

    public void selectJobType(String jobType) {
        clickOnElement(jobTypeDropDown);
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        CustomListeners.test.log(Status.PASS, "select job type dropdown" + jobTypeDropDown);
        Reporter.log("select job type dropdown" + jobTypeDropDown.toString());
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsBtn);
        CustomListeners.test.log(Status.PASS, "click on find job" + findJobsBtn);
        Reporter.log("click on find job " + findJobsBtn.toString());
    }
}