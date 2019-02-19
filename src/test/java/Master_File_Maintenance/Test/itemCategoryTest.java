package Master_File_Maintenance.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Home.Test.homeTest;
import Master_File_Maintenance.Page.itemCategory;
import commonElements.masterFileCommonElements;
import configuration.Baseclass;

public class itemCategoryTest extends Baseclass
{
	@Test(description="To Verify the functionality of Save Button",priority=1)
     public void item_Category_SaveButton_TC_013() throws Exception
     
     {
    	 homeTest.homePage();
    	 itemCategory itemcategory=PageFactory.initElements(Driver, itemCategory.class);
    	 itemcategory.item_Category_Save();
    	 masterFileCommonElements mf=new masterFileCommonElements(Driver);
 		 mf.save_button();
 		 acceptAlert() ; 
 		 acceptAlert() ;
     }
	
	
	@Test(description="To Verify the functionality of Modify Button",priority=2)
    public void item_Category_Modify_TC_014() throws Exception
   
    {
		
   	 homeTest.homePage();
   	 itemCategory itemcategory=PageFactory.initElements(Driver, itemCategory.class);
   	 itemcategory.item_Category_Modify();
   	 
	 
    }
	
	/*@Test(description="To Verify the functionality of Modify Button",priority=2)
    public void item_Category_Modify_TC_014() throws Exception
   
    {
   	 homeTest.homePage();
   	 itemCategory itemcategory=PageFactory.initElements(Driver, itemCategory.class);
   	 itemcategory.item_Category_Modify();
    }*/
	
	
	
}	
