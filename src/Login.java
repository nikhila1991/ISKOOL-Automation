import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM\\FirstTest\\src\\resources\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://128.199.22.62");


		driver.manage().window().maximize();
		/*Is-kool login Page*/
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("krish@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("krish123");
		driver.findElement(By.xpath("//span[.='Log in']")).click();
		//driver.findElement(By.xpath("//div[@class='bg-white..........']")).click();
		System.out.println("Login Successful");
		Thread.sleep(6000);
				
		//clicking on profile photo//
		driver.findElement(By.xpath("//div[@class='absolute bottom-0']")).click();
		System.out.println("Clicked on Profile pic");
		driver.findElement(By.xpath("//div[@class='text-lg']")).click();	
		driver.findElement(By.xpath("//span[.='Save']")).click();
		driver.findElement(By.xpath("//span[.='Remove']")).click();
		System.out.println("Clicked on Profile pic");
		
		driver.findElement(By.xpath("//div[@class='bg-white rounded-md text-black']")).click();
		driver.findElement(By.xpath("//div[@class='flex items-center space-x-2 py-1 cursor-pointer text-red-400']")).click();
		System.out.println("Logout Successful");
		Thread.sleep(6000);  
		
		//Thread.sleep(6000); 
		/*Upload and Remove photo*/
			
		
		
		
		//Thread.sleep(6000);
		
		/*Logout of Is-kool*/
		//driver.findElement(By.xpath("//div[@class='text-black']")).click();
		//System.out.println("clicked on profile button at right corner");
		//driver.findElement(By.xpath("//div[.='Logout']")).click();
		
		//driver.findElements(By.xpath("//div"))	
		
		//driver.close();*/

	}

}
