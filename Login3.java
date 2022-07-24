package com.IEBank.pages;

import java.time.Duration;
import java.util.Set;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.IEBank.base.TestBase;

public class Login3 extends TestBase {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public boolean validateLogin3() {

		wait(2000);

		By homepage = By.xpath("/html/body/form/div[3]/div[2]/div[1]/a");

		wait(2000);

		driver.findElement(homepage).click();
		
	wait(2000);
		
		boolean flagResult = true;
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"body_lblPassword\"]")));	
			}catch(TimeoutException te) {
				captureScreenshot("LoginPage failure");
				flagResult = false;
			}
	


if (flagResult) {
	String actResult = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/table/tbody/tr[3]/td[2]/div/table/tbody/tr[3]/td[2]/span[1]"))
			.getText();
	return actResult.equals("Password");
} else
	return false;
		
	}
}