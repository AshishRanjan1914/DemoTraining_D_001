package seleniumUI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelUIFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\automationTools\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/guru99home/");

		 
		//Sleep --
		Thread.sleep(4000);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='a077aa5e']")));
		
		//handling iframes
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='a077aa5e']")));

		driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']/img")).click();
		
		Thread.sleep(4000);		
		
		//close vs Quit
		driver.quit();
		
		
	}

}
