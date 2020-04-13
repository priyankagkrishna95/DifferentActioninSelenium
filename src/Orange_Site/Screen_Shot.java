package Orange_Site;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.*;
import org.apache.commons.FileUtils;



public class Screen_Shot {
	
	
	private static final TakesScreenshot driver = null;
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\eclipse-workspace\\Action_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//HouseKeepingjobs
		driver.manage().window().maximize();
		

		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement uname = driver.findElement(By.id("txtUsername"));
		WebElement pass = driver.findElement(By.id("txtPassword"));
		WebElement submit = driver.findElement(By.id("btnLogin"));
		uname.sendKeys("Admin");
		pass.sendKeys("admin123");
		submit.click();
		WebElement Dash = driver.findElement(By.xpath("//h1[text()='Dashboard']"));
	
		if(Dash.isDisplayed())
		{
			System.out.println("Navigated to Dashboard");
		}
	
	
	}	
		public static void main1(String[] args1) throws Exception {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("C:\\\\Users\\\\Priyanka\\\\eclipse-workspace\\\\Action_Project"));
			System.out.println("the Screenshot is taken");
		}
		
}

