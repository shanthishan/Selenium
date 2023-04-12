package ExampleofAnnotation;

import com.github.javafaker.Faker;
import com.github.javafaker.Number;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registrationform  extends BaseClass
{
    @Test
    public void test()
    {
        Faker fake=new Faker();
        String firstName=fake.name().firstName();
        String lastName=fake .name().lastName();
        String email=firstName + "@gmail.com";
        String mobile=fake.number().digits(10);
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
       driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("userEmail")).sendKeys(email);
        driver.findElement(By.name("gender")).click();
        driver.findElement(By.id("userNumber")).sendKeys(mobile);
        driver.findElement(By.id("dateOfBirthInput")).click();
        WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select se=new Select(month);
        se.selectByVisibleText("October");
        Select se1=new Select(year);
        se1.selectByValue("1993");
        driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--006 react-datepicker__day--selected']")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
