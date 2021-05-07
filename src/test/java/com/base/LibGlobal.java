package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	public static WebDriver driver;
	
	
	public void  getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEW\\eclipse-workspace\\Cucumber2Day\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	public void loadUrl(String url) {
		driver.get(url);
	}
	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}
	public void btnClick(WebElement element) {
		element.click();
	}
	
    public static void select ( WebElement element, String name) {
    	Select s = new Select(element);
    	s.selectByVisibleText(name);
    }
    
     
    
	public void quitBrowser() {
		driver.quit();
		

	}
	
	
}
	


