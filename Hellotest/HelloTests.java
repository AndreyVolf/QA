package Hellotest;

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
   public void testsHelloNastya() {

      driver.navigate().to("https://lm.skillbox.cc/qa_tester/module01/");
      driver.findElement(By.name("name")).sendKeys("Настя");
      driver.findElement(By.className("button")).click();
      var actualResult = driver.findElement(By.className("start-screen__res")).getText();
      var expectedResult = "Привет, Настя!";
      Assert.assertEquals(expectedResult, actualResult);


   }

   @Test
   public void testVasya() {

      driver.navigate().to("https://lm.skillbox.cc/qa_tester/module01/");
      driver.findElement(By.name("name")).sendKeys("Вася");
      driver.findElement(By.className("button")).click();

   }

   @Test
   public void testVasyaIvanov() {

      driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
      driver.findElement(By.name("name")).sendKeys("Вася Иванов");
      driver.findElement(By.name("email")).sendKeys("Vasya@mail.com");
      driver.findElement(By.name("phone")).sendKeys("77777");
      driver.findElement(By.className("custom-form__button")).click();
      var actualResult = driver.findElement(By.className("error")).getText();
      var expectedResult = "Здравствуйте, Вася Иванов.\n" +
              "На вашу почту (Vasya@mail.com) отправлено письмо.\n" +
              "Наш сотрудник свяжется с вами по телефону: 77777.";
      Assert.assertEquals(expectedResult, actualResult);

   }

   @Test
   public void testEmptyFieldsHello() {

      driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
      driver.findElement(By.className("custom-form__button")).click();
      var actualResult = driver.findElement(By.className("start-screen__res")).getText();
      var expectedResult = "Здравствуйте, .\n" +
              "На вашу почту () отправлено письмо.\n" +
              "Наш сотрудник свяжется с вами по телефону: .";
      Assert.assertEquals("неправильный текст приветствия", expectedResult, actualResult);   //Указываем неправильный тест приветствия.


   }

   @Test
   public void testLocators() {
      driver.navigate().to("https://lm.skillbox.cc/qa_tester/module05/practice1/");
      var emailElement = driver.findElement(By.className("form-input"));
      var passwordElement = driver.findElement(By.id("password"));
      var passwordconfirmElement = driver.findElement(By.name("confirm_password"));


   }
@Test
   public void testLocators2(){
      driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
      var sizeElement = driver.findElement(By.className("input-field"));
      var sizeElement2 = driver.findElement(By.id("size"));
      var sizeElement3 = driver.findElement(By.name("check"));
}

     @Test
   public void testLocators3(){
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module05/practice1/");
        var emailElement = driver.findElement(By.className("form-input"));
        var passwordElement = driver.findElement(By.id("password"));
        var passwordConfirmElement = driver.findElement(By.name("confirm_password"));
        var buttonElement = driver.findElement(By.tagName("button"));
        var headerResultElement = driver.findElement(By.tagName("h3"));
        var password = "12345";
        var email =  "vtometall@gmail.com";
        emailElement.sendKeys(email);
        passwordElement.sendKeys(password);
        passwordConfirmElement.sendKeys(password);
        buttonElement.click();
        var emailResultElement = driver.findElement(By.linkText(email));
        var emailResultElement2 = driver.findElement(By.partialLinkText(email));
        Assert.assertEquals("неверный текст при успешной регистрации", "Спасибо за регистрацию!",headerResultElement.getText());
        Assert.assertEquals("неверный email при успешной регистрации", email,emailResultElement.getText());

     }

    @Test
    public void testKittens(){
     driver.navigate().to("http://qajava.skillbox.ru/module04/lesson2/changed.html");
     var emailElement = driver.findElement(By.className("email"));
     var buttonElement = driver.findElement(By.id("write-to-me"));
     var email = "test@test.ru";
     emailElement.sendKeys(email);
     buttonElement.click();
     var resaultEmailElement = driver.findElement(By.className("notification-email"));
     Assert.assertEquals("не отобразился текст email",true,resaultEmailElement.isDisplayed());
     Assert.assertEquals("неправильно текст отобразился",email,resaultEmailElement.getText());

   }

    @Test
    public  void testKittenEmptyEmail(){
        driver.navigate().to("http://qajava.skillbox.ru/module04/lesson2/changed.html\"");
        var buttonElement = driver.findElement(By.id("write-to-me"));
        buttonElement.click();
        var resaultEmailElement = driver.findElement(By.className("notification-email"));
        Assert.assertEquals("неправильно текст отобразился","",resaultEmailElement.getText());




    }



}
