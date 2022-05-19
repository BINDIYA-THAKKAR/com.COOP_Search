package org.Tesco_Search.Driver_factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class driverfactory {
    public static WebDriver driver;

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.tesco.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public driverfactory(){
        PageFactory.initElements(driver,this);
    }

    public void closeBrowser(){
        driver.close();
    }
}
