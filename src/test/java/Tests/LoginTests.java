package Tests;

import Pages.InventoryPage;
import Pages.InvoicePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends base {

    InventoryPage  inventoryPage;
    InvoicePage invoicePage;

    @Test(priority = 1)
    public void loginTest() {
        homePage.clickLoginButton();

        loginPage.enterUsername("rolivhuwa@gmail.com");

        loginPage.enterPassword("Tn#921028");

        loginPage.clickLogin();
    }

    @Test(priority = 2)
    public void navigateToInventoryTest() {
        homePage.clickLearn();

        homePage.clickLearningMaterials();

        homePage.clickWebAutomationAdvance();

        inventoryPage = new InventoryPage(driver);
    }

    @Test(priority = 3)
    public void selectProductTest() {

        inventoryPage.selectDeviceType("Phone");

        inventoryPage.selectBrand("Apple");

        inventoryPage.selectStorage128GB();

        Assert.assertEquals
                (inventoryPage.getUnitPrice(),
                        "R480.00");

        inventoryPage.selectColor("Blue");

        inventoryPage.enterQuantity("2");

        Assert.assertEquals
                (inventoryPage.getSubtotal(),
                        "R960.00");
    }

    @Test(priority = 4)
    public void enterDeliveryAddressTest() {

        inventoryPage.enterAddress("123 Test Street");

        inventoryPage.clickNext();
    }

    @Test(priority = 5)
    public void selectOrderOptionTest() {

        inventoryPage.selectWarranty1yr();

        inventoryPage.selectExpressShipping();
    }

    @Test(priority = 6)
    public void applyDiscountTest() {

        inventoryPage.enterDiscountCode("SAVE10");

        inventoryPage.applyDiscount();

        Assert.assertEquals(
                inventoryPage.getDiscountFeedback(),
                "Code SAVE10 applied: -10%");
    }

    @Test(priority = 7)
    public  void confirmPurchaseTest() {

        inventoryPage.clickConfirmPurchase();
    }

    @Test(priority = 8)
    public void viewInvoiceTest() {

        invoicePage = new InvoicePage(driver);

        invoicePage.clickViewInvoiceHistory();

        invoicePage.verifyInvoiceHistoryDisplayed();

        invoicePage.clickViewInvoice();
    }

    }
