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
import com.Amc.PageObjects.Projects_teamsection;
import com.Amc.PageObjects.StartPage;
import com.Amc.PageObjects.sidebaroption;
/*This test case is for Positive Test Scenario*/ 
public class TC_Projects_teamsection_Positive1  extends TestBase{


	public static Projects_teamsection lp;
	


	@Test(priority=1)
	public void ClickprojectssectionTest() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.ClickprojectssectionTest();
		Thread.sleep(3000);
		
	}
	@Test(priority=2)
	public void ClickteamprojectssectionTest() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.ClickteamprojectssectionTest();
		Thread.sleep(3000);
		
	} 
	@Test(priority=3)
	public void ClickresultsTest() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.ClickresultsTest();
			
	}
	@Test(priority=4)
	public void Clickresults1Test() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.Clickresults1Test();
			
	}
	@Test(priority=5)
	public void ClickeditTest() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.ClickeditTest();
			
	}
	@Test(priority=6)
	public void ClickcancelTest() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.ClickcancelTest();
			
	}
	@Test(priority=7)
	public void Clickedit1Test() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.Clickedit1Test();
	
	}
	@Test(priority=8)
	public void EditnameTest() {
		lp = new Projects_teamsection();
		lp.Editname(" Test edit name");
	}
	@Test(priority=9)
	public void EnterdescriptionTest() {
		lp = new Projects_teamsection();
		lp.Editdescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
	}
	@Test(priority=10)
	public void SubmitTest() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.SubmitTest();			
	} 
	@Test(priority=11)
	public void ClickdropdownTest() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.ClickdropdownTest();			
	}
	@Test(priority=12)
	public void ClickauditTest() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.ClickauditTest();			
	}
	@Test(priority=13)
	public void ClickcloseauditTest() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.ClickcloseauditTest();			
	}
	@Test(priority=14)
	public void ClickdefineTest() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.ClickdefineTest();			
	}
	@Test(priority=15)
	public void ClickaddareaTest() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.ClickaddareaTest();			
	}
	@Test(priority=16)
	public void Clickpoint1Test() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.Clickpoint1Test();			
	}
	@Test(priority=17)
	public void Clickpoint2Test() throws IOException, InterruptedException {
		lp = new Projects_teamsection();
		lp.Clickpoint2Test();			
	}
}