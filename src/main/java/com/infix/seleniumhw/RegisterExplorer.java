package com.infix.seleniumhw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RegisterExplorer {

    public static void main (String []args){
        registerinternetexplorer();
    }

    public static void registerinternetexplorer(){

        System.setProperty("webdriver.ie.driver","C:\\drivers\\iedriverserver.exe");
        WebDriver register = new InternetExplorerDriver();
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
