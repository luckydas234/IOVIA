package IOVIO.IOVIOFW;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import okhttp3.internal.platform.Platform;

public class Profile_Update 
{
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/sulagnajee/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Naukri_Update(driver);
		//Monster_Update(driver);
		//Shine_Update(driver);
	}
	public static void Naukri_Update(WebDriver driver)
	{try {
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.manage().window().maximize();
		driver.findElement(By.id("usernameField")).sendKeys("biswaranjan.das275@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Lucky@275");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='My Naukri']")).click();
		driver.findElement(By.xpath("//*[text()='Edit Profile']")).click();
		//driver.switchTo().window(parent);
		driver.findElement(By.xpath("//*[text()='Resume Headline']/following-sibling::span")).click();
		System.out.println("Hello");
		driver.switchTo().frame(driver.findElement(By.className("s12 lbpadding")));
		System.out.println("Hello");
		driver.findElement(By.xpath("//div[@class='action s12']//*[text()='CANCEL']/following-sibling::button[text()='Save']")).click();
	}finally {
		driver.findElement(By.xpath("//*[text()='My Naukri']")).click();
		driver.findElement(By.xpath("//*[@title='Logout']")).click();
	}
	}
	
	
	public static void Monster_Update(WebDriver driver)
	{try {
		driver.get("https://www.monsterindia.com/rio/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("usernameField")).sendKeys("biswaranjan.das275@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Lucky@275");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[text()='My Naukri']")).click();
		
		driver.findElement(By.xpath("//*[text()='Edit Profile']")).click();
		
		
		driver.findElement(By.xpath("//*[text()='Resume Headline']/following-sibling::span")).click();
		
		
		driver.findElement(By.xpath("//*[text()='Save' and @type='submit']")).click();
	}finally {
		driver.findElement(By.xpath("//*[text()='My Naukri']")).click();
		driver.findElement(By.xpath("//*[@title='Logout']")).click();
	}
	}
	
	public static void Shine_Update(WebDriver driver)
	{try {
		driver.get("https://www.monsterindia.com/rio/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("usernameField")).sendKeys("biswaranjan.das275@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Lucky@275");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[text()='My Naukri']")).click();
		driver.findElement(By.xpath("//*[text()='Edit Profile']")).click();
		driver.findElement(By.xpath("//*[text()='Resume Headline']/following-sibling::span")).click();
		
		
		driver.findElement(By.xpath("//*[text()='Save' and @type='submit']")).click();
	}finally {
		driver.findElement(By.xpath("//*[text()='My Naukri']")).click();
		driver.findElement(By.xpath("//*[@title='Logout']")).click();
	}
	}
	

}
