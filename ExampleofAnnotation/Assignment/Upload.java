package ExampleofAnnotation.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.Key;

public class Upload extends BaseClass{
    @Test
    public void File() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\shant\\OneDrive\\Desktop\\facebook form\\facebookform.png");
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(2000);
    }
}
