package ExampleofAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandle extends BaseClass{
    @Test
    public void Handle() throws InterruptedException {
        driver.get("https://canarabank.com/");
driver.manage().window().maximize();
String ParentWindow=driver.getWindowHandle();
String ParentTitle= driver.getTitle();
System.out.println("parent id"+ParentWindow);
System.out.println("Parent title"+ParentTitle);

WebElement log=driver.findElement(By.xpath("//div[@class='icon box-icon-noun_103186']"));
        Actions act=new Actions(driver);
        act.moveToElement(log).perform();
        driver.findElement(By.xpath("//a[text()='Net Banking']")).click();
        Set<String> windowsid=driver.getWindowHandles();
        for (String id:windowsid ) {
            System.out.println(id);
            if(ParentWindow.equals(id))
            {

            }
else{
                driver.switchTo().window(id);

            }

        }



        Thread.sleep(2000);


    }
}
