package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2day2 {

	public static void main(String[] args) throws InterruptedException {
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
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Find Contacts")).click();
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		
		driver.findElement(By.xpath("//label[text()='Email Address:']/following::input")).sendKeys("XYZ@gmail.com");
		
		driver.findElement(By.linkText("Find Contacts")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewContact?partyId=10033']")).click();
		
		
		

	}

}
