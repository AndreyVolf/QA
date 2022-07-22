package PageFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase2 {

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
