package COM.Ceptes.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	@BeforeMethod
	public void LaunchBrowsersNew () {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Dinesh\\Desktop\\Automation\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
	}

}
