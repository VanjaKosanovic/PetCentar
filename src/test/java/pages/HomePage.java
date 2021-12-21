package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class HomePage extends BasePage{

    String homePageUrl = "https://www.pet-centar.rs/";

    String sectionXpath = "//section[@class = 'product-list--featured']";

    @FindBy (id = "ctl53_FilterHomepage1_RptFilters_ctl00_LnkFilterName")
    private WebElement psiMenuItem;
    @FindBy (xpath = "//a[@id='ctl53_HyperLink10']")
    private WebElement buttonSeeAll;

    public HomePage (ChromeDriver driver){
        super(driver);
        driver.get(homePageUrl);
    }

   public Psi clickOnthePsiMenuItem (){
        psiMenuItem.click();
        return new Psi(driver);
   }

   public void scrollToSeeAll (){
        scrollIntoView(buttonSeeAll);
   }

   public void clickSeeAllButton (){
        buttonSeeAll.click();
   }

    public ArrayList <WebElement> returnListOfAllActionProducts (){
        ArrayList <WebElement> listOfAllActionProducts = (ArrayList<WebElement>) driver.findElementsByXPath("//section[@class='product-list']//article[contains (@id, 'ctl48_ProductList2Actions1_RptCategories')]");
        return listOfAllActionProducts;
    }

// metoda pomoću koje se klikće na konkretan proizvod ili item iz menija ili liste
//1. parametar je driver (samo se prosledjuje)
// 2. parametar je naziv proizvoda (tipa String), definise se u testu
// 3. parametar je lista u kojoj je proizvod
//metoda pronalazi porizvod, klikće na njega i vraća driver
    public ChromeDriver clickOnCertainElement(ChromeDriver driver, String item, ArrayList<WebElement> listOfElements) {

//definiše se lista stringova u kojoj će biti prikupljnei svi nazivi proizvoda
        ArrayList<String> titlesOfElements = new ArrayList<>();


//u for petlji se prolazi kroz celu listu elemenata (ona je definisana u drugoj metodi, samo se ubacuje kao parametar)
//uzma se tekst iy svakog elementa liste i dodaje na listu Stringova

        for (int i = 0; i < listOfElements.size(); i++) {
            String title = listOfElements.get(i).getText();
            titlesOfElements.add(title);
        }

//druga for petlja traži u listi stringova konrekatn naziv proizvoda koji je zadat kao parametar u metodi
//kada ga pronađe, vraća se na element sa istim indeksom i klikće na njega
//sa break se završava dalji prolazak kroz for petlje, jer je elemnt pronađen i kliknut
        for (int j = 0; j < titlesOfElements.size(); j++) {
            if (titlesOfElements.get(j).contains(item)) {
                WebElement chosenItem = listOfElements.get(j);
                chosenItem.click();
                {
                    break;
                }
            }
        }
        return driver;
    }


//ova metoda ne radi, jer ne uspeva da klikne na strelicu u delu gde su Proizvodi na akciji
   public void clickNextButton () {
       WebElement buttonNext = driver.findElementByXPath("//section[@class='main-carousel owl-carousel owl-loaded owl-drag']//button[@class='owl-next']");
       scrollIntoView(buttonNext);
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("arguments[0].click()", buttonNext);

  }


   public String getTitleOfSection(){
        WebElement section = driver.findElement(By.xpath(sectionXpath));
        return section.getText();
   }

   public ArrayList<WebElement> returnSections(){
        scrollIntoView(buttonSeeAll);
        ArrayList<WebElement> sekcije = new ArrayList<>(driver.findElements(By.xpath(sectionXpath)));
        return sekcije;


   }
   public ArrayList<WebElement> getListOfProductsUnderSection(WebElement sekcija){
        ArrayList<WebElement> proizvodi = new ArrayList<>(sekcija.findElements(By.xpath("//article[contains (@class, 'product-item')]")));
        return proizvodi;

   }

}
