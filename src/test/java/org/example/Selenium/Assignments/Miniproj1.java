package org.example.Selenium.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Miniproj1 {

    @Test
    public void MiniProj1()
    {
        WebDriver driver=new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement btn=driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        btn.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]/div/div/div[1]/h2")));
        WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("John Doe");
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("ThisIsNotAPassword");
        WebElement btnlogin=driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        btnlogin.click();
        WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"appointment\"]/div/div/div/h2")));
        WebElement h2=driver.findElement(By.xpath("//*[@id=\"appointment\"]/div/div/div/h2"));
        Assert.assertEquals("Make Appointment",h2.getText());
        WebElement element=driver.findElement(By.id("combo_facility"));
        Select select=new Select(element);
        select.selectByIndex(1);
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        WebElement c1=checkboxes.get(0);
        c1.click();
        WebElement radio=driver.findElement(By.xpath("//input[@id='radio_program_medicare']"));
        radio.click();
        WebElement date=driver.findElement(By.xpath("//*[@id=\"txt_visit_date\"]"));
        date.sendKeys("18/01/2024");
        WebElement txt=driver.findElement(By.xpath("//textarea[@id='txt_comment']"));
        txt.sendKeys("Hi");
        WebElement bookbtn=driver.findElement(By.xpath("//*[@id=\"btn-book-appointment\"]"));
        bookbtn.click();
        WebDriverWait wait3=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"summary\"]/div/div/div[1]/h2")));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"summary\"]/div/div/div[1]/h2")));

    }
}
