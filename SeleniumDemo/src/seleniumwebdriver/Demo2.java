package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91951\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement username=driver.findElement(By.id("txtUsername"));
		if(username.isEnabled())
		{
			username.clear();
			username.sendKeys("Admin");
		}
		if(username.isDisplayed())
		{
			WebElement pwd = driver.findElement(By.id("txtPassword"));
			pwd.clear();
			pwd.sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			List<WebElement> link=driver.findElements(By.tagName("a"));
			System.out.println(link.size());
			for(WebElement a: link)
				System.out.println(a.getText());
		}
		else
		{
			System.out.println("Not displayed");
		}
		driver.close();
	}

}
