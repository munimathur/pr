package Master_File_Maintenance.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Home.Test.homeTest;
import Master_File_Maintenance.Page.termsMaster;
import configuration.Baseclass;

public class termsMasterTest extends Baseclass
{
		
	@Test
	public void terms_Master() throws Exception 
	{
		homeTest.homePage();
		termsMaster tm=PageFactory.initElements(Driver, termsMaster.class);
		tm.termsElements();
		
	}

}
