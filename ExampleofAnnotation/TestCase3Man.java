package ExampleofAnnotation;

import ExampleofAnnotation.BaseClass;
import org.testng.annotations.Test;

public class TestCase3Man extends BaseClass {
    @Test
    public void Mantra()
    {
        driver.get("https://www.myntra.com/");    }
}
