package org.Tesco_Search.Pages;

import org.Tesco_Search.Driver_factory.driverfactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class pages extends driverfactory {
    @FindBy(className = "beans-cookies-notification__form")
    WebElement cookies;

    @FindBy(xpath = "//div[@class=\"search-logo-container\"]/div[2]/form/div/input")
    WebElement SearchBar;

    @FindBy(xpath = "//div[@class=\"search-logo-container\"]/div[2]/form/button[2]/span")
    WebElement Searchbutton;

    @FindBy(css = "h1[class=\'heading query\']")
    WebElement Titletext;

    public void setCookies() throws Exception{
        cookies.click();
        Thread.sleep(3000);
    }
    public void setSearchBar(String Productname) throws Exception {
        SearchBar.sendKeys(Productname);
        Thread.sleep(3000);

    }
    public void setSearchbutton() throws Exception{
        SearchBar.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    public String URL(){
        return driver.getCurrentUrl();
    }
    public String Title(){
        return Titletext.getText();
    }

}
