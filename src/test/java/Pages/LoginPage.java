package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    @FindBy(id= "login-email")
    WebElement usernameField;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }
    public  void enterUsername(String username){
        usernameField.sendKeys(username);
    }

}
