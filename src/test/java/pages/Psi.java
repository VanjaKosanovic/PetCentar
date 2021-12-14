package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Psi extends BasePage {

    private WebElement hranaMenuItem;

    public ArrayList<WebElement> getListPsiMenu() {
        return listPsiMenu;
    }

    ArrayList<WebElement> listPsiMenu;


    public Psi(ChromeDriver driver) {
        super(driver);
        this.hranaMenuItem = driver.findElementById("ctl52_Filter1_RptFilters_ctl00_RptFilter_ctl01_LnkFilter");
        this.listPsiMenu = (ArrayList<WebElement>) driver.findElementsByXPath("//div[@class='filter-nav__group']//ul//a[contains(@id, 'ctl52_Filter1_RptFilters')]");

    }

    public Hrana clickOnHranaMenuItem() {
        hranaMenuItem.click();
        return new Hrana(driver);

    }

    public void clickOntheChoosenPsiItem (ChromeDriver driver, String item) {

        ArrayList<String> titlesOfPsiManuItems = new ArrayList<>();

        for (int i = 0; i < getListPsiMenu().size(); i++) {
            String title = getListPsiMenu().get(i).getText();
            titlesOfPsiManuItems.add(title);
        }

        for (int j = 0; j < titlesOfPsiManuItems.size(); j++) {
            if (titlesOfPsiManuItems.get(j).contains(item)) {
                WebElement chosenItem = getListPsiMenu().get(j);
                chosenItem.click();
                {
                    break;
                }
            }
        }
    }


}
