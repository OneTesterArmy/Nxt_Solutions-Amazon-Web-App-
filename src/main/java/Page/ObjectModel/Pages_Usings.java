package Page.ObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.*;

public class Pages_Usings {
	
	protected WebDriver driver;
	public Pages_Usings (WebDriver driver)
	
	{
PageFactory.initElements(driver, this);

}
}
