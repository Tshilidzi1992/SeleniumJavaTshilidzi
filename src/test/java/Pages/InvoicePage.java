package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InvoicePage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "view-history-btn")
    WebElement viewInvoiceHistoryButton;

    @FindBy(id = "invoice-history-panel")
    WebElement invoiceHistoryPanel;

    @FindBy(xpath = "//button[starts-with(@id,'view-invoice-')]")
    WebElement viewInvoiceButton;

    public InvoicePage(WebDriver driver) {
        this.driver = driver; wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this); }

    public void clickViewInvoiceHistory(){
        wait.until(ExpectedConditions.elementToBeClickable(viewInvoiceHistoryButton));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();",
                viewInvoiceHistoryButton);
    }

    public void verifyInvoiceHistoryDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(invoiceHistoryPanel));
    }

    public void clickViewInvoice() {
        wait.until(ExpectedConditions.elementToBeClickable(viewInvoiceButton));
        viewInvoiceButton.click();
    }


}
