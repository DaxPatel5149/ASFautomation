package com.Amc.Base;


import java.io.File;

import java.io.IOException;

import java.util.Properties;


import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.support.ui.Wait;

import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Amc.Utilities.ReadConfig;

public class TestBase {
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public static Properties prop;
	public static WebDriver driver;
	public static Logger logger;
	public static Wait wait;
	public static ChromeOptions option;
	
	@Parameters("browser")
	@BeforeSuite
	public void setup(String br) {
		PropertyConfigurator.configure("Log4j.properties");
		
		
		//wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(30))
               // .ignoring(NoSuchElementException.class);
		
		
		if(br.equals("chrome")) {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\MTPC-372\\eclipse-workspace\\Amcwebsite\\chromedriver-win132\\chromedriver.exe");  
			 option=new ChromeOptions();
			    option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(option);
			
			
			driver.manage().window().maximize();
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFireforxpath());
			driver = new FirefoxDriver();
		}
		else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readconfig.getIepath());
			driver = new InternetExplorerDriver();
		}
		else if(br.equals("edge")) {
			System.setProperty("webdriver.edge.driver", readconfig.getEdgepath());
			driver = new EdgeDriver();			
		}
		
		driver.get(baseURL);
	}
	
	@BeforeClass
	public void SetLogger() {
		logger = Logger.getLogger("TestBase.class");
		
	}
	
	// It will execute after every test execution 
	
	@AfterMethod
	public void TakeScreenShotOfTest(ITestResult result)
	{

		// Here will compare if test is failing then only it will enter into if condition
		if(ITestResult.FAILURE==result.getStatus())
		{
			try 
			{
				captureScreen(driver,result.getName());
				logger.info("The "+result.getName()+" is Failed. Screenshot taken.");
			} 
			catch (Exception e)
				{
				System.out.println("Exception while taking screenshot "+e.getMessage());
				} 
			}
		else {
			logger.info("The "+result.getName()+" is Passed.");

		}
	}
	
	@AfterSuite(enabled = false)
	public void tearDown() {
		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
	}
	
	
}

