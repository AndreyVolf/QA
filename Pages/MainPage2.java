package Pages;
import PageObjekt.HeaderPanel;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage2 {
    private WebDriver driver;
    public HeaderPanel header2;
    private String url = "http://qajava.skillbox.ru/module04/homework/auth/changed.html";



    @FindBy(css =  ".form-input.input-data")
    public WebElement email;

    @FindBy(css =  ".form-input.password")
    public WebElement password;

    @FindBy(css =  "input.form-input.input-data")
    public WebElement email2;

    @FindBy(css =  "input.form-input.password")
    public WebElement password2;

    @FindBy(css =  "#email")
    public WebElement email3;

    @FindBy(css =  "#password")
    public WebElement password3;

    @FindBy(css =  "input#email.form-input.input-data")
    public WebElement email4;

    @FindBy(css =  "#password")
    public WebElement password4;


public MainPage2(WebDriver driver){
    this.driver = driver;
    header2 = new HeaderPanel(driver);
    PageFactory.initElements(driver, this);
}
public  void open(){
    driver.navigate().to(url);

}




}
