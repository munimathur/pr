package Home.Test;

import org.openqa.selenium.support.PageFactory;

import Home.Page.home_Screen;
import configuration.Baseclass;

public class homeTest extends Baseclass
{
  public static void homePage()
  {		
		home_Screen ht= PageFactory.initElements(Driver, home_Screen.class);
		ht.Master_File_Link();
  }
}
