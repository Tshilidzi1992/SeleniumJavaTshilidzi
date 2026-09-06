package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {

    WebDriver driver;

    @FindBy(id = "deviceType")
    WebElement deviceTypeDropdown;

    @FindBy(id = "brand")
    WebElement brandDropdown;

    @FindBy(id = "storage-128GB")
    WebElement storage128GB;

    @FindBy(id ="unit- price")
    WebElement unitPrice;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectDeviceType(String deviceType){
        Select select = new Select(deviceTypeDropdown);
        select.selectByVisibleText(deviceType);
    }

    public void selectBrand(String brand){
        Select select = new Select(brandDropdown);
        select.selectByVisibleText(brand);
    }

    public void selectStorage128GB(){
        storage128GB.click();
    }
}
