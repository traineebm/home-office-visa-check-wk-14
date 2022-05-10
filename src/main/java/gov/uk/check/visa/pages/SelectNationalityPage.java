package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='response']")
    WebElement findNationality;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton1;


    public void selectNationalityFromDropDown(String nationality){
        selectByVisibleTextFromDropDown(findNationality, nationality);
    }
    public void clickOnNextStepButton(){
        Reporter.log("Click on continue : "+ continueButton1.toString()+"<br>");
        clickOnElement(continueButton1);
    }
}
