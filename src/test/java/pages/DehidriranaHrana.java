package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class DehidriranaHrana extends BasePage {



    ArrayList <WebElement> productsDehHranaPage1;

    public DehidriranaHrana (ChromeDriver driver){
        super(driver);
        productsDehHranaPage1 = (ArrayList<WebElement>) driver.findElementsByXPath("//article[contains(@id, 'ctl49_ProductList21_ProductList2Products1_RptProducts')]");
    }

    public ArrayList<WebElement> getProductsDehHranaPage1() {
        return productsDehHranaPage1;
    }


        }
