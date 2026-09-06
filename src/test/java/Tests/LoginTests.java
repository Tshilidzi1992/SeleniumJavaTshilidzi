package Tests;

import Pages.InventoryPage;
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
    }
}