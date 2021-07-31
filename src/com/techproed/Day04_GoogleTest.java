package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com/");

        WebElement onay = driver.findElement(By.partialLinkText("agree"));
        onay.click();

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("city bike");

        WebElement ara = driver.findElement(By.className("gNO89b"));
        ara.submit();

        WebElement sonuc = driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());

        WebElement shopping = driver.findElement(By.partialLinkText("Shopping"));
        shopping.click();

        WebElement image = driver.findElement(By.tagName("img"));
        image.click();

    }

}
