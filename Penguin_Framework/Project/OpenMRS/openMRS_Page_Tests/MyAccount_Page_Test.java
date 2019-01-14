package openMRS_Page_Tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import OpenMRS.PropertyReader;
import base_Architecture.BaseClass;
import openMRS_Page_Actions.Home_Page_Action;
import openMRS_Page_Actions.Login_Page_Action;
import openMRS_Page_Actions.MyAccount_Page_Action;

public class MyAccount_Page_Test extends BaseClass {
	
	
	@Test (priority = 0, description="verify Change Password tab is present")
    public void verifyChangePasswordTab() throws InterruptedException {
            
        Login_Page_Action loginPA = new Login_Page_Action(driver);
        Home_Page_Action homePA = loginPA.succesfulLogin(PropertyReader.getValue("ui.application.username"),PropertyReader.getValue("ui.application.password"));
        homePA.hoverAdmin();
        MyAccount_Page_Action myAccountPA = homePA.clickMyAccount();
       assertTrue(myAccountPA.verifyChangePassword());
 
     }
	
	@Test (priority = 0, description="verify MY Language tab is present")
    public void verifyMyLanguageTab() throws InterruptedException {
            
        Login_Page_Action loginPA = new Login_Page_Action(driver);
        Home_Page_Action homePA = loginPA.succesfulLogin(PropertyReader.getValue("ui.application.username"),PropertyReader.getValue("ui.application.password"));
        homePA.hoverAdmin();
        MyAccount_Page_Action myAccountPA = homePA.clickMyAccount();
       assertTrue(myAccountPA.verifyMyLanguage());
 
     }

}
