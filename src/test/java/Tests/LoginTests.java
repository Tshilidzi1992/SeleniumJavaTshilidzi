package Tests;

import Pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends base {


    @Test
    public void clickLoginButton() throws InterruptedException {

        homePage.clickLoginButton();

        loginPage.enterUsername("rolivhuwa@gmail.com");

        loginPage.enterPassword("Tn#921028");

        loginPage.clickLogin();

        homePage.clickLearn();

        homePage.clickLearningMaterials();

        homePage.clickWebAutomationAdvance();

        InventoryPage inventoryPage = new InventoryPage(driver);

        inventoryPage.selectDeviceType("Phone");

        inventoryPage.selectBrand("Apple");

        inventoryPage.selectStorage128GB();

        Assert.assertEquals(inventoryPage.getUnitPrice(), "R480.00");

        inventoryPage.selectColor("Blue");

        inventoryPage.enterQuantity("2");

        Assert.assertEquals(inventoryPage.getSubtotal(), "R960.00");

        inventoryPage.enterAddress("123 Test Street");

        inventoryPage.clickNext();

        inventoryPage.selectWarranty1yr();

        inventoryPage.selectExpressShipping();

        inventoryPage.enterDiscountCode("SAVE10");

        inventoryPage.applyDiscount();

        Assert.assertEquals(
                inventoryPage.getDiscountFeedback(),
                "Code SAVE10 applied: -10%");

    }
}