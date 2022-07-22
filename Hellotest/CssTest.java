package Hellotest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTest {
    private WebDriver driver;

    @Before

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        driver = new ChromeDriver();


    }

    @After
    public void tearDown() {
        driver.quit();





    }



    @Test
    public void testFeedback() {
        driver.navigate().to("http://qajava.skillbox.ru/search.html");
        var namelocator = By.cssSelector("[test-info='about-us']");
        var namelocator2 = By.cssSelector("a[href='']");
        var namelocator3 = By.cssSelector("[selected]");
        var namelocator4 = By.cssSelector("div.book-price");
        var namelocator5 = By.cssSelector("button[class^='book']");
        var namelocator6 = By.cssSelector("[class$='main']");
        var namelocator7 = By.cssSelector("a[class*='menu']");
        var namelocator8 = By.cssSelector("footer > div");
        var namelocator9 = By.cssSelector("li#genres+*");
        var namelocator10 = By.cssSelector("div.filter-container~*");

    }


        @Test
        public void testFeedback1 () {
            driver.navigate().to("http://qajava.skillbox.ru/module05/auth/index.html/");
            var namelocator11 = By.cssSelector("section.important-section-block[for='main-header-page'] > h1:first-child");
            var namelocator12 = By.cssSelector("form.form#login-form > p:last-child");
            var namelocator13 = By.cssSelector("body > *:nth-child(3)");
            var namelocator14 = By.cssSelector("div.footer__menuList > a:nth-of-type(1)");
            var namelocator15 = By.cssSelector("div.footer__menu > div.footer__menuList:first-child > a:nth-of-type(1)");


        }
    }