package openMRS_Page_Actions;

import org.openqa.selenium.WebDriver;

import openMRS_Page_Locators.Home_Page_Locator;

public class MyLanguage_Page_Action {

	WebDriver driver = null;
	MyLanguage_Page_Action homePL;
	public MyLanguage_Page_Action(WebDriver driver){
		this.driver = driver;
		homePL=new MyLanguage_Page_Action(driver);
	}
	
}
