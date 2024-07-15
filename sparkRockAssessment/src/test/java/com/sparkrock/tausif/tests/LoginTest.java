package com.sparkrock.tausif.tests;

import com.sparkrock.tausif.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginLink();
        loginPage.enterUsername("admin"); // valid user
        loginPage.enterPassword("admin"); // valid pass
        loginPage.clickLoginButton();

        // Assuming the successful login shows logout link
        Assert.assertTrue(loginPage.isLogoutDisplayed());
    }

    @Test
    public void testUnsuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginLink();
        loginPage.enterUsername("invalidUser");
        loginPage.enterPassword("invalidPassword");
        loginPage.clickLoginButton();

        // Handle the alert and check for error message, and make sure URL remains same
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.demoblaze.com/");
    }
}
