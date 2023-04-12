package ExampleofAnnotation.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class Assignment1 extends BaseClass{
    @Test
    public void amazon() throws InterruptedException {
      driver.get("https://www.amazon.in/");
      driver.manage().window().maximize();
   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13mini 256gb",Keys.ENTER);

      WebElement iphone=driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Mini (256GB) - Starlight']"));
      WebElement price=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
                    String i= price.getText();
                    int j= Integer.parseInt(i);
        System.out.println("price in amazon :" +j);
       Actions act= new Actions(driver);
       act.moveToElement(iphone).build().perform();
    driver.navigate().to("https://www.flipkart.com");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
       driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 13mini 256gb",Keys.ENTER);
       Thread.sleep(2000);
       WebElement phone=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 mini (Starlight, 256 GB)']"));
       WebElement price1=driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]"));
        act.moveToElement(phone).build().perform();
        String k=price1.getText();
        int l=Integer.parseInt(k);
       System.out.println("Price in flipkart:"+l);
       if(j>l)
       {
           System.out.println("go for flipkart");
       }
else
       {
           System.out.println("go for amazon");
       }




        Thread.sleep(8000);


    }
}
