package MavenNew;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://gmail.com");
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  	{
	  System.out.println("BeforeTest");
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  /*System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Drivers\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver();*/
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  	}

  @AfterTest
  public void afterTest() 
  	{
	  System.out.println("AfterTest");
	  driver.close();
  	}
  
}
