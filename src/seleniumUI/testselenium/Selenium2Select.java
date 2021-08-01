package testselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium2Select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		File file = new File("E:\\EclipseProjects\\workspace\\Adjfgsjdfgsjdfsdjfs\\src\\resources\\config.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			prop.load(fis);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(prop.getProperty("A"));
		System.out.println(prop.getProperty("B"));
		System.out.println(prop.getProperty("C"));
		System.out.println(prop.getProperty("D"));
		System.out.println(prop.getProperty("WikiURL"));
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\automationTools\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(); // chrome object

		driver.navigate().to(prop.getProperty("WikiURL")); // navigate to URL

		driver.manage().window().maximize(); // window maximize
		
		//wait for 5 sec
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Select element ---
		WebElement selectElement = driver.findElement(By.id(prop.getProperty("UsernameElement")));
		Select mySelectInstance = new Select(selectElement);
		
		System.out.println("selected option is::"+mySelectInstance.getFirstSelectedOption().getAttribute("value"));
		
		List<WebElement> allSelectOptionsElement = mySelectInstance.getOptions();		
		
		System.out.println("Total no of options :: "+allSelectOptionsElement.size());
		
		for (int i = 0; i < allSelectOptionsElement.size(); i++) {
			String optionText = allSelectOptionsElement.get(i).getText();
			String optionValue = allSelectOptionsElement.get(i).getAttribute("value");
			String optionLang = allSelectOptionsElement.get(i).getAttribute("lang");
			System.out.println("Text>>"+optionText + "Value Attribute >> "+optionValue + "optionLang" + optionLang);
		}
		
		
		Date date = new Date();
		
		// 3 ways - select
		mySelectInstance.selectByIndex(3);
		Thread.sleep(2000);
		System.out.println("selected option is::"+mySelectInstance.getFirstSelectedOption().getAttribute("value"));
		
		mySelectInstance.selectByValue("de");
		Thread.sleep(2000);
		System.out.println("selected option is::"+mySelectInstance.getFirstSelectedOption().getAttribute("value"));
		
		mySelectInstance.selectByVisibleText("Italiano");
		Thread.sleep(2000);
		System.out.println("selected option is::"+mySelectInstance.getFirstSelectedOption().getAttribute("value"));
		
		driver.close();
		
		

	}
	
	//actual vs Expected..  -- [A,B,C,D]

}
