package com.Amc.TestCases;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Amc.Base.TestBase;
import com.Amc.PageObjects.Home;
import com.Amc.PageObjects.About_Us;
import com.Amc.PageObjects.Projects_teamsection;
import com.Amc.PageObjects.StartPage;
import com.Amc.PageObjects.sidebaroption;
/*This test case is for Positive Test Scenario*/ 
public class TC_About_Us_Positive1  extends TestBase{


	public static About_Us lp;


	@Test(priority=1)
	public void ClickStartTest() throws IOException, InterruptedException {
		lp = new About_Us();
		Thread.sleep(5000);
		lp.StartButton();
	    }
	
	// advertisement pop-up close
	@Test(priority=2)
	public void ClickPopup() throws IOException, InterruptedException {
		Thread.sleep(3000);
		lp.ClickPopup();
	}
	// Click About us
		@Test(priority=3)
		public void ClickAbout_us() throws IOException, InterruptedException {
			Thread.sleep(3000);
			lp.ClickAbout_us();
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll incrementally down the page
	        for (int i = 0; i < 5; i++) {
	            js.executeScript("window.scrollBy(0, 400);"); // scroll down by 250px
	            try {
	                Thread.sleep(500); // wait 0.5 seconds between each scroll
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
		}
		
		@Test(priority=4)
		public void ClickPlay() throws IOException, InterruptedException {
			Thread.sleep(3000);
			lp.ClickPlay();
		}
		@Test(priority=5)
		public void ClickPlayvideo() throws IOException, InterruptedException {
			Thread.sleep(3000);
			lp.ClickPlayvideo();
		}
		@Test(priority=6)
		public void ClickVideoclose() throws IOException, InterruptedException {
			Thread.sleep(10000);
			lp.ClickVideoclose();
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver; 

			js.executeScript("window.scrollBy(0, 1600);"); 

			 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");
			 
		}
		
}
