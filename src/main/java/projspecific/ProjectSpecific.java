package projspecific;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.DataLibrary;




public class ProjectSpecific {


	// TODO Auto-generated method stub

	public ChromeDriver driver	;
	public String excelfileName;

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {


		//driver.get("https://login.salesforce.com/");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("puppetter@testleaf.com");
		driver.findElementById("password").sendKeys("Bootcamp$123");
		driver.findElementById("Login").click();




	}


	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
	
	@DataProvider(name="fdata")
	public Object[][] getdata() throws IOException{
		return DataLibrary.readExcelData(excelfileName);
	}

}






