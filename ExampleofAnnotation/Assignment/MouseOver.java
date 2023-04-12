package ExampleofAnnotation.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class MouseOver extends BaseClass{
    @Test
    public void over() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/hovers ");
        driver.manage().window().maximize();
        WebElement img=driver.findElement(By.xpath("(//div[@class='figure'])[1]"));
        WebElement img1=driver.findElement(By.xpath("(//div[@class='figure'])[2]"));
        WebElement img2=driver.findElement(By.xpath("(//div[@class='figure'])[3]"));
        Actions act=new Actions(driver);
        act.moveToElement(img).perform();
        act.moveToElement(img1).perform();
        act.moveToElement(img2).perform();

Thread.sleep(2000);

        img.click();
       //boolean imagepresent=image.isDisplayed();
        //assertTrue("NotFound",imagepresent);
      // act.moveToElement(img1).perform();
      // act.moveToElement(img2).perform();

        Thread.sleep(2000);

    }
}
