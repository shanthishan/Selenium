package ExampleofAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Redbus extends BaseClass
    {
        @Test
        public void Amazon() throws InterruptedException {
            driver.get("https://www.redbus.in/online-booking/apsrtc?gclid=EAIaIQobChMIn6fn_pPH_QIVI4ZLBR3ibwhwEAAYASAAEgL1WPD_BwE");
        driver.findElement(By.xpath("//input[@id='txtSource']")).sendKeys("Hyderabad", Keys.ENTER);
       driver.findElement(By.xpath("//input[@id='txtDestination']")).sendKeys("Thanjavur", Keys.ENTER);
      // driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).sendKeys("06/10/2023", Keys.ENTER);
        driver.findElement(By.id("txtOnwardCalendar")).click();
            WebElement Month=driver.findElement(By.id("rb-next-middle"));
          //  WebElement date=driver.findElement(By.xpath("//ul[@class='rb-calendar-days']/li[19]"));
            Select se=new Select(Month);
           se.selectByVisibleText("December");
            //Select se1=new Select((date));
            //se1.selectByValue("17");

            Thread.sleep(5000);


           Thread.sleep(2000);



        }
    }

