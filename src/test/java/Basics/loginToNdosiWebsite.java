package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginToNdosiWebsite {

    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
    }


    @Test
    public void clickLoginButton() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[1]")).click();

    }

    @Test (priority = 1)
    public void enterUserName() throws InterruptedException {

        driver.findElement(By.id("login-email")).sendKeys("rolivhuwa@gmail.com");
    }

    @Test (priority = 2)
    public void enterPassword() throws InterruptedException {

        driver.findElement(By.id("login-password")).sendKeys("Tn#921028");
    }

    @Test (priority = 3)
    public void clickLoginSubmitButton() throws InterruptedException {

        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 4)
    public void verifyLoginSuccess() {

        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[3]/button/span[2]")).isDisplayed();
    }
    @AfterTest
    public void quit() {
        driver.quit();
}


}


