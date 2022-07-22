package Hellotest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KittenTests {
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
    public void testKittens1() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/lesson2/changed.html");
        var emailElement = driver.findElement(By.className("email"));
        var buttonElement = driver.findElement(By.id("write-to-me"));
        var email = "test@test.ru";
        emailElement.sendKeys(email);
        buttonElement.click();
        var resaultEmailElement = driver.findElement(By.className("notification-email"));
        Assert.assertEquals("не отобразился текст email", true, resaultEmailElement.isDisplayed());
        Assert.assertEquals("неправильно текст отобразился", email, resaultEmailElement.getText());

    }

    @Test
    public void testKittenEmptyEmail2() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/lesson2/changed.html\"");
        var buttonElement = driver.findElement(By.id("write-to-me"));
        buttonElement.click();
        var resaultEmailElement = driver.findElement(By.className("notification-email"));
        Assert.assertEquals("неправильно текст отобразился", "", resaultEmailElement.getText());


    }


    private By emailLocator = By.className("email");
    private By writeToMeLocator = By.id("write-to-me");
    private By resaultEmailLocator = By.className("notification-email");

    @Test
    public void testKittens() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/lesson2/changed.html");
        var email = "test@test.ru";
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(writeToMeLocator).click();
        Assert.assertTrue("не отобразился текст email", driver.findElement(resaultEmailLocator).isDisplayed());
        Assert.assertEquals("неправильно текст отобразился", email, driver.findElement(resaultEmailLocator).getText());

    }

    @Test
    public void testKittenEmptyEmail() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/lesson2/changed.html");
        driver.findElement(writeToMeLocator).click();
        Assert.assertEquals("неправильно текст отобразился", "", driver.findElement(resaultEmailLocator).getText());

    }

    @Test
    public void testPuppyEmail() {

        driver.navigate().to("http://qajava.skillbox.ru/module04/lesson2/practice/");

        var emailElement = driver.findElement(By.name("email"));
        var buttonElement = driver.findElement(By.id("sendMe"));
        var email = "test@test.ru";
        emailElement.sendKeys(email);
        buttonElement.click();
        var resaultEmailElement = driver.findElement(By.className("your-email"));
        Assert.assertEquals("не отобразился текст email", true, resaultEmailElement.isDisplayed());
        Assert.assertEquals("неправильно отобразился текст", email, resaultEmailElement.getText());


    }

    @Test
    public void testPuppyEmail2() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/lesson2/practice/");
        var emailElement = driver.findElement(By.name("email"));
        var buttonElement = driver.findElement(By.id("girl"));
        var button1Element = driver.findElement(By.id("sendMe"));
        var email = "test@test.ru";
        buttonElement.click();
        button1Element.click();
        var resaultEmailElement = driver.findElement(By.className("your-email"));
        Assert.assertEquals("неправильно текст отобразился", "", resaultEmailElement.getText());


    }

    private By emailLocator1 = By.name("email");
    private By writeToMeLocator1 = By.id("sendMe");
    private By resaultEmailLocator1 = By.className("your-email");


    @Test
    public void testPuppyEmail3() {

        driver.navigate().to("http://qajava.skillbox.ru/module04/lesson2/practice/");

        var email = "test@test.ru";
        driver.findElement(emailLocator1).sendKeys(email);
        driver.findElement(writeToMeLocator1).click();
        Assert.assertTrue("не отобразился текст email", driver.findElement(resaultEmailLocator1).isDisplayed());
        Assert.assertEquals("неправильно отобразился текст", email, driver.findElement(resaultEmailLocator1).getText());


    }

    @Test
    public void testPuppyEmail4() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/lesson2/practice/");
        var buttonElement = driver.findElement(By.id("girl"));
        var email = "test@test.ru";
        buttonElement.click();
        driver.findElement(emailLocator1).sendKeys(email);
        driver.findElement(writeToMeLocator1).click();
        Assert.assertTrue("не отобразился текст email", driver.findElement(resaultEmailLocator1).isDisplayed());
        Assert.assertEquals("неправильно отобразился текст", email, driver.findElement(resaultEmailLocator1).getText());

    }


    @Test
    public void testFeedback() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/lesson3/os.html");
        var namelocator = By.cssSelector(".data.text");
        var namelocator2 = By.cssSelector(".data.field");
        var namelocator3 = By.cssSelector(".field.text");
        var buttonlocator = By.id("comment");
        driver.findElement(namelocator).sendKeys("Вася");
        driver.findElement(namelocator2).sendKeys("test@test.ru");
        driver.findElement(namelocator3).sendKeys("привет");
        driver.findElement(buttonlocator).click();
        var messagelocator = By.className("message-header");
        Assert.assertTrue("не отобразился текст спасибо", driver.findElement(messagelocator).isDisplayed());

    }

    @Test
    public void testFeedback2() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/lesson3/index.html");
        var namelocator = By.cssSelector(".form-input.fio");
        var namelocator2 = By.cssSelector(".data.form-input.street");
        var namelocator3 = By.cssSelector(".form-input.house");
        var namelocator4 = By.cssSelector(".form-input.flat");
        var namelocator5 = By.cssSelector(".form-input.date");
        var button = By.className("form-submit");
        driver.findElement(namelocator).sendKeys("Иванов Иван Иванович");
        driver.findElement(namelocator2).sendKeys("Ленина");
        driver.findElement(namelocator3).sendKeys("12");
        driver.findElement(namelocator4).sendKeys("36");
        driver.findElement(namelocator5).sendKeys("завтра");
        driver.findElement(button).click();
        var messagelocator1 = By.className("form-result-description");
        Assert.assertTrue("текст не совпадает", driver.findElement(messagelocator1).isDisplayed());


    }

    private By emailLocator2 = By.name("email");
    private By passwordLocator = By.className("form-input");
    private By buttonLocator = By.tagName("button");


    @Test
    public void testHomeWork() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/homework/auth/index.html");

        driver.findElement(emailLocator2).sendKeys("@");
        driver.findElement(passwordLocator).sendKeys("123");
        driver.findElement(buttonLocator).click();
        var messagelocator = By.id("error");
        var resault = "Некорректный email или пароль";
        Assert.assertTrue("неверный текст", driver.findElement(messagelocator).isDisplayed());
        Assert.assertEquals("Неверный текст", resault, driver.findElement(messagelocator).getText());

    }

    @Test
    public void testHomeWork2() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/homework/auth/changed.html");
        var emaillocator3 = By.cssSelector(".form-input.input-data");
        var passwordlocator3 = By.cssSelector(".form-input.password");
        var buttonlocator3 = By.cssSelector(".form-submit");


        driver.findElement(emaillocator3).sendKeys("@");
        driver.findElement(passwordlocator3).sendKeys("123");
        driver.findElement(buttonlocator3).click();
        var messagelocator3 = By.id("error");
        var resault3 = "Некорректный email или пароль";
        Assert.assertTrue("неверный текст", driver.findElement(messagelocator3).isDisplayed());
        Assert.assertEquals("Неверный текст", resault3, driver.findElement(messagelocator3).getText());


    }

    @Test
    public void testHomeWork3() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/homework/auth/changed.html");
        var emaillocator4 = By.cssSelector("input.form-input.input-data");
        var passwordlocator4 = By.cssSelector("input.form-input.password");
        var buttonlocator4 = By.cssSelector("button.form-submit");


        driver.findElement(emaillocator4).sendKeys("@");
        driver.findElement(passwordlocator4).sendKeys("123");
        driver.findElement(buttonlocator4).click();
        var messagelocator4 = By.id("error");
        var resault4 = "Некорректный email или пароль";
        Assert.assertTrue("неверный текст", driver.findElement(messagelocator4).isDisplayed());
        Assert.assertEquals("Неверный текст", resault4, driver.findElement(messagelocator4).getText());


    }

    @Test
    public void testHomeWork4() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/homework/auth/changed.html");
        var emaillocator5 = By.cssSelector("#email");
        var passwordlocator5 = By.cssSelector("#password");
        var buttonlocator5 = By.cssSelector("#submit");


        driver.findElement(emaillocator5).sendKeys("@");
        driver.findElement(passwordlocator5).sendKeys("123");
        driver.findElement(buttonlocator5).click();
        var messagelocator5 = By.id("error");
        var resault5 = "Некорректный email или пароль";
        Assert.assertTrue("неверный текст", driver.findElement(messagelocator5).isDisplayed());
        Assert.assertEquals("Неверный текст", resault5, driver.findElement(messagelocator5).getText());


    }

    @Test
    public void testHomeWork5() {
        driver.navigate().to("http://qajava.skillbox.ru/module04/homework/auth/changed.html");
        var emaillocator6 = By.cssSelector("input#email.form-input.input-data");
        var passwordlocator6 = By.cssSelector("input#password.form-input.password");
        var buttonlocator6 = By.cssSelector("button#submit.form-submit");


        driver.findElement(emaillocator6).sendKeys("@");
        driver.findElement(passwordlocator6).sendKeys("123");
        driver.findElement(buttonlocator6).click();
        var messagelocator6 = By.id("error");
        var resault6 = "Некорректный email или пароль";
        Assert.assertTrue("неверный текст", driver.findElement(messagelocator6).isDisplayed());
        Assert.assertEquals("Неверный текст", resault6, driver.findElement(messagelocator6).getText());


    }



    }