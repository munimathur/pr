package Master_File_Maintenance.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Home.Test.homeTest;
import Master_File_Maintenance.Page.warehouseLocation;
import configuration.Baseclass;

public class warehouseLocationTest extends Baseclass
{
    @Test
   public void warehouse_Master() throws Exception 
   {
	   homeTest.homePage();
	   warehouseLocation wlocation=PageFactory.initElements(Driver, warehouseLocation.class); 
	   wlocation.ware_House_Elemenst();
	   
   }
}
