package org.example.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium6 {


    @Test
    public void Test2()
    {
        WebDriver driver=new EdgeDriver();
        WebDriver driver2=new EdgeDriver();
        //2 browsers will open

        driver.get("https://sdet.live"); // https is important
    }
}
