package Tests;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends base {


    @Test
    public void clickLoginButton() throws InterruptedException {
        homePage.clickLoginButton();
    }

    @Test
    public void enterUsernameTests() {
        loginPage.enterUsername("rolivhuwa@gmail.com");
    }
}