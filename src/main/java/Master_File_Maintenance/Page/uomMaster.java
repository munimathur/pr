package Master_File_Maintenance.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class uomMaster extends BaseFunctions
{

	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/*************************************************/
	 
	WebDriver Driver;
	public uomMaster(WebDriver Ldriver) 
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
	* These are the list of the Xpath  for UOM file Page Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'UOM')]")
	@CacheLookup
	 WebElement uom;
	
	public void UOM_Maintenance() 
	{
		HighlightOnElement(uom);
		mouseClick(uom);	
	}
	
}
