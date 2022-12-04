package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	 WebDriver driver;
	 
	 //constuctor getting driver from BaseClass
	 //(Package(testBase)-->Class(BaseClass-->Method(SetUp))-->static WebDriver driver  
     public BasePage(WebDriver driver)
	     {
		     this.driver=driver;
		     PageFactory.initElements(driver,this);
	     }
	   	   
}




