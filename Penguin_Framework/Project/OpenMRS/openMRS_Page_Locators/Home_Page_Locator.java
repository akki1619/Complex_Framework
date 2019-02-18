package openMRS_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_Locator {

	WebDriver driver = null;
	public Home_Page_Locator(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className= "identifier")
	private WebElement admin;
	
	public WebElement getAdmin(){
		return admin;
	}
	
	
	@FindBy(xpath= "//*[@id=\"user-account-menu\"]/li/a")
	private WebElement myAccount;
	
	public WebElement getmyAccount(){
		return myAccount;
	}
	
	
	@FindBy(id="coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
	private WebElement findPatient;
	
	public WebElement getFindPatient(){
		return findPatient;
	}
	
	
}
