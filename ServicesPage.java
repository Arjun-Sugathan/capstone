	package com.IEBank.pages;
	
	import java.time.Duration;
	import java.util.Set;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.TimeoutException;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import com.IEBank.base.TestBase;
	
	public class ServicesPage extends TestBase {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		By Service = By.xpath("//*[@id=\"GeneralTabMenu_Service_li_Cust\"]/span");
		
		public boolean validateService() {
	     
			driver.findElement(Service).click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
boolean flagResult = true;
		
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"body_cph_Services_header_divHeader\"]")));	
		}catch(TimeoutException te) {
			captureScreenshot("Servicepage Failed");
			flagResult = false;
		}
		
		if(flagResult) {
		String actResult = driver.findElement(By.xpath("//*[@id=\"body_cph_Services_header_divHeader\"]")).getText();
		return actResult.equals("ENJOY OUR SERVICES");
		}
		else 
		return false;
	}
	

}
