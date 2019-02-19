package configuration;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configreaderclass 
{
	/*****************************************************************/
	/*
	* This bellow function read the constant from property file.
	* @author  Muni Mathur
	*/
	/*****************************************************************/
	public String[] configreader() throws Exception
	{
	File src = new File("./Config/config.property");
	FileInputStream FIS= new FileInputStream(src);
	Properties pro=new Properties();
	pro.load(FIS);
	String url=pro.getProperty("url");
	//String uname=pro.getProperty("Username");
	//String pwd=pro.getProperty("password");
	String Browsername=pro.getProperty("browser");
	
	return new String[]{url,Browsername,};	
	}
	/*****************************************************************/
	/*
	* End
	*/
	/*****************************************************************/
}
