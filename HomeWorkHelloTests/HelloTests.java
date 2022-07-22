package HomeWorkHelloTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloTests {
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
    public void testLocators2() {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        var sizeElement = driver.findElement(By.id("size"));
        var buttonElement = driver.findElement(By.id("check-size-button"));
        var size = "43";
        sizeElement.sendKeys(size);
        buttonElement.click();
        var actualResult = driver.findElement(By.className("error")).getText();
        ;
        var expectedResult = "В нашем магазине есть обувь вашего размера";
        Assert.assertEquals("неправильный текст ", expectedResult, actualResult);


    }


    @Test
    public void testLocators3() {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        var sizeElement = driver.findElement(By.id("size"));
        var buttonElement = driver.findElement(By.id("check-size-button"));
        var size = "49";
        sizeElement.sendKeys(size);
        buttonElement.click();
        var actualResult = driver.findElement(By.id("size-error")).getText();
        var expectedResult = "В нашем магазине нет обуви вашего размера";
        Assert.assertEquals("неправильный текст ", expectedResult, actualResult);


    }

    @Test
    public void testLocator4() {
        driver.navigate().to("http://qajava.skillbox.ru/");
        var hrefElement = driver.findElement(By.linkText("Обратная связь"));
        var hrefElement2 = driver.findElement(By.linkText("Предзаказы"));
        var buttonElement = driver.findElement(By.tagName("button"));
        var headerResultElement = driver.findElement(By.tagName("h1"));
        var idElement = driver.findElement(By.id("cart_count"));
        var idElement2 = driver.findElement(By.id("genres"));
        var searchElement = driver.findElement(By.name("search-input-form"));

    }

    @Test
    public void testLocator5() {
        driver.navigate().to("http://qajava.skillbox.ru/");
        var noteElements = driver.findElements(By.className("book-info"));
        Assert.assertEquals("неверное количество записей на странице", 15, noteElements.size());

    }

    @Test
    public void testLocators6() {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        driver.findElement(By.className("module_input_text")).sendKeys("Ваши любимые фильмы");
        driver.findElement(By.name("serials")).sendKeys("Ваши любимые сериалы");
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("two")).click();
        driver.findElement(By.className("section__button")).click();
        driver.findElement(By.id("ok")).click();
        var actualResult = driver.findElement(By.className("module__result")).getText();
        var expectedResult = "Ваши любимые фильмы:\n" +
                "Ваши любимые фильмы\n" +
                "Ваши любимые сериалы:\n" +
                "Ваши любимые сериалы\n" +
                "Я люблю смотреть фильмы:\n" +
                "Возраст:";
        Assert.assertEquals("неверный текст", expectedResult, actualResult);


    }


    @Test
    public void testLocators7() {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        var filmElement = By.className("module_input_text");
        var serialElement= By.name("serials");
        driver.findElement(filmElement).sendKeys("Ваши любимые фильмы");
        driver.findElement(serialElement).sendKeys("Ваши любимые сериалы");
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("two")).click();
        driver.findElement(By.className("section__button")).click();
        driver.findElement(By.id("ok")).click();
        var actualResult = driver.findElement(By.className("module__result")).getText();
        var expectedResult = "Ваши любимые фильмы:\n" +
                "Ваши любимые фильмы\n" +
                "Ваши любимые сериалы:\n" +
                "Ваши любимые сериалы\n" +
                "Я люблю смотреть фильмы:\n" +
                "Возраст:";
        Assert.assertEquals("неверный текст", expectedResult, actualResult);


    }

    @Test
    public void testLocators8() {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module07/practice3/");
        var filmElement = By.id("films");
        var serialElement= By.id("serials");
        driver.findElement(filmElement).sendKeys("Гладиатор");
        driver.findElement(serialElement).sendKeys("Братья Доннелли");
        driver.findElement(By.id("save")).click();
        driver.findElement(By.id("two")).click();
        driver.findElement(By.className("section__button")).click();
        driver.findElement(By.id("ok")).click();
        var actualResult = driver.findElement(By.className("module__result")).getText();
        var expectedResult = "Ваши любимые фильмы:\n" +
                "Гладиатор\n" +
                "Ваши любимые сериалы:\n" +
                "Братья Доннелли\n" +
                "Я люблю смотреть фильмы:\n" +
                "Возраст:";
        Assert.assertEquals("неверный текст", expectedResult, actualResult);


    }

}
