package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.Cart;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest extends BasePage{

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
