package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Progress {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("firstname");
		
		driver.findElement(By.id("lastNameField")).sendKeys("lastname");
		
		driver.findElement(By.name("firstNameLocal")).sendKeys("name");
		
		driver.findElement(By.name("lastNameLocal")).sendKeys("last");
		
		driver.findElement(By.name("departmentName")).sendKeys("ece");
		
		driver.findElement(By.name("description")).sendKeys("test do not deploy");
		
		driver.findElement(By.name("primaryEmail")).sendKeys("test@test.com");
		
		WebElement eleDropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dropdown = new Select(eleDropdown);
		dropdown.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.name("description")).clear();
		
		driver.findElement(By.name("importantNote")).sendKeys("important");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title = driver.getTitle();
		System.out.println("The title is" + title);
		
		driver.close();
		
		
		
		
		
		
		
		
		

	
}
	}


