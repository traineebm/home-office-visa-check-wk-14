package gov.uk.check.visa.pages;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class FamilyImmigrationStatusPage extends Utility {

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> immigrationStatus;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    public void selectImmigrationStatus(String status){
        for (WebElement menu : immigrationStatus) {
            if (menu.getText().equals(status)) {
                clickOnElement(menu);
                Reporter.log("Click on '" + status + "' tab <br>");
                break;
            }
        }
    }

    public void clickOnNextStepButton() {
        Reporter.log("Click on next step" + "<br>");
        clickOnElement(continueButton);
    }
}
