package ui;

import bo.TableBO;
import org.testng.annotations.Test;

public class AddUserToTable {
    @Test
    public void testAddUserToTable() {
        new TableBO().topage()
                .openform()
                .fillform("Roman","qwdwqdq@wde.wqd",21,12312,"asdwed","dom")
                .pressSubmitButton()
                .checkUserExist();
    }
}
