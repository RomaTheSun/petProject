package bo;

import driver.DriverProvider;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import po.TablePO;

public class TableBO {
    TablePO table = new TablePO();

    public TableBO topage() {
        return this;
    }

    public TableBO openform(){
        Assert.assertTrue(table.getaddNewRecordButton().isDisplayed());
        JavascriptExecutor js = (JavascriptExecutor) DriverProvider.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", table.getaddNewRecordButton());
        table.getaddNewRecordButton().click();
        return this;
    }

    public TableBO fillform(String firstName, String userEmail,Integer age,Integer salary,String department,String lassName) {
        Assert.assertTrue(table.getage().isDisplayed());
        Assert.assertTrue(table.getDepartment().isDisplayed());
        Assert.assertTrue(table.getfirstName().isDisplayed());
        Assert.assertTrue(table.getlastName().isDisplayed());
        Assert.assertTrue(table.getsalary().isDisplayed());
        Assert.assertTrue(table.getuserEmail().isDisplayed());
        table.getfirstName().sendKeys(firstName);
        table.getlastName().sendKeys(lassName);
        table.getuserEmail().sendKeys(userEmail);
        table.getage().sendKeys(age.toString());
        table.getsalary().sendKeys(salary.toString());
        table.getDepartment().sendKeys(department);
        return this;
    }

    public TableBO pressSubmitButton() {
        Assert.assertTrue(table.getsubmit().isDisplayed());
        table.getsubmit().click();
        return this;
    }

    public TableBO checkUserExist() {
        Assert.assertTrue(table.getuser().isDisplayed());
        return this;
    }
}
