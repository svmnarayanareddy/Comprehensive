package Mindtree.Comprehensive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assessment_2 {
	@Test
	public static void Test2() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.marriott.com/default.mi");
		Thread.sleep(2000);
		/*
		driver.findElement(By.xpath("//button[@data-description='Sign In']")).click();
		driver.findElement(By.xpath("//*[@id='signin-userid']")).sendKeys("svmnarayanareddy@gmail.com");
		driver.findElement(By.id("signin-user-password")).sendKeys("Mindtree@4334");
		driver.findElement(By.xpath("//*[@id='container-26d2e6af1a']/div/div/header/div[2]/div[2]/div/div[2]/div/ul/li[6]/div/div[2]/form/div[3]/button")).click();
	*/
	}
	
}

