package openMRS_Page_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common_Functions.WebButton;
import common_Functions.WebElementCommon;
import openMRS_Page_Locators.Home_Page_Locator;


public class Home_Page_Action {
	WebDriver driver = null;
	Home_Page_Locator homePL;
	public Home_Page_Action(WebDriver driver){
		this.driver = driver;
		homePL=new Home_Page_Locator(driver);
	}
	public String verifyTitle(){
		return driver.getTitle();
	}
	
	public void hoverAdmin(){
	
		 
		WebElement adminEle = homePL.getAdmin();
		WebElementCommon.hoverElement(driver, adminEle);

	}
	
	
	public MyAccount_Page_Action clickMyAccount(){
		WebElement myAccountEle = homePL.getmyAccount();
		if(WebElementCommon.webElementPresent(myAccountEle)){
			if(WebElementCommon.webElementClickble(myAccountEle)){
				WebButton.clickBtn(myAccountEle);
			}
		}
		return new MyAccount_Page_Action(driver);
	}
	
	
}
