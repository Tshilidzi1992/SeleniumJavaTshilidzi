package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {

    WebDriver driver;

    @FindBy(xpath = "//span[text()='Login']")
    WebElement loginButton;

    public homePage(WebDriver driver) {
        this.driver = driver;
    }
    public  void clickLoginButton(){
        loginButton.click();
    }

}
