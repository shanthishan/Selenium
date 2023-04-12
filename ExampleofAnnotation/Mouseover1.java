package ExampleofAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouseover1 extends BaseClass{
    @Test
    public void myntra() throws InterruptedException {
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
      WebElement kids= driver.findElement(By.xpath("(//div[@class='desktop-navContent'])[3]"));
        WebElement choli=driver.findElement(By.xpath("//a[text()='Lehenga choli']"));

        Actions act= new Actions(driver);
        act.moveToElement(kids).perform();
      Thread.sleep(2000);
      choli.click();
    }
}
