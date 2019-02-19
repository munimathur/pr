package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseFunctions 
{
	public static WebDriver Driver;
	public static ExtentReports extent;
	
	static XSSFWorkbook Workbook;
	static XSSFSheet Datasheet;
	static File src= new File(".//Data//TestDataSheet.xlsx");
	
	public static WebDriver getdriver()
	{
		return Driver;	
	}
	public static ExtentReports getextent()
	{
	 	return extent;	
	}
	/*****************************************************************/
	/*
	* This bellow function helps to generate Extent report.
	* @author  Muni Mathur
	*/
	/*****************************************************************/
	@BeforeSuite(alwaysRun=true)
	@Parameters({"Reportname"})
	public void setup(@Optional String Reportname)
	{
		String xmlname=Reportname;
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Screenshot/"+xmlname+".html");		
	    extent = new ExtentReports();	    
	    extent.attachReporter(reporter);
	    
	}
	/*****************************************************************/
	/*
	* This bellow function helps to Wait driver.
	* @author Muni Mathur
	*/
	/*****************************************************************/
	public void waitForPageLoad(WebDriver wdriver, WebElement WE) 
	{
	ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() 
	{
	       public Boolean apply(WebDriver driver) 
	       {
	           return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
	       }
	       };
	       try {
	           WebDriverWait wait = new WebDriverWait(wdriver, 10);
	           wait.until(expectation);
	           wait.until(ExpectedConditions.visibilityOfAllElements(WE));
	       } catch (Throwable error) {
	           Assert.fail("Timeout waiting for Page Load Request to complete.");
	       }
	}
	/****************************************************************************************************/
	 /* This method used to click on "OK" button of the alert pop up
	  * @author  Muni Mathur*/
	/*******************************************************************************************************/
	public void acceptAlert() 
	{
		WebDriverWait wait = new WebDriverWait(Driver, 3000);
		wait.until(ExpectedConditions.alertIsPresent());
		String alrt = Driver.switchTo().alert().getText();
		Alert alert = Driver.switchTo().alert();
		alert.accept();
		Reporter.log("Error Message:" + alrt, true);
	}

	/***************************************************************************************************/
	/* This method is used to "CANCEL" button of the alert pop up
	 * @author  Muni Mathur*/
	/******************************************************************************************************/	
	public void dismissAlert() 
	{
		WebDriverWait wait = new WebDriverWait(Driver, 1000);
		wait.until(ExpectedConditions.alertIsPresent());
		String alrt = Driver.switchTo().alert().getText();
		Alert alert = Driver.switchTo().alert();
		alert.dismiss();
		Reporter.log("Expected result:" + alrt, true);
	}
	
	/*******************************************************************************************************/
	/* This method is used to refresh the page
	 * @author  Muni Mathur*/
	/******************************************************************************************************/
	public void pageForRefresh(WebDriver driver) 
	{
		driver.navigate().refresh();
	}
	
	/*******************************************************************************************************/
	/* This method is used to back the page
	 * @author  Muni Mathur*/
	/******************************************************************************************************/
	public void backtoPage(WebDriver driver) 
	{
		driver.navigate().back();
	}
	
	/****************************************************************************/
	/* Highlight the Element to visible at time of Execution
	 * @author  Muni Mathur*/
	/***************************************************************************/
	public static void HighlightOnElement(WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"color: blue; border: 4px solid Red;");
	}
	
	/****************************************************************************/
	/* Highlight the List Element to visible at time of Execution
	 * @author  Muni Mathur*/
	/***************************************************************************/
	public static void HighlightOnElementList(WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"color: blue; border: 4px solid Magenta;");
	}
	
	/****************************************************************************/
	/* This method is used to Switch to frame
	 * @author  Muni Mathur*/
	/***************************************************************************/
	public void switchToFrame(WebElement element) 
	{
		Driver.switchTo().frame(element);
	}
	
	/****************************************************************************/
	/* This method is used to Switch to main frame
	 * @author  Muni Mathur*/
	/***************************************************************************/
	public void switchFrameToMainWindow() 
	{
		Driver.switchTo().defaultContent();
	}
	
	/****************************************************************************/
	/* This method is used to Page ScroolDown
	 * @author  Muni Mathur*/
	/***************************************************************************/
	public void ScroolDown() 
	{
		JavascriptExecutor jse = (JavascriptExecutor) Driver;
		jse.executeScript("window.scrollBy(0,1000)");
	}
	/****************************************************************************/
	/* This method is used to Page Scroolup
	 * @author  Muni Mathur*/
	/***************************************************************************/
	
	public void ScroolUp() 
	{
		JavascriptExecutor jse = (JavascriptExecutor) Driver;
		jse.executeScript("window.scrollBy(0,-450)", "");
	}
	
	/****************************************************************************/
	 /* This method is used to Click on any element through JavaScript
	 * @author Muni Mathur	*/
	 /***************************************************************************/
	public static void Click_Btn(WebElement element)

	{
	      JavascriptExecutor jse = (JavascriptExecutor)Driver;
	      jse.executeScript("arguments[0].click();", element);
	}

	/****************************************************************************/
	/* This method is used to get the title of webpage
	 * @author Muni Mathur
	 */	
	/****************************************************************************/
	public String Get_Title()
	{
	      JavascriptExecutor jse = (JavascriptExecutor)Driver;
	      String sText =  jse.executeScript("return document.title;").toString();
	      return sText;
	}
	
	/****************************************************************************/
	 /* This method is used to reload the WebPage
	 * @author Muni Mathur
	 */
	 /****************************************************************************/
	public static void Refresh()
	{
	      JavascriptExecutor jse = (JavascriptExecutor)Driver;
	      jse.executeScript("history.go(0)");
	}
	
	/****************************************************************************/
	 /* This method is used to Scroll page till element  
	 * @author Muni Mathur
	 */	
	/****************************************************************************/
	
	public static void Scroolpage(WebElement element)
	{
	      JavascriptExecutor jse = (JavascriptExecutor) Driver;
	      jse.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	/****************************************************************************/
	 /* This method is used to click on element with the help of Action Class  
	 * @author Muni Mathur
	 */	
	/****************************************************************************/
	
	public static void mouseClick(WebElement element) 
	{
		Actions act=new Actions(Driver);
		act.moveToElement(element).click().build().perform();
	}
	
	/****************************************************************************/
	 /* This method is used to Select the dropdown value using Select class 
	 * @author Muni Mathur
	 */	
	/****************************************************************************/
	
	public static void selectDropDown(WebElement element, String str)
	{
		Select slt=new Select(element);
		slt.selectByVisibleText(str);
	}
	
	
	/*****************************************************************/
	/*
	* This bellow function read the excel sheet and send data to calling function.
	* @author  Muni Mathur
	*/
	/*****************************************************************/
	public static Object[][] read(int sheetname) throws Exception
	{	
		FileInputStream FIS=new FileInputStream(src);
		Workbook =new XSSFWorkbook(FIS);
		Datasheet =Workbook.getSheetAt(sheetname);		
		ArrayList<String> UserData=new ArrayList<String>();		
		int Rowc= Datasheet.getLastRowNum();
		int Col= Datasheet.getRow(0).getLastCellNum();
		Rowc=Rowc+1;
		Object[][] Data= new Object[Rowc][Col];		
		for(int i=1; i<Rowc; i++)
		{
			for(int j=0; j<Col; j++)
			{	
				UserData.add(Datasheet.getRow(i).getCell(j).getStringCellValue());
				Data[i][j]=UserData.get(j);
			}			
			UserData.clear();
		}
		return Data;		
	}
	
	public String Cellread( String sheetnum, int Rownum, int Colnum) throws Exception
	{
		Workbook =new XSSFWorkbook(src);
		Datasheet =Workbook.getSheet(sheetnum);			
		XSSFRow Rowc= Datasheet.getRow(Rownum);
		XSSFCell Col= Rowc.getCell(Colnum);
		String Data= Col.getStringCellValue();
		return Data;  	
	}
	/*****************************************************************/
	/*
	* End
	*/
	/*****************************************************************/
	
	
}
