	package com.IEBank.pages;
	
	import java.time.Duration;
	import java.util.Set;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.TimeoutException;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import com.IEBank.base.TestBase;
	
	public class SignUpPage extends TestBase {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		By Signup = By.xpath("/html/body/form/div[3]/div[3]/table/tbody/tr[3]/td[2]/div/table/tbody/tr[7]/td[2]/a");
		
		public boolean validateSignup() {
	     
			driver.findElement(Signup).click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
boolean flagResult = true;
		
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div[3]/div[1]/div[1]")));	
		}catch(TimeoutException te) {
			captureScreenshot("SignIn Failed");
			flagResult = false;
		}
		
		if(flagResult) {
		String actResult = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div[1]/div[1]")).getText();
		return actResult.equals("REGISTER WITH IN ESSENCE BANK");
		}
		else 
		return false;
	}
	

}
