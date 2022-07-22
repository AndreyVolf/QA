package Hellotest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CssTestHard {
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
    public void tearDown() {
        driver.quit();





    }



    @Test
    public void testFeedback() {
        driver.navigate().to("http://qa.skillbox.ru/module16/maincatalog/");
         var namelocator = By.cssSelector("div.pageCreate__cards div");
         var namelocator2 = By.cssSelector("div.pageCreate > div.pageCreate__cards img");
         var namelocator3 = By.cssSelector("div.baseFooter > *");
        var namelocator4 = By.cssSelector("div.baseCard.pageCreate__card:first-child p");

    }


        @Test
        public void testFeedback1 () {
            driver.navigate().to("http://qa.skillbox.ru/module16/16_2/");
            var namelocator11 = By.cssSelector("section.important-section-block[for='main-header-page'] > h1:first-child");
            var namelocator12 = By.cssSelector("span:not(.baseCard__title)");
            var namelocator13 = By.cssSelector("button:not(disabled)");
            var namelocator14 = By.cssSelector("div.baseCard.pageCreate__card:nth-of-type(4) .baseButton:not(.baseButton--noBorder)");
           // var namelocator15 = By.cssSelector("div.footer__menu > div.footer__menuList:first-child > a:nth-of-type(1)");


        }



    @Test
    public void testFeedback3 () {
        driver.navigate().to("http://qa.skillbox.ru/module15/bignotes/#/");
       var namebutton1 = By.cssSelector("div.pageCreate__sidebarHeader.pageCreate__sidebarWrapper button");
       var namelocator2 = By.cssSelector("div.baseInput.popup__baseInput input[type='text'].baseInput__field");
       var namelocator3 = By.cssSelector("div.baseTextarea__inner > [maxlength='1000'].baseTextarea__text");
       var namelocator4 = By.cssSelector(".baseButton.popup__baseButton");
       var assert1 = By.cssSelector("p.articlePreview__title");
       var assert2 = By.cssSelector("p.articlePreview__text");
        wait.until(ExpectedConditions.presenceOfElementLocated(namebutton1));
        driver.findElement(namebutton1).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(namelocator2));
        driver.findElement(namelocator2).sendKeys("Есенин");
        wait.until(ExpectedConditions.presenceOfElementLocated(namelocator3));
        driver.findElement(namelocator3).sendKeys("Заметался пожар голубой");
        wait.until(ExpectedConditions.presenceOfElementLocated(namelocator4));
        driver.findElement(namelocator4).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(namelocator2));

        var actualTitle = driver.findElement(assert1).getText();
        var expectedTitle = "Есенин";
        var actualTitle1 = driver.findElement(assert2).getText();
        var expectedTitle1 = "Заметался пожар голубой";
        Assert.assertTrue("не отобразился лайтбокс с заметками",driver.findElement(namebutton1).isDisplayed());
        Assert.assertEquals("неправильный заголовок",expectedTitle,actualTitle);
        Assert.assertEquals("неправильный текст",expectedTitle1,actualTitle1);
        Assert.assertTrue("не исщез лайтбокс после нажатия кнопки",driver.findElements(namelocator2).size()==0);





    }
    @Test
    public void testFeedback4 () {
        driver.navigate().to("http://qa.skillbox.ru/module15/bignotes/#/");
        var namebutton1 = By.cssSelector("div.pageCreate__sidebarHeader.pageCreate__sidebarWrapper button");
        var namelocator2 = By.cssSelector("div.baseInput.popup__baseInput input[type='text'].baseInput__field");
        var namelocator3 = By.cssSelector("div.baseTextarea__inner > [maxlength='1000'].baseTextarea__text");
        var namelocator4 = By.cssSelector(".baseButton.popup__baseButton");
        var assert1 = By.cssSelector("p.articlePreview__title");
        var assert2 = By.cssSelector("p.articlePreview__text");
        driver.findElement(namebutton1).click();
        driver.findElement(namelocator2).sendKeys("Есенин");
        driver.findElement(namelocator3).sendKeys("Заметался пожар голубой");
        driver.findElement(namelocator4).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(namelocator2));
        var actualTitle = driver.findElement(assert1).getText();
        var expectedTitle = "Есенин";
        var actualTitle1 = driver.findElement(assert2).getText();
        var expectedTitle1 = "Заметался пожар голубой";
        Assert.assertTrue("не отобразился лайтбокс с заметками", driver.findElement(namebutton1).isDisplayed());
        Assert.assertEquals("неправильный заголовок", expectedTitle, actualTitle);
        Assert.assertEquals("неправильный текст", expectedTitle1, actualTitle1);
        Assert.assertTrue("не исщез лайтбокс после нажатия кнопки",driver.findElements(namelocator2).size()==0);

    }

    @Test
    public void HomeworkCss() {
     driver.navigate().to("https://lm.skillbox.cc/qa_tester/module04/practice1/");
     var  elementLocator = By.cssSelector("input:not([id])");
     var elementLocator2 = By.cssSelector("p.form-row");
     var elementLocator3 = By.cssSelector("div.form-inner p.form-row:first-child");


    }

    @Test
    public  void HomeworkCss1()
    {
        driver.navigate().to("http://qa.skillbox.ru/module15/bignotes/#/statistic");
        var elementLocator = By.cssSelector("[href='/module15/bignotes/#/statistic']");
        var elementLocator1 = By.cssSelector(".articlePreview.pageStatistic__article");
        var elementLocator2 = By.cssSelector(".pageArticle__sidebar.page__sidebar .articlePreview.pageArticle__articlePreview:nth-of-type(1)");
        var elementLocator3 = By.cssSelector(".page__content.pageArticle__content .pageArticle__button:nth-of-type(2)");


        wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
        driver.findElement(elementLocator).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator1));
        driver.findElement(elementLocator1).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator2));
        driver.findElement(elementLocator2).click();


          var actualTitle1 = driver.findElement(elementLocator2).getText();
          var expectedTitle1 = "27 ИЮНЯ 2022\n" +
                 "План на следующий месяц\n" +
                 "Прочитать книгу «Искусство цвета».";

         Assert.assertTrue("не отобразился лайтбокс с текстом", driver.findElement(elementLocator2).isDisplayed());
         Assert.assertEquals("Неправильный текст",expectedTitle1,actualTitle1);

          wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator3));
           driver.findElement(elementLocator3).click();
           Assert.assertTrue("не исщез текст из заголовка",driver.findElements(elementLocator1).size()==0);



    }

    @Test
    public  void HomeworkCss2()
    {
        driver.navigate().to("http://qa.skillbox.ru/module15/bignotes/#/statistic");
        var elementLocator = By.cssSelector("[href='/module15/bignotes/#/statistic']");
        var elementLocator1 = By.cssSelector(".articlePreview.pageStatistic__article");
        var elementLocator2 = By.cssSelector(".pageArticle__sidebar.page__sidebar .articlePreview.pageArticle__articlePreview:nth-of-type(1)");
        var elementLocator3 = By.cssSelector(".page__content.pageArticle__content .pageArticle__button:nth-of-type(2)");


        driver.findElement(elementLocator).click();
        driver.findElement(elementLocator1).click();
        driver.findElement(elementLocator2).click();


        var actualTitle1 = driver.findElement(elementLocator2).getText();
        var expectedTitle1 = "27 ИЮНЯ 2022\n" +
                "План на следующий месяц\n" +
                "Прочитать книгу «Искусство цвета».";

        Assert.assertTrue("не отобразился лайтбокс с текстом", driver.findElement(elementLocator2).isDisplayed());
        Assert.assertEquals("Неправильный текст",expectedTitle1,actualTitle1);

        driver.findElement(elementLocator3).click();
        Assert.assertTrue("не исщез текст из заголовка",driver.findElements(elementLocator1).size()==0);



    }
    }