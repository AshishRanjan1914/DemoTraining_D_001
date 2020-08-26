package seleniumUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelUI2SelectSce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\automationTools\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		
		Thread.sleep(4000);
		
		WebElement selectElement = driver.findElement(By.id("searchLanguage"));
		//
		Select selOpt = new Select(selectElement);

		//selected option verify
		String selectedElementText = selOpt.getFirstSelectedOption().getText();
		System.out.println("selectedElementText ::"+selectedElementText);
		
		//all
		List<WebElement> listOfAllSelect = selOpt.getOptions();
		int totalNumberOptions = listOfAllSelect.size();
		System.out.println("totalNumberOptions::"+totalNumberOptions);
		//get text and attribute of all options
		for (int i = 0; i < totalNumberOptions; i++) {
			System.out.println("Each Options at ::"+i+" and value ::"+listOfAllSelect.get(i).getText()+" and value"+listOfAllSelect.get(i).getAttribute("value"));
		}		
		
		//select & de-select options
		
		//select by index
		selOpt.selectByIndex(6);//
		Thread.sleep(2000);
		//select by value		
		selOpt.selectByValue("ast");
		Thread.sleep(2000);
		//select by text
		selOpt.selectByVisibleText("Deutsch");
		Thread.sleep(2000);
		
		//
		System.out.println("IsMuliSelect::"+selOpt.isMultiple());
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
