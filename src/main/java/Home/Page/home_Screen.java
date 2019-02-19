package Home.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class home_Screen extends BaseFunctions
{

	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/*************************************************/
	 
	WebDriver Driver;
	public home_Screen(WebDriver Ldriver) 
	{
		this.Driver=Ldriver;
	}
	/*****************************************************************/
	/*
	* End
	*/
	/*****************************************************************/

	
	/*
	* These are the list of the WebElement for Master file  page Login Screen.
	* @author Muni Mathur
	*/

	@FindBy(xpath="//span[contains(text(),'Master File Maintenance')]")
    @CacheLookup
    WebElement MasterFileLink;
	
	public void Master_File_Link() 
	{
		HighlightOnElement(MasterFileLink);
		mouseClick(MasterFileLink);
		//MasterFileLink.click();
	}
			
	
	@FindBy(xpath="//span[contains(text(),'Annual Procurement Plan')]")
    @CacheLookup
    WebElement AnnualProcurementPlan;
	
	public void Annual_Procurement_Plan() 
	{
		HighlightOnElement(AnnualProcurementPlan);
		AnnualProcurementPlan.click();
	}
			
	@FindBy(xpath="//span[contains(text(),'Requisition Process')]")
    @CacheLookup
    WebElement RequisitionProcess;
	
	public void Requisition_Process() 
	{
		HighlightOnElement(RequisitionProcess);
		RequisitionProcess.click();
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Requisition Fullfillment')]")
    @CacheLookup
    WebElement RequisitionFullfillment;
	
	public void Requisition_Fullfillment() 
	{
		HighlightOnElement(RequisitionFullfillment);
		RequisitionFullfillment.click();
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Purchasing Process')]")
    @CacheLookup
    WebElement PurchasingProcess;
	
	public void Purchasing_Process() 
	{
		HighlightOnElement(PurchasingProcess);
		PurchasingProcess.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Receipt & Inspection Process')]")
    @CacheLookup
    WebElement ReceiptInspectionProcess;
	
	public void Receipt_Inspection_Process() 
	{
		HighlightOnElement(ReceiptInspectionProcess);
		ReceiptInspectionProcess.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Inventory')]")
    @CacheLookup
    WebElement Inventory;
	
	public void Inventory_Home() 
	{
		HighlightOnElement(Inventory);
		Inventory.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Property Plant & Equipment')]")
    @CacheLookup
    WebElement PropertyPlantEquipment;
	
	public void Property_Plant_Equipment() 
	{
		HighlightOnElement(PropertyPlantEquipment);
		PropertyPlantEquipment.click();
		
	}

	
}
