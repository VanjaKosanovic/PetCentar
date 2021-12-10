package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.Cart;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest extends BasePage{

    private WebElement petCentarLogo;
    private WebElement searchButton;
    private WebElement searchInput;
    private WebElement cartLogo;
    private WebElement logInIcon;

    public BaseTest (ChromeDriver driver){
        super(driver);
        this.petCentarLogo = driver.findElement(By.id("ctl53_Header1_Image1"));
        this.searchButton = driver.findElement(By.id("ctl53_Header1_SearchBox1_BtnSearch"));
        this.searchInput = driver.findElement(By.id("ctl53_Header1_SearchBox1_TbSearch"));
        this.cartLogo = driver.findElement(By.id("ctl53_Header1_BasketSmall_LblBasketEmpty"));
        this.logInIcon = driver.findElement(By.id("ctl53_Header1_hlLogin"));
    }

    public HomePage clickPetCentarLogo (){
        petCentarLogo.click();
        return new HomePage(driver);
    }

    public void clickSearchButton (){
        waitUntilClickable(searchButton, 2);
        searchInput.click();
    }

    public void search (String item){
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
