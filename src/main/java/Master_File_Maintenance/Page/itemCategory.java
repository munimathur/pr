package Master_File_Maintenance.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class itemCategory extends BaseFunctions
{
	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/*************************************************/
	 
	WebDriver Driver;
	public itemCategory(WebDriver Ldriver) 
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
	* These are the list of the Xpath  for Item Category file Page Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Item Category')]")
	@CacheLookup
	 WebElement Item_Category;
	
	public void Item_Category_Maintenance() 
	{
		waitForPageLoad(Driver, Item_Category);
		HighlightOnElementList(Item_Category);
		mouseClick(Item_Category);
	}
	
	/*****************************************************************/
	/*
	* These are the list of the Xpath  for Item Category file Page  Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//input[@id='itemCatCode']")
	@CacheLookup
	WebElement itemCatCode;
	
	public void item_Category_Code(String str) 
	{
		HighlightOnElement(itemCatCode);
		itemCatCode.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='itemCatDesc']")
	@CacheLookup
	WebElement itemCatDesc;
	
	@FindBy(xpath="//button[@title='click here to save']")
	@CacheLookup
	WebElement savebutton;
		
	public void save_button() 
	{
		HighlightOnElement(savebutton);
		savebutton.click();
	}
		
	public void item_Category_Description(String str) 
	{
		HighlightOnElement(itemCatDesc);
		itemCatDesc.sendKeys(str);
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
	
	
	@FindBy(xpath="//button[@title='click here to update']")
	@CacheLookup
	WebElement updatebutton;
	
	public  void update_Button() 
	{
		HighlightOnElement(updatebutton);
		Click_Btn(updatebutton);
	}	
	
	
	@FindBy(xpath="//tbody[@role='alert']//tr[1]//td[3]//button[1]")
	@CacheLookup
	WebElement tablemodify;

	public void table_Modify()
	{
		tablemodify.click();
	}
	
	
	
	
	public void item_Category_Save() throws Exception 
	 {
		 
		Item_Category_Maintenance();
		item_Category_Code(Cellread("Item Category", 1, 0));
		item_Category_Description(Cellread("Item Category",1,1));
		
		 
	 }
	
	
	public void item_Category_Modify() throws Exception 
	 {
		 
		Item_Category_Maintenance();
		modify_Button();
		Thread.sleep(2000);
		search_Text(Cellread("Item Category", 1, 1));
	   	table_Modify();
	   	update_Button();
		acceptAlert();
		acceptAlert();
		
	 }
	
	
}
