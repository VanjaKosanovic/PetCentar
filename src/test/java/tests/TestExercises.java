package tests;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.*;

import java.util.ArrayList;

public class TestExercises {

    @Test
    public void addDehHranaItemToCart () throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookies();
        Psi psi = homePage.clickOnthePsiMenuItem();
        psi.clickOnCertainElement(driver, "Hrana", psi.getListPsiMenu());
        Hrana hrana = new Hrana(driver);
        hrana.clickOnCertainElement(driver, "Dehidrirana", hrana.getListHranaItems());
        DehidriranaHrana dehidriranaHrana = new DehidriranaHrana(driver);
        dehidriranaHrana.scrollIntoView(driver.findElementByXPath("//a[@id='ctl49_ProductList21_ProductList2Products1_LnkNext2']"));
        dehidriranaHrana.clickOnCertainElement(driver, "ALLEVA EQUILIBRIUM", dehidriranaHrana.getProductsDehHranaPage1());
        dehidriranaHrana.addToCart();
        driver.quit();


    }

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
        psi.clickOnCertainElement(driver, "Dodaci", psi.getListPsiMenu());
        driver.quit();
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


                }





