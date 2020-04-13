package DropdowmPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\eclipse-workspace\\Action_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//HouseKeepingjobs
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		WebElement selectdropdowm = driver.findElement(By.xpath("//a[text()='Selectmenu']"));
		selectdropdowm.click();
		
		WebElement speed = driver.findElement(By.xpath("//span[@id=\"speed-button\"]"));
		speed.click();
		WebElement selectFast = driver.findElement(By.xpath("//div[@id=\"ui-id-4\"]"));
		selectFast.click();
		
		WebElement file = driver.findElement(By.xpath("//span[@id=\"files-button\"]"));
		file.click();
		WebElement selectfile =driver.findElement(By.xpath("//div[@id=\"ui-id-7\"]"));
		selectfile.click();
		
	
}
}



