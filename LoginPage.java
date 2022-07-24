package com.IEBank.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.IEBank.base.TestBase;

public class LoginPage extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	By userNameLoc = By.xpath("/html/body/form/div[3]/div[3]/table/tbody/tr[3]/td[2]/div/table/tbody/tr[2]/td[3]/input");
	By passwordLoc = By.xpath("/html/body/form/div[3]/div[3]/table/tbody/tr[3]/td[2]/div/table/tbody/tr[3]/td[3]/input");
	By loginButtonLoc = By.xpath("//*[@id=\"body_btnLogin\"]");

	public boolean validateLogin(String uName, String pwd) {	
		wait(2000);
		driver.findElement(userNameLoc).sendKeys(uName);
		wait(2000);
		driver.findElement(passwordLoc).sendKeys(pwd);
		wait(2000);
		driver.findElement(loginButtonLoc).click();
		
		

	
		
		boolean flagResult = true;
		
	    wait(4000);
		
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"body_cph_MyAccount_header_divHeader\"]")));	
		}catch(TimeoutException te) {
			captureScreenshot("Login Failure");
			flagResult = false;
		}
		
		if(flagResult) {
		String actResult = driver.findElement(By.xpath("//*[@id=\"body_cph_MyAccount_header_divHeader\"]")).getText();
		return actResult.equals("ACCOUNT DETAILS");
		}
		else 
		return false;
	}

}
