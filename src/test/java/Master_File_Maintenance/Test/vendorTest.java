package Master_File_Maintenance.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Home.Test.homeTest;
import Master_File_Maintenance.Page.vendors;
import configuration.Baseclass;

public class vendorTest extends Baseclass 
{
	
	@Test
	public void vendor_Master() throws Exception 
	{
		homeTest.homePage();
		vendors vn=PageFactory.initElements(Driver, vendors.class);
		vn.vendor_Elements();
		
	}
	
	
}
