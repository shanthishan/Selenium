import ExampleofAnnotation.BaseClass;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.beans.Transient;

public class DragNDrop extends BaseClass {
@Test
    public void  drop() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        WebElement src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        WebElement des2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
       WebElement src= driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
        WebElement des=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        WebElement src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
        WebElement des3=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
        WebElement des1=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
        Actions act=new Actions(driver);
        act.dragAndDrop(src1,des2).perform();
     act.dragAndDrop(src,des).perform();
        act.dragAndDrop(src2,des3).perform();
        act.dragAndDrop(src,des1).perform();
        Thread.sleep(10000);


    }
}
