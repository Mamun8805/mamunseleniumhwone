package aprilfifteenhw;

public class HomePage extends BasePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//*[@href ='/hot-sauces/green_ghost'])")
    WebElement clickGreenGhost;
    @FindBy(xpath = "(//*[@class = 'btn btn-primary js-addToCart'])")
    WebElement addToCart;
    @FindBy(xpath = "(//*[@href = '/cart'])[1]")
    WebElement viewCart;
    @FindBy(xpath = "(//*[@name= 'quantity'])")
    Select selectQty;
    @FindBy(xpath = "(//*[@href= '/checkout'])")
    WebElement clickCheckout;

    public void homepage(String expectedString) throws InterruptedException {
        clickTheElement(clickGreenGhost);
        clickTheElement(addToCart);
        clickTheElement(viewCart);
        select(selectQty);
        clickTheElement(clickCheckout);
        System.out.println(" Click checkout");
    }











}