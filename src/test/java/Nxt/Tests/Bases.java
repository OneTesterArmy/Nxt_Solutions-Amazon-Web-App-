package Nxt.Tests;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterSuite;

public class Bases
{

	public static WebDriver driver;



	@BeforeSuite
	@Parameters(("browser"))
	public void startDriver(@Optional ("chrome") String browserName)
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			System.setProperty("webdriver.http.factory", "jdk-http-client");

			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("MicrosoftEdge")) {
			System.setProperty("InternetExplorerDriver.driver", System.getProperty("user.dir")+"drivers/InternetExplorerDriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		driver.navigate().to("https://qa-test-frontend-ce07bae316f3.herokuapp.com/");
	}
	@AfterSuite
	public void StopDriver()
	{
		//driver.quit();
	}
}

