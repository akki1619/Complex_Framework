package openMRS_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount_Page_Locator {

	
	
	WebDriver driver = null;
	
	public MyAccount_Page_Locator(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}


	@FindBy(xpath= "//*[@id=\"tasks\"]/a[1]/div/i")
	private WebElement changePassword;
	
	public WebElement getchangePassword(){
		return changePassword;
	}

	@FindBy(xpath= "//*[@id=\"tasks\"]/a[2]")
	private WebElement myLanguage;
	
	public WebElement getmyLanguage(){
		return myLanguage;
	}

}
