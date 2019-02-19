package Master_File_Maintenance.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Home.Test.homeTest;
import Master_File_Maintenance.Page.ppeClasses;
import configuration.Baseclass;

public class ppeClassesTest extends Baseclass
{
	
	@Test
	public void ppe_Classes_Maintenance() throws Exception
{
		homeTest.homePage();
		ppeClasses ppe=PageFactory.initElements(Driver, ppeClasses.class);
		ppe.ppeElementsMaster();
					
}
}