package ExampleofAnnotation.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ssample extends  BaseClass{
    @Test
    public void sam() throws InterruptedException {
        driver.get("https://www.tripadvisor.in/UserReviewEdit-g641714-d1156207-Club_Mahindra_Madikeri_Coorg-Madikeri_Kodagu_Coorg_Karnataka.html");
        WebElement drop= driver.findElement(By.xpath("(//span[@class='biGQs _P vvmrG'])[1]"));
        drop.click();
        Select sel=new Select(drop);
        sel.selectByVisibleText("January 2023");
        Thread.sleep(10000);}
}
