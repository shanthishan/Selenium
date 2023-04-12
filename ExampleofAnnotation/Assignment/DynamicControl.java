package ExampleofAnnotation.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControl extends BaseClass{
@Test
public void control()
{
    driver.get(" https://the-internet.herokuapp.com/dynamic_controls");
    driver.findElement(By.xpath("//button[text()='Remove']")).click();
    WebDriverWait wait=new WebDriverWait(driver,15);
    WebElement checkbox=wait.until(ExpectedConditions.elementToBeClickable(By.id("message")));
    Assert.assertEquals(checkbox.getText(),"It's gone!");
}}
