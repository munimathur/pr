package commonElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Utility.BaseFunctions;

public class masterFileCommonElements extends BaseFunctions
{

	/********************************************************************************
	 * This below function helps to call the Driver from Base class.
	 * @author Muni Mathur
	 */
	/********************************************************************************/
	 
	WebDriver Driver;
	public masterFileCommonElements(WebDriver Ldriver) 
	{
		this.Driver=Ldriver;
	}

	
	/********************************************************************************
	 * 
	 *  ENDS HERE
	 */
	/********************************************************************************/
	 
	
	/********************************************************************************
	 * This is the List of Common Xpath in All Pages in Master File Maintenance Page
	 * @author Muni Mathur
	 */
	/********************************************************************************/
	
		
	By savebutton=By.xpath("//button[@title='click here to save']");
	
	public void save_button() 
	{
		WebElement save=Driver.findElement(savebutton);
		HighlightOnElement(save);
		save.click();
	}
		
	By modify=By.xpath("//button[@title='click here to modify']");
		
	public void modify_Button() 
	{
		WebElement modifybutton=Driver.findElement(modify);
		HighlightOnElement(modifybutton);
		Click_Btn(modifybutton);
	}
	

	By reset=By.xpath("//button[@title='click here to modify']//following::button[1]");
	
	public void reset_Button() 
	{
		WebElement resetbutton=Driver.findElement(reset);
		HighlightOnElement(resetbutton);
		resetbutton.click();
	}
	
	@FindBy(xpath="//button[@title='click here to back']")
	@CacheLookup
	static
	WebElement backbutton;
	
	public static void back_Button() 	
	{			
		HighlightOnElement(backbutton);
		backbutton.click();
		
	}
	
	@FindBy(xpath="//input[@type='text']")
	@CacheLookup
	WebElement searchtext;

	public void search_Text(String str)
	{
		searchtext.sendKeys(str);
	}
	
	@FindBy(xpath="//a[@id='table_next']")
	@CacheLookup
	WebElement nextbutton;

	public void next_Button()
	{
		nextbutton.click();
	}
	
	
	@FindBy(xpath="//a[@id='table_previous']")
	@CacheLookup
	WebElement prevoiusbutton;

	public void prevoius_Button()
	{
		prevoiusbutton.click();
	}
	
		
}
