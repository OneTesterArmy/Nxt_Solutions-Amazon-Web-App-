package Nxt.Tests;

import org.testng.annotations.Test;
import Page.ObjectModel.Login_pageObject;
import org.testng.Assert;
import Page.ObjectModel.Pages;

public class Login_TestCases extends Bases
{

    Login_pageObject LoginObject;
    Pages Pages_UsingsObject;

    @Test
    public void Login_with_valid_credinitals()
    {
        LoginObject = new Login_pageObject(driver);
        Pages_UsingsObject = new Pages(driver);
        LoginObject.Loginpage("UserName", "Password");
        Boolean LoginSuccessful = true;
        Assert.assertEquals(LoginSuccessful, true);
    }
}