package org.example.Selenium.selenium24march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//URL USED IN THIS---->https://the-internet.herokuapp.com/dropdown
public class Selenium1 {

    @Test
    public void testcase() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement element=driver.findElement(By.id("dropdown"));
        Select select=new Select(element);
        select.selectByIndex(1);
        Thread.sleep(1000);


    }
}
