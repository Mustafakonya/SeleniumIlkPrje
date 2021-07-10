package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/admin/Documents/selenium libraries/drivers/chromedriver");

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");
        webDriver.navigate().to("http://amazon.com");

        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
    }



}
