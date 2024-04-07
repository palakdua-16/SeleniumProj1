package org.example.Selenium.selenium24march;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SELNIUM2Actionalerts {
    @Test
    public void Test2()
    {
        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
      //  //button[@onclick="jsAlert()"]
        //  //button[text="Click for JS Alert"]
        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        button.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebElement text= driver.findElement(By.id("result"));
        Assert.assertEquals(text,"You successfully clicked an alert");
        WebElement button2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        button2.click();
        Alert alert2=driver.switchTo().alert();
        alert2.accept();
        alert2.dismiss();
        Assert.assertEquals(text,"You clicked: Ok");
        WebElement button3 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        button3.click();
        Alert alert3=driver.switchTo().alert();
        alert3.sendKeys("Palak");
        WebElement result= driver.findElement(By.id("result"));
        Assert.assertEquals(result,"You entered: Palak");










    }
}