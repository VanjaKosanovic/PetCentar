package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class Hrana extends BasePage{



    private ArrayList <WebElement> listHranaItems;
//    @FindBy (xpath ="//a[@id='ctl50_Filter1_RptFilters_ctl01_LnkFilterName']/parent::div//li[@class='filter-nav__group__btn-more']")

    private WebElement robnaMarkaVidiSveButton;

    public ArrayList<WebElement> getListHranaItems() {
        return listHranaItems;
    }
        public Hrana (ChromeDriver driver){
        super(driver);
        this.listHranaItems = (ArrayList<WebElement>) driver.findElementsByXPath("//a[contains (@id, 'ctl50_Filter1_RptFilters_ctl00_RptFilter')]");
    }

    public void clickOnRobnaMarkaVidiSveButton (){
        scrollIntoView(robnaMarkaVidiSveButton);
        robnaMarkaVidiSveButton.click();
    }

    public WolfPack clickOnWolfPackRobnaMarka (){
        WebElement wolfPackRobnaMarka = driver.findElementByXPath("//a[contains(@title, 'WolfPack')]");
        scrollIntoView(wolfPackRobnaMarka);
        wolfPackRobnaMarka.click();
        return new WolfPack(driver);
    }


    }



