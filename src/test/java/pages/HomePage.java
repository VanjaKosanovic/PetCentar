package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage{
//home

    private WebElement psiMenuItem;
    String homePageUrl = "https://www.pet-centar.rs/";

    public HomePage (ChromeDriver driver){
        super(driver);
        driver.get(homePageUrl);
        this.psiMenuItem = driver.findElementById("ctl53_FilterHomepage1_RptFilters_ctl00_LnkFilterName");
    }

   public Psi clickOnthePsiMenuItem (){
        psiMenuItem.click();
        return new Psi(driver);
   }

}
