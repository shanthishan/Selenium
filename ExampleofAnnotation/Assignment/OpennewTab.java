package ExampleofAnnotation.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.util.Set;

public class OpennewTab extends BaseClass {
    @Test
    public void tab() throws InterruptedException {
        driver.get(" https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        String Parentwindow = driver.getWindowHandle();
        String ActualTitle = driver.getTitle();
        System.out.println(ActualTitle);
        String ExpectedTitle = "New Window";
        System.out.println(ExpectedTitle);
        Assert.assertNotEquals(ExpectedTitle, ActualTitle);
        Set<String> windows = driver.getWindowHandles();
        for (String w : windows) {
            if (!w.equalsIgnoreCase(Parentwindow)) {
                System.out.println(w);
                driver.switchTo().window(w);
            }
            Thread.sleep(2000);
            //sleep

        }

    }
}
