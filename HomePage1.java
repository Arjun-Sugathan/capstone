	package com.IEBank.pages;
	
	import java.time.Duration;
	import java.util.Set;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.TimeoutException;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import com.IEBank.base.TestBase;
	
	public class HomePage1 extends TestBase {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		By Home = By.xpath("/html/body/form/div[3]/div[1]/div[2]/a[1]");
		
		public boolean validateHomepage1() {
	     
			driver.findElement(Home).click();

			String parentWindow = driver.getWindowHandle();
			Set<String> totalWindows = driver.getWindowHandles();

			boolean flagResult = true;

			for (String obj : totalWindows) {

				if (!obj.endsWith(parentWindow)) {
					driver.close();

					driver.switchTo().window(obj);
					
                    wait(4000);
					
					try {
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div[2]/div[3]/h2")));	
						}catch(TimeoutException te) {
							System.out.println("in contact us page");
							captureScreenshot("HomeBack failure");
							flagResult = false;
						}
				}

			}
			if (flagResult) {
				String actResult = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[3]/h2"))
						.getText();
				System.out.println("text captured: " + actResult);
				return actResult.equals("CONTACT US");
			} else
				return false;
			

		}
		
			
	}
