package ExampleofAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.Set;

public class SelfTry extends BaseClass{
    @Test
    public void AddtoCart() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 13", Keys.ENTER);
        WebDriverWait wait= new WebDriverWait(driver,20);
        WebElement iphone=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='_4rR01T'])[1]")));
        iphone.click();
String Parent=driver.getWindowHandle();
System.out.println(Parent);
        Actions act=new Actions(driver);
        act.moveToElement(iphone).perform();
        Set<String> w=driver.getWindowHandles();
        for (String windows:w)
        {
        System.out.println(w);
        if(Parent.equals(w))
        {
            driver.switchTo().window(windows);
        }
        }
        Thread.sleep(2000);
        WebDriverWait wait1= new WebDriverWait(driver,20);
        //WebElement cart=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")));
        WebElement cart=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")));
        cart.click();


    }


    }

