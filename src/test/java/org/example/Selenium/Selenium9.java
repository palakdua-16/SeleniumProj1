package org.example.Selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class Selenium9 {

    @Test
    public void Test2()
    {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://binge.com");
        driver.navigate().to("https://app.vwo.com");
       // driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
