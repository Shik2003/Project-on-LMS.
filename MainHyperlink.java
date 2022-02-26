// import org.openqa.selenium.Alert;

// Checking the hyperlink of Batch Calendar and Live Connect.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainHyperlink {
	private WebDriver driver;
	public static String baseUrl="https://www.hcltss-lms.com/login/index.php";
	
	
	@BeforeClass
	public void setup() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Selenium Jars\\msedgedriver.exe");
		driver = new ChromeDriver();
	    driver.get(baseUrl);
	}
	
	@Test
	public void testweb10() throws Exception{
		
		driver.findElement(By.id("username")).sendKeys("LTTB0721124");
		driver.findElement(By.id("password")).sendKeys("Jan2019$");
		driver.findElement(By.id("loginbtn")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[1]/div/div[1]/div[2]/a")).click();
		Set<String> LearnerLanding = driver.getWindowHandles();
		 Iterator<String> i = LearnerLanding.iterator();
		 String mainwindow = i.next();
		 String Calendar = i.next();
		 
		 driver.switchTo().window(Calendar);
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/section/aside/section[1]/div/div/ul/li[2]/a")).isDisplayed();
		 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/section/aside/section[1]/div/div/ul/li[2]/a")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/section/div/div/div[1]/ul/li/div/div/ul/li[1]/div/div/div[2]/div")).click();
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/section/div/div/div[1]/ul/li/div/div/ul/li[2]/div/div/div[2]/div/a")).click();
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.switchTo().window(mainwindow);
		 Thread.sleep(4000);
		 
		 
		 }
	
	
	@Test
	public void testweb11() throws Exception{
		//Set<String> LearnerLanding1 = driver.getWindowHandles();
	
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[2]/div/div[1]/div[2]/a")).click();
		 Thread.sleep(6000);

		 
		
	}
	
	
	

	
	
	@Test
	public void testweb12() throws Exception{
//		Set<String> LearnerLanding1 = driver.getWindowHandles();
//		Iterator<String> i1 = LearnerLanding1.iterator();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[3]/div/div[1]/div[2]/a")).click();
		//String mainwindow = i1.next();
	}
	
	@Test
	public void testweb13() throws Exception{
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[4]/div/div[1]/div[2]/a")).click();		
	}
	
	@AfterClass
	public void tearDown() throws Exception{
		this.driver.close();
	}

}
