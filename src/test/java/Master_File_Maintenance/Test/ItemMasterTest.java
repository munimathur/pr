package Master_File_Maintenance.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Home.Test.homeTest;
import Master_File_Maintenance.Page.itemMaster;
import configuration.Baseclass;

public class ItemMasterTest extends Baseclass
{
	
		
	@Test
	public void master_File_Save() throws Exception 
	{
		
		homeTest.homePage();
		itemMaster itm=PageFactory.initElements(Driver, itemMaster.class);
		itm.datafillMaster();	
		
		
		
	}
	
	
}
