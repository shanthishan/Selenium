package ExampleofAnnotation.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Notify extends BaseClass{
    @Test
    public void message() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
        WebElement clk=driver.findElement(By.xpath("//a[text()='Click here']"));
        Actions act= new Actions(driver);
        act.doubleClick(clk).perform();
        String Expected="Action unsuccesful, please try again";
     String Actual=driver.findElement(By.xpath("//div[@class='flash notice']")).getText();

        assertEquals(Expected,Actual);
Thread.sleep(2000);
    }
}
