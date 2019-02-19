package commonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class purchasingProcessElements extends BaseFunctions 
{
	/********************************************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/********************************************************************************/
	 
	WebDriver Driver;
	public purchasingProcessElements(WebDriver Ldriver) 
	{
		this.Driver=Ldriver;
	}
	
	
	@FindBy(xpath="//div[@class='btn-group btn-group-sm']//button[1]")
	@CacheLookup
	WebElement newjobbutton;

	public void addNewJobOrder()
	{
		newjobbutton.click();
	}
	
	
	@FindBy(xpath="//div[@class='btn-group btn-group-sm']//button[2]")
	@CacheLookup
	WebElement refreshbutton;

	public void refresh_Button()
	{
		refreshbutton.click();
	}
	
	@FindBy(xpath="//select[@id='itemCat']")
	@CacheLookup
	WebElement itemcategory;

	public void item_Category()
	{
		itemcategory.click();
	}
	
	
	@FindBy(xpath="//input[@id='datepicker']")
	@CacheLookup
	WebElement datecreated;

	public void date_Created()
	{
		datecreated.click();
	}
	

	@FindBy(xpath="//input[@type='text']")
	@CacheLookup
	WebElement searchtext;

	public void search_Text()
	{
		searchtext.click();
	}
	
	@FindBy(xpath="//select[@name='example_length']")
	@CacheLookup
	WebElement showentries;

	public void showList()
	{
		showentries.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
