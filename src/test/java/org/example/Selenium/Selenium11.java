package org.example.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium11 {
    @Test
    @Description("App.vwo.com Login Verify")
    public void Test11()
    {
        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");
        WebElement email=driver.findElement(By.id("login-username"));
        email.sendKeys("palak.dua16@gmail.com");
        WebElement pass=driver.findElement(By.id("login-password"));
        pass.sendKeys("abcd@1234");
        WebElement btn=driver.findElement(By.id("js-login-btn"));
        btn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement notify=driver.findElement(By.id("js-notification-box-msg"));
        String msg= notify.getText();
        Assert.assertEquals(msg,"Your email, password, IP address or location did not match");


        driver.quit(); // Stop the session and edge browser which is opened.


    }
}
