package PageObjekt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPanel {
    private By buttonlocator3 = By.cssSelector(".form-submit");
    private By buttonlocator4 = By.cssSelector(".form-submit");
    private By buttonlocator5 = By.cssSelector(".form-submit");
    private By buttonlocator6 = By.cssSelector(".form-submit");



    private WebDriver driver;
    public HeaderPanel(WebDriver driver){
this.driver = driver;
    }

    public void sendKeysLocator3(){driver.findElement(buttonlocator3).click();}
    public void sendKeysLocator4(){driver.findElement(buttonlocator4).click();}
    public void sendKeysLocator5(){driver.findElement(buttonlocator5).click();}
    public void sendKeysLocator6(){driver.findElement(buttonlocator6).click();}



}
