package com.infix.seleniumhw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HelloExplorer {

    public static void main(String [] args){
        firstseleniumhomework();
    }

    public static void firstseleniumhomework(){
        System.setProperty("webdriver.ie.driver","C:\\drivers\\iedriverserver.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.navigate().to("https://www.google.com/");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        driver.quit();
    }

}

