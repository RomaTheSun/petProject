package po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static driver.DriverProvider.getDriver;

public class TablePO {
    @FindBy(id = "addNewRecordButton")
    WebElement addNewRecordButton;

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "age")
    WebElement age;

    @FindBy(id = "salary")
    WebElement salary;

    @FindBy(xpath = "//*[@id=\"department\"]")
    WebElement Department;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    WebElement submit;

    @FindBy(xpath = "//div[text()='Roman']")
    WebElement user;

    public TablePO() {
        getDriver().get("https://demoqa.com/webtables");
        PageFactory.initElements(getDriver(),this);
    }

    public WebElement getaddNewRecordButton() {
        return addNewRecordButton;
    }
    public WebElement getfirstName() {
        return firstName;
    }
    public WebElement getuserEmail() {
        return userEmail;
    }
    public WebElement getage() {
        return age;
    }
    public WebElement getsalary() {
        return salary;
    }
    public WebElement getDepartment() {
        return Department;
    }
    public WebElement getuser() {
        return user;
    }
    public WebElement getlastName() {
        return lastName;
    }
    public WebElement getsubmit() {
        return submit;
    }
}
