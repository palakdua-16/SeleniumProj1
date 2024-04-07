package org.example.Selenium.selenium24march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Checkboxes {
    @Test
    public void Test02()
    {
        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        WebElement c1=checkboxes.get(0);
        c1.click();






    }
}
