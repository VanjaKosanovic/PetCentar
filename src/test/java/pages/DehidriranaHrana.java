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

    public void clickOnProductDehHranaPage1 (ChromeDriver driver, String item)  {
        scrollIntoView(driver.findElementByXPath("//a[@id='ctl49_ProductList21_ProductList2Products1_LnkNext2']"));
//        WebElement lastElementOftheList = productsDehHranaPage1.get(productsDehHranaPage1.size()-1);

        ArrayList<String> titlesOfProductsDehHrana = new ArrayList<>();

        for (int i = 0; i < productsDehHranaPage1.size(); i++) {
            String title = productsDehHranaPage1.get(i).getText();
            titlesOfProductsDehHrana.add(title);
        }

        for (int j = 0; j < productsDehHranaPage1.size(); j++) {
            if (titlesOfProductsDehHrana.get(j).contains(item)) {
                WebElement chosenItem = productsDehHranaPage1.get(j);
                chosenItem.click();
                {
                    break;
                }
            }
        }
    }
}
