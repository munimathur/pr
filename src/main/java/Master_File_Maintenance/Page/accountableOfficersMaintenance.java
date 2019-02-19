package Master_File_Maintenance.Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class accountableOfficersMaintenance extends BaseFunctions
{

	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/*************************************************/
	 
	WebDriver Driver;
	public accountableOfficersMaintenance(WebDriver Ldriver) 
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
	* These are the list of the Xpath  for Accountable Officers file Page Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Accountable Officers')]")
	@CacheLookup
	 WebElement Accountable_Officers;
	
	
	public void Accountable_Officers_Maintenance() 
	{
		waitForPageLoad(Driver, Accountable_Officers);
		HighlightOnElementList(Accountable_Officers);
		mouseClick(Accountable_Officers);
		
	}
	
	/*****************************************************************/
	/*
	* These are the list of the Xpath  for Accountable Officers Maintenance file Page  Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	
	@FindBy(xpath="//input[@id='officerCode']")
	 @CacheLookup
	 WebElement officerCode;
	
	public void officer_Code(String str) 
	{
		waitForPageLoad(Driver,officerCode);
		HighlightOnElement(officerCode);
		officerCode.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='officerName']")
	 @CacheLookup
	 WebElement officerName;
	
	public void officer_Name(String str) 
	{
		HighlightOnElement(officerName);
		officerName.sendKeys(str);
	}
	
	
	@FindBy(xpath="//input[@id='officialDesignation']")
	 @CacheLookup
	 WebElement officialDesignation;
	
	public void official_Designation(String str) 
	{
		HighlightOnElement(officialDesignation);
		officialDesignation.sendKeys(str);
	}
	

	@FindBy(xpath="//input[@id='assumptionDate']")
	 @CacheLookup
	 WebElement assumptionDate;
	
	By assumption_Currentdate_Calender=By.xpath("//div[@id='ui-datepicker-div']//table//tr/td");
	
	public void assumption_Date() throws Exception 
	{
		HighlightOnElement(assumptionDate);
		assumptionDate.click();
		Thread.sleep(1000);
		List<WebElement> Daylist= Driver.findElements(assumption_Currentdate_Calender);
		int Count= Daylist.size();
		for (int j=0; j<Count; j++)
		{
			String Date= Daylist.get(j).getText();
			if(Date.equalsIgnoreCase("1"))
			{
				Daylist.get(j).click();
				break;				
			}
		}		
	}
	
	@FindBy(xpath="//select[@id='centerCode']")
	 @CacheLookup
	 WebElement centerCode;
	
	public void responsbility_Center_Code(String str) 
	{
		
		HighlightOnElement(centerCode);
		selectDropDown(centerCode,str);
		
	}
	
	
	@FindBy(xpath="//button[@title='click here to save']")
	@CacheLookup
	WebElement savebutton;
		
	public void save_button() 
	{
		HighlightOnElement(savebutton);
		savebutton.click();
	}
	
	
	@FindBy(xpath="//button[@title='click here to update']")
	@CacheLookup
	WebElement updatemodifybutton;
		
	public void update_button() 
	{
		HighlightOnElement(updatemodifybutton);
		updatemodifybutton.click();
	}
	
	

	@FindBy(xpath="//button[@title='click here to modify']")
	@CacheLookup
	static
	WebElement modifybutton;
	
	public  void modify_Button() 
	{
		HighlightOnElement(modifybutton);
		Click_Btn(modifybutton);
	}
	
	
	@FindBy(xpath="//label[contains(text(), 'Search')]//child::input")
	@CacheLookup
	WebElement searchtext;

	public void search_Text(String str)
	{
		searchtext.sendKeys(str);
	}
	
	//@FindBy(xpath="//table[@id='table']//tbody//tr//td[9]")
	@FindBy(xpath="//button[@title='click here to modify']")
	@CacheLookup
	WebElement tablemodify;

	public void table_Modify()
	{
		tablemodify.click();
	}
	
	@FindBy(xpath="//button[@title='click here to modify']//following::button[1]")
	@CacheLookup
	WebElement resetbutton;
	
	public void reset_Button() 
	{
		
		HighlightOnElement(resetbutton);
		resetbutton.click();
	}
	
			
	/*******************************************************************************/
	/*
	* This method is for Saving the details Accountable Officers file Page Screen.
	* @author Muni Mathur
	*/
	/********************************************************************************/
	
	public void accountable_Save() throws Exception
	{
		Accountable_Officers_Maintenance();
		officer_Code(Cellread("Accountable Officers",1,0));
		officer_Name(Cellread("Accountable Officers",1,1));
		official_Designation(Cellread("Accountable Officers",1,2));		
		assumption_Date();
		responsbility_Center_Code("12");
		save_button();
		acceptAlert() ;
		acceptAlert() ;
	}
	
	/*******************************************************************************/
	/*
	* This method is for Modifying  the  Accountable Officers file Page Screen.
	* @author Muni Mathur
	*/
	/********************************************************************************/
	
	
	public void acountable_Modify() throws Exception 
	{
		Accountable_Officers_Maintenance();
		modify_Button();
		search_Text(Cellread("Accountable Officers", 1, 0));
		Thread.sleep(3000);
		table_Modify();
		Thread.sleep(3000);
		assumption_Date(); // 1-1-2019
		Thread.sleep(3000);
		update_button();
		acceptAlert();
		acceptAlert();
	}
	
	
	
	/*******************************************************************************/
	/*
	* This method is for Reset the Accountable Officers file Page Screen.
	* @author Muni Mathur
	*/
	/********************************************************************************/
	
	public void accountable_Reset() throws Exception
	
	{
		Accountable_Officers_Maintenance();
		officer_Code(Cellread("Accountable Officers",1,0));
		officer_Name(Cellread("Accountable Officers",1,1));
		official_Designation(Cellread("Accountable Officers",1,2));		
		assumption_Date();
		responsbility_Center_Code("12");
		reset_Button();		
	}
	
}
