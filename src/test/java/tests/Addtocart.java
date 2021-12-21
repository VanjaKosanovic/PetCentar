package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.Proizvod;
import pages.Proizvodi;

import java.util.ArrayList;

public class Addtocart {
    @Test
    public void testAddActionProductsToTheCart(){

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookies();
        homePage.clickSeeAllButton();
        String item = "CLAN Briketi za pse Mini Tunjevina i Haringa";
        ArrayList <WebElement> list = homePage.returnListOfAllActionProducts();
        homePage.clickOnCertainElement(driver, item, list);
        Proizvod product = new Proizvod(driver);
        product.enterQuantity("2");
        product.clickAddToCartButton();
        assert (driver.findElementByXPath("//main[@class='page-content page-content--other-pages']/h1").getText().equals("Moja korpa") &&
                driver.findElementByXPath("//td[@class='left basket__product-name']").getText().contains(item)):
                "The chosen item is not in a Cart.";
//
//
//       ArrayList<WebElement> sekcije = homePage.returnSections();
//        for (int i = 0; i<sekcije.size(); i++){
//            System.out.println(sekcije.get(i));
//            String text = sekcije.get(i).findElement(By.xpath("/span")).getText();
//            if (text.equals("Proizvodi na akciji")){
//                ArrayList<WebElement> proizvodi = homePage.getListOfProductsUnderSection(sekcije.get(i));
//                proizvodi.get(0).click();
//
//                break;
//            }

        }

    }

