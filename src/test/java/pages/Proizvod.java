package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Proizvod extends BasePage{

    @FindBy(id = "ctl47_ProductDetails1_RptProductVariants_ctl01_BtnAdd2Basket")
    private WebElement atToCardButton;

    public Proizvod(ChromeDriver driver){
        super(driver);
    }
    public Cart clickatToCartButton(){
        atToCardButton.click();
        return new Cart(driver);
    }
}
