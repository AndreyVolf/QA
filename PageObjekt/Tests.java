package PageObjekt;

import Pages.MainPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Tests  extends TestBase {

    private By messagelocator6 = By.id("error");


    @Test
    public void testHomeWork2() {

        var page = new MainPage(driver);

         page.open();
         page.header.sendKeysLocator3();

        resaultAssert();

    }

    @Test
    public void testHomeWork3() {
        var page = new MainPage(driver);

        page.open();
        page.header.sendKeysLocator4();

        resaultAssert();
    }

    @Test
    public void testHomeWork4() {
        var page = new MainPage(driver);

        page.open();
        page.header.sendKeysLocator5();

        resaultAssert();

    }

    @Test
    public void testHomeWork5() {
        var page = new MainPage(driver);

        page.open();
        page.header.sendKeysLocator6();

       resaultAssert();

    }

private void resaultAssert() {
    var resault6 = "Некорректный email или пароль";
    Assert.assertTrue("неверный текст", driver.findElement(messagelocator6).isDisplayed());
    Assert.assertEquals("Неверный текст", resault6, driver.findElement(messagelocator6).getText());


}
    }