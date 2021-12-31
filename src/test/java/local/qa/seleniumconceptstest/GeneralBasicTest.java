package local.qa.seleniumconceptstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GeneralBasicTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/My Projects - Eclipse/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.quit();
		
		System.setProperty("webdriver.edge.driver", "D:\\My Projects - Eclipse\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.quit();
		
		
		
		
		
		
	}

}
