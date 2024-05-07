package com.myideasoft.utilities;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    private Driver(){}

    private static WebDriver driver;

    public static WebDriver get(){
        if (driver == null){
            String browser = ConfigurationReader.get("browser");

            switch (browser.toLowerCase()){
                case "chrome" :
                    driver = new ChromeDriver();
                    break;
                case "safari":
                    if (!System.getProperty("os.name").toLowerCase().contains("mac")){
                        throw new WebDriverException("Your OS does NOT support Safari...");
                    }
                    driver = new SafariDriver();
                    break;
                case "chrome-headless" :
                    driver = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
                    break;
            }

        }

        return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
