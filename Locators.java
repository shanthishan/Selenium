import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.List;

public class Locators {
    WebDriver driver;

    @BeforeSuite
    public void open()
    {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
    }
    @Test
    public void test()
    {
        driver.get("https://www.amazon.in/");
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Kids clothing",Keys.ENTER);
        //driver.findElement(By.name("field-keywords")).sendKeys("Footwear",Keys.ENTER);
        //driver.findElement(By.linkText("Amazon miniTV") ).sendKeys("Footwear",Keys.ENTER);
        //driver.findElement(By.partialLinkText("miniTV") ).sendKeys("Footwear",Keys.ENTER);
   /*List<WebElement> tags= driver.findElements(By.tagName("a"));

   for(int i=0;i< tags.size();i++)
   {
       System.out.println(tags.get(i).getText());

   }*/
       // driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Kidstoys",Keys.ENTER);
       // driver.findElement(By.xpath("//a[@class='nav-a  '])[3]")).sendKeys("bats",Keys.ENTER);
    //driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).click();
    //driver.findElement(By.xpath("//select[contains(@id,'searchDropdownBox')]")).click();
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords']")).sendKeys("kids",Keys.ENTER);
    }


}
