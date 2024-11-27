package ui;

import alure.AlureListener;
import bo.LoginBO;
import com.automation.remarks.testng.UniversalVideoListener;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AlureListener.class, UniversalVideoListener.class})
public class LoginTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
                {"firstname1", "lastname1","1234567890"},
                {"firstname2", "lastname2","2312312312"},
                {"firstname3", "lastname3","9940712218"}
        };
    }
    @Test(dataProvider = "loginData")
    public void testlogin(String firstName, String lastName, String userNumber){
        new LoginBO().login()
                     .fillform(firstName, lastName, userNumber)
                     .checkLoginSuccess();
    }
}
