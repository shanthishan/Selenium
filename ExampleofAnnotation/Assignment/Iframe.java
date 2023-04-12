package ExampleofAnnotation.Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Iframe extends  BaseClass{
    @Test
    public void frame() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.xpath("//body[@class='mce-content-body ']/p")).sendKeys("Hello selenium");
        Thread.sleep(2000);
    }
}
