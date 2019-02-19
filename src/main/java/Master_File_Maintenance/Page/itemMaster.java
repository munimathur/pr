package Master_File_Maintenance.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class itemMaster extends BaseFunctions 
{

	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/*************************************************/
	 
	WebDriver Driver;
	public itemMaster(WebDriver Ldriver) 
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
	* These are the list of the Xpath  for Item Master file Page  Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
		
	@FindBy(xpath="//a[contains(text(),'Item Master')]")
	 @CacheLookup
	 WebElement ItemMaster;
	
	public void Item_Master_Click() 
	{
		waitForPageLoad(Driver, ItemMaster);
		HighlightOnElement(ItemMaster);
		mouseClick(ItemMaster);
	}
	
	
	/*****************************************************************/
	/*
	* These are the list of the Xpath  for Item Master file Page  Screen.
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
	
	@FindBy(xpath="//input[@id='itemName']")
	@CacheLookup
	 WebElement itemName;
	
	public void item_Name(String str) 
	{
		HighlightOnElement(itemName);
		itemName.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='itemDesc']")
	@CacheLookup
	 WebElement itemDesc;
	
	public void item_Desc(String str) 
	{
		HighlightOnElement(itemDesc);
		itemDesc.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='itemStatus']")
	@CacheLookup
	 WebElement itemStatus;
	
	public void item_Status(String str) 
	{
		HighlightOnElement(itemStatus);
		itemStatus.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='purchaseUom']")
	@CacheLookup
	 WebElement purchaseUom;
	
	public void purchase_Uom(String str) 
	{
		HighlightOnElement(purchaseUom);
		purchaseUom.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='stockingUom']")
	@CacheLookup
	 WebElement stockingUom;
	
	public void stocking_Uom(String str) 
	{
		HighlightOnElement(stockingUom);
		stockingUom.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='siteCode']")
	@CacheLookup
	 WebElement siteCode;
	
	public void site_Code(String str) 
	{
		HighlightOnElement(siteCode);
		siteCode.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='warehouseLoc']")
	@CacheLookup
	 WebElement warehouseLoc;
	
	public void warehouse_Loc(String str) 
	{
		HighlightOnElement(warehouseLoc);
		warehouseLoc.sendKeys(str);
	}
	
	@FindBy(xpath="")
	@CacheLookup
	 WebElement table;
	
	public void table() 
	{
		
	}
	
	
	public void datafillMaster() throws Exception
	{
		Item_Master_Click();	
		Thread.sleep(3000);
		item_Code(Cellread("Item Master",1,0));
		item_Name(Cellread("Item Master",1,1));
		item_Desc(Cellread("Item Master",1,2));
		item_Status(Cellread("Item Master",1,3));
		purchase_Uom(Cellread("Item Master",1,4));
    	stocking_Uom(Cellread("Item Master",1,5));
		site_Code(Cellread("Item Master",1,6));
		warehouse_Loc(Cellread("Item Master",1,7));
	}
	
	
}
