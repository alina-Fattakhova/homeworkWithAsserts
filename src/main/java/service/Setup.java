package service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Setup {
    public static WebDriver setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.get("https://learn.andersenlab.com/");
        return driver;
    }
}
