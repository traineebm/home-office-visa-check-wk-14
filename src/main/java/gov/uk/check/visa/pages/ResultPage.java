package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ResultPage extends Utility {

    public ResultPage() {
        PageFactory.initElements(driver,this);
    }

   // @FindBy(xpath = "//*[@id='result-info']/div[2]/h2")
    @FindBy(xpath = "//*[@id='result-info']/div[2]/h2")
    WebElement getMessage;

    public String getResultMessage() {
        String message = getTextFromElement(getMessage);
        //Reporter.log("Checking if message is displayed : " + getMessage.getText() + "<br>");
        return message;
    }

    public void verifyConfirmResultMessage(String expMsg) {
        if (getResultMessage().equalsIgnoreCase(expMsg)) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }


    /**

    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage1;

    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement resultMessage2;

    @FindBy (xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement resultMessage3;

    public String getResultMessageA(){
        Reporter.log("Checking if message is displayed : " + resultMessage1.getText() + "<br>");
        return getTextFromElement(resultMessage1);
    }

    public String getResultMessageB(){
        Reporter.log("Checking if message is displayed : " + resultMessage2.getText() + "<br>");
        return getTextFromElement(resultMessage2);
    }

    public String getResultMessageC(){
        Reporter.log("Confirm message displayed: " + resultMessage3.getText() + "<br>");
        return getTextFromElement(resultMessage3);
    }
    */
}
