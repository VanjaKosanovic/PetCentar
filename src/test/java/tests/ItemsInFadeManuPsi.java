package tests;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.*;

import java.util.ArrayList;

public class ItemsInFadeManuPsi {

//    @Test
//    public void clickOnTheChoosenTitle() {
//        String title = "Hrana za pse";
//        ChromeDriver driver = npseew ChromeDriver();
//        HomePage homePage = new HomePage(driver);
//        Hrana hrana = (Hrana) homePage.clickOnthePsiFadingManuItem(driver, title);
//
//    }
//
//    @Test
//    public void hoverPsiMenuItem() throws InterruptedException {
//        ChromeDriver driver = new ChromeDriver();
//        HomePage homePage = new HomePage(driver);
//        homePage.hoverOnthePsiMenuItem();
////    System.out.println(homePage.getPsiFadingManu().get(1).getText());
//        homePage.waitUntilVisible(homePage.getPsiFadingManu().get(0), 10);
//        homePage.clickOnthePsiMenuItem1();
//
//
//    }


    @Test
    public void testFilterDogFood2() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookies();
        Psi psi = homePage.clickOnthePsiMenuItem();
        psi.clickOntheChoosenPsiItem(driver, "Dodaci");
                }
//                    Thread.sleep(5000);
//                    Hrana hrana = new Hrana(driver);
//                    assert hrana.driver.findElementByClassName("hero-banner").getText().contains("Hrana za pse") : "This item is not working";

//                    driver.quit();

//                    switch (chosenItem.getText()) {
//                        case "Hrana za pse":
//                            return new Hrana(driver);
//                        case "Igračke":
//                            return new IgrackePsi(driver);
//                        default:
//                            return new Psi(driver);
//                    }
//
//                }
//
//            }
//        }
//        return null;
//    }

    @Test
    public void addDehHranaItemToCart () throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookies();
        Psi psi = homePage.clickOnthePsiMenuItem();
        psi.clickOntheChoosenPsiItem(driver, "Hrana");
        Hrana hrana = new Hrana(driver);
        hrana.clickOnTheChosenHranaZaPseItem(driver, "Dehidrirana");
        DehidriranaHrana dehidriranaHrana = new DehidriranaHrana(driver);
        dehidriranaHrana.clickOnProductDehHranaPage1(driver, "ALLEVA EQUILIBRIUM");
        dehidriranaHrana.addToCart();

    }
                }





