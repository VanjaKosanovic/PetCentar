package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.Cart;
import pages.HomePage;
import pages.LoginPage;

public abstract class BaseTest{

    public HomePage clickPetCentarLogo (ChromeDriver driver){
        BasePage page = new BasePage(driver);
        page.petCentarLogo.click();
        return new HomePage(driver);
    }

    public void clickSearchButton (ChromeDriver driver){
        BasePage page = new BasePage(driver);
        page.waitUntilClickable(page.searchButton, 2);
        page.searchInput.click();
    }

    public void search (String item, ChromeDriver driver){
        BasePage page = new BasePage(driver);
        page.searchInput.sendKeys(item);
        clickSearchButton(driver);
    }

    public Cart clickCartLogo (ChromeDriver driver){
        BasePage page = new BasePage(driver);
        page.cartLogo.click();
        return new Cart(driver);
    }

    public LoginPage clickLoginIcon (ChromeDriver driver){
        BasePage page = new BasePage(driver);
        page.logInIcon.click();
        return new LoginPage(driver);
    }
}
