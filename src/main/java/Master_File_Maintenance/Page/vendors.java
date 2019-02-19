package Master_File_Maintenance.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class vendors extends BaseFunctions {
	
	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/*************************************************/
	 
	WebDriver Driver;
	public vendors(WebDriver Ldriver) 
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
	* This is Xpath  for Vendors file Page  Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Vendors')]")
	@CacheLookup
	 WebElement Vendors;
	
	public void vendors_Master_Click() 
	{
		waitForPageLoad(Driver, Vendors);
		HighlightOnElement(Vendors);
		mouseClick(Vendors);
	}
	
	/*****************************************************************/
	/*
	* These are the list of the Xpath  for Vendors file Page  Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//input[@name='vendorCode']")
	@CacheLookup
	WebElement vendorCode;
			
	public void vendor_Code(String str)
	{
		HighlightOnElement(vendorCode);
		vendorCode.sendKeys(str);
		
	}
	
	@FindBy(xpath="//input[@id='vendorName']")
	@CacheLookup
	WebElement vendorName;
	
public void vendor_Name(String str)
{
	HighlightOnElement(vendorName);
	vendorName.sendKeys(str);
		
}

@FindBy(xpath="//input[@id='activeStatus']")
@CacheLookup
WebElement activeStatus;

public void active_Status(String str) 
{
	HighlightOnElement(activeStatus);
	activeStatus.sendKeys(str);
}

@FindBy(xpath="//input[@id='address']")
@CacheLookup
WebElement address;

public void address_Vendor(String str) 
{
	
	HighlightOnElement(address);
	address.sendKeys(str);
}

@FindBy(xpath="//input[@id='phoneNo']")
@CacheLookup
WebElement phoneNo;

public void phone_No(String str)
{
	HighlightOnElement(phoneNo);
	phoneNo.sendKeys(str);
	
}

@FindBy(xpath="//input[@id='emailAddress']")
@CacheLookup
WebElement emailAddress;

public void email_Address(String str) 
{
	HighlightOnElement(emailAddress);
	emailAddress.sendKeys(str);
}

@FindBy(xpath="//input[@name='terms']")
@CacheLookup
WebElement terms;

public void terms_Vendor(String str) 
{
	HighlightOnElement(terms);
	terms.sendKeys(str);
}

@FindBy(xpath="//input[@id='tin']")
@CacheLookup
WebElement tin;

public void tin_Vendor(String str) 
{
	HighlightOnElement(tin);
	tin.sendKeys(str);
}

@FindBy(xpath="//input[@id='taxCode']")
@CacheLookup
WebElement taxCode;

public void atc_Vendor(String str) 
{
	HighlightOnElement(taxCode);
	taxCode.sendKeys(str);
}

@FindBy(xpath="//input[@id='payableUACSObjectCode']")
@CacheLookup
WebElement payableUACSObjectCode;

public void payable_Uacs_ObjectCode(String str)
{
	HighlightOnElement(payableUACSObjectCode);
	payableUACSObjectCode.sendKeys(str);
	
}
	
@FindBy(xpath="//input[@id='expenseUACSObjectCode']")
@CacheLookup
WebElement expenseUACSObjectCode;

public void expense_Uacs_ObjectCode(String str) 
{
	HighlightOnElement(expenseUACSObjectCode);
	expenseUACSObjectCode.sendKeys(str);
}
	
public void vendor_Elements() throws Exception 
{
	
	vendors_Master_Click();
	Thread.sleep(3000);
	vendor_Code(Cellread("Vendors",1,0));
	vendor_Name(Cellread("Vendors",1,1));
	active_Status(Cellread("Vendors",1,2));
	address_Vendor(Cellread("Vendors",1,3));
	phone_No(Cellread("Vendors",1,4));
	email_Address(Cellread("Vendors",1,5));
	terms_Vendor(Cellread("Vendors",1,6));
	tin_Vendor(Cellread("Vendors",1,7));
	atc_Vendor((Cellread("Vendors",1,8)));
	payable_Uacs_ObjectCode(Cellread("Vendors",1,9));
	expense_Uacs_ObjectCode(Cellread("Vendors",1,10));
		
}
	
}
