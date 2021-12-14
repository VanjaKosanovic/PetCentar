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


}
