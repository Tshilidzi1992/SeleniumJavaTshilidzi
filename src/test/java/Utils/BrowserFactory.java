package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {

   static WebDriver driver;

    public static  WebDriver LaunchBrowser(String browserChoice, String url){
        if ( browserChoice.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver=new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

}
