package Master_File_Maintenance.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class sitesMaster extends BaseFunctions {
	
	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/*************************************************/
	 
	WebDriver Driver;
	public sitesMaster(WebDriver Ldriver) 
	{
		this.Driver=Ldriver;
	}
	/*****************************************************************/
	/*
	* End
	*/
	/*****************************************************************/
	
		
	
	/*****************************************************************/
	/*
	* This is the  Xpath  for Sites Maintenance file Page Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Sites')]")
	@CacheLookup
	 WebElement sites;
	
	public void sites_Maintenance_Click() 
	{
		waitForPageLoad(Driver, sites);
		HighlightOnElement(sites);
		mouseClick(sites);
	}
	
	/*****************************************************************/
	/*
	* These are the list of the Xpath  for Sites Maintenance file Page Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/

	@FindBy(xpath="//input[@id='siteCode']")
	@CacheLookup
	WebElement siteCode;
	
	public void site_Code(String str) 
	{
		HighlightOnElement(siteCode);
		siteCode.sendKeys(str);
	}
	
	
	@FindBy(xpath="//input[@id='siteDesc']")
	@CacheLookup
	WebElement siteDesc;
	
	public void site_Description(String str) 
	{
		HighlightOnElement(siteDesc);
		siteDesc.sendKeys(str);
	}

	public void site_Elements_Master() throws Exception 
	   
	   {
		  
		   sites_Maintenance_Click();
		   Thread.sleep(3000);
		   
		   site_Code(Integer.toString(12));
		   site_Description(Integer.toString(72));
		}
	   
	
}
