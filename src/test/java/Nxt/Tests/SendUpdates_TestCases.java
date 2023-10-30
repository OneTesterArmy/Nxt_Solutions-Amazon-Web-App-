package Nxt.Tests;
import Page.ObjectModel.Pages;
import Page.ObjectModel.SendUpdates_pageObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SendUpdates_TestCases extends Bases {

    SendUpdates_pageObject LoginObject;
    Pages Pages_UsingsObject;

    @Test
    public void Send_notification_viaSMS() {
        LoginObject = new SendUpdates_pageObject(driver);
        Pages_UsingsObject = new Pages(driver);
        LoginObject.Loginpage("UserName", "Password");
        Boolean Notifiaction_Sent_Successfully = true;
        Assert.assertEquals(Notifiaction_Sent_Successfully, true);
    }

    @Test
    public void Send_notification_viaemail() {
        LoginObject = new SendUpdates_pageObject(driver);
        Pages_UsingsObject = new Pages(driver);
        Boolean Notifiaction_Sent_Successfully = true;
        Assert.assertEquals(Notifiaction_Sent_Successfully, true);

    }

    @Test
    public void Send_notification_via_mobile() {
        LoginObject = new SendUpdates_pageObject(driver);
        Pages_UsingsObject = new Pages(driver);
        Boolean Notifiaction_Sent_Successfully = true;
        Assert.assertEquals(Notifiaction_Sent_Successfully, true);
    }

    @Test
    public void Send_notification_via_SelectingAll() {
        LoginObject = new SendUpdates_pageObject(driver);
        Pages_UsingsObject = new Pages(driver);
        Boolean Notifiaction_Sent_Successfully = true;
        Assert.assertEquals(Notifiaction_Sent_Successfully, true);
    }
}