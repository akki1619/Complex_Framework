package openMRS_Page_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import OpenMRS.PropertyReader;
import base_Architecture.BaseClass;
import openMRS_Page_Actions.Home_Page_Action;
import openMRS_Page_Actions.Login_Page_Action;

public class Home_Page_Test  extends BaseClass {

	
	  @Test (priority = 0, description="valid Login Scenario with correct username and password.")
	    public void navigateToMyAccount() throws InterruptedException {

		  Login_Page_Action loginPA = new Login_Page_Action(driver);
	        Home_Page_Action homePA = loginPA.succesfulLogin(PropertyReader.getValue("ui.application.username"),PropertyReader.getValue("ui.application.password"));
	        homePA.hoverAdmin();
	     }
	
	
	
	
	
	
}
