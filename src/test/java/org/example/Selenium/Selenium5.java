package org.example.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium5 {

    @Test
    public void Test1()
    {
        EdgeOptions edgeOptions=new EdgeOptions();
        //edgeOptions.addArguments("--headless=new");
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addExtensions(new File("/Users/palak/Downloads/AdBlock.crx"));
        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");
    }
}
