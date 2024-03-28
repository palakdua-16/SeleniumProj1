package org.example.Selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium10 {

    @Test
    public void Test10()
    {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");
        String URL=driver.getCurrentUrl();
        System.out.println(URL);
        String result="https://app.vwo.com/#/login";
        Assert.assertEquals(URL,result);

    }
}
