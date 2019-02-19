package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BrowserClass
{
	/*****************************************************************/
	/*
	* This bellow function helps to open the Browser.
	* It's taking the url from configreaderclass.java and return the driver.
	* @author  Muni Mathur
	*/
	/*****************************************************************/
	@SuppressWarnings("deprecation")
	public static WebDriver BrowserDetails(String browser,WebDriver Driver) throws Exception
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		    //Incognito Mode
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("--incognito");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			
			capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
			capabilities.setJavascriptEnabled(true);
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			Driver = new ChromeDriver(capabilities);
			Driver.manage().deleteAllCookies();
			Thread.sleep(3000);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			//create firefox instance
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			Driver = new FirefoxDriver();
		}
		configreaderclass BC=new configreaderclass();
		String[] str=BC.configreader();
		Driver.get(str[0]);
		Driver.manage().window().maximize();
		return Driver;
	}
	/*****************************************************************/
	/*
	* End
	*/
	/*****************************************************************/
}
