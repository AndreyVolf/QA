package PageFactory;

import PageObjekt.TestBase;
import Pages.MainPage;
import Pages.MainPage2;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Tests2 extends TestBase2 {

    private By messagelocator6 = By.id("error");


    @Test
    public void testHomeWork2() {

        var page = new MainPage2(driver);

         page.open();
         page.email.sendKeys("@");
         page.password.sendKeys("123");


        resaultAssert();

    }

    @Test
    public void testHomeWork3() {
        var page = new MainPage2(driver);

        page.open();
        page.email2.sendKeys("@");
        page.password2.sendKeys("123");


        resaultAssert();
    }

    @Test
    public void testHomeWork4() {
        var page = new MainPage2(driver);

        page.open();
        page.email3.sendKeys("@");
        page.password3.sendKeys("123");

        resaultAssert();

    }

    @Test
    public void testHomeWork5() {
        var page = new MainPage2(driver);


        page.open();
        page.email4.sendKeys("@");
        page.password4.sendKeys("123");

        resaultAssert();

    }

private void resaultAssert() {
    var resault6 = "Некорректный email или пароль";
    Assert.assertTrue("неверный текст", driver.findElement(messagelocator6).isDisplayed());
    Assert.assertEquals("Неверный текст", resault6, driver.findElement(messagelocator6).getText());


}
    }