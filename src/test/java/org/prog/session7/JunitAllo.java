package org.prog.session7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class JunitAllo {
    private WebDriver driver;

    @BeforeSuite
    public void initWebDriver(){
        driver = new ChromeDriver();
    }

    @Test
    public void myAlloTest(){
        driver.get("https://allo.ua");
        WebElement search = driver.findElement(By.cssSelector("input#search-form__input.search-form__input"));
        search.sendKeys("IPhone 16");
        search.sendKeys(Keys.ENTER);
        driver.quit();
    }
}
