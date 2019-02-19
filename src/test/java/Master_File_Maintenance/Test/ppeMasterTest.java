package Master_File_Maintenance.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Home.Test.homeTest;
import Master_File_Maintenance.Page.ppemaster;
import configuration.Baseclass;

public class ppeMasterTest extends Baseclass
{
	 @Test
     public void ppeMasterSave() throws Exception 
     {
    	  homeTest.homePage();
    	  ppemaster p1=PageFactory.initElements(Driver, ppemaster.class);
    	  p1.ppeMasterElements();
    	 
     }
}
