package Tests;

import org.testng.annotations.Test;

public class LoginTests extends base {


    @Test
    public  void loginToNdosiWebsite(){
       homePage.clickLoginButton();
    }
}
