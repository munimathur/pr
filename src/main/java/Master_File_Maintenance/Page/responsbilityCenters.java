package Master_File_Maintenance.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class responsbilityCenters extends BaseFunctions
{
	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/*************************************************/
	 
	WebDriver Driver;
	public responsbilityCenters(WebDriver Ldriver) 
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
	* These is the Xpath  for Responsibility Centers file Page Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Responsibility Centers')]")
	@CacheLookup
	 WebElement Responsibility_Centers;
	
	public void Responsibility_Centers_Maintenance_Click() 
	{
		waitForPageLoad(Driver, Responsibility_Centers);
		HighlightOnElement(Responsibility_Centers);
		mouseClick(Responsibility_Centers);
	}
	
	
	/*****************************************************************/
	/*
	* These are the list of the Xpath  for Responsibility Centers file Page Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//input[@id='respCenterCode']")
	@CacheLookup
	WebElement respCenterCode;
	
	public void responsibility_Center_Code(String str) 
	{
		HighlightOnElement(respCenterCode);
		respCenterCode.sendKeys(str);
	}
	
		
	@FindBy(xpath="//input[@id='respCenterName']")
	@CacheLookup
	WebElement respCenterName;
	
	public void responsibility_Center_Name(String str) 
	{
		HighlightOnElement(respCenterName);
		respCenterName.sendKeys(str);
	}
		
	public void responsbilityElementsMaster() throws Exception 
    {
   	 
   	 Responsibility_Centers_Maintenance_Click() ;
   	 Thread.sleep(3000);
   	 responsibility_Center_Code(Cellread("Responsibility Centers", 1,0));
   	 responsibility_Center_Name(Cellread("Responsibility Centers",1,1) );
    }
	
	
	
}
