package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Psi extends BasePage {
//psi

    private WebElement hranaMenuItem;

    public Psi (ChromeDriver driver){
        super(driver);
        this.hranaMenuItem = driver.findElementById("ctl52_Filter1_RptFilters_ctl00_RptFilter_ctl01_LnkFilter");

    }

    public Hrana clickOnHranaMenuItem (){
        hranaMenuItem.click();
        return new Hrana (driver);

    }

}
