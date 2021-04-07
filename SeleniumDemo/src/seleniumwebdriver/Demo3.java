package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91951\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("sakshi");
		driver.findElement(By.name("password")).sendKeys("sakshi");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//*[@href='reservation.php']")).click();
		driver.findElement(By.xpath("//*[@name='tripType'][2]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
