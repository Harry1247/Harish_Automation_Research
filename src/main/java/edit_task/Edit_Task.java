package edit_task;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit_Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//System.out.println("Able to launch the app");
		
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("puppetter@testleaf.com");
		driver.findElementById("password").sendKeys("Bootcamp$123");
		driver.findElementById("Login").click();
		
		//Clicking n Togggle button:
		
		//driver.findElementBXPath("(//button[contains(@class,'bare slds-icon-waffle_container')]")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'bare slds-icon-waffle_container')]")).click();
		
		
		//Clicking on view all
		
		driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']/button")).click();
		
		
		
		Thread.sleep(3000);
		//Clicking on sales link :
		driver.findElementByXPath("//p[text()='Sales']").click();
		
		
	//Clicking on Task:
			
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@data-id='Task']").click();
		
		
		Thread.sleep(1500);
		driver.findElementByXPath("//a[@title='Select List View']").click();
		
		Thread.sleep(1500);
		driver.findElementByXPath("(//*[text()='Recently Viewed'])[3]").click();
		
		Thread.sleep(1500);
		driver.findElementByXPath("//*[text()='Bootcamp']").click();
		
		Thread.sleep(1500);
		driver.findElementByXPath("//a[@title='Show 13 more actions']").click();
		
		Thread.sleep(1500);
		driver.findElementByXPath("//a[@title='Edit']").click();
		
		
		Thread.sleep(1500);
		driver.findElementByXPath("//a[@class='datePicker-openIcon display']").click();
		
		Date date = new Date(0);  
	    @SuppressWarnings("deprecation")
		int today = date.getDate();
	    
	    Thread.sleep(1500);
		driver.findElementByXPath("//span[text()='"+today+"']").click();
		
		Thread.sleep(1500);
		driver.findElementByXPath("(//a[@class='select'])[2]").click();
		
		Thread.sleep(1500);
		driver.findElementByXPath("//*[text()='Low']").click();
		
		//Clicking on Save:
		driver.findElementByXPath("(//*[@class='slds-button slds-button--brand cuf-publisherShareButton uiButton'])").click();
		
	}
}
		
		


		
		
		
		
		
		
		 //JavascriptExecutor executor = (JavascriptExecutor) driver;
		 //Object sales1 = null;
		//executor.executeScript ("arguments[0].click();" , sales1);
		
		 //System.out.println("sales link is clicked");
		
		
		
		
		
		
		
		
		
	

	