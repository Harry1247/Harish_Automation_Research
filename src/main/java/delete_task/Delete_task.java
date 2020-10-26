package delete_task;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete_task {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
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
					
				
					//Clicking n Toggle button
					Thread.sleep(1500);			
					driver.findElementByXPath("(//span[text()='Setup'])[4]/preceding::button[1]").click();
					
					Thread.sleep(1500);
					driver.findElementByXPath("//button[text()='View All']").click();
					
					Thread.sleep(1500);
					driver.findElementByXPath("//p[text()='Sales']").click();
					
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
					driver.findElementByXPath("//a[@title='Delete']").click();
					
					Thread.sleep(1500);
					
					
					driver.findElementByXPath("(//*[@class='slds-button slds-button--brand cuf-publisherShareButton uiButton'])").click();

		}
					
					
		}
	

