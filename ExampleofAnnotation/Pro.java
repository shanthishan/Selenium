package ExampleofAnnotation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Pro extends BaseClass
{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        //alt.accept();
       driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert alt =driver.switchTo().alert();
        alt.dismiss();
       alt.getText();
       /*driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        alt.sendKeys("no");
        alt.accept();*/


        Thread.sleep(2000);


    }
}
