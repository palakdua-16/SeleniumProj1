package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium13 {

    @Test
    public void Test13()
    {
        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");
        List<WebElement> atags=driver.findElements(By.tagName("a"));
        for (WebElement element : atags) {
            System.out.println("A tag text:" + element.getText());
        }
            

    }

}
