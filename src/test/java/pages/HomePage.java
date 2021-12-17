package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class HomePage extends BasePage{

    String homePageUrl = "https://www.pet-centar.rs/";

    String sectionXpath = "//section[@class = 'product-list--featured']";

    @FindBy (id = "ctl53_FilterHomepage1_RptFilters_ctl00_LnkFilterName")
    private WebElement psiMenuItem;
    @FindBy (id = "ctl53_HyperLink10")
    private WebElement buttonSeeAll;

    public HomePage (ChromeDriver driver){
        super(driver);
        driver.get(homePageUrl);
    }

   public Psi clickOnthePsiMenuItem (){
        psiMenuItem.click();
        return new Psi(driver);
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
