package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Help {
	
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
		
		/*Help*/
		
		driver.findElement(By.xpath("//div[contains(text(),'Help')]")).click();
		System.out.println("click on Help button successful");
		driver.findElement(By.xpath("//span[.='ADD']")).click();
		driver.findElement(By.xpath("//input[@id='create-Help_question']")).sendKeys("What is the automation type of this Application?");
		driver.findElement(By.xpath("//textarea[@id='create-Help_answer']")).sendKeys("Selenium is used for automation of this Application.");
		driver.findElement(By.xpath("//span[.='Create']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'anticon anticon-delete')]")).click();
		
	}

}
