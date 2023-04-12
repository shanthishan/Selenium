package ExampleofAnnotation.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.Set;

public class Assignment2 extends BaseClass{
    @Test
    public void club() throws InterruptedException {
        driver.get(" https://www.tripadvisor.in");
        driver.manage().window().maximize();
        String Parentwindow = driver.getWindowHandle();
        String PatrentTitle = driver.getTitle();
        driver.findElement(By.xpath("(//input[@class='qjfqs _G B- z _J Cj R0'])[2]")).sendKeys("Club Mahindra", Keys.ENTER);

        System.out.println(Parentwindow);
        System.out.println(PatrentTitle);
        driver.findElement(By.xpath("//span[text()='Club Mahindra Madikeri, Coorg']")).click();
        Set<String> windows = driver.getWindowHandles();
        for (String w : windows) {
            System.out.println(w);
            driver.switchTo().window(w);
        }
        driver.findElement(By.xpath("(//span[@class='biGQs _P ttuOS'])[1]")).click();
        WebElement rating = driver.findElement(By.xpath("(//label[@class='_S'])[5]"));
        Actions act = new Actions(driver);
        act.moveToElement(rating).perform();
        WebElement drop = driver.findElement(By.xpath("(//span[@class='biGQs _P vvmrG'])[1]"));
        drop.click();
        Select sel = new Select(drop);
        sel.selectByVisibleText("January 2023");
        driver.findElement(By.xpath("//span[text()='Couples']")).click();
        driver.findElement(By.xpath("(//div[@class='biGQs _P TInKc'])[1]")).sendKeys("qwertyuiop[]asdfghjkl;'zxcvb nm,.fghjkl;edrftgbhnjmk,lwsedrftgyhujikoldxcfvgbhnjkm,lzsxdcfgvbhnj m,sxdcfgvbh nm,xdcfgvbh nmdrftgvbhnjkmdxcfgvbhnjkm,dxcfgvbhnjkmxdcfgvbhnjmdxcfgvbhnj mdxcfgvbhnjmxdcfvbnm");
        driver.findElement(By.xpath("(//div[@class='biGQs _P TInKc'])[2]")).sendKeys("qwertyuiop[asdfghjk,.wertyuiol;sdfghjkl sdfghjkxcvbnm,sdfghjkm,wertyuikxcvbnm,erftghyjkcvbnm,erftghyjklxcvbnm,sdfghjkldf");
        driver.findElement(By.xpath("//button[@class='rmyCe _G B- z _S c Wc wSSLS w pexOo sOtnj']")).click();


        Thread.sleep(10000);
    }

    }
