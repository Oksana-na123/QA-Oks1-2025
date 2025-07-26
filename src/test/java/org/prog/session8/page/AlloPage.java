package org.prog.session8.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlloPage {

    private WebDriver driver;

    public AlloPage(WebDriver driver) {
        this.driver = driver;
    }

    public void myAlloTest() {
        driver = new ChromeDriver();
    }

    public void loadPage() {
        driver.get("https://allo.ua");
    }

    public void searchForSomething(String s) {
        WebElement search = driver.findElement(By.id("search-form__input"));
        search.sendKeys(s);
        search.sendKeys(Keys.ENTER);

    }



   public boolean isHryvniaSign(String c) {
       WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement hryvniaSing = driver.findElement(By.className(c));
        if(hryvniaSing.getText().contains(c)) {
            return true;
        } else {

           return false;
       }



    }

}






