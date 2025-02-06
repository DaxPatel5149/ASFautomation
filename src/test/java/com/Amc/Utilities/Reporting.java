package com.Amc.Utilities; 

import java.io.File; 
import java.io.IOException; 
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext; 
import org.testng.ITestResult; 
import org.testng.TestListenerAdapter;
import org.testng.internal.TestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest; 
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper; 
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme; 
//import com.aventstack.extentreports.reporter.configuration.ChartLocation;

public class Reporting extends TestListenerAdapter
{
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger; 
	
	public void onStart(ITestContext tespContext) { 
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp 
		String repName="Amc-Test-Report-"+timeStamp+".html"; 
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/"+repName);//specify 
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml"); 
		extent=new ExtentReports(); 
		extent. attachReporter(htmlReporter); 
		extent.setSystemInfo("Host name","Manektech.com"); 
		extent.setSystemInfo("Environemnt","Live"); 
		extent.setSystemInfo("User","Dax"); 
		htmlReporter.config().setDocumentTitle("Manektech.com Contact Us Project"); // Tile of report 
		htmlReporter.config().setReportName("Functional, Positive, and Negative Automation Test Report"); // name of the report 
		//htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); //location of the chart
		htmlReporter.config().setTheme(Theme.DARK); 
	}
		public void onTestSuccess(ITestResult tr) { 
			logger=extent.createTest(tr.getName()); // create new entry in the report 
			logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); // send the passed 

		}
		
		public void onTestFailure(ITestResult tr) { 
			logger=extent.createTest(tr.getName()); // create new entry in th report 
			logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED)); // send the failed  
			logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getMethod().getRealClass().getName() + ":" + tr.getMethod().getMethodName(),ExtentColor.RED)); // send the failed 
			logger.log(Status.FAIL, tr.getThrowable());// send the failed 

			String screenshotPath = System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png"; 

		
			File f = new File(screenshotPath); 
				if(f.exists())
				{ 
					try { 
						logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
					} 
					catch (IOException e)
					{ 
						e.printStackTrace(); 
					}
				} 
		}
		
		public void onTestSkipped(ITestResult tr) { 
			logger=extent.createTest(tr.getName()); // create new entry in th report 
			logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE)); 
			logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getClass()+"_"+tr.getName(),ExtentColor.ORANGE));// send the failed 

		}
		
		//public void onTestINFO(TestResult tr) { 
			//logger=extent.createTest(tr.getName()); // create new entry in th report 
			//logger.log(Status.INFO,MarkupHelper.createLabel(tr.getName(),ExtentColor.BLUE)); 
		//}
		
		public void onFinish(ITestContext testContext) { 
		extent.flush(); 
		} 

}
