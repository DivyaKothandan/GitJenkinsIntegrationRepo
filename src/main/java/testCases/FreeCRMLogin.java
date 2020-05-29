package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FreeCRMLogin {
	WebDriver driver;

	@BeforeTest
	public void beforemethod() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D://Drivers//Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		Thread.sleep(2000);
	}

	@BeforeClass
	public void login() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("divyamadan23@gmail.com");
		driver.findElement(By.name("password")).sendKeys("SeleniumTesting@2020");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		Thread.sleep(2000);
	}

	@Test(priority=0)
	public void calenderLink() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='main-nav']/a[2]/span")).click();
		System.out.println("Calender link is clicked");	
		System.out.println(driver.getTitle());
	}

	@Test(priority=1)
	public void contactLink() {
		driver.findElement(By.xpath("//*[@id='main-nav']/a[3]/span")).click();
		System.out.println("contacts link is clicked");	
		System.out.println(driver.getTitle());
	}

	@Test(priority=2)
	public void companiesLink() {		
		driver.findElement(By.xpath("//*[@id='main-nav']/a[4]/span")).click();
		System.out.println("companies link is clicked");	
		System.out.println(driver.getTitle());
	}
	@AfterClass
	public void logoff() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='top-header-menu']/div[3]/div[2]/div/i")).click();
		driver.findElement(By.xpath("//*[@id='top-header-menu']/div[3]/div[2]/div/div[2]/a[5]/span")).click();
	}


	@AfterTest
	public void aftermethod() {
		driver.quit();
	}


}
