package org.example.Selenium.selenium24march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumModals {

    @Test
    public void Test02()
    {
        WebDriver driver=new EdgeDriver();
        driver.get("https://makemytrip.com/");
        WebDriverWait  wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='description']")));

        driver.findElement(By.cssSelector("div[class='description']")).click();




    }
}
