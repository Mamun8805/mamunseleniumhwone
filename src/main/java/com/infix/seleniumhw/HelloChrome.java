package com.infix.seleniumhw;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloChrome {

    public static void main(String[] args) {
        firstseleniumhomework();

    }
    public static void firstseleniumhomework() {
        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        driver.quit();







    }



}
