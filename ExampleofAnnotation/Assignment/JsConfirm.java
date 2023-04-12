package ExampleofAnnotation.Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.image.Kernel;
import java.security.Key;

public class JsConfirm extends BaseClass{
    @Test
    public void button() throws InterruptedException {
        driver.get(" https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert  act=driver.switchTo().alert();
        System.out.println(act.getText());
        act.sendKeys("hello");
        act.accept();
        String text=driver.findElement(By.id("result")).getText();
        System.out.println(text);

        Thread.sleep(2000);

    }
}
