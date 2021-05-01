package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Week2day1program {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
	ChromeDriver driver = new ChromeDriver();
		
	driver.get("http://leaftaps.com/opentaps");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("urjanet");
	
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("manual");
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("tester");
	
	WebElement eleDropdown1=driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd1=new Select(eleDropdown1);
    dd1.selectByVisibleText("Partner");
    
    WebElement dd2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	
	Select d = new Select(dd2);
	d.selectByVisibleText("Automobile");
	
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("myfirst");
	
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("company");
	
	driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("testid");
	
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/05/1995");
	
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Rubicon");
	
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing team");
	
    WebElement dd3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	
	Select d1 = new Select(dd3);
	d1.selectByVisibleText("Media");
	
    WebElement dd4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	
	Select d2 = new Select(dd4);
	d2.selectByVisibleText("Partnership");
	
	
	driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("200000");
	
	driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("16");
	
	driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("600073");
	
	driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("manualid");
	
	driver.findElement(By.id("createLeadForm_description")).sendKeys("test do not deploy");
	
	driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("test id creation");
	
	driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
	
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9361722647");
	
	driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("chennai");
	
	driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("primary");
	
	driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("784596");
	
	
	driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("test.com");
	
	//primary contact
	
	driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("testingteam");
	
	driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("attender");
	
	driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("perungalathur");
	
	driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("california");
	
	
	WebElement dd7 =driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select d5 = new Select(dd7);
	d5.selectByVisibleText("India");
	
	driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
	
	driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("6000063");
	
	driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("52");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	driver.findElement(By.linkText("Duplicate Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Capgemini");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	String text3 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	
	if (text3.contains("Capgemini")) {
		System.out.println(text3 + "is the updated company name");
		
		System.out.println("Updated company name is verified");
	} else {

		System.out.println("company name is wrong");
	}
	
	
    
	
	
	
	
	
	
	

	}

}
