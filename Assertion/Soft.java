package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft {
    @Test
    public void Soft()
    {
        String expected="login page";
        SoftAssert sa= new SoftAssert();
        sa.assertEquals(expected,"home page");
        //evem though error the code will be executed
        System.out.println("end");
        String str="login page";
        Assert.assertTrue(str.contains("home"));

        //sa.assertAll();
    }
}
