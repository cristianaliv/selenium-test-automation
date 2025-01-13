package org.automation.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
    //Open the browser

    WebDriver driver;

    public void openBrowser(){
       driver =  new ChromeDriver(); // imi porneste browserul
    }


    //returneaza driverul si folosind acesst obiect puitem interactiona cu browserul pe ce adresa sa se duca,
    public WebDriver getDriver(){
        return driver;
    }

}
