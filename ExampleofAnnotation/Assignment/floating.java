package ExampleofAnnotation.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class floating extends BaseClass {
    @Test
    public void menu() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/floating_menu ");
        driver.manage().window().maximize();
        WebElement flo = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", flo);
        driver.findElement(By.xpath("//a[text()='Home']"));
        Thread.sleep(2000);
    }
}
