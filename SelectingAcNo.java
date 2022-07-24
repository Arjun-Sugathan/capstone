package com.IEBank.pages;
	
	import java.time.Duration;
	import java.util.Set;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.TimeoutException;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
	
	import com.IEBank.base.TestBase;
	
	public class SelectingAcNo extends TestBase {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		
		public boolean validateSelectAc() {
			
		    wait(3000);
	     
		    Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\"body_cph_MyAccount_ddlAccountNo\"]")));
		    s1.selectByValue("100000000000");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("/html/body/form/div[3]/div[4]/div[2]/div[3]/table[1]/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/input")).click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			driver.findElement(By.xpath("/html/body/form/div[3]/div[4]/div[2]/div[3]/table[1]/tbody/tr[3]/td[2]/table/tbody/tr/td[1]/input")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("/html/body/form/div[3]/div[4]/div[2]/div[3]/table[1]/tbody/tr[5]/td[2]/input")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

boolean flagResult = true;
		
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"body_cph_MyAccount_gvTransaction\"]/tbody/tr[1]/th[1]")));	
		}catch(TimeoutException te) {
			captureScreenshot("View Transaction page Ministatement failed");
			flagResult = false;
		}
		
		if(flagResult) {
		String actResult = driver.findElement(By.xpath("//*[@id=\"body_cph_MyAccount_gvTransaction\"]/tbody/tr[1]/th[1]")).getText();
		return actResult.equals("Transaction Date And Time");
		
		}
		else 
		return false;
	}
	

}
