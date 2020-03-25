package com.infix.seleniumhw;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloMozilla {

public static void main(String [] args){
    firstseleniumhomework();
}

    public static void firstseleniumhomework(){
        System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.twitter.com/");
        String pagetitle= driver.getTitle();
        System.out.println(pagetitle);
        driver.quit();
}
}
