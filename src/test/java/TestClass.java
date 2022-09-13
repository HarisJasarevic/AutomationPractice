import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestClass extends BaseClass {

    WebDriver driver;
    String url = "http://automationpractice.com/index.php"; //registrovati, logovati i testirati

    @BeforeTest
    public void setWebDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    public void setUp2(){
        System.out.println("Ispis Before Class");
        //WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp1(){
        System.out.println("Ispis Before Method");
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("https://google.com");
        driver.quit();
    }

    @Test
    public void test2(){
        driver.get("https://yahoo.com");
        driver.quit();
    }

}
