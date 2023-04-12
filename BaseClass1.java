import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass1 {
    WebDriver driver;

    @BeforeSuite
    public void open()
    {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
    }
    @Test
    public void test()
    {
        driver.get("https://www.flipkart.com/");
    }
    @AfterSuite
    public void close()
    {
        driver.quit();
    }
}