package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        String pageTitle = driver.getTitle();

        if (pageTitle.toLowerCase().contains("car")){
            System.out.println("Car kelimesi geciyor");
        }else {
            System.out.println("Car kelimesi gecmiyor");
        }




    }
}
