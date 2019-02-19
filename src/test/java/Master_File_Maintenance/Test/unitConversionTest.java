package Master_File_Maintenance.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Home.Test.homeTest;
import Master_File_Maintenance.Page.unitConversion;
import configuration.Baseclass;

public class unitConversionTest extends Baseclass
{

	
	
	@Test
	public void unitMaster() throws Exception
	{
		 homeTest.homePage();
		 unitConversion uc=PageFactory.initElements(Driver, unitConversion.class);
		 uc.unit_Elements();
	}
	
}
