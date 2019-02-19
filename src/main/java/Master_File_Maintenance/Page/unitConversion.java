package Master_File_Maintenance.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class unitConversion extends BaseFunctions
{
	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/*************************************************/
	 
	WebDriver Driver;
	public unitConversion(WebDriver Ldriver) 
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
	* These is the Xpath  for Unit Conversions file Page Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Unit Conversions')]")
	@CacheLookup
	 WebElement unitConversions;
	
	
	public void unit_Conversions_Maintenance_Click() 
	{
		waitForPageLoad(Driver, unitConversions);
		HighlightOnElement(unitConversions);
		mouseClick(unitConversions);
	}
	
	/*****************************************************************/
	/*
	* End
	*/
	/*****************************************************************/

	
	/*****************************************************************/
	/*
	* These is the List of Xpath  for Unit Conversions file Page Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//input[@id='itemCode']")
	@CacheLookup
	WebElement itemCode;
	
	public void item_Code(String str) 
	{
		HighlightOnElement(itemCode);
		itemCode.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='conversionType']")
	@CacheLookup
	WebElement conversionType;
	
	public void conversion_Type(String str) 
	{
		HighlightOnElement(conversionType);
		conversionType.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='altUnitMeasure']")
	@CacheLookup
	WebElement altUnitMeasure;
	
	public void alt_Unit_Measure(String str) 
	{
		HighlightOnElement(altUnitMeasure);
		altUnitMeasure.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='stockingUom']")
	@CacheLookup
	WebElement stockingUom;
	
	public void stocking_Uom(String str) 
	{
		HighlightOnElement(stockingUom);
		stockingUom.sendKeys(str);
	}
	
	@FindBy(xpath="//select[@id='operation']")
	@CacheLookup
	WebElement operation;
	
	public void operation(String str) 
	{
		HighlightOnElement(operation);
		selectDropDown(operation,str);
	}
	
	@FindBy(xpath="//input[@id='conversionFactor']")
	@CacheLookup
	WebElement conversionFactor;
	
	public void conversion_Factor(String str) 
	{
		HighlightOnElement(conversionFactor);
		conversionFactor.sendKeys(str);
	}
	
	public void unit_Elements() throws Exception 
	{
		
		unit_Conversions_Maintenance_Click();
		Thread.sleep(3000);
		item_Code(Cellread("Unit Conversion", 1,0));
		conversion_Type(Cellread("Unit Conversion",1,1));
		alt_Unit_Measure(Cellread("Unit Conversion",1,2));
		operation("Multiply");
		conversion_Factor(Cellread("Unit Conversion",1,4));
	
	}
	
	
	
}
