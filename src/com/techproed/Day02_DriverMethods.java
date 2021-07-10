package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");
        String pageTitle = driver.getTitle();
        String pageUrl = driver.getCurrentUrl();

        System.out.println(pageTitle);
        System.out.println(pageUrl);

        driver.quit();


    }


}
