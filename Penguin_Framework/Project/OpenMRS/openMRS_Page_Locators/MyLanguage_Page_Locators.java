package openMRS_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyLanguage_Page_Locators {

	WebDriver driver = null;
	public MyLanguage_Page_Locators(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
