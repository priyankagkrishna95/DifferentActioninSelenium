package DatePickerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\eclipse-workspace\\Action_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//HouseKeepingjobs
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		WebElement date = driver.findElement(By.xpath("//a[text()='Datepicker']"));
		date.click();
		WebElement datepicker = driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
		datepicker.click();
		WebElement selecttoday = driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']/a"));
		selecttoday.click();
		System.out.println("date selected succesfully");
		
		

}
}

