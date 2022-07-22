package Hellotest;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Labirint {
    private WebDriver driver;
    private WebDriverWait wait;



    @Before

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,5);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws IOException {

          var sourceFile  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File("C:\\ScreenShots.png"));
        driver.quit();



    }



    @Test
    public void Labirinttest1() {
        driver.navigate().to("https://www.labirint.ru/");



        var Locatoreelement1 = By.cssSelector("[data-title='Что почитать: выбор редакции'] .product:nth-of-type(1) .buy-link");
        var Locatoreelement2 = By.cssSelector("[data-title='Что почитать: выбор редакции'] .product:nth-of-type(1) .btn-more");
        var LocatoreelementCookie = By.cssSelector(".cookie-policy__button.js-cookie-policy-agree");
        var Locatoreelement3 = By.cssSelector(".btn.btn-primary.btn-large.fright.start-checkout-js");
        var Locatorelement4 = By.cssSelector(".delivery__profiles-change-btn");
        var Locatorelement5 = By.cssSelector(".delivery-type-items .li-select.margin-set.pointer");
        var Locatorelement6 = By.cssSelector("#deliveryAddress");
        var Locatoreelement7 = By.cssSelector(".do--parent-of-list-item.list-item-26");
        var Locatorelement7 = By.cssSelector(".delivery-info.padding-set");
        var Locatoreelement8 = By.cssSelector(".container-top-label [placeholder='Индекс/ZIP']");
        var Locatoreelement9 = By.cssSelector(".base-button--theme-red.base-button--noselect.text-s");
        var Locatoreelement10 = By.cssSelector(".front .div-select-text-left-body");
        var Locatoreelement11 = By.cssSelector(".loading-panel");


        driver.findElement(LocatoreelementCookie).click();
        driver.findElement(Locatoreelement1).click();
        driver.findElement(Locatoreelement2).click();
        driver.findElement(Locatoreelement3).click();
        driver.findElement(Locatorelement4).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locatorelement5));
        driver.findElement(Locatorelement5).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locatorelement6));
        driver.findElement(Locatorelement6).sendKeys("улица Большая Якиманка, 22, Москва");
        driver.findElement(Locatoreelement7).click();
     //   driver.findElement(Locatoreelement8).sendKeys("119634");




    }



    }