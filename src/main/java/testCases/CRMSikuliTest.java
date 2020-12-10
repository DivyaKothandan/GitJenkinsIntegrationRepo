package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class CRMSikuliTest {

	public static void main(String[] args) throws Exception {
		
		/*DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		  
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		capabilities.setCapability(ChromeDriver.
		  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://freecrm.co.in/");
		
		Thread.sleep(1000);
		
		Screen s = new Screen();
		Pattern LoginButton = new Pattern("D:\\Drivers\\SikuliImages\\LoginButton.png");
		Pattern username = new Pattern("D:\\Drivers\\SikuliImages\\Email.png");
		
		Pattern password = new Pattern("D:\\Drivers\\SikuliImages\\CRMPassword.png");
		
		Pattern login = new Pattern("D:\\Drivers\\SikuliImages\\CRMLogin.png");
	
		//s.wait(username, 10);	
		s.click(LoginButton);
		Thread.sleep(2000);
		s.type(username, "Testing@test.com");
		
		s.type(password, "Test");
	
		s.click(login);

	}

}
