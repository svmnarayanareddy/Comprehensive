package Mindtree.Comprehensive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
 
public class Assessment1 {
	@Test
	public static void Test1() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.marriott.com/default.mi");
		/*Actions a=new Actions(driver);
		//Redirecting to login page
		a.moveToElement(driver.findElement(By.xpath("//*[@id='sign-in-tooltip-id']"))).click().build().perform();
		driver.findElement(By.id("field-first-name")).sendKeys("SaiVenkataManohar");
		driver.findElement(By.id("field-last-name")).sendKeys("Kamireddy");
		//dropdown to country list
		driver.findElement(By.xpath("//*[@class='selectric']")).click();
		driver.findElement(By.id("selectric-opt099")).click();
		driver.findElement(By.xpath("//*[@id='field-email']")).sendKeys("svmnarayanareddy@gmail.com");
		driver.findElement(By.xpath("//*[@id='field-password']")).sendKeys("Mindtree@4334");
		driver.findElement(By.xpath("//*[@id='field-password-confirmation']")).sendKeys("Mindtree@4334");
		//clicking on join
		driver.findElement(By.xpath("//*[@id='enroll-join']")).click();
		Thread.sleep(2000);*/
		
	}
}
