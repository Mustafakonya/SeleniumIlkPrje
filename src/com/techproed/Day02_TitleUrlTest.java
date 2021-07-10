package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://youtube.com");
        String pageTitle = driver.getTitle();
        if (pageTitle.toLowerCase().contains("video")){
            System.out.println("Var : " + pageTitle);
        }else {
            System.out.println("Yok");
        }

        driver.quit();

    }
}
