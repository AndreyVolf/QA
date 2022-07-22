package HomeTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
    @Test
    public void testsHelloNastya() {
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module01/");
        driver.findElement(By.name("name")).sendKeys("Настя");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Привет, Настя!";
        Assert.assertEquals(expectedResult, actualResult);
        driver.quit();


    }

    @Test
    public void testVasya() {
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module01/");
        driver.findElement(By.name("name")).sendKeys("Вася");
        driver.findElement(By.className("button")).click();

    }
    @Test
    public void testVasyaIvanov(){
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Вася Иванов");
        driver.findElement(By.name("email")).sendKeys("Vasya@mail.com");
        driver.findElement(By.name("phone")).sendKeys("77777");
        driver.findElement(By.className("custom-form__button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, Вася Иванов.\n" +
                "На вашу почту (Vasya@mail.com) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: 77777.";
        Assert.assertEquals(expectedResult, actualResult);
        driver.quit();
    }
   @Test
    public void testEmptyFieldsHello(){
       System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
       driver.findElement(By.className("custom-form__button")).click();
       var actualResult = driver.findElement(By.className("start-screen__res")).getText();
       var expectedResult = "Здравствуйте, .\n" +
               "На вашу почту () отправлено письмо.\n" +
               "Наш сотрудник свяжется с вами по телефону: .";
       Assert.assertEquals(expectedResult, actualResult);
       driver.quit();

    }

    @Test
    public void testElement(){
        System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");

    }




}
