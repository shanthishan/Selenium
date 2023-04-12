package ExampleofAnnotation.Assignment;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsAl extends BaseClass
{
    @Test
    public void JS() throws InterruptedException {
        driver.get(" https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        //driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        //driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert  act=driver.switchTo().alert();
        String Actualtext=act.getText();
        //System.out.println(act.getText());
        //act.sendKeys("hello");
        act.accept();
        String Exptext="I am a JS Alert";
        Assert.assertEquals(Exptext,Actualtext);

        Thread.sleep(2000);
    }
}
