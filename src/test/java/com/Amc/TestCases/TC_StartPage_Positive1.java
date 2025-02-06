package com.Amc.TestCases;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
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
import com.Amc.PageObjects.Shopping;
import com.Amc.PageObjects.StartPage;
/*This test case is for Positive Test Scenario*/ 
public class TC_StartPage_Positive1  extends TestBase{


	public static StartPage lp;
	
	
	@Test(priority=1)
	public void ClickStartTest() throws IOException, InterruptedException {
		lp = new StartPage();
		Thread.sleep(5000);
		lp.StartButton();
		
		
		
	    }
	// advertisement pop-up close
	@Test(priority=2)
	public void ClickPopup() throws IOException, InterruptedException {
		Thread.sleep(3000);
		lp.ClickPopup();
		Thread.sleep(5000);

	    JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 0);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");

		    while (true) {
		        // Scroll down to the bottom
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		        // Wait for new content to load
		       Thread.sleep(2000);

		        // Calculate new height and compare with last height
		        long newHeight = (Long) js.executeScript("return document.body.scrollHeight");
		        if (newHeight == lastHeight) {
		            break; // If the height hasn't changed, we've reached the bottom
		        }
		        lastHeight = newHeight;
		        Thread.sleep(4000);
		    }
		} 
	
	@Test(priority=3)
	public void ClickEvent() throws IOException, InterruptedException {
		lp.ClickEvent();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 0);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");

		    while (true) {
		        // Scroll down to the bottom
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		        // Wait for new content to load
		       Thread.sleep(2000);

		        // Calculate new height and compare with last height
		        long newHeight = (Long) js.executeScript("return document.body.scrollHeight");
		        if (newHeight == lastHeight) {
		            break; // If the height hasn't changed, we've reached the bottom
		        }
		        lastHeight = newHeight;
		        Thread.sleep(4000);
		    }
	}
	
	@Test(priority=4)
	public void ClickShoppingDis() throws IOException, InterruptedException {
		lp.ClickShoppingDis();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 0);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");

		    while (true) {
		        // Scroll down to the bottom
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		        // Wait for new content to load
		       Thread.sleep(2000);

		        // Calculate new height and compare with last height
		        long newHeight = (Long) js.executeScript("return document.body.scrollHeight");
		        if (newHeight == lastHeight) {
		            break; // If the height hasn't changed, we've reached the bottom
		        }
		        lastHeight = newHeight;
		        Thread.sleep(4000);
		    }
	}
	
	@Test(priority=5)
	public void ClickHotspots() throws IOException, InterruptedException {
		lp.ClickHotspots();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 0);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");

		    while (true) {
		        // Scroll down to the bottom
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		        // Wait for new content to load
		       Thread.sleep(2000);

		        // Calculate new height and compare with last height
		        long newHeight = (Long) js.executeScript("return document.body.scrollHeight");
		        if (newHeight == lastHeight) {
		            break; // If the height hasn't changed, we've reached the bottom
		        }
		        lastHeight = newHeight;
		        Thread.sleep(4000);
		    }
		    
	}
	
	@Test(priority=6)
	public void ClickVisitASF() throws IOException, InterruptedException {
		lp.ClickVisitASF();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 0);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");

		    while (true) {
		        // Scroll down to the bottom
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		        // Wait for new content to load
		       Thread.sleep(2000);

		        // Calculate new height and compare with last height
		        long newHeight = (Long) js.executeScript("return document.body.scrollHeight");
		        if (newHeight == lastHeight) {
		            break; // If the height hasn't changed, we've reached the bottom
		        }
		        lastHeight = newHeight;
		        Thread.sleep(4000);
		    }
	}
	
	@Test(priority=7)
	public void Clickaboutus() throws IOException, InterruptedException {
		lp.Clickaboutus();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 0);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");

		    while (true) {
		        // Scroll down to the bottom
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		        // Wait for new content to load
		       Thread.sleep(2000);

		        // Calculate new height and compare with last height
		        long newHeight = (Long) js.executeScript("return document.body.scrollHeight");
		        if (newHeight == lastHeight) {
		            break; // If the height hasn't changed, we've reached the bottom
		        }
		        lastHeight = newHeight;
		        Thread.sleep(4000);
		    }
	}
	
	@Test(priority=8)
	public void ClickPrivacyNotice() throws IOException, InterruptedException {
		lp.ClickPrivacyNotice();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 0);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");

		    while (true) {
		        // Scroll down to the bottom
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		        // Wait for new content to load
		       Thread.sleep(2000);

		        // Calculate new height and compare with last height
		        long newHeight = (Long) js.executeScript("return document.body.scrollHeight");
		        if (newHeight == lastHeight) {
		            break; // If the height hasn't changed, we've reached the bottom
		        }
		        lastHeight = newHeight;
		        Thread.sleep(4000);
		       }
		    
	     }
	
	@Test(priority=9)
	public void Clickitinerary() throws IOException, InterruptedException {
		lp.Clickitinerary();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 0);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");

		    while (true) {
		        // Scroll down to the bottom
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		        // Wait for new content to load
		       Thread.sleep(2000);

		        // Calculate new height and compare with last height
		        long newHeight = (Long) js.executeScript("return document.body.scrollHeight");
		        if (newHeight == lastHeight) {
		            break; // If the height hasn't changed, we've reached the bottom
		        }
		        lastHeight = newHeight;
		        Thread.sleep(4000);
		    }
	}
	
	@Test(priority=10)
	public void Clickshopping_desti() throws IOException, InterruptedException {
		lp.Clickshopping_desti();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 0);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");

		    while (true) {
		        // Scroll down to the bottom
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		        // Wait for new content to load
		       Thread.sleep(2000);

		        // Calculate new height and compare with last height
		        long newHeight = (Long) js.executeScript("return document.body.scrollHeight");
		        if (newHeight == lastHeight) {
		            break; // If the height hasn't changed, we've reached the bottom
		        }
		        lastHeight = newHeight;
		        Thread.sleep(4000);
		    }
	}
	
	@Test(priority=11)
	public void Clicklogo() throws IOException, InterruptedException {
		lp.Clicklogo();
		Thread.sleep(5000);
	}
	
	@Test(priority=12)
	public void ClickPopup1() throws IOException, InterruptedException {
		lp.ClickPopup1();
		Thread.sleep(5000); 
	}

}
		
		
	



