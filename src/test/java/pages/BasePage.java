package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class BasePage {
    public ChromeDriver driver;

    public BasePage(ChromeDriver driver) {

        this.driver = driver;
    }

    //accept cookies
    public void acceptCookies() {
        driver.findElementById("ctl53_Header1_CookiesEuBox_btnAcceptAll").click();
    }

    public void waitUntilVisible(WebElement webElement, int timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilClickable(WebElement webElement, int timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public boolean isElementPresent(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (final Exception e) {
            return false;
        }
    }

    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void addToCart() {
        driver.findElementByXPath("//a[@class='btn btn--addToBasket']").click();
    }

    public void browserRefresh() {
        driver.navigate().refresh();
    }

// method which allows you to click on the item (or product) in any menu (or list)
//you create a list of elements in a menu (3. parameter)
//you input the menu item/product name you want as string (2. parameter)
//the method finds the item/product, clicks on it and returns driver
    public ChromeDriver clickOnCertainElement(ChromeDriver driver, String item, ArrayList<WebElement> listOfElements) {

//        ArrayList<WebElement> listOfElements = new ArrayList<>();
        ArrayList<String> titlesOfElements = new ArrayList<>();

        for (int i = 0; i < listOfElements.size(); i++) {
            String title = listOfElements.get(i).getText();
            titlesOfElements.add(title);
        }

        for (int j = 0; j < titlesOfElements.size(); j++) {
            if (titlesOfElements.get(j).contains(item)) {
                WebElement chosenItem = listOfElements.get(j);
                chosenItem.click();
                {
                    break;
                }
            }
        }
        return driver;
    }
}
