package seleniumUI;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelUIMultiWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\automationTools\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/popup.php");

		//Multiple windows
		
		String mainWindow = driver.getWindowHandle();
				 
		System.out.println("mainWindow :: "+mainWindow);
		//Sleep --
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Click Here")));
		
		driver.findElement(By.linkText("Click Here")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("allWindowHandles :: "+allWindowHandles);
		
		for (String eachWindow : allWindowHandles) {
			if(eachWindow!=mainWindow) {
				driver.switchTo().window(eachWindow);
			}			
		}
		
		String newWindow = driver.getWindowHandle();
		System.out.println(newWindow);
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("random123@cc.com");

		Thread.sleep(3000);		
		
		driver.switchTo().window(mainWindow);
		
		System.out.println("Finally ::"+driver.getWindowHandle());
		
		driver.quit();
	}

}
