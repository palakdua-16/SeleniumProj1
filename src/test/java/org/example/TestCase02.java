package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase02 {

    @Test
    public void gettitle()
    {
        WebDriver driver=new EdgeDriver();
        driver.get("https://thetestingacademy.com");
        System.out.println(driver.getTitle());
    }
}

