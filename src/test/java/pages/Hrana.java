package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Hrana extends BasePage{

    WebElement robnaMarkaVidiSveButton;
    ArrayList <WebElement> listHranaItems;

    public Hrana (ChromeDriver driver){
        super(driver);
        this.robnaMarkaVidiSveButton = driver.findElementByXPath("//a[@id='ctl50_Filter1_RptFilters_ctl01_LnkFilterName']/parent::div//li[@class='filter-nav__group__btn-more']");
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


    public void clickOnTheChosenHranaZaPseItem (ChromeDriver driver, String item){
        driver.findElementByXPath("//a[@id='ctl50_Filter1_RptFilters_ctl00_LnkFilterName']/parent::div//li[@class='filter-nav__group__btn-more']").click();
        ArrayList<String> titlesOfHranaItems = new ArrayList<>();

        for (int i = 0; i < listHranaItems.size(); i++) {
            String title = listHranaItems.get(i).getText();
            titlesOfHranaItems.add(title);
        }

        for (int j = 0; j < titlesOfHranaItems.size(); j++) {
            if (titlesOfHranaItems.get(j).contains(item)) {
                WebElement chosenItem = listHranaItems.get(j);
                chosenItem.click();
                {
                    break;
                }
            }
        }
    }

}

