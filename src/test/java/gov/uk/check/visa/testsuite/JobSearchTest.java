package gov.uk.check.visa.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.StartPage;
import gov.uk.check.visa.pages.SelectNationalityPage;
import gov.uk.check.visa.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {

    StartPage homePage;
    SelectNationalityPage resultPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new StartPage();
        resultPage = new SelectNationalityPage();
    }

    /**
     * 1.JobSearchTest
     * Inside JobSearchTest class create following testmethods
     * 1.verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
     * String result).
     * enter job title 'jobTitle'
     * enter Location 'location'
     * select distance 'distance'
     * click on moreSearchOptionsLink
     * enter salaryMin 'salaryMin'
     * enter salaryMax 'salaryMax'
     * select salaryType 'salaryType'
     * select jobType 'jobType'
     * click on 'Find Jobs' button
     * verify the result 'result'
     * Data set
     * |jobTitle|location|distance|salaryMin|salaryMax|salaryType|jobType|result|
     * |Tester|Harrow| up to 5 miles|30000|500000|Per annum| Permanent|Permanent Tester jobs in Harrow on the Hill|
     */
    @Test(groups = {"sanity", "regression"}, dataProvider = "jobSearchData", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result) {
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
    }
}
