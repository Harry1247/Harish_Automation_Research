package vannilaScriptForSalesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006_NewCase {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//ChromeDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

//		Authentication
		driver.findElementById("username").sendKeys("dhivya@testleaf.com");
		driver.findElementById("password").sendKeys("India@123");
		driver.findElementById("Login").click();

		Thread.sleep(20000);
		
//		Click SVG Icon
		//WebElement svg = driver.findElementByXPath("//div[@class='slds-global-header__item']//li[4]//a");
		//svg.sendKeys(Keys.ENTER);
		
		WebElement plus = driver.findElementByXPath("//*[@class='slds-icon slds-icon_x-small']");
		

		Thread.sleep(15000);
		plus.click();
		
		System.out.println("Able to click SVG");
		
		
//		Click New Event and maximize it
		//Actions builder = new Actions(driver);
		//builder.click(driver.findElementByXPath("(//span[text()='New Opportunity'])[4]"));
		//Thread.sleep(2000);
		
		driver.findElementByXPath("(//span[@class='actionLabel'])[5]").click();
		
		
		
		
		
		//builder.click(driver.findElement(By.xpath("//button[@title='Maximize']"))).perform();
		
		 //driver.findElementByXPath("(//span[text()='Opportunity Name'])").sendKeys("On site");
										
		
		System.out.println("new opportunity name is entered");
		
		//driver.findElementByXPath("//span[text()='Stage']/../following-sibling::div").click();
		
		driver.findElementByXPath("//a[text()='Prospecting']").click();
			
		driver.findElementByXPath("(//span[text()='Save'])[2]").click();
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}