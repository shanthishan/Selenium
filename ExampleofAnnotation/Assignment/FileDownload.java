package ExampleofAnnotation.Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FileDownload extends BaseClass{
    @Test
    public void Download() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[text()='alexander-ramsey-lrE0O_e8-Do-unsplash.jpg']")).click();
        Thread.sleep(2000);
    }
}
