package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.PredefinedActions;
import pages.LoginPage;

public class LoginTest {
	
	@Test
	public void tc_01(){
		
		System.out.println("STEP - Launch Chrome Browser & Hit url");
		PredefinedActions.start("https://hjadhav-trials77.orangehrmlive.com");
		System.out.println("STEP - Enter valid login credentials");
		LoginPage login=new LoginPage();
		login.login("Admin", "P3aWj3TV@o");
		
		System.out.println("<------------VERIFY - home page is displayed----->");
		System.out.println("TestConflicts");
		System.out.println("<<<<VERIFY - home page is displayed>>>");
		String expetedTitle = "Employee Management";
		String actualTitle = login.getPageTitle();
		System.out.println("Test conflicts");
		
		Assert.assertEquals(actualTitle, expetedTitle, "Expected title was " + expetedTitle + " but actual title was " + actualTitle);
		System.out.println("Test Scenario 2");
		PredefinedActions.closeBrowser();
		

		
	}

}
