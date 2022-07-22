package PageObjekt;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {

        protected WebDriver driver;


        @Before

        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
            driver = new ChromeDriver();


        }

        @After
        public void tearDown() {
            driver.quit();

        }


    }
