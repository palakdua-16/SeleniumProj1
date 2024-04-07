package org.example.Selenium.Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium14 {

    @Test
    public void Test14() throws InterruptedException {
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.ebay.com/");
        WebElement input=driver.findElement(By.xpath("//input[@id='gh-ac]"));
        input.sendKeys("macmini");
        WebElement searchbtn=driver.findElement(By.cssSelector("input[value='Search']"));
        searchbtn.click();
        Thread.sleep(4000);
        List<WebElement> headings=driver.findElements(By.className("s-item__title"));
        for (WebElement title:headings)
        {
            System.out.println(title.getText());
        }

    }
}
