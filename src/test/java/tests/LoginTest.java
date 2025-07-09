package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void testAmazonLoginPage() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("test@example.com");
        loginPage.clickContinue();

        Assert.assertTrue(loginPage.isPasswordFieldVisible(), "Password field should be visible after clicking continue.");

        // For demo only — do not use real credentials
        // loginPage.enterPassword("your_password");
        // loginPage.clickSignIn();
    }
}

