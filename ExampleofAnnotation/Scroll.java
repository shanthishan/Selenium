package ExampleofAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scroll extends BaseClass{
    @Test
    public void down() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.manage().window().maximize();
        WebElement Wholesale=driver.findElement(By.xpath("//a[text()='Flipkart Wholesale']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Wholesale);
        Thread.sleep(2000);
        }
}
