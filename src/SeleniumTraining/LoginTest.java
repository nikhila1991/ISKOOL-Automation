package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

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
		System.out.println("Login Successful");
		
		//Thread.sleep(3000);


		//Removing existing  profile photo//
	
		driver.findElement(By.xpath("//div[@class='absolute bottom-0']")).click();
		//driver.findElement(By.cssSelector("input.absolute bottom-0")).click();
		System.out.println("Clicked on Profile photo button successful");
		driver.findElement(By.xpath("//span[.='Remove']")).click();
		//driver.findElement(By.xpath("//span[.='Cancel']")).click();
		driver.findElement(By.xpath("//span[.='Save']")).click();
		System.out.println("Profile pic removed successfully");
		
			
		//Upload Profile photo// //How to get the images here ????
		driver.findElement(By.xpath("//div[@class='absolute bottom-0']")).click();
		driver.findElement(By.xpath("//div[@class='text-lg']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[.='Save']")).click();
		//driver.findElement(By.xpath("//span[.='Cancel']")).click();
		Thread.sleep(3000);
				
		//Removing existing  cover photo//
		driver.findElement(By.xpath("//div[@class='absolute top-5 right-5 ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Remove'])[2]")).click();
		driver.findElement(By.xpath("(//span[.='Save'])[2]")).click();
		//driver.findElement(By.xpath("//span[.='Cancel'])[2]")).click();
		System.out.println("Cover photo removed successfully");
		
		
		
		//Upload cover photo// //How to get the images here ?
		driver.findElement(By.xpath("//div[@class='absolute top-5 right-5 ']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Upload photo')]")).click();	
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[.='Save']")).click();
		//driver.findElement(By.xpath("//span[.='Cancel']")).click();//cancel not working
		Thread.sleep(3000);
		
		
		
		
		//Adding a Post //Getting error Element not intractable???
		driver.findElement(By.xpath("//input[@id='basic_content']")).sendKeys("This is my first Automation post");
		/*driver.findElement(By.xpath("//div[@class='w-full px-1']")).sendKeys("This is my first Automation post");
		driver.findElement(By.xpath("//div[contains(text(),'Upload images')]")).click();	
		Thread.sleep(10000);*/
		driver.findElement(By.xpath("//span[.='Post']")).click();		
		
		
		//Editing Admin details from Home page// Why it is not working?????
		driver.findElement(By.xpath("//div[@class='absolute top-5 right-5 '])[2]")).click();
		driver.findElement(By.xpath("//input[@id='basic_first_name']")).sendKeys("Karan");
		driver.findElement(By.xpath("//input[@id='basic_last_name']")).sendKeys("Johar");
		driver.findElement(By.xpath("//input[@id='basic_headline']")).sendKeys("Passionate Actor and Director");
		driver.findElement(By.xpath("//input[@id='basic_country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='basic_region']")).sendKeys("Mumbai");
		//driver.findElement(By.xpath("(//span[.='Remove'])[3]")).click();
		driver.findElement(By.xpath("(//span[.='Save'])[3]")).click();
		
		//Automation for calendar
		
		
		//Automation to delete Post
		
		
		
		
		//driver.findElement(By.
		//driver.findElement(By.xpath("//span[.='Yes']")).click();
		//driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm'and span='Yes']")).click();
		//span[.='Yes']
		
		//driver.findElement(By.xpath("//span[@class,'ant-popover-buttons')]")).click();

		Thread.sleep(6000);		
		
				/*driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).click();
				//driver.findElement(By.xpath("//div[@class='flex items-center space-x-2 py-1 cursor-pointer text-red-400']")).click();
				System.out.println("Logout Successful");
		
		
		/*className("text-xs text-center line-clamp-2")).click();
		
		driver.find_element_by_xpath("//*[@class='action-btn cancel alert-display']") 
		
		Thread.sleep(6000);
		
		
		//driver.findElement(By.xpath("//div[@class='bg-white..........']")).click();
		/*System.out.println("Login Successful");
		driver.findElement(By.xpath("//div[@class='bg-white rounded-md text-black']")).click();
		driver.findElement(By.xpath("//div[@class='flex items-center space-x-2 py-1 cursor-pointer text-red-400']")).click();
		/*System.out.println("Logout Successful");*/
		//Thread.sleep(6000);  
	}

	}