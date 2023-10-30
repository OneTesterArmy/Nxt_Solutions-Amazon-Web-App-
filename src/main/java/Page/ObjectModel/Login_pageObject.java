package Page.ObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pageObject extends Pages
{

	public Login_pageObject(WebDriver driver)
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
	public void Loginpage(String UserNameField , String PasswordField )
	{
		setTextElementText(UserName, "nxttester");
		setTextElementText(Password, "nxt#qA@23");
		clickButton(LoginButton);
		clickButton(SkipButton);
	}
}




