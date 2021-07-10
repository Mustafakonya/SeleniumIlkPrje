package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.get("http://youtube.com");
        String pageTitle2 = driver.getTitle();
        String pageUrl = driver.getCurrentUrl();
        System.out.println(pageTitle2);
        System.out.println(pageUrl);
        driver.navigate().back();
        String pageUrl2 = driver.getCurrentUrl();
        System.out.println(pageUrl2);
        driver.quit();


    }



}
