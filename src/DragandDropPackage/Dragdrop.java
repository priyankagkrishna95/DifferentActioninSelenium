package DragandDropPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\eclipse-workspace\\Action_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//HouseKeepingjobs
		driver.manage().window().maximize();
		

		driver.get("https://demoqa.com/");
		WebElement clickdropabble = driver.findElement(By.xpath("//a[text()='Droppable']"));
		clickdropabble.click();
		WebElement sourceLocator = driver. findElement(By. xpath("//div[@id=\"draggable\"]"));
		WebElement targetLocator = driver. findElement(By. xpath("//div[@id=\"droppable\"]"));
		Actions action = new Actions(driver);
		action. dragAndDrop(sourceLocator, targetLocator). build(). perform();
		WebElement validatedropped = driver.findElement(By.xpath("//p[text()='Dropped!']"));
		if(validatedropped.isDisplayed())
		{
			System.out.println("Drag and Drop done succesfully");
		}

}
}
