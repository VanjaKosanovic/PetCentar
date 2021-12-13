package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrana extends BasePage{
//hrana

    WebElement robnaMarkaVidiSveButton;


    public Hrana (ChromeDriver driver){
        super(driver);
        this.robnaMarkaVidiSveButton = driver.findElementByXPath("//a[@id='ctl50_Filter1_RptFilters_ctl01_LnkFilterName']/parent::div//li[@class='filter-nav__group__btn-more']");
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
