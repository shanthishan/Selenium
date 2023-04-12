package Wait;

import ExampleofAnnotation.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWait extends BaseClass {
    @Test
    public void implict()
    {
       //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.get("https://www.google.com/");
        //driver.findElement(By.id("abc"));
        // ImplicitWait wait is to give particular time, element to be appear.
        //Explicitwait wait for a particular element to be appear.
        driver.get("https://www.redbus.in/bus-tickets/hyderabad-to-chennai");
driver.findElement(By.xpath("//div[@class='onward-modify-btn g-button clearfix fl']")).click();
        WebDriverWait wait= new WebDriverWait(driver,20);
        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='SEARCH']")));
        String bus=driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
        System.out.println(bus);


         }
}
