package Pages;
import PageObjekt.HeaderPanel;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    public HeaderPanel header;
    private String url = "http://qajava.skillbox.ru/module04/homework/auth/changed.html";
    private By emaillocator3 = By.cssSelector(".form-input.input-data");
    private By passwordlocator3 = By.cssSelector(".form-input.password");
    private By buttonlocator3 = By.cssSelector(".form-submit");
    private By messagelocator3 = By.id("error");
    private By emaillocator4 = By.cssSelector("input.form-input.input-data");
    private By passwordlocator4 = By.cssSelector("input.form-input.password");
    private By messagelocator4 = By.id("error");
    private By emaillocator5 = By.cssSelector("#email");
    private By passwordlocator5 = By.cssSelector("#password");
    private By messagelocator5 = By.id("error");
    private By emaillocator6 = By.cssSelector("input#email.form-input.input-data");
    private By passwordlocator6 = By.cssSelector("#password");
    private By messagelocator6 = By.id("error");

public MainPage(WebDriver driver){
    this.driver = driver;
    header = new HeaderPanel(driver);
}
public  void open(){
    driver.navigate().to(url);

}
public void locator3  (){
driver.findElement(emaillocator3).sendKeys("@");
driver.findElement(passwordlocator3).sendKeys("123");
resaultAssert();
}
    public void locator4  (){
        driver.findElement(emaillocator4).sendKeys("@");
        driver.findElement(passwordlocator4).sendKeys("123");
        resaultAssert();
}
    public void locator5  (){
        driver.findElement(emaillocator5).sendKeys("@");
        driver.findElement(passwordlocator5).sendKeys("123");
        resaultAssert();
}
    public void locator6  (){
        driver.findElement(emaillocator6).sendKeys("@");
        driver.findElement(passwordlocator6).sendKeys("123");
        resaultAssert();
}

   public void resaultAssert() {
        var resault6 = "Некорректный email или пароль";
        Assert.assertTrue("неверный текст", driver.findElement(messagelocator6).isDisplayed());
        Assert.assertEquals("Неверный текст", resault6, driver.findElement(messagelocator6).getText());


    }
}
