package tests;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.Hrana;
import pages.Psi;
import pages.WolfPack;

import java.util.ArrayList;

public class FilterDogFood {


    //test pada kod robne marke, kad sam definisala elemente sa anotacijom
    @Test
    public void testFilterDogFood (){
        ChromeDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookies();
        Psi psi = homePage.clickOnthePsiMenuItem();
        Hrana hrana = psi.clickOnHranaMenuItem();
        hrana.clickOnRobnaMarkaVidiSveButton();
        WolfPack wolfPack = hrana.clickOnWolfPackRobnaMarka();
        ArrayList <String> listaProizvoda = wolfPack.getTitlesOfAllProducts();
        for (int i = 0; i<listaProizvoda.size(); i++){
            assert listaProizvoda.get(i).contains("WOLFPACK"): "This item is not Wolfpack";
        }
        driver.quit();


    }



}
