package Master_File_Maintenance.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class warehouseLocation extends BaseFunctions
{
	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/*************************************************/
	 
	WebDriver Driver;
	public warehouseLocation(WebDriver Ldriver) 
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
	* These are the list of the Xpath  for Warehouse Locations file Page Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Warehouse Locations')]")
	@CacheLookup
	 WebElement warehouseLocations;
	
	public void warehouse_Locations_Maintenance_Click() 
	{
		waitForPageLoad(Driver, warehouseLocations);
		HighlightOnElement(warehouseLocations);
		mouseClick(warehouseLocations);
	}

	
	/*****************************************************************/
	/*
	* These are the list of the Xpath  for Warehouse Locations file Page Screen.
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
	
	

	@FindBy(xpath="//input[@id='locCode']")
	@CacheLookup
	WebElement warehouselocCode;
	
	public void warehouse_Location_Code(String str) 
	{
		HighlightOnElement(warehouselocCode);
		warehouselocCode.sendKeys(str);
	}
	

	@FindBy(xpath="//input[@id='locName']")
	@CacheLookup
	WebElement locName;
	
	public void warehouse_Location_Name(String str) 
	{
		HighlightOnElement(locName);
		locName.sendKeys(str);
	}
	

	@FindBy(xpath="//input[@id='locType']")
	@CacheLookup
	WebElement locType;
	
	public void location_Type(String str) 
	{
		HighlightOnElement(locType);
		locType.sendKeys(str);
	}
	

	@FindBy(xpath="//input[@id='receiptsAllowed']")
	@CacheLookup
	WebElement receiptsAllowed;
	
	public void receipts_Allowed(String str) 
	{
		HighlightOnElement(receiptsAllowed);
		receiptsAllowed.sendKeys(str);
	}
	

	@FindBy(xpath="//input[@id='issuesAllowed']")
	@CacheLookup
	WebElement issuesAllowed;
	
	public void issues_Allowed(String str) 
	{
		HighlightOnElement(issuesAllowed);
		issuesAllowed.sendKeys(str);
	}
	
	
	@FindBy(xpath="//input[@id='incQtyAvailable']")
	@CacheLookup
	WebElement incQtyAvailable;
	
	public void include_Qty_Available(String str) 
	{
		HighlightOnElement(incQtyAvailable);
		incQtyAvailable.sendKeys(str);
	}
	
	
	 public void ware_House_Elemenst() throws Exception 
	   {
		  
		  warehouse_Locations_Maintenance_Click();
		  Thread.sleep(3000);
		   site_Code(Cellread("Warehouse Location",1, 0));
		   warehouse_Location_Code(Cellread("Warehouse Location",1,1));
		   warehouse_Location_Name(Cellread("Warehouse Location",1,2));
		   location_Type(Cellread("Warehouse Location",1, 3));
		   receipts_Allowed(Cellread("Warehouse Location",1,4));
		   issues_Allowed(Cellread("Warehouse Location",1,5));
		   include_Qty_Available(Cellread("Warehouse Location", 1,6));  
	   }
		
	
}
