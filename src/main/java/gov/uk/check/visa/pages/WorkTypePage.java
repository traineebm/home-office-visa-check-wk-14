package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class WorkTypePage extends Utility {

    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> jobType;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    public void selectJobType(String job) {
        for (WebElement menu : jobType) {
            if (menu.getText().equals(job)) {
                clickOnElement(menu);
                Reporter.log("Click on '" + job + "' tab <br>");
                break;
            }
        }
    }

    public void clickOnNextStepButton() {
        Reporter.log("Click on next step" + "<br>");
        clickOnElement(continueButton);
    }
}
