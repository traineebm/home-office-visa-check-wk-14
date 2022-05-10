package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends TestBase {

    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ResultPage resultPage;
    ReasonForTravelPage reasonForTravelPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    DurationOfStayPage durationOfStayPage;
    WorkTypePage workTypePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        resultPage = new ResultPage();
        reasonForTravelPage = new ReasonForTravelPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        durationOfStayPage = new DurationOfStayPage();
        workTypePage = new WorkTypePage();
    }

    @Test(groups = {"smoke","sanity","regression"})
    public void anAustralianComingToUKForTourism() {
      //startPage.acceptCookiesButton();
        startPage.clickOnStartNow();
        selectNationalityPage.selectNationalityFromDropDown("Australia");
        selectNationalityPage.clickOnNextStepButton();
        reasonForTravelPage.selectReasonForTravel("Tourism or visiting family and friends");
        reasonForTravelPage.clickOnContinueButton();
        resultPage.getResultMessage();
    }

    @Test(groups = {"smoke","regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        startPage.acceptCookiesButton();
        startPage.clickOnStartNow();
        selectNationalityPage.selectNationalityFromDropDown("Chile");
        selectNationalityPage.clickOnNextStepButton();
        reasonForTravelPage.selectReasonForTravel("Work, academic visit or business");
        reasonForTravelPage.clickOnContinueButton();
        durationOfStayPage.selectLengthOfStay("longer than 6 months");
        durationOfStayPage.clickNextStepButton();
        workTypePage.selectJobType("Health and care professional");
        workTypePage.clickOnNextStepButton();
        resultPage.getResultMessage();

    }

    @Test(groups = {"regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {
        startPage.acceptCookiesButton();
        startPage.clickOnStartNow();
        selectNationalityPage.selectNationalityFromDropDown("Colombia");
        selectNationalityPage.clickOnNextStepButton();
        reasonForTravelPage.selectReasonForTravel("Join partner or family for a long stay");
        reasonForTravelPage.clickOnContinueButton();
        familyImmigrationStatusPage.selectImmigrationStatus("Yes");
        familyImmigrationStatusPage.clickOnNextStepButton();
        resultPage.getResultMessage();
    }
}
