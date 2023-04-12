package ExampleofAnnotation;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookForm extends BaseClass{
    @Test
    public void Book() throws InterruptedException {
        driver.get("https://www.facebook.com/campaign/landing.php?");
        driver.manage().window().maximize();
        Faker fak=new Faker();
        String firstname=fak.name().firstName();
        String lastname=fak.name().lastName();
        String email=firstname + "@gmail.com";
        String Mobile=fak.number().digits(10);
        driver.findElement(By.name("firstname")).sendKeys(firstname);
        driver.findElement(By.name("lastname")).sendKeys(lastname);
        driver.findElement(By.name("reg_email__")).sendKeys(email);
        driver.findElement(By.name("reg_passwd__")).sendKeys("1234");
        WebElement day=driver.findElement(By.name("birthday_day"));
        WebElement month=driver.findElement(By.name("birthday_month"));
        WebElement year=driver.findElement(By.name("birthday_year"));
        Select sel=new Select(day);
        sel.selectByValue("6");
        Select sel1=new Select(month);
        sel1.selectByIndex(11);
        Select sel2=new Select(year);
        sel2.selectByVisibleText("1993");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        Thread.sleep(5000);
    }
}
