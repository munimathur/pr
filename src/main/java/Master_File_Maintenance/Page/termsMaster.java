package Master_File_Maintenance.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class termsMaster extends BaseFunctions
{

	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/*************************************************/
	 
	WebDriver Driver;
	public termsMaster(WebDriver Ldriver) 
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
	* These are the list of the Xpath  for Terms file Page Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Terms')]")
	@CacheLookup
	 WebElement Terms;
	
	public void terms_Maintenance_Click() 
	{
		waitForPageLoad(Driver, Terms);
		HighlightOnElementList(Terms);
		mouseClick(Terms);
		
	}
	
	
	/*****************************************************************/
	/*
	* These are the list of the Xpath  for UOM Page  Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/

	@FindBy(xpath="//input[@id='termCode']")
	 @CacheLookup
	 WebElement termCode;
	
	public void terms_Code(String str) 
	{
		HighlightOnElement(termCode);
		termCode.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='termDesc']")
	 @CacheLookup
	 WebElement termDesc;
	
	public void terms_Description(String str) 
	{
		HighlightOnElement(termDesc);
		termDesc.sendKeys(str);
	}
	
	
	@FindBy(xpath="//input[@id='dueNumberOfDays']")
	 @CacheLookup
	 WebElement dueNumberOfDays;
	
	public void due_Number_Of_Days(String str) 
	{
		HighlightOnElement(dueNumberOfDays);
		dueNumberOfDays.sendKeys(str);
	}
	
	public void termsElements() throws Exception 
	{
		terms_Maintenance_Click();
		Thread.sleep(2000);
		terms_Code(Cellread("Terms",1,0));
		terms_Description(Cellread("Terms",1,1));
		due_Number_Of_Days(Integer.toString(12));
	}
	
	

}
