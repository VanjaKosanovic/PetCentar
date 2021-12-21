package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Proizvod extends BasePage{

//    @FindBy(id = "ctl47_ProductDetails1_RptProductVariants_ctl01_BtnAdd2Basket")
//    private WebElement addToCardButton;

    //promenila sam lokator za element AddToCartButton,
    // sada sadrži samo deo ID-a,
    // da bi driver mogao da ga pronađe i u drugim slučajevima (za druge proizvode)
    @FindBy(xpath = "//a[contains (@id, 'BtnAdd2Basket')]")
    private WebElement addToCardButton;

    @FindBy(xpath = "//input[contains (@class, 'product-quantity__input')]")
    private WebElement inputQuantity;
    @FindBy(xpath = "//a[contains (@class, 'product-quantity__plus)']")
    private WebElement plusQuantity;
    @FindBy(xpath = "//a[contains (@class, 'product-quantity__minus)']")
    private WebElement minusQuantity;

    public Proizvod(ChromeDriver driver){
        super(driver);
    }

    public Cart clickAddToCartButton(){
        addToCardButton.click();
        return new Cart(driver);
    }
    public void enterQuantity(String quantity){
        inputQuantity.clear();
        inputQuantity.sendKeys(quantity);

    }
    public void quantityPlus(){
        plusQuantity.click();

    }
    public void quantityMinus(){
        minusQuantity.click();
    }
}
