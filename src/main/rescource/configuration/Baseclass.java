package configuration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utility.BaseFunctions;

public class Baseclass extends BaseFunctions
{	
	
	/*****************************************************************/
	/*
	* This bellow function helps to open the Browser.
	* It's taking the browser name from configreaderclass.java and pass parameter to browser class.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	@BeforeMethod
	public static void OpenBrowser() throws Exception
	{
		configreaderclass BC=new configreaderclass();
		String[] str2=BC.configreader();
		Driver=BrowserClass.BrowserDetails(str2[1], Driver);
	}
	/*****************************************************************/
	/*
	* End
	*/
	/*****************************************************************/
	/*****************************************************************/
	/*
	* This bellow function helps to close the Browser.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	@AfterMethod
	public static void closebrowser() throws Exception
	{
		Driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		Driver.close();	
	}
	/*****************************************************************/
	/*
	* End
	*/
	/*****************************************************************/
	
}
