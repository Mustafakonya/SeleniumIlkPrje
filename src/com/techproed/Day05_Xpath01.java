package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("testtechproed@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Test1234!");

        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
    }
}
