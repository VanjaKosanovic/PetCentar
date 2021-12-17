package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.ArrayList;

public class Addtocart {
    @Test
    public void testAddToCart(){

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookies();
        ArrayList<WebElement> sekcije = homePage.returnSections();
        for (int i = 0; i<sekcije.size(); i++){
            System.out.println(sekcije.get(i));
            String text = sekcije.get(i).findElement(By.xpath("/span")).getText();
            if (text.equals("Proizvodi na akciji")){
                ArrayList<WebElement> proizvodi = homePage.getListOfProductsUnderSection(sekcije.get(i));
                proizvodi.get(0).click();

                break;
            }

        }

    }
}
