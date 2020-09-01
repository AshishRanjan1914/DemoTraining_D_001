package seleniumUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelUIAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\automationTools\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/delete_customer.php");

		// Waits in selenium... 
		//Sleep --
		Thread.sleep(2000);

		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Explicit wait..
		//500 ms - default pooling time.
		WebDriverWait wait  = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@value='Submit']")));

		driver.findElement(By.xpath("//*[@value='Submit']")).click();

		wait.until(ExpectedConditions.alertIsPresent());

		//handling alert..
		//switch to active alert

		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a1.getText());

		//cancel/no
		a1.dismiss();
		Thread.sleep(2000);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@value='Submit']")));

		driver.findElement(By.xpath("//*[@value='Submit']")).click();

		wait.until(ExpectedConditions.alertIsPresent());

		Thread.sleep(2000);
		Alert a2 = driver.switchTo().alert();

		System.out.println(a2.getText());

		//yes/ok
		a2.accept();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		Alert a3 = driver.switchTo().alert();
		System.out.println(a3.getText());
		Thread.sleep(2000);
		a3.accept();
		
		Thread.sleep(2000);
		
		driver.close();
		//fun castle../ ratu chatti..
	}

}
