package ExampleofAnnotation;

import ExampleofAnnotation.BaseClass;
import org.testng.annotations.Test;

public class TestCase02AmZ extends BaseClass
{
    @Test
    public void Amazon()
    {
        driver.get("https://www.amazon.in/");
    }
}
