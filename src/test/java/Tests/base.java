package Tests;

import Pages.HomePage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class base {

    BrowserFactory browserFactory= new BrowserFactory();

    final WebDriver driver = browserFactory.LaunchBrowser("chrome","https://ndosisimplifiedautomation.vercel.app/");
    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
}
