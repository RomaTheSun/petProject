package po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static driver.DriverProvider.getDriver;

public class LoginPO {

    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]")
    WebElement maleGenderButton;

    @FindBy(id = "userNumber")
    WebElement userNumberField;

    @FindBy(xpath = "//*[@id=\"userForm\"]/div[11]/div")
    WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"example-modal-sizes-title-lg\"]")
    WebElement submittingconfirmation;

    public LoginPO() {
        getDriver().get("https://demoqa.com/automation-practice-form");
        PageFactory.initElements(getDriver(),this);
    }

    public WebElement getsubmitButton() {
        return submitButton;
    }
    public WebElement getuserNumberField() {
        return userNumberField;
    }
    public WebElement getmaleGenderButton() {
        return maleGenderButton;
    }
    public WebElement getlastNameField() {
        return lastNameField;
    }
    public WebElement getfirstNameField() {
        return firstNameField;
    }
    public WebElement getsubmittingconfirmation() {
        return submittingconfirmation;
    }

}
