package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTesting {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("poojarawat572@gmail.com");
	driver.findElement(By.id("Pass")).sendKeys("8700348443");
	
		

	}
}
