package Mindtree.Comprehensive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assessment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.marriott.com/default.mi");
		Thread.sleep(2000);
		
		//selecting destination box
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@name='destinationAddress.destination']"))).click().build().perform();
		
		//giving destination address
		driver.findElement(By.xpath("//input[@name='destinationAddress.destination']")).sendKeys("Hyderabad");
		
		//clicking on Find Hotels
		driver.findElement(By.xpath("//button[text()='Find Hotels']")).click();
		
		//Selecting first one in the page
		driver.findElement(By.xpath("//*[@href='/search/hotelQuickView.mi?propertyId=HYDCY&brandCode=CY&marshaCode=HYDCY']")).click();
		Thread.sleep(2000);
		
		//Clicking on continue button
		driver.findElement(By.xpath("//*[@id='merch-property-results']/div/div/div[2]/div/div/a[2]/div")).click();
		Thread.sleep(2000);
		
		//Selecting member rate flexible one
		driver.findElement(By.xpath("//*[@data-formaction='https://www.marriott.com/reservation/v2/selectRate.mi']")).click();
		
		
		
	}

}
