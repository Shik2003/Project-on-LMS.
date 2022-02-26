# Project-on-LMS.

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
//import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
public class Home{
	//private WebDriver driver;
	//public static String baseUrl="https://www.hcltss-lms.com/learner-landing.php";
	private WebDriver driver;
	public static String baseUrl="https://www.hcltss-lms.com/login/index.php";
	public static Boolean Dashboard = false; 
	public static Boolean WOD = false; 
	public static Boolean induction = false; 
	public static Boolean Feedback = false;
	public static Boolean Resources = false;
	public static Boolean Scorecard = false;
	public static Boolean learninglab = false;
	public static Boolean Bookmark = false;
	public static Boolean GeneralInformation = false;
	public static Boolean Profile = false;
	public static String Dashboard1;
	public static String WOD1;
	public static String Feedback1;
	public static String Scorecard1;
	public static String Learninglab1;
	public static String GeneralInformation1;
	
	
	
	@BeforeClass
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Selenium Jars\\msedgedriver.exe");
		driver = new ChromeDriver();
	    driver.get(baseUrl);		
	}
	
	// Navigation Bar.
	@Test
	public void testweb5() throws Exception {
		driver.findElement(By.id("username")).sendKeys("LTTB0721124");
		driver.findElement(By.id("password")).sendKeys("Jan2019$");
		driver.findElement(By.id("loginbtn")).click();
		Dashboard = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).isDisplayed();
		System.out.println(Dashboard);
		WOD = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).isDisplayed();
		System.out.println(WOD);
		induction = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).isDisplayed();
		System.out.println(induction);
		Feedback = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).isDisplayed();
		System.out.println(Feedback);
		Resources = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).isDisplayed();								
		System.out.println(Resources);
		Scorecard = driver.findElement(By.linkText("Score Card")).isDisplayed();
		System.out.println(Scorecard);
		learninglab = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[7]/a")).isDisplayed();
		System.out.println(learninglab);
		Bookmark = driver.findElement(By.id("bookmark")).isDisplayed();
		System.out.println(Bookmark);
		GeneralInformation = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[9]/a")).isDisplayed();
		System.out.println(GeneralInformation);
		Profile = driver.findElement(By.id("action-menu-toggle-0")).isDisplayed();
		System.out.println(Profile);		
		
		driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
		Dashboard1 = driver.getTitle();
		if(Dashboard1.contentEquals("Learner Landing")) {
			System.out.println(true);
		}
		driver.findElement(By.xpath("//a[contains(text(),'WOD')]")).click();
		WOD1 = driver.getTitle();
		if(WOD1.contentEquals("Word of the day")) {
			System.out.println(true);
		}
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")).click();
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[contains(text(),'Feedback')]")).click();
		Feedback1= driver.getTitle();
		if(Feedback1.contentEquals("Scholar Feedback")) {
			System.out.println(true);
		}
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]\r\n")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Score Card')]")).click();
		Scorecard1 = driver.getTitle();
		if(Scorecard1.contentEquals("Score Card")) {
			System.out.println(true);
		}
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Learning Labs')]")).click();
		Learninglab1 = driver.getTitle();
		if(Learninglab1.contentEquals("Course Tabs")) {
			System.out.println(true);
		}
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/nav[1]/div[2]/ul[1]/li[8]/a[1]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/nav/div[2]/ul/li[9]/a")).click();
		GeneralInformation1 = driver.getTitle();
		Set<String> LearnerLanding = driver.getWindowHandles();
		 Iterator<String> i = LearnerLanding.iterator();
		 String mainwindow = i.next();
	        String learner = i.next();
	        driver.switchTo().window(learner);
	        
	        
		if(GeneralInformation1.contentEquals("Information")) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		 driver.switchTo().window(mainwindow);
		/*
		driver.navigate().to("https://www.hcltss-lms.com/login/index.php");
		driver.findElement(By.id("username")).sendKeys("LTTB0721124");
		driver.findElement(By.id("password")).sendKeys("Jan2019$");
		driver.findElement(By.id("loginbtn")).click();
		*/
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/nav/ul/li/div/div/div/div/div/a")).click();
		
		driver.navigate().refresh();
		
		
		
		
		
	}
	// Checking the presence of Learner Dashboard, Hello! Shikhar Mittal, Batch Name, Attendance, Course completion, Term1,2,3.
	@Test
	public void testweb6() throws Exception{
	driver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/div[1]/div/h2")).isDisplayed();
	driver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/div[1]/div/div/span")).isDisplayed();
	driver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/div[2]/div[1]/div/div[1]/div/strong")).isDisplayed();
	driver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/div[2]/div[1]/div/div[2]/div/p[1]")).isDisplayed();
	driver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/div[2]/div[1]/div/div[2]/div/p[2]")).isDisplayed();
	driver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/div[2]/div[2]/div[1]")).isDisplayed();
	driver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/div[2]/div[2]/div[2]")).isDisplayed();
	driver.findElement(By.xpath("//*[@id=\"region-main\"]/div/div/div/div[2]/div[2]/div[3]")).isDisplayed();
	
		}
	
	@Test
	public void testweb7() throws Exception{
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[1]/div/div/div[1]/span")).isDisplayed();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[1]/div/div/a")).click();
		String Communication = driver.getTitle();
	//	Set<String> LearnerLanding = driver.getWindowHandles();
//		 Iterator<String> i = LearnerLanding.iterator();
//		 String mainwindow = i.next();
//	        String Communication1 = i.next();
//	        driver.switchTo().window(Communication1);
	        
		if(Communication.contentEquals("Course: Communication/SoftSkills")) {
			System.out.println(true);
			
		}
//		driver.switchTo().window(mainwindow);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[2]/div/div/div[1]/span")).isDisplayed();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[2]/div/div/a")).click();
		String Se = driver.getTitle();
//		Set<String> LearnerLanding1 = driver.getWindowHandles();
//		 Iterator<String> i1 = LearnerLanding1.iterator();
	        
	        
	        if(Se.contentEquals("Course: Software Engineering")) {
	        	System.out.println(true);
	        }
	        
	//        driver.switchTo().window(mainwindow);
	        
	     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[3]/div/div/div[1]/span")).isDisplayed();
	     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[3]/div/div/a")).click();
	     String Java = driver.getTitle();
	     
	     if(Java.contentEquals("Course: Java")) {
	    	 System.out.println(true);
	     }
	     
	     
	   
	}
		@Test
		public void testweb8() throws Exception{
			
			//Set<String> LearnerLanding = driver.getWindowHandles();
			 //Iterator<String> i = LearnerLanding.iterator();
			 
			 //String mainwindow = i.next();
			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[4]/div/div/div[1]/span")).isDisplayed();
		     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[4]/div/div/a")).click();
		     String ITP = driver.getTitle();
		     //String ITP1 = i.next();
		     //driver.switchTo().window(ITP1);
		     if(ITP.contentEquals("Course: ITP Java")) {
		    	 System.out.println(true);
		     }
		     
		     //driver.switchTo().window(mainwindow);
		     
		     
		     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[5]/div/div/div[1]/span")).isDisplayed();
		     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[5]/div/div/a")).click();
		     String Testing = driver.getTitle();
		     //String Testing1 = i.next();
		     //driver.switchTo().window(Testing1);
		     if(Testing.contentEquals("Course: Testing")) {
		    	 System.out.println(true);
		     }
		     
		     //driver.switchTo().window(mainwindow);
		     
		     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[6]/div/div/div[1]/span")).isDisplayed();
		     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[6]/div/div/a")).click();
		     String project = driver.getTitle();
		     //String project1 = i.next();
		     //driver.switchTo().window(project1);
		     
		     if(project.contentEquals("Course: Project")) {
		    	 System.out.println(true);
		     }
		     
		    // driver.switchTo().window(mainwindow);
		     
		     
		     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[7]/div/div/div[1]/span")).isDisplayed();
		     driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[7]/div/div/a")).click();
		    String Doubt = driver.getTitle();
		    //String Doubt1 = i.next();
		    //driver.switchTo().window(Doubt1);
		    if(Doubt.contentEquals("Course: Doubt Clearing session")) {
		    	System.out.println(true);
		    }
		    
		    //driver.switchTo().window(mainwindow);
		    
		    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[8]/div/div/div[1]/span"));
		    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[2]/div[3]/div[8]/div/div/a")).click();
		    
		    String SQL = driver.getTitle();
//		    String SQL1 = i.next();
	//	    driver.switchTo().window(SQL1);
		    
		    if(SQL.contentEquals("Course: SQL")) {
		    	System.out.println(true);
		    }
		    
		//    driver.switchTo().window(mainwindow);	
		}
		
		@Test
		public void testweb9() throws Exception {
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[1]/div/div[1]/div[1]")).isDisplayed();	
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[1]/div/div[2]/span")).isDisplayed();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[1]/div/div[1]/div[2]/a")).click();
		String Calendar = driver.getTitle();
		if(Calendar.contentEquals("Course: Batch Calendar")) {
			System.out.println(true);
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[2]/div/div[1]/div[1]")).isDisplayed();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[2]/div/div[2]")).isDisplayed();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[2]/div/div[1]/div[2]/a")).click();
		String Join = driver.getTitle();
//		Alert alt = driver.switchTo().alert();
//		alt.dismiss();
		if(Join.contentEquals("Join conversation")) {
			System.out.println(true);
		}
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[3]/div/div[1]/div[1]")).isDisplayed();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[3]/div/div[2]/span")).isDisplayed();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[3]/div/div[1]/div[2]/a")).click();
		String Quiz = driver.getTitle();
		if(Quiz.contentEquals("Course: Daily Quiz")) {
			System.out.println(true);
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[4]/div/div[1]/div[1]")).isDisplayed();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[4]/div/div[2]/span")).isDisplayed();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/section/div/div/div/div[3]/div/div[4]/div/div[1]/div[2]/a")).click();
		String Assessment = driver.getTitle();
		if(Assessment.contentEquals("Course: Assessments")) {
			System.out.println(true);
		}
		
		
		}
		
		
	@AfterClass
	public void tearDown1() throws Exception {
		this.driver.close();	
		}
	
	
	
	

}
