package com.IEBank.testsscenarios;

import org.testng.annotations.Test;

import com.IEBank.base.TestBase;
import com.IEBank.pages.ForgotPasswordPage;
import com.IEBank.pages.HomePage;
import com.IEBank.pages.HomePage1;
import com.IEBank.pages.Login2;
import com.IEBank.pages.Login3;
import com.IEBank.pages.LoginPage;
import com.IEBank.pages.LogoutPage;
import com.IEBank.pages.SelectingAcNo;
import com.IEBank.pages.ServicesPage;
import com.IEBank.pages.SignUpPage;
import com.IEBank.pages.ViewTransactionPage;

import org.testng.annotations.BeforeClass;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TransactionTestcase extends TestBase {
	
	@BeforeClass
	public void setUp() {
		launchBrowser();
		navigateToURL();
	}

	@AfterClass
	public void tearDown() {
	}
	
	@Test (priority = 1)
	public void SignInTest() {  
		SignUpPage signupPage = new SignUpPage();
		boolean actResult = signupPage.validateSignup();
		Assert.assertTrue(actResult);
		}
	
	@Test (priority = 2)
	public void HomepageTest() {  
		HomePage homepage = new HomePage();
		boolean actResult = homepage.validateHomepagea();
		Assert.assertTrue(actResult);
		}
	
	@Test (priority = 3)
	public void Login2Test() {  
		Login2 homepageIcon = new Login2();
		boolean actResult = homepageIcon.validateLogin2();
		Assert.assertTrue(actResult);
		}
	
	@Test (priority = 4)
	public void ForgotPassTest() {  // pass
		ForgotPasswordPage forgetpass = new ForgotPasswordPage();
		boolean actResult = forgetpass.validateForgotpass();
		Assert.assertTrue(actResult);
		}
	
	@Test (priority = 5)
	public void Homepage1Test() {  // fail
		HomePage1 homepage = new HomePage1();
		boolean actResult = homepage.validateHomepage1();
		Assert.assertTrue(actResult);
		}
	
	@Test (priority = 6)
	public void Login3Test() {  
		Login3 homepageIcon3 = new Login3();
		boolean actResult = homepageIcon3.validateLogin3();
		Assert.assertTrue(actResult);
		}
	
	
	@Test (priority = 7)
	public void loginPagewith_Password_Test() {
		LoginPage loginPage = new LoginPage();
		boolean actResult = loginPage.validateLogin("donhere", "don@123");
		Assert.assertTrue(actResult);
	}
	
	@Test (priority = 8)
	public void ViewTransactionTest() { 
		ViewTransactionPage viewtransaction = new ViewTransactionPage();
		boolean actResult = viewtransaction.validateViewTransaction();
		Assert.assertTrue(actResult);
		}
	
	@Test (priority = 9)
	public void SelectingAcNumberTest() { 
		SelectingAcNo SelectAc = new SelectingAcNo();
		boolean actResult = SelectAc.validateSelectAc();
		Assert.assertTrue(actResult);
		}
	
	@Test (priority = 10)
	public void Servicepagetest() { 
		ServicesPage ServicePage = new ServicesPage();
		boolean actResult = ServicePage.validateService();
		Assert.assertTrue(actResult);
		}
	
	@Test (priority = 11)
	public void LogoutTest() { 
		LogoutPage Logout = new LogoutPage();
		boolean actResult = Logout.validateLogout();
		Assert.assertTrue(actResult);
		}
}
