package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {


    public List<WebElement> getPsiFadingManu() {
        return psiFadingManu;
    }

    List<WebElement> psiFadingManu;
    String homePageUrl = "https://www.pet-centar.rs/";

//    @FindBy (id = "ctl53_FilterHomepage1_RptFilters_ctl00_LnkFilterName")
    private WebElement psiMenuItem;
// neće da rade testovi sa ovim elementom kada definišem element sa anotacijom,
// prestane da radi metoda sa elementom, a ne znam kako da je prepravim


     public HomePage(ChromeDriver driver) {
        super(driver);
        driver.get(homePageUrl);
        this.psiMenuItem = driver.findElementById("ctl53_FilterHomepage1_RptFilters_ctl00_LnkFilterName");
//        this.psiFadingManu= driver.findElementsByXPath("//div[@class='filter-fade-menu']//a[contains (@id, 'ctl53_Header1_FilterHomepage1_RptFilters_ctl00_RptFilter')]");

    }



    public Psi clickOnthePsiMenuItem() {
        psiMenuItem.click();
        return new Psi(driver);
    }

    public Hrana clickOnthePsiMenuItem1() {
        psiFadingManu.get(0).click();
        return new Hrana (driver);
    }

    public void hoverOnthePsiMenuItem() {
        Actions action = new Actions(driver);
        action.moveToElement(psiMenuItem).perform();
            }

    public BasePage clickOnthePsiFadingManuItem(ChromeDriver driver, String textOftheItem) {
        Actions action = new Actions(driver);
//Performing the mouse hover action on the target element.
        action.moveToElement(psiMenuItem).perform();
        for (int i = 0; i < psiFadingManu.size(); i++) {
            String title = psiFadingManu.get(i).getText();
            ArrayList<String> titlesOfPsiFadingManuItems = new ArrayList<>();
            titlesOfPsiFadingManuItems.add(title);

            for (int j = 0; j < titlesOfPsiFadingManuItems.size(); j++) {
                if (titlesOfPsiFadingManuItems.get(j).contains(textOftheItem)) {
                    WebElement chosenItem = psiFadingManu.get(j);
                    chosenItem.click();

                    switch (chosenItem.getText()) {
                        case "Hrana za pse":
                            return new Hrana(driver);
                        case "Igračke":
                            return new IgrackePsi(driver);
                        default:
                            return new Psi(driver);
                    }

                }

            }
        }
        return null;
    }
}








