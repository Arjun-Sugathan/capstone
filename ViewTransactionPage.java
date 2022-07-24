package com.IEBank.pages;
	
	import java.time.Duration;
	import java.util.Set;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.TimeoutException;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import com.IEBank.base.TestBase;
	
	public class ViewTransactionPage extends TestBase {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		By Viewtransaction = By.xpath("/html/body/form/div[3]/div[4]/div[1]/div/div/ul/li[4]/a");
		
		public boolean validateViewTransaction() {
			
		    wait(4000);
	     
			driver.findElement(Viewtransaction).click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
boolean flagResult = true;
		
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div[4]/div[2]/div[3]/table[1]/tbody/tr[1]/td[1]/span[1]")));	
		}catch(TimeoutException te) {
			captureScreenshot("View Transaction page failed");
			flagResult = false;
		}
		
		if(flagResult) {
		String actResult = driver.findElement(By.xpath("/html/body/form/div[3]/div[4]/div[2]/div[3]/table[1]/tbody/tr[1]/td[1]/span[1]")).getText();
		return actResult.equals("Account No");
		
		}
		else 
		return false;
	}
	

}
