package ExampleofAnnotation;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseClass {
    protected WebDriver driver;

    @BeforeSuite
    public void beforesuite() {
        System.out.println("Open Browser");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("Close Browser");
        driver.quit();
    }
}