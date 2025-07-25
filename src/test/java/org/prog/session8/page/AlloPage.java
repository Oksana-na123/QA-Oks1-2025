package org.prog.session8.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlloPage {

    private  WebDriver driver;
    public AlloPage (WebDriver driver) {
        this.driver = driver;
    }
        public void myAlloTest() {
            driver = new ChromeDriver();
        }

        public void loadPage() {
            driver.get("https://allo.ua");
        }
        public void searchIphone(){
            WebElement search = driver.findElement(By.id("search-form__input"));
            search.sendKeys("IPhone 16");
            search.sendKeys(Keys.ENTER);
        }
    }


