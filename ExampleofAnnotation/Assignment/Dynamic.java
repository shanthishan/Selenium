package ExampleofAnnotation.Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class Dynamic extends BaseClass{
    @Test
    public void content() throws InterruptedException {
driver.get(" https://the-internet.herokuapp.com/dynamic_content");
driver.navigate().refresh();
String Parentwindow=driver.getWindowHandle();
System.out.println(Parentwindow);

Thread.sleep(2000);
    }
}
