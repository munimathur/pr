package Master_File_Maintenance.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class ppeClasses extends BaseFunctions
{
	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/*************************************************/
	 
	WebDriver Driver;
	public ppeClasses(WebDriver Ldriver) 
	{
		this.Driver=Ldriver;
	}
	/*****************************************************************/
	/*
	* End
	*/
	/*****************************************************************/

	
	
	@FindBy(xpath="//a[contains(text(),'PPE Classes')]")
	@CacheLookup
	 WebElement PPE_Classes;
	
	public void PPE_Classes_Click() 
	{
		waitForPageLoad(Driver, PPE_Classes);
		HighlightOnElementList(PPE_Classes);
		mouseClick(PPE_Classes);
	}
	
	/*****************************************************************/
	/*
	* These are the list of the Xpath  for PPE Classes Maintenance file Page  Screen.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	
	@FindBy(xpath="//input[@id='classCode']")
	 @CacheLookup
	 WebElement classCode;
	
	public void ppe_Class_Code(String str) 
	{
		HighlightOnElement(classCode);
		classCode.sendKeys(str);
	}
	
	
	@FindBy(xpath="//input[@id='classDesc']")
	 @CacheLookup
	 WebElement classDesc;
	
	public void ppe_Class_Description(String str) 
	{
		HighlightOnElement(classDesc);
		classDesc.sendKeys(str);
	}
	
	
	@FindBy(xpath="//input[@id='usefulLife']")
	 @CacheLookup
	 WebElement usefulLife;
	
	public void useful_Life(String str) 
	{
		HighlightOnElement(usefulLife);
		usefulLife.sendKeys(str);
	}
	
	
	@FindBy(xpath="//input[@id='uACSCode']")
	 @CacheLookup
	 WebElement uACSCode;
	
	public void ppe_Uacs_Code(String str) 
	{
		HighlightOnElement(uACSCode);
		uACSCode.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='accuDepUACSCode']")
	 @CacheLookup
	 WebElement accuDepUACSCode;
	
	public void accumulated_Depreciation_Uacs_Code(String str) 
	{
		HighlightOnElement(accuDepUACSCode);
		accuDepUACSCode.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@id='depUACSCode']")
	 @CacheLookup
	 WebElement depUACSCode;
	
	public void depreciation_Uacs_Code(String str) 
	{
		HighlightOnElement(depUACSCode);
		depUACSCode.sendKeys(str);
	}
	
	public void ppeElementsMaster() throws Exception
	{
		
        PPE_Classes_Click() ;
        Thread.sleep(3000);
		ppe_Class_Code(Cellread("PPE Classes", 1, 0));
		ppe_Class_Description(Cellread("PPE Classes",1,1));
		useful_Life(Cellread("PPE Classes",1,2));
		ppe_Uacs_Code(Cellread("PPE Classes",1, 3));
		accumulated_Depreciation_Uacs_Code(Cellread("PPE Classes",1,4));
		depreciation_Uacs_Code(Cellread("PPE Classes",1,5));
	}
	
	
}
