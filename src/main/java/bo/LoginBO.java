package bo;

import driver.DriverProvider;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import po.LoginPO;

import java.time.Duration;

public class LoginBO  {
    LoginPO login = new LoginPO();

    public LoginBO login() {
       return this;
    }

    public LoginBO fillform(String firstName, String lastName,String userNumber) {
       login.getfirstNameField().sendKeys(firstName);
       login.getlastNameField().sendKeys(lastName);
       login.getuserNumberField().sendKeys(userNumber);
       login.getmaleGenderButton().click();
        JavascriptExecutor js = (JavascriptExecutor) DriverProvider.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", login.getsubmitButton());
       login.getsubmitButton().click();
       return this;
    }
    public LoginBO checkLoginSuccess() {
        Assert.assertTrue(login.getsubmittingconfirmation().isDisplayed(),"unsuccessful login");
        return this;
    }
}
