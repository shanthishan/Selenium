package ExampleofAnnotation;

import com.github.javafaker.Faker;
import com.github.javafaker.Number;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class MouseOver extends BaseClass {
    @Test
    public void mouse() throws InterruptedException {
        driver.get("https://www.shopclues.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
//        Alert alt=driver.switchTo().alert();
  //      alt.dismiss();
driver.findElement(By.xpath("//button[@class='moe-chrome-style-notification-btn moe-btn-close moe-block-class']")).click();
        WebElement Mobile = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
       WebElement realme=driver.findElement(By.xpath("(//ul[@class='list_blocks']/li)[4]"));
        Actions act = new Actions(driver);
        act.moveToElement(Mobile).perform();
        Thread.sleep(5000);
        realme.click();
        //div[@class='MegaDropdown-ContentHeading']
        //ul[@class='list_blocks']


    }
}
