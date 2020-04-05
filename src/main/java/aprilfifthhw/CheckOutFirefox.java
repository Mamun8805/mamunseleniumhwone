package aprilfifthhw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutFirefox {

    public static void main(String [] args){

        checkoutfirefox();
    }

    public static void checkoutfirefox(){
        System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.twitter.com/");
        String pagetitle= driver.getTitle();
        System.out.println(pagetitle);

        WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        emailBox.clear();
        System.out.println("Clear email box");
        emailBox.sendKeys("Mamun882005@gmail.com");
        System.out.println("Email is entered");
        Thread.sleep(500);

        WebElement passwordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordBox.clear();
        System.out.println("Clear password box");
        passwordBox.sendKeys("Infix123!");
        System.out.println("Password is Entered");
        Thread.sleep(500);

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"left-nav\"]/ul/li[2]/a/span"));
        loginButton.click();
        System.out.println("Click login button");
        Thread.sleep( 500);

        WebElement clickHotSauces = driver.findElement(By.xpath("//*[@id=\"left-nav\"]/ul/li[2]/a/span"));
        clickHotSauces.click();
        System.out.println("Click on hot sauces");
        Thread.sleep(500);

        WebElement clickHoppin =driver.findElement(By.xpath("//*[@id=\"products\"]/div[5]/div/div[2]/h4/a"));
        clickHoppin.click();
        System.out.println("Click on hoppin sauce");
        Thread.sleep(500);

        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"product-main-button-panel\"]/div[1]/button"));
        addToCart.click();
        System.out.println("Click to add cart");
        Thread.sleep(500);

        WebElement viewCart = driver.findElement(By.xpath("//*[@id=\"product-main-button-panel\"]/div[3]/a"));
        viewCart.click();
        System.out.println("Click to view your cart");
        Thread.sleep(500);

        Select selectQuantity = new Select (driver.findElement(By.name("quantity")));
        selectQuantity.selectByIndex(9);
        System.out.println("Select 10");
        Thread.sleep(500);

        WebElement clickCheckOut = driver.findElement(By.xpath("//*[@id=\"cart\"]/div[3]/div[1]/div[2]/div[5]/div[1]/a"));
        clickCheckOut.click();
        System.out.println("Click check out");
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"fullName\"]")).sendKeys("Joe Smith");
        System.out.println("Full name clear");
        System.out.println("Full name is entered");
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"addressLine1\"]")).sendKeys("1234 Michigan Ave Apt 1b");
        System.out.println("Address is clear");
        System.out.println("Address is entered");
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Troy");
        System.out.println("City is clear");
        System.out.println("City is entered");
        Thread.sleep(500);

        Select selectState = new Select ((driver.findElement(By.id("//*[@id=\"stateProvinceRegion\"]"))));
        selectState.selectByVisibleText("MI");
        System.out.println("Select MI");
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"postalCode\"]")).sendKeys("48085");
        System.out.println("zip code is clear");
        System.out.println ("Zip code is entered");
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"phonePrimary\"]")).sendKeys("248-123-4567");
        System.out.println("Phone number is clear");
        System.out.println("Phone number is entered");
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"shippingInfo\"]/div/div[2]/div[2]/label")).click();
        System.out.println("Select Shipping");
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[1]/div[2]/div[2]/a/span")).click();
        System.out.println("Click check out");
        Thread.sleep(500);

        driver.findElement(By.xpath("<span class=\"check\"></span>")).click();
        System.out.println("Check same Address");
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"cardNumber\"]")).sendKeys("4444444441112333");
        System.out.println("Card number is blank");
        System.out.println("Card number is entered");
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"securityCode\"]")).sendKeys("234");
        System.out.println("Security code is clear");
        System.out.println("Security code is entered");
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"cardExpDate\"]")).sendKeys("01/24");
        System.out.println("Expire date is clear");
        System.out.println("Expire date is entered");
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[2]/div[2]/div[3]/div[2]/a")).click();
        System.out.println("Check out");
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[3]/div[2]/div[2]/a/span")).click();
        System.out.println("Confirmation number");
        Thread.sleep(500);

        driver.close();


    }
}

}
