package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class DurationOfStayPage extends Utility {

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='radio']")
    List<WebElement> selectStay;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;


    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "6 months or less":
                selectStay.get(0).click();
                break;
            case "longer than 6 months":
                selectStay.get(1).click();
                break;
        }
    }

    public void clickNextStepButton() {
        Reporter.log("Click on next step" + "<br>");
        clickOnElement(continueButton);
    }
}
