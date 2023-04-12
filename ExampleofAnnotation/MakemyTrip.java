package ExampleofAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;

public class MakemyTrip extends BaseClass{
@Test
public void Trip() throws InterruptedException {
    driver.get("https://www.easemytrip.com/");
    driver.manage().window().maximize();
driver.findElement(By.id("pff")).click();
driver.findElement(By.id("a_FromSector_show")).sendKeys("Hyderabad");
    List< WebElement> list=driver.findElements(By.xpath("//ul[@class='ausuggest']/li"));
    System.out.println(list.size());

   for (WebElement src:list)
    {
        System.out.println(src.getText());
        /*if(src.getText().contains("Goa"))
        {
            src.click();
            break;
        }*/
    }
/* driver.findElement(By.xpath("//span[@class='lbl_input latoBold  appendBottom5']"));
  //driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Hyderabad");
    driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10']")).click();
    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
    driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[6]")).click();
    driver.findElement(By.xpath("//p[@class='latoBlack font12 greyText lineHeight16']")).click();
    driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[10]")).click();
    driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom5']")).click();
*/
    Thread.sleep(5000);







}}
