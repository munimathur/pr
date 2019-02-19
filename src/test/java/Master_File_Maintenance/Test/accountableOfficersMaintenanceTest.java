package Master_File_Maintenance.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Home.Test.homeTest;
import Master_File_Maintenance.Page.accountableOfficersMaintenance;
import configuration.Baseclass;

public class accountableOfficersMaintenanceTest extends Baseclass
{

	@Test(description="To Verify the functionality of Save Button",priority=1)
	public void Accountable_Officers_Save_TC_04() throws Exception 
	{
		homeTest.homePage();
		accountableOfficersMaintenance saveAccount=PageFactory.initElements(Driver, accountableOfficersMaintenance.class);
		saveAccount.accountable_Save();
	}
	
	@Test(description="To Verify the functionality of Modify Button",priority=2)
	public void Accountable_Officers_Modify_TC_05() throws Exception 
	{
		homeTest.homePage();
		accountableOfficersMaintenance modifyDetails=PageFactory.initElements(Driver, accountableOfficersMaintenance.class);
		modifyDetails.acountable_Modify();
	}
	
	@Test(description="To Verify the functionality of Reset Button",priority=3)
	public void Accountable_Officers_Modify_TC_06() throws Exception 
	{
		homeTest.homePage();
		accountableOfficersMaintenance accountable_Reset=PageFactory.initElements(Driver, accountableOfficersMaintenance.class);
		accountable_Reset.accountable_Reset();
	}
	
	
}