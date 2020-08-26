package seleniumUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class A{
	public A m1() {
		return new A();

	}
}

class B{
	public B m2() {
		return new B();

	}
}

public class SelUI1LaunchBrowser {	


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\automationTools\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");


		//Get title
		String pageTitle = driver.getTitle();
		System.out.println("pageTitle:: "+pageTitle);

		//Get Page URL
		String pageURL = driver.getCurrentUrl();
		System.out.println("pageURL:: "+pageURL);

		//Get Page Source
		String pageSource = driver.getPageSource();
		System.out.println("pageSource:: \n"+pageSource);
		
		
		//Locating an elements in selenium
		//Id
		//name
		//classname
		//tagname
		//linkText
		//partialLinkText
		//cssSelector 
		//xpath 
		
		WebElement usernameEle = driver.findElement(By.id("txtUsername"));
		//click
		usernameEle.click();
		//type
		usernameEle.sendKeys("Admin");		
		
		
		WebElement pwdEle = driver.findElement(By.id("txtPassword"));
		pwdEle.click();
		pwdEle.sendKeys("admin123");
		
		WebElement loginButtonEle = driver.findElement(By.name("Submit"));
		loginButtonEle.click();
		//another usages example
		//driver.findElement(By.name("Submit")).click();
		
		//multiple element matches - operate 1st element
		
		// browser back
		driver.navigate().back();
		//browser forward
		driver.navigate().forward();
		//browser refresh
		driver.navigate().refresh();

		//objects locators.. maven -- 

		Thread.sleep(2000);
		driver.quit();

	}

}
