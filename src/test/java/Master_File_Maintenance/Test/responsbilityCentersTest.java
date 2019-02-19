package Master_File_Maintenance.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Home.Test.homeTest;
import Master_File_Maintenance.Page.responsbilityCenters;
import configuration.Baseclass;

public class responsbilityCentersTest extends Baseclass

{
     
     
     @Test
     public void responsbilityMaster() throws Exception 
     {
    	 homeTest.homePage();
    	 responsbilityCenters response=PageFactory.initElements(Driver, responsbilityCenters.class);
    	 response.responsbilityElementsMaster();
     }
}
