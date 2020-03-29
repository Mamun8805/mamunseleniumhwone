package com.infix.seleniumhw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterFirefox {

    public static void main(String[] args){
    registerfirefox();
    }
    public static void registerfirefox(){

        System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
        WebDriver register = new FirefoxDriver();
        register.navigate().to("https://demo.broadleafcommerce.org/login");
        System.out.println(register.navigate());
        register.findElement(By.xpath("//*[@id=\"customer.emailAddress\"]")).sendKeys("Mamun8805@gmail.com");
        register.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Mamun");
        register.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("Miah");
        register.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Infix123!");
        register.findElement(By.xpath("//*[@id=\"passwordConfirm\"]")).sendKeys("Infix123!");
        register.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/form/button")).click();
        System.out.println("Click to register");
        register.quit();
    }

}
