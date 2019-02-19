package Master_File_Maintenance.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Home.Test.homeTest;
import Master_File_Maintenance.Page.sitesMaster;
import configuration.Baseclass;

public class siteMasterTest extends Baseclass
{
   
   @Test
   public void siteMaster() throws Exception
   {
	   homeTest.homePage();
	   sitesMaster site=PageFactory.initElements(Driver, sitesMaster.class);
	   site.site_Elements_Master();
   }
}
