package openMRS_Page_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common_Functions.WebButton;
import common_Functions.WebElementCommon;
import openMRS_Page_Locators.Home_Page_Locator;
import openMRS_Page_Locators.MyAccount_Page_Locator;

public class MyAccount_Page_Action {

		WebDriver driver = null;
		MyAccount_Page_Locator myAccountPL;
		public MyAccount_Page_Action(WebDriver driver){
			this.driver = driver;
			myAccountPL=new MyAccount_Page_Locator(driver);
		}
	
	public boolean verifyChangePassword() {
		WebElement changePaswordEle = myAccountPL.getchangePassword();
	boolean ischangePaswordPresent=	WebElementCommon.webElementPresent(changePaswordEle);
	return ischangePaswordPresent;
	
	}
	
public boolean verifyMyLanguage() {
		
	WebElement myLanguageEle = myAccountPL.getmyLanguage();
	boolean ismyLanguageElePresent=	WebElementCommon.webElementPresent(myLanguageEle);
	return ismyLanguageElePresent;
	
	}

public void clickChangePassword(){
	WebElement changePaswordEle = myAccountPL.getchangePassword();
	if(WebElementCommon.webElementPresent(changePaswordEle)){
		if(WebElementCommon.webElementClickble(changePaswordEle)){
			WebButton.clickBtn(changePaswordEle);
		}
	}
}

public MyLanguage_Page_Action clickMyLanguage(){
	WebElement myLanguageEle = myAccountPL.getmyLanguage();
	if(WebElementCommon.webElementPresent(myLanguageEle)){
		if(WebElementCommon.webElementClickble(myLanguageEle)){
			WebButton.clickBtn(myLanguageEle);
		}
	}
	
	return new MyLanguage_Page_Action(driver);
}


	
	
}
