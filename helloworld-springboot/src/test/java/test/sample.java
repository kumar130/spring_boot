package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseUrl = "http://google.com/";
		driver.get(baseUrl);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.xpath("//li//input[@value='Google Search']")).click();
		driver.close();
		driver.quit(); 
		 


	}

}
