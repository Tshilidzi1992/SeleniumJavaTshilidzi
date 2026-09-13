package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//span[text()='Login']")
    WebElement loginButton;

    @FindBy(xpath = "//span[text()='Learn']")
    WebElement learnButton;

    @FindBy(xpath = "//span[text()='Learning Materials']")
    WebElement learningMaterials;

    @FindBy(id = "tab-btn-web")
    WebElement webAutomationAdvanceTab;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public  void clickLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void clickLearn(){
        wait.until(ExpectedConditions.elementToBeClickable(learnButton)).click();

    }

    public void clickLearningMaterials() {
        wait.until(ExpectedConditions.elementToBeClickable(learningMaterials)).click();

    }
    public void clickWebAutomationAdvance() {
        webAutomationAdvanceTab.click();
    }
}
