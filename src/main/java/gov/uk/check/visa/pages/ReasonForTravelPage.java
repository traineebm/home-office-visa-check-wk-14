package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> reasonForTravel;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton2;


    public void selectReasonForTravel(String reason){
        for (WebElement element : reasonForTravel) {
            if (element.getText().equals(reason)) {
                clickOnElement(element);
                Reporter.log("Select reason for travel : " + reason + "<br>");
                break;
            }
        }
    }

    public void clickOnContinueButton() {
        Reporter.log("Click on next step" + "<br>");
        clickOnElement(continueButton2);
    }













    /**
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> reasonForTravel;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton2;

    public void selectReasonForTravel(String reason){
        Reporter.log("Select reason for travel : " + reason + "<br>");
        for (WebElement element : reasonForTravel) {
            if (element.getText().equalsIgnoreCase(reason)) {
                clickOnElement(element);
                break;
            }
        }
    }
    public void clickOnContinueButton(){
        Reporter.log("Click on continue button : " + continueButton2.toString() + "<br>");
        clickOnElement(continueButton2);
    }
    */
}
