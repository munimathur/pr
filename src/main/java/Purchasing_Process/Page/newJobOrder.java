package Purchasing_Process.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class newJobOrder extends BaseFunctions
{
	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/*************************************************/
	 
	WebDriver Driver;
	public newJobOrder(WebDriver Ldriver) 
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
	* These is the Xpath  for New Job Order file Page Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	
	/*****************************************************************/
	/*
	* End
	*/
	/*****************************************************************/

	
	/*****************************************************************/
	/*
	* These is the List of Xpath  for New Job Order file Page Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//select[@id='itemCat']")
	@CacheLookup
	WebElement itemCat;
	
	public void item_Category() 
	{
		HighlightOnElement(itemCat);
		
	}
	
	
	@FindBy(xpath="//input[@id='datepicker']")
	@CacheLookup
	WebElement datepicker;
	
	public void date_Created() 
	{
		HighlightOnElement(datepicker);
		
	}
	
	
	@FindBy(xpath="//input[@type='text']")
	@CacheLookup
	WebElement searchtext;
	
	public void search_Text() 
	{
		HighlightOnElement(searchtext);
		
	}
	
	
	


}
