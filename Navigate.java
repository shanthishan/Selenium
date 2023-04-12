import org.testng.annotations.Test;

public class Navigate extends  BaseClass1{
    @Test
    public void amazon() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        driver.get("https://www.flipkart.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(2000);
        //driver
    }
}
