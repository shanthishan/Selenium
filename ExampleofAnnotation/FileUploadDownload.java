package ExampleofAnnotation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;




public class FileUploadDownload extends BaseClass
{
    @Test
    public void test() throws InterruptedException {
       // driver.get("https://the-internet.herokuapp.com/download");
        //driver.findElement(By.xpath("//a[text()='LambdaTest.txt']")).click();
        driver.get("https://the-internet.herokuapp.com/upload");
        //driver.findElement(By.id("file submit")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\shant\\IdeaProjects\\ExcelREAding\\Data\\Book1.xlsx");
driver.findElement(By.id("file-submit")).click();
  Thread.sleep(2000);


    }
}
