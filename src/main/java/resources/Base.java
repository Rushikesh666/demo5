package resources;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop = new Properties();

	
	public WebDriver Initialise() throws IOException {

		System.setProperty("webdriver.chrome.driver","D:\\software\\EClipse and all\\WorkSpace_Eclipse\\browsers\\chromedriver\\chromedriver.exe");

		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\automationpractice2\\src\\main\\java\\resources\\data.Properties");

		prop.load(fis);

		prop.getProperty("browser");

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		}

		else {

			driver = new FirefoxDriver();

		}
		return driver;
	}
		public void Test1_Invoke_homepage() throws IOException, InterruptedException, NullPointerException, AWTException
		{

			driver = Initialise();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
	System.out.println("TEST !");
		}
		
		
		
		
		public void GetScreenshot() throws IOException {
			
			
			
			TakesScreenshot TS	=	(TakesScreenshot)driver;
			
		File FromSource=	TS.getScreenshotAs(OutputType.FILE);
		
		
			
			FileUtils.copyFile(FromSource, new File("D://myfolder//TRASH-Copy//Screenshot.png"));
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

