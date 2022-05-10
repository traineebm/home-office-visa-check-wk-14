package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StartPage extends Utility {
    public StartPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement startNowButton;

    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCookies;

    public void clickOnStartNow() {
        Reporter.log("Click on start button : "+ startNowButton.toString()+"<br>");
        clickOnElement(startNowButton);
    }
    public void acceptCookiesButton(){
        Reporter.log("Clicking on accepted cookies : "+ acceptCookies.toString()+"<br>");
        clickOnElement(acceptCookies);
    }
}
