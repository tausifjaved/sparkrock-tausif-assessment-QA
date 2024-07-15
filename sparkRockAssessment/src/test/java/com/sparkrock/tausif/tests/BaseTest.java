package com.sparkrock.tausif.tests;

import com.sparkrock.tausif.utils.WebDriverManagerUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverManagerUtil.getDriver();
        driver.get("https://www.demoblaze.com/");
    }

    @AfterMethod
    public void tearDown() {
        WebDriverManagerUtil.quitDriver();
    }
}
