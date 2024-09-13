package Browserlaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass    {
	
public static WebDriver driver;

	public static WebDriver launchbrowser() {
		
		return driver = new ChromeDriver();
		
	}
		public static void launchbrowser(String browser) {
		switch (browser) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 
			driver=new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			 
			driver=new EdgeDriver();
	
		}
/*
 * if(browser.equalsIgnoreCase("chrome")) {
 * 
 * WebDriverManager.chromedriver().setup();
 * 
 * driver=new ChromeDriver(); }
 */
	
/*
 * else if(browser.equalsIgnoreCase("edge")){
 * WebDriverManager.chromedriver().setup();
 * 
 * driver=new ChromeDriver();
 * 
 * } else { WebDriverManager.chromedriver().setup();
 * 
 * driver=new ChromeDriver();
 * 
 * }
 * 
 * }
 */
	}
		
	public static void urllaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	
	public static void implicitlyWait(long sec) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);           		

	}
	
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);
		
	}
	
	public static void click(WebElement e) {
		e.click();
		
	}
	
	public static void movetoelement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).build().perform();
		
	}
	
	public static void dragAndDrop(WebElement src,WebElement des) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src, des).build().perform();  
		
		}
	
	public static void selectbyindex(WebElement e, int index) {
		Select s= new Select(e);
		s.selectByIndex(index);
		
	}
	
}
