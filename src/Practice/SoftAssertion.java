package Practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SoftAssertion {

	String url = "https://www.facebok.com";
	WebDriver driver;
	String title;
	SoftAssert assertion = new SoftAssert();
	
  @BeforeTest
  public void beforeTest() throws Exception{
  
		
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");
		
		String exePath = "F:\\Software\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		driver = new ChromeDriver(chromeOptions);	
		
	driver.get(url);
	title = driver.getTitle();
		  
  }
	
  @Test
  public void f1() {
	 
	  System.out.println("Test 1 Started");
	  assertion.assertEquals(title.substring(0, 8), "Facebook");
	  System.out.println("Test 1 Ended");
	  
  }
  
  @Test
  public void f2() {
	  
	  System.out.println("Test 2 Started"); 
	  assertion.assertEquals(title.substring(0, 7), "Facebook");
	  System.out.println("Test 2 Ended");
	  
  }
  
  

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("Test Completed");
	  driver.quit();
	  
  }

}
