package ExampleofAnnotation;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Screenshot extends BaseClass{
    @Test
    public void screen() throws IOException {
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(ss,new File("data/myntra.png"));

    }
}
