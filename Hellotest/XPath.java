package Hellotest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
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
//$x("//button[@id='submit'][@class='form-submit']") кнопка "войти"
//$x("//input[@required='']") поле email
// $x("//input[@required='true']") поле пароль
//$x("//p[contains(@class, 'forgot')]") кнопка забыли пароль, если мы ищем по 1 классу хотя у нас в дереве 2 класса.
//$x("//p[@class = 'form-row forgot']") поиск по двум классам
//$x("//p[contains(@class, 'forgot')]/a") поиск внутренней ссылки с добавление следующего тэга "a"
//$x("//header//div//img")  Поиск картинки img по тэгам, где 1 / строгая последовательность а 2 // не строгая.
// $x("//header//div[contains(@class, header-block)]//img") локатор дополнили классом.
// $x("(//button)[2]") универсальный способ для выбора элемента по счету, лучше чем css ntg-of-type()
// $x("(//button)[last()]") поиск   последнего элемента
// $x("//*[@id='genres']/../li") Локатор ищет все дочерние элементы li
// $x("//*[@id='genres']/..") Локатор ищет родительский элемент.
// $x("//*[@id='genres']/parent::ul") Локатор конкретно тэг ul.
//$x("//*[@id='genres']/ancestor::*") Ищет всех родителей ul.
//$x("//*[text()='В КОРЗИНУ']") Ищет все кнопки по тексту 'В КОРЗИНУ'
//$x("(//*[text()='В КОРЗИНУ'])[1]") Ищет конкретно кнопку по цифре в скобках
//$x("//*[@id='genres']//*[.='Бестселлеры']") Ищет конкретно ссылку с текстом Бестселлеры





    @Test
    public void testFeedback() {
   driver.navigate().to("http://qa.skillbox.ru/module16/maincatalog/");
        var firstLocator = By.xpath("//*[text()='Алфавит для взрослых (обновлённый материал)']");
        var firstLocator2 = By.xpath("(//*[text()='Старт: 14 февраля 2020'])[5]");





    }

    @Test
    public void testFeedback2() {
        driver.navigate().to("http://qajava.skillbox.ru/index.html");
        var firstLocator = By.xpath("//*[@id='preorder292']//*[.='О магазине']");
        var firstLocator2 = By.xpath("(//*[.='Бестселлеры'])[last()]");
        var firstLocator3 = By.xpath("//input[@id='search-input'][@placeholder='Поиск по магазину...']");
        var firstLocator4 = By.xpath("//button[text()='Оформить заказ']");
        var firstLocator5 = By.xpath("div[text()='Ваш заказ: ']");
        var firstLocator6 = By.xpath("//div[@id='total']");
        var firstLocator7 = By.xpath("//button[@class='filter-button'][text()='Отменить']");





    }

    }