package testselenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.xml.internal.ws.wsdl.ActionBasedOperationSignature;

public class Selenium3SwitchEvent {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\automationTools\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // chrome object
		/*driver.navigate().to("http://demo.guru99.com/test/delete_customer.php"); // navigate to URL
		driver.manage().window().maximize(); // window maximize		
		WebDriverWait wait3 = new WebDriverWait(driver, 1);
		WebElement submitButtonEle = driver.findElement(By.xpath("//input[@Value='Submit' and @name='submit']"));
		wait3.until(ExpectedConditions.elementToBeClickable(submitButtonEle));		
		submitButtonEle.click();		
		wait3.until(ExpectedConditions.alertIsPresent());
		//switching to alert//
		Alert alert1 = driver.switchTo().alert();		
		System.out.println(alert1.getText());		
		alert1.dismiss();//cancel/no/dismiss		
		Thread.sleep(4000);		
		submitButtonEle.click();
		wait3.until(ExpectedConditions.alertIsPresent());		
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(4000);
		//alert2.sendKeys("type text on alert");
		alert2.accept();//accept/yes/confirm		
		wait3.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(4000);
		Alert alert3 = driver.switchTo().alert();		
		System.out.println(alert3.getText());
		alert3.accept();*/
		
		//iframe
		/*
		driver.navigate().to("http://demo.guru99.com/test/guru99home/"); // navigate to URL
		driver.manage().window().maximize(); // window maximize		
		WebDriverWait wait3 = new WebDriverWait(driver, 1);
		
		WebElement iframeElement = driver.findElement(By.id("a077aa5e"));
		
		wait3.until(ExpectedConditions.presenceOfElementLocated(By.id("a077aa5e")));
		
		driver.switchTo().frame(iframeElement);
		
		WebElement ele1 = driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']/img"));
		ele1.click();
		//switching to default html node
		 * 
		 * //Convert webdriver to TakeScreenshot - Ashot
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile , new File("C:\\temp\\screenshot.png));
		 * 
		driver.switchTo().defaultContent();	*/
		
		// multiple windows..
		driver.navigate().to("http://demo.guru99.com/popup.php"); // navigate to URL
		driver.manage().window().maximize(); // window maximize		
		WebDriverWait wait3 = new WebDriverWait(driver, 2);		
		wait3.until(ExpectedConditions.elementToBeClickable(By.linkText("Click Here")));
		
		//  taking screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;	
		File screenShotFile = ts.getScreenshotAs(OutputType.FILE);
		//File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)
		
		FileUtils.copyFile(screenShotFile , new File("E:\\EclipseProjects\\workspace\\Adjfgsjdfgsjdfsdjfs\\screenshot"+Math.random()+".png"));
				
		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow>>"+parentWindow);
		System.out.println("Before Click Title of page>>"+driver.getTitle()+" <<And URL>> "+ driver.getCurrentUrl());
		driver.findElement(By.linkText("Click Here")).click();
		System.out.println("After Click Title of page>>"+driver.getTitle()+" <<And URL>> "+ driver.getCurrentUrl());
				
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("allWindowHandles"+allWindowHandles);
		
		for (String window : allWindowHandles) {
			if (!window.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(window);
				System.out.println("Title of page>>"+driver.getTitle()+" <<And URL>> "+ driver.getCurrentUrl());
			}		
		}
		driver.close();
		driver.switchTo().window(parentWindow);		
		System.out.println("After Close of one win Title of page>>"+driver.getTitle()+" <<And URL>> "+ driver.getCurrentUrl());
		
		driver.close();
		
		//Actions Class..
		Actions act = new Actions(driver);
		act.contextClick().click().clickAndHold().moveToElement(driver.findElement(By.id(""))).doubleClick(driver.findElement(By.xpath(""))).build().perform();
		
		// JSscript execute .. 
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,100)");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,100)");
		
		//scroll
		WebElement element = driver.findElement(By.id("id_of_element"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		
		// *TestNG*
		
		//BDD - Gerkin - Cucumber + Jbehave+ cucumber-JVM+ Specflow		

	}

}
