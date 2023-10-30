package Page.ObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.css.model.SelectorList;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SendUpdates_pageObject extends Pages
{

	public SendUpdates_pageObject(WebDriver driver)
	{
		super(driver);
		//Select selectOptions = new Select(optionlist);
	}
	@FindBy(id = "username")
	WebElement UserName;

	@FindBy(id = "password")
	WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement LoginButton;

	@FindBy(xpath = "//button[@type='button']")
	WebElement SkipButton;

	@FindBy(xpath= "(//td[@id='col-1']/div)[3]")
	WebElement TestEvent;

	@FindBy(xpath = "//span[contains(.,'Content')]")
	WebElement Content;

	@FindBy(linkText = "Send Updates")
	WebElement Send_UpdatesButton;

	@FindBy(xpath = "//div[@id='root']/div/div[5]/main/div[2]/section/div[2]/div/div/a/div/p")
	WebElement CreateNew;

	@FindBy(id = "appNotification")
	WebElement Notify_appNotification;

	@FindBy(id = "sms")
	WebElement Notify_smsNotification;

	@FindBy(id = "title")
	WebElement Title_Field;

	@FindBy(id = "title")
	WebElement Body_Field;

	//@FindBy(className = "Input_root__fi0ZK Input_selectInput__aHlvF")
	WebElement UserGroup;

	@FindBy(id = "multi-select-list")
	WebElement GroupSelect;

	@FindBy(xpath = "(//button[@type='button'])[12]")
	WebElement SendNow_Button;
	public void Loginpage(String UserNameField , String PasswordField )
	{
		setTextElementText(UserName, "nxttester");
		setTextElementText(Password, "nxt#qA@23");
		clickButton(LoginButton);
		clickButton(SkipButton);
		clickButton(TestEvent);
		clickButton(Content);
		clickButton(Send_UpdatesButton);
		clickButton(CreateNew);
		clickButton(Notify_appNotification);
		clickButton(Notify_smsNotification);
		setTextElementText(Title_Field, "Test");
		setTextElementText(Body_Field, "Test notification");
		clickButton(UserGroup);
		setTextElementText(GroupSelect, "Test");
		clickButton(SendNow_Button);

	}
}




