import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    @BeforeTest
    public void setWebDriver(){
        System.out.println("Ispis iz BeforeTest");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Ispis Before Method");
        WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
    }


}
