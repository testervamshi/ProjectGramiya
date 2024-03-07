package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_New_registration extends BaseClass{
	@Test
	public void registrationAccout() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		RegistrationPage rp=new RegistrationPage(driver);
		
		hp.click_signup();
		logger.info("***Clicked on Signup button***");
		Thread.sleep(3000);
		rp.setFirstname(RB.getString("firstname"));//pass values from config to webpage
		logger.info("***firstname is entered***");
		rp.setLastname(RB.getString("lastname"));
		logger.info("***lastname is entered***");
		rp.setEmail(RB.getString("email"));
		logger.info("***email is entered***");
		rp.setPassword(RB.getString("password"));
		logger.info("***password is entered***");
		Thread.sleep(3000);
		rp.clickSubmit();
		logger.info("***Clicked on submit button***");
		System.out.println(RB.getString("status"));
		
	}

}
