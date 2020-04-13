package KeyboardEventPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardEvents {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\eclipse-workspace\\Action_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//HouseKeepingjobs
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement keyboardevent = driver.findElement(By.xpath("//a[text()='Keyboard Events Sample Form']"));
		keyboardevent.click();
		WebElement username =  driver.findElement(By.xpath("//input[@id=\"userName\"]"));
		username.sendKeys("pri");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		WebElement address =  driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("Address AABC");
		act.sendKeys(Keys.TAB).build().perform();
		WebElement paddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		paddress.sendKeys("Abbc 12345,Caifornia , America,USA");
		WebElement submit = driver.findElement(By.xpath("//input[@id='submit']"));
		submit.click();
		driver.switchTo().alert().accept();
		System.out.println("Done");
		
		
		

}
}
