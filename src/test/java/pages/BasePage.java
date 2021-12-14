package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public ChromeDriver driver;

    public BasePage(ChromeDriver driver) {

        this.driver = driver;
    }

    //accept cookies
    public void acceptCookies () {
        driver.findElementById("ctl53_Header1_CookiesEuBox_btnAcceptAll").click();
    }

    public void waitUntilVisible (WebElement webElement, int timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilClickable (WebElement webElement, int timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public boolean isElementPresent(WebElement webElement){
        try {
            return webElement.isDisplayed();
        } catch (final Exception e) {
            return false;
        }
    }

    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void addToCart (){
        driver.findElementByXPath("//a[@class='btn btn--addToBasket']").click();
    }

    public void browserRefresh (){
        driver.navigate().refresh();
    }
}
