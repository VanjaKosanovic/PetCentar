package tests;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.ArrayList;

public class PretragaiDodavanjeUkorpu extends  BaseTest{
    @Test
    public void testPretragaiDodavanjeUkorpu(){
        ChromeDriver driver=new ChromeDriver();
        HomePage homePage=new HomePage(driver);
        homePage.acceptCookies();
        Proizvodi proizvodi= search("igracke",driver);


        ArrayList<WebElement> listaProizvoda=proizvodi.getlistofProducts();
        for (int i = 0; i<listaProizvoda.size(); i++){
            if (proizvodi.getTitleofProduct(listaProizvoda.get(i)).contains("KONG")){
                listaProizvoda.get(i).click();
                break;
            }
            Proizvod proizvod = new Proizvod(driver);

            Cart cart=proizvod.clickatToCartButton();


         }

            }


    }
