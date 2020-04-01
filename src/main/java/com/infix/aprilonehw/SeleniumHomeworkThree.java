package com.infix.aprilonehw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumHomeworkThree {

    public static void main(String []args){
    orderingonhealthclinic();
    }
    public static void orderingonhealthclinic(){

        System.setProperty ("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.broadleafcommerce.org/login");
        System.out.println(driver.navigate());
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Mamun882005@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Infix123!");
        driver.findElement(By.xpath("//*[@id=\"left-nav\"]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"products\"]/div[5]/div/div[2]/h4/a")).click();
        driver.findElement(By.xpath("//*[@id=\"product-main-button-panel\"]/div[1]/button")).click();
        driver.findElement(By.xpath("<i class=\"material-icons\">shopping_cart</i>")).click();
        driver.findElement(By.xpath("//*[@id=\"product-main-button-panel\"]/div[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cart\"]/div[3]/div[1]/div[2]/div[5]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"fullName\"]")).sendKeys("Joe Smith");
        driver.findElement(By.xpath("//*[@id=\"addressLine1\"]")).sendKeys("1234 Michigan Ave Apt 1b");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Troy");
        Select sel = new Select (driver.findElement(By.id("//*[@id=\"stateProvinceRegion\"]")));



        driver.findElement(By.xpath("//*[@id=\"postalCode\"]")).sendKeys("48085");
        driver.findElement(By.xpath("//*[@id=\"phonePrimary\"]")).sendKeys("248-123-4567");
        driver.findElement(By.xpath("//*[@id=\"shippingInfo\"]/div/div[2]/div[2]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[1]/div[2]/div[2]/a/span")).click();
        driver.findElement(By.xpath("<span class=\"check\"></span>")).click();
        driver.findElement(By.xpath("//*[@id=\"cardNumber\"]")).sendKeys("4444444441112333");
        driver.findElement(By.xpath("//*[@id=\"securityCode\"]")).sendKeys("234");
        driver.findElement(By.xpath("//*[@id=\"cardExpDate\"]")).sendKeys("01/24");
        driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[2]/div[2]/div[3]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[3]/div[2]/div[2]/a/span")).click();
        driver.close();






















    }
}
