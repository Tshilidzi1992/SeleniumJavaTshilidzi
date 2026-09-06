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

    @FindBy(id ="unit-price-value")
    WebElement unitPrice;

    @FindBy(id = "color")
    WebElement colorDropdown;

    @FindBy(id= "quantity")
    WebElement quantityInput;

    @FindBy(id= "subtotal-value")
    WebElement subtotal;

    @FindBy(id= "address")
    WebElement addressInput;

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
    public String getUnitPrice(){
        return unitPrice.getText();
    }

    public void selectColor(String color){
        Select select = new Select(colorDropdown);
        select.selectByVisibleText(color);
    }

    public void enterQuantity(String quantity){
        quantityInput.clear();
        quantityInput.sendKeys(quantity);
    }

    public String getSubtotal(){
        return subtotal.getText();
    }

    public  void  enterAddress(String address){
        addressInput.clear();
        addressInput.sendKeys(address);
    }
}
