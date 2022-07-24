package com.IEBank.pages;
	
	import java.time.Duration;
	import java.util.Set;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.TimeoutException;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import com.IEBank.base.TestBase;
	
	public class LogoutPage extends TestBase {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		By Logoutbutton = By.xpath("//*[@id=\"lbLoginOut\"]");
		
		public boolean validateLogout() {
	     
			driver.findElement(Logoutbutton).click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
boolean flagResult = true;
		
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"body_lblUserID\"]")));	
		}catch(TimeoutException te) {
			captureScreenshot("Logout Failed");
			flagResult = false;
		}
		
		if(flagResult) {
		String actResult = driver.findElement(By.xpath("//*[@id=\"body_lblUserID\"]")).getText();
		System.out.println("text captured: " + actResult);
		return actResult.equals("User ID");
		}
		else 
		return false;
	}
	

}
