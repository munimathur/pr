package Master_File_Maintenance.Page;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class ppemaster extends BaseFunctions {
	/*************************************************
	 * This below function helps to call the Driver from Base class.
	 * 
	 * @author Muni Mathur
	 */
	/*************************************************/

	WebDriver Driver;

	public ppemaster(WebDriver Ldriver) {
		this.Driver = Ldriver;
	}
	/*****************************************************************/
	/*
	 * End
	 */
	/*****************************************************************/

	/*****************************************************************/
	/*
	 * These are the list of the Xpath for PPE Master file Page Screen.
	 * 
	 * @author Muni Mathur
	 */
	/*****************************************************************/

	@FindBy(xpath = "//a[contains(text(),'PPE Master')]")
	@CacheLookup
	WebElement PPE_Master;

	public void PPE_Master_Maintenance_Click() {
		waitForPageLoad(Driver, PPE_Master);
		HighlightOnElementList(PPE_Master);
		mouseClick(PPE_Master);
	}

	/*****************************************************************/
	/*
	 * These are the list of the Xpath for PPE Master Maintenance file Page Screen.
	 * 
	 * @author Muni Mathur
	 */
	/*****************************************************************/

	@FindBy(xpath = "//input[@id='propertyNumber']")
	@CacheLookup
	WebElement propertyNumber;

	public void property_Number(String str) {
		HighlightOnElement(propertyNumber);
		propertyNumber.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='itemCode']")
	@CacheLookup
	WebElement itemCode;

	public void item_Code(String str) {
		HighlightOnElement(itemCode);
		itemCode.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='ppeDesc']")
	@CacheLookup
	WebElement ppeDesc;

	public void ppe_Description(String str) {
		HighlightOnElement(ppeDesc);
		ppeDesc.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='ppeParticulars']")
	@CacheLookup
	WebElement ppeParticulars;

	public void ppe_Particulars(String str) {
		HighlightOnElement(ppeParticulars);
		ppeParticulars.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='status']")
	@CacheLookup
	WebElement status;

	public void ppe_Status(String str) {
		HighlightOnElement(status);
		status.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='ppeClassification']")
	@CacheLookup
	WebElement ppeClassification;

	public void ppe_Classification(String str) {
		HighlightOnElement(ppeClassification);
		ppeClassification.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='warrantyExpiration']")
	@CacheLookup
	WebElement warrantyExpiration;

	public void warranty_Expiration(String str) {
		HighlightOnElement(warrantyExpiration);
		warrantyExpiration.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='srlNumber']")
	@CacheLookup
	WebElement srlNumber;

	public void srl_Number(String str) {
		HighlightOnElement(srlNumber);
		srlNumber.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='plateNumber']")
	@CacheLookup
	WebElement plateNumber;

	public void plate_Number(String str) {
		HighlightOnElement(plateNumber);
		plateNumber.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='brand']")
	@CacheLookup
	WebElement brand;

	public void brand_Ppe(String str) {
		HighlightOnElement(brand);
		brand.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='supplier']")
	@CacheLookup
	WebElement supplier;

	public void supplier_Ppe(String str) {
		HighlightOnElement(supplier);
		supplier.sendKeys(str);
	}

	@FindBy(xpath = "//input[@name='poNumber']")
	@CacheLookup
	WebElement poNumber;

	public void po_Number(String str) {
		HighlightOnElement(poNumber);
		poNumber.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='acquisitionDate']")
	@CacheLookup
	WebElement acquisitionDate;
	By Acquistion_date = By.xpath("//div[@id='ui-datepicker-div']//table//tr/td");

	// Current Date
	public void acquisition_Date() throws Exception {
		HighlightOnElement(acquisitionDate);
		acquisitionDate.click();
		Thread.sleep(1000);

		List<WebElement> Daylist = Driver.findElements(Acquistion_date);
		int Count = Daylist.size();
		for (int j = 0; j < Count; j++) {
			String Date = Daylist.get(j).getText();
			if (Date.equalsIgnoreCase("1")) {
				Daylist.get(j).click();
				break;
			}
		}

	}

	@FindBy(xpath = "//input[@id='acquisitionCost']")
	@CacheLookup
	WebElement acquisitionCost;

	public void acquisition_Cost(String str) {
		HighlightOnElement(acquisitionCost);
		acquisitionCost.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='usefulLife']")
	@CacheLookup
	WebElement usefulLife;

	public void useful_Life(String str) {
		HighlightOnElement(usefulLife);
		usefulLife.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='monthlyDepAmount']")
	@CacheLookup
	WebElement monthlyDepAmount;

	public void monthly_Depreciation_Amount(String str) {
		HighlightOnElement(monthlyDepAmount);
		monthlyDepAmount.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='accumulatedDep']")
	@CacheLookup
	WebElement accumulatedDep;

	public void accumulated_Depreciation(String str) {
		HighlightOnElement(accumulatedDep);
		accumulatedDep.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='periodLastDep']")
	@CacheLookup
	WebElement periodLastDep;

	public void period_Last_Depreciated(String str) {
		HighlightOnElement(periodLastDep);
		periodLastDep.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='remainingBookValue']")
	@CacheLookup
	WebElement remainingBookValue;

	public void remaining_Book_Value(String str) {
		HighlightOnElement(remainingBookValue);
		remainingBookValue.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='remainingLife']")
	@CacheLookup
	WebElement remainingLife;

	public void remaining_Life(String str) {
		HighlightOnElement(remainingLife);
		remainingLife.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='lastAppraisalDate']")
	@CacheLookup
	WebElement lastAppraisalDate;

	By Calendar_date = By.xpath("//div[@id='ui-datepicker-div']//table//tr/td");

	public void last_Appraisal_Date() throws Exception {
		HighlightOnElement(lastAppraisalDate);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateOnly = new SimpleDateFormat("dd");
		String a = dateOnly.format(cal.getTime());
		a = a.replaceFirst("0", "");

		lastAppraisalDate.click();
		Thread.sleep(1000);
		List<WebElement> Daylist = Driver.findElements(Calendar_date);
		int Count = Daylist.size();
		for (int j = 0; j < Count; j++) {
			String Date = Daylist.get(j).getText();
			if (Date.equalsIgnoreCase(a)) {
				Daylist.get(j).click();
				break;
			}
		}
	}

	@FindBy(xpath = "//input[@id='appraisedValue']")
	@CacheLookup
	WebElement appraisedValue;

	public void appraised_Value(String str) {
		HighlightOnElement(appraisedValue);
		appraisedValue.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='ppeUacsCode']")
	@CacheLookup
	WebElement ppeUacsCode;

	public void ppe_Uacs_Code(String str) {
		HighlightOnElement(ppeUacsCode);
		ppeUacsCode.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='ppeAccumDepnUacsCode']")
	@CacheLookup
	WebElement ppeAccumDepnUacsCode;

	public void ppe_Accum_Depn_Uacs_Code(String str) {
		HighlightOnElement(ppeAccumDepnUacsCode);
		ppeAccumDepnUacsCode.sendKeys(str);
	}

	@FindBy(xpath = "//input[@id='ppeDepnExpenseUacsCode']")
	@CacheLookup
	WebElement ppeDepnExpenseUacsCode;

	public void ppe_Depn_Expense_Uacs_Code(String str) {
		HighlightOnElement(ppeDepnExpenseUacsCode);
		ppeDepnExpenseUacsCode.sendKeys(str);
	}

	public void ppeMasterElements() throws Exception {

		PPE_Master_Maintenance_Click();
		Thread.sleep(1000);
		property_Number(Cellread("PPE Master", 1, 0));
		monthly_Depreciation_Amount(Cellread("PPE Master", 1, 1));
		item_Code(Cellread("PPE Master", 1, 2));

		accumulated_Depreciation(Cellread("PPE Master", 1, 3));
		ppe_Description(Cellread("PPE Master", 1, 4));
		period_Last_Depreciated(Cellread("PPE Master", 1, 5));
		ppe_Particulars(Cellread("PPE Master", 1, 6));
		remaining_Book_Value(Cellread("PPE Master", 1, 7));

		ppe_Status(Cellread("PPE Master", 1, 8));
		remaining_Life(Cellread("PPE Master", 1, 9));
		ppe_Classification(Cellread("PPE Master", 1, 10));
		Thread.sleep(1000);
		last_Appraisal_Date();
		ScroolDown();

		warranty_Expiration(Cellread("PPE Master", 1, 12));
		Thread.sleep(1000);
		appraised_Value(Cellread("PPE Master", 1, 13));

		srl_Number(Cellread("PPE Master", 1, 14));
		ppe_Uacs_Code(Cellread("PPE Master", 1, 15));
		plate_Number(Cellread("PPE Master", 1, 16));
		ppe_Accum_Depn_Uacs_Code(Cellread("PPE Master", 1, 17));
		brand_Ppe(Cellread("PPE Master", 1, 18));

		Thread.sleep(1000);
		ppe_Depn_Expense_Uacs_Code(Cellread("PPE Master", 1, 19));
		supplier_Ppe(Cellread("PPE Master", 1, 20));
		po_Number(Cellread("PPE Master", 1, 21));
		acquisition_Date();
		acquisition_Cost(Cellread("PPE Master", 1, 23));
		useful_Life(Cellread("PPE Master", 1, 24));

	}

}
