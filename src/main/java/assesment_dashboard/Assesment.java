package assesment_dashboard;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assesment {

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
		
			
		
		//driver.findElement(By.xpath("//one-applaunchermodal_applaunchermodal[@@class='slds-grid slds-grid_pull-padded slds-wrap app-dnd-identifier']")).click();
		
		
		//Clicking on service App Launcher:
		
		WebElement element=driver.findElement(By.xpath("//p[text()='Service Console'] "));	
		 JavascriptExecutor executor = (JavascriptExecutor) driver;
		 executor.executeScript ("arguments[0].click();" , element);
		System.out.println("Service Console is clicked");
		
		//Thread.sleep(3000);
		
		
		//Clicking on Home Dropdown:
		
		
		//driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon slds-p-horizontal__xxx-small slds-button_icon-small slds-button_icon-container']")).click();
		//System.out.println("Home dropdon clicked");

		Thread.sleep(10000);
		
		driver.findElement(By.xpath("(//a[@class='menuItem'])[7]")).click();
		
		//System.out.println("Home dropdon clicked");
		//Setting as Goal:
		
		//Navigating to dropdon list box:
		
		driver.findElement(By.xpath("//button[@title='Show Navigation Menu']/lightning-primitive-icon")).click();
		System.out.println("clicked the list box");
		Thread.sleep(15000);
		
		//Clicking on homedropdown
		
	    //driver.findElement(By.xpath("(//a[@class='menuItem'])[7]")).click();		
		
		driver.findElement(By.xpath("(//*[@class='slds-listbox__item'])[6]")).click();
	 	System.out.println("Home dropdon clicked");
		Thread.sleep(2000);
		
		//Add + Close
		
		//Getting the text of closed 		
		String firstclosed=driver.findElement(By.xpath("(//span[@class='metricAmount uiOutputText'])[1]")).getText();
		System.out.println("closed value has been obtained");
		
		
		//Getting the text of opened value:
		String firstopened=driver.findElement(By.xpath("(//span[@class='metricAmount uiOutputText'])[2]")).getText();
		System.out.println("Opened value 0 has been obtained");
		
		//Replacing $0 to integer just to 0 for closed:
		
		firstclosed.replaceAll("\\W", " ");
		System.out.println("closedreplecedwithinteger");
		
		//Replacing $0 to integerjust to 0 for open:
		
		firstopened.replaceAll("\\W", " ");
		System.out.println("openreplecedwithinteger");
		
		
		//Getting Goal text:
		
		driver.findElement(By.xpath("(//span[@class='metricAmount uiOutputText'])[3]")).getText();
		System.out.println("Goal text is obtained");
		
		//Clicking on edit button in Goal:
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon slds-m-left--x-small editGoal slds-button_icon-bare homeGoalSetting']")).click();
		System.out.println("Goal Edit Button is clisked");
		
		//Clearing the text box and entering the value 10000:
		
		WebElement goaledit = driver.findElement(By.xpath("//button[@class='input uiInputSmartNumber uiInput uiInput--default uiInput--input']"));
		
		goaledit.clear();
		
		goaledit.sendKeys("10000");
		
		//Clicking on Save
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton']")).click();
		System.out.println("Clicked on save");
		
		
		driver.findElement(By.xpath("//button[@title='Show Navigation Menu']/lightning-primitive-icon")).click();
		System.out.println("Drodown is clicked");
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[@class='menuLabel slds-listbox_option-text slds-listbox_option-text_entity']/following::li[4]")).click();		
	 	System.out.println("Select Dashboard from the DropDown");
	 	
		
//Clciking on new Dashboard:

driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
System.out.println("New dashboard is clicked succesffuly");
Thread.sleep(4000);

//Enter bootcamp1 in name textbox:

WebElement boot=driver.findElement(By.xpath("//input[@id='dashboardNameInput']"));
boot.sendKeys("Bootcamp1");
System.out.println("YourName_Bootcamp is eneterd");

//Enter description as testing

driver.findElement(By.xpath("//input[@id='dashboardDescriptionInput']")).sendKeys("Testing");
System.out.println("Testing is enetered");

//Clicking on Create Dashboard:
driver.findElement(By.xpath("//button[text()='Create']")).click();
System.out.println("Create is clicked");
Thread.sleep(5000);


//Clcikingon Done:(It is in Frmae,so I frame is used)

driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='dashboard']")));
WebElement done=driver.findElement(By.xpath("//button[@class='slds-button doneEditing']"));
executor.executeScript("arguments[0].click();" , done);
System.out.println("Done is clicked");


//Subscribe

WebElement subscribe=driver.findElement(By.xpath("//button[text()='Subscribe']"));
executor.executeScript("arguments[0].click();" , subscribe);
System.out.println("Subscribe is clicked");
Thread.sleep(3000);
driver.switchTo().parentFrame();

//Clicking on daily:


driver.findElement(By.xpath("//span[text()='Daily']")).click();
System.out.println("daily is clicked");


//Clicking on time 10 AM:
driver.findElement(By.xpath("//option[text()='10:00 AM']")).click();
System.out.println("10:00 AM time  clicked");

//Clicking on Save:

driver.findElement(By.xpath("//span[text()='Save']")).click();
System.out.println("Save is clicked");
Thread.sleep(3000);

////Closing Your Bootcamp tab:

driver.findElement(By.xpath("//button[@title='Close Bootcamp1']")).click();
System.out.println("Closed Bootcamp1 tab");

//Clicking on Private Dashboards:


driver.findElement(By.xpath("(//a[@title='Private Dashboards'])[1]")).click();
System.out.println("Private dashboard is clicked");
Thread.sleep(3000);

//Under Private Dashboard Verifying the newly created dashboard is available or not:

WebElement newdashname= driver.findElement(By.xpath("(//lightning-primitive-cell-factory[@data-label='Dashboard Name'])[5]/span/divdiv/lightning-formatted-url/a"));
newdashname.getAttribute("title");
newdashname.getText();
System.out.println("titlename");
System.out.println("createddashname");

//Clicking on Dropdown::


  WebElement drpd=driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small'])[1]"));
executor.executeScript("arguments[0].click();" , drpd);
System.out.println("Dropdown is clicked");
WebElement drpd1=driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small'])[1]"));
executor.executeScript("arguments[0].click();" , drpd1);
System.out.println("Dropdown is clicked");


//Selecting delete :

driver.findElement(By.xpath("//span[text()='Delete']")).click();


//Confirming the delete

driver.findElement(By.xpath("(//span[text()='Delete'])[2]")).click();
Thread.sleep(3000);


//Verifying the item is not available in pivate dashboard after deletion

WebElement item1=driver.findElement(By.xpath("(//lightning-primitive-cell-factory[@data-label='Dashboard Name'])[1]/span/div/lightning-formatted-url/a"));
String taskname2=item1.getText();
System.out.println(taskname2);
if (taskname2.equals(taskname2)) {
	System.out.println("Delete fail");
		}
else {
	System.out.println("Delete successful");
}

driver.close();

}

}



















	

		
		
		
		
		
		
		
		
	