package org.prog.session8;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.session8.page.AlloPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AlloPageTest {
    private WebDriver driver;
    private AlloPage alloPage;

    @BeforeSuite
    public void initWebDriver() {
        driver = new ChromeDriver();
        alloPage = new AlloPage(driver);
    }

    @Test
    public void myAlloTest() {
        alloPage.loadPage();
        alloPage.searchForSomething("Iphone");
        alloPage.searchForSomething("Sumsung");
        Assertions.assertTrue(alloPage.isHryvniaSign("₴"));
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}


