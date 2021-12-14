package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.Cart;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest extends BasePage{

    @FindBy (id = "ctl53_Header1_Image1")
    private WebElement petCentarLogo;

    @FindBy (id = "ctl53_Header1_SearchBox1_BtnSearch")
    private WebElement searchButton;

    @FindBy (id = "ctl53_Header1_SearchBox1_TbSearch")
    private WebElement searchInput;

    @FindBy (id = "ctl53_Header1_BasketSmall_LblBasketEmpty")
    private WebElement cartLogo;

    @FindBy (id = "ctl53_Header1_hlLogin")
    private WebElement logInIcon;

    public BaseTest (ChromeDriver driver){
        super(driver);
    }


    public HomePage clickPetCentarLogo (){
        petCentarLogo.click();
        return new HomePage(driver);
    }

    public void clickSearchButton (){
        waitUntilClickable(searchButton, 2);
        searchInput.click();
    }

    public void search (String item) {
        searchInput.sendKeys(item);
        clickSearchButton();
    }

    public Cart clickCartLogo (){
        cartLogo.click();
        return new Cart(driver);
    }

    public LoginPage clickLoginIcon (){
        logInIcon.click();
        return new LoginPage(driver);
    }
}
