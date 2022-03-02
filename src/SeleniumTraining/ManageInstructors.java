package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageInstructors {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\FirstTest\\src\\resources\\chromedriver_win32\\chromedriver.exe");
		//Driver initiation  ---> Variable to access Web driver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Getting/opening the URL
		driver.get("http://128.199.22.62");
		driver.manage().window().maximize();
		
		/*Is-kool login Page*/
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("krish@gmail.com"); ---> Direct method
		WebElement adminUsername = driver.findElement(By.id("normal_login_email"));
		adminUsername.sendKeys("krish@gmail.com");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("krish123"); ---> Direct method
		WebElement adminPassword = driver.findElement(By.id("normal_login_password"));
		adminPassword.sendKeys("krish123");
		driver.findElement(By.xpath("//span[.='Log in']")).click();
		System.out.println("Login Successful");
		
		Thread.sleep(6000);
		
		
										/*Manage Instructors*/
		
		//driver.findElement(By.xpath("//div[@class='text-xs text-center line-clamp-2']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Manage Instructors')]")).click();
		System.out.println("Manage Instructors click Successful");
		Thread.sleep(6000);
							/*Add New Instructor*/
		driver.findElement(By.xpath("//span[.='Add New Instructor']")).click();
		driver.findElement(By.xpath("//input[@id='basic_first_name']")).sendKeys("Karunakar1");
		driver.findElement(By.xpath("//input[@id='basic_last_name']")).sendKeys("SubbaRaj");
		driver.findElement(By.xpath("//input[@id='basic_username']")).sendKeys("KaranJohar");
		driver.findElement(By.xpath("//input[@id='basic_email']")).sendKeys("karanJohar@gmail.com");
		driver.findElement(By.xpath("//input[@id='basic_password']")).sendKeys("shaila123");
		driver.findElement(By.xpath("//input[@id='basic_confirm']")).sendKeys("shaila123");
		driver.findElement(By.xpath("//input[@id='basic_department']")).sendKeys("Department of Maths");
		driver.findElement(By.xpath("//input[@id='basic_title']")).sendKeys("Mathematician");
		driver.findElement(By.xpath("//span[.='Save']")).click();
		driver.findElement(By.xpath("//span[.='Cancel']")).click();
		Thread.sleep(6000);
							/*Search Instructor*/
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("parinithi");
		driver.findElement(By.xpath("//span[.='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Parinithi')]")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}
}