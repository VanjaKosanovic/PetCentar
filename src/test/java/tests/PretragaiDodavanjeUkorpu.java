package tests;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.HomePage;
import pages.Proizvodi;

import java.util.ArrayList;

public class PretragaiDodavanjeUkorpu {
    @Test
    public void testPretragaiDodavanjeUkorpu(){
        ChromeDriver driver=new ChromeDriver();
        HomePage homePage=new HomePage(driver);
        homePage.searchInput.sendKeys("igracke");
        homePage.searchButton.click();
        Proizvodi proizvodi= new Proizvodi(driver);
//        ArrayList<String> listaProizvoda=proizvodi.getTitlesOfAllProducts();//for (int i = 0; i<listaProizvoda.size(); i++){
//         if (listaProizvoda.get(i).contains("KONG")){
//             listaProizvoda.get(i).
 //        }

            }


    }
