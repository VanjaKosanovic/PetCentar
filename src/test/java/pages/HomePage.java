package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    String homePageUrl = "https://www.pet-centar.rs/";

    @FindBy (id = "ctl53_FilterHomepage1_RptFilters_ctl00_LnkFilterName")
    private WebElement psiMenuItem;

    public HomePage (ChromeDriver driver){
        super(driver);
        driver.get(homePageUrl);
    }

   public Psi clickOnthePsiMenuItem (){
        psiMenuItem.click();
        return new Psi(driver);
   }

}
