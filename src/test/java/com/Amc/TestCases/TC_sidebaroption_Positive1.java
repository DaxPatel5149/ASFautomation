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
import com.Amc.PageObjects.StartPage;
import com.Amc.PageObjects.sidebaroption;
/*This test case is for Positive Test Scenario*/ 
public class TC_sidebaroption_Positive1  extends TestBase{


	public static sidebaroption lp;

	@Test(priority=1)
	public void ClickprojectsTest() throws IOException, InterruptedException {
		lp = new sidebaroption();
		lp.ClickprojectsTest();
		Thread.sleep(5000);
		
	}
	
	@Test(priority=2)
	public void ClickusermanagementTest() throws IOException, InterruptedException {
		lp = new sidebaroption();
		lp.ClickusermanagementTest();
		Thread.sleep(3000);
		
	}
	@Test(priority=3)
	public void ClickproductmanagementTest() throws IOException, InterruptedException {
		lp = new sidebaroption();
		lp.ClickproductmanagementTest();
		Thread.sleep(3000);
		
	}
	@Test(priority=4)
	public void ClickbrandlinkTest() throws IOException, InterruptedException {
		lp = new sidebaroption();
		lp.ClickbrandlinkTest();
		Thread.sleep(3000);
		
	}  
	@Test(priority=5)
	public void ClickswitchproductTest() throws IOException, InterruptedException {
		lp = new sidebaroption();
		lp.ClickswitchproductTest();
		Thread.sleep(4000);
		
	}
	@Test(priority=6)
	public void ClickswitchproductbrandTest() throws IOException, InterruptedException {
		lp = new sidebaroption();
		lp.ClickswitchproductbrandTest();
		Thread.sleep(7000);
		
	} 
	@Test(priority=7)
	public void ClicklanguageTest() throws IOException, InterruptedException {
		lp = new sidebaroption();
		lp.ClicklanguageTest();
		Thread.sleep(4000);
		
	} 
	@Test(priority=8)
	public void ClickswitchlanguageTest() throws IOException, InterruptedException {
		lp = new sidebaroption();
		lp.ClickswitchlanguageTest();
		Thread.sleep(4000);
		
	} 
	@Test(priority=9)
	public void ClicksettingTest() throws IOException, InterruptedException {
		lp = new sidebaroption();
		lp.ClicksettingTest();
		Thread.sleep(3000);
		
	}
	@Test(priority=10)
	public void ClickprofileTest() throws IOException, InterruptedException {
		lp = new sidebaroption();
		lp.ClickprofileTest();
		Thread.sleep(3000);
		
	} 
}
		