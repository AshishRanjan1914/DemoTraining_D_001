package testselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium1navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\automationTools\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); // chrome object
		
		//static wait
		Thread.sleep(2000);
		
		//implicit wait timeout
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.get("URL");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/"); // navigate to URL
		
		driver.manage().window().maximize(); // window maximize

		//Navigation cmds
		driver.navigate().back();		
		driver.navigate().forward();		
		driver.navigate().refresh();
		
		//Explicit wait..
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.alertIsPresent());
		
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		
		
		
		// WebElement.. 8 ways to locate..
		/*
		WebElement loginB = driver.findElement(By.id("btnLogin"));
		loginB.click(); // click
		WebElement submitB = driver.findElement(By.name("Submit"));
		submitB.sendKeys(""); // type
		WebElement inputB = driver.findElement(By.tagName("input"));
		inputB.clear(); // clear
		WebElement buttonB = driver.findElement(By.className("button"));
		WebElement ForgetLinkB = driver.findElement(By.linkText("Forgot your password?"));
		WebElement ForgetPartialLinkB = driver.findElement(By.partialLinkText("your password?"));
		WebElement cssButtonB = driver.findElement(By.cssSelector(""));
		WebElement xpathButtonB = driver.findElement(By.xpath(""));*/
		
		WebElement userNameFieldElement = driver.findElement(By.id("txtUsername"));
		userNameFieldElement.sendKeys("Admin");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		WebElement passwordFieldElement =  driver.findElement(By.id("txtPassword"));
		passwordFieldElement.click();
		passwordFieldElement.sendKeys("admin123");
		
		WebElement loginButtonElement = driver.findElement(By.id("btnLogin"));//
		loginButtonElement.click();
		
		/*
		 * Relative xpath = xpath = //tagname[@attribute = 'attributeValue'] //div[@id = 'divLoginButton']/input
		 * //*[@id="btnLogin"]
		 * link - a
		 * //a
		 * Absolute xpath =  /html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input
		 *  / - start of the node / immediate child
		 *  // - in the entire HTML ..
		 */
		
		try {
			Thread.sleep(4000); // pause 4 sec
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();// close current windows
		
		
		

	}

}
