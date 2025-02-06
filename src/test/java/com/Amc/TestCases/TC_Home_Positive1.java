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
import com.Amc.PageObjects.Home;
import com.Amc.PageObjects.Projects_teamsection;
import com.Amc.PageObjects.Shopping;
import com.Amc.PageObjects.sidebaroption;
/*This test case is for Positive Test Scenario*/ 
public class TC_Home_Positive1  extends TestBase{


	public static Home lp;
	
	@Test(priority=1)
	public void ClickStartTest() throws IOException, InterruptedException {
		Thread.sleep(2000);
		lp = new Home();
		lp.StartButton();
		Thread.sleep(3000);
		} 
	// advertisement pop-up close
	@Test(priority=2)
	public void ClickPopup() throws IOException, InterruptedException {
		lp.ClickPopup();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 400);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");
		} 
	@Test(priority=3)
	public void Clickpartner() throws IOException, InterruptedException {
		Thread.sleep(3000);
		lp.Clickpartner();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll from top to bottom
        System.out.println("Scrolling from Top to Bottom...");
        js.executeScript("window.scrollTo(0,2400);");

        // Wait for a few seconds to observe the scroll effect (this is for demonstration)
        try {
            Thread.sleep(3000); // wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Scroll back from bottom to top
        System.out.println("Scrolling from Bottom to Top...");
        js.executeScript("window.scrollTo(0, 0);");

        // Wait for a few seconds to observe the scroll effect (this is for demonstration)
        try {
            Thread.sleep(3000); // wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	@Test(priority=4)
	public void Clickback() throws IOException, InterruptedException {
		lp.Clickback();
		Thread.sleep(2000);
	}
	@Test(priority=5)
	public void ClickPopup1() throws IOException, InterruptedException {
		Thread.sleep(2000);
		lp.ClickPopup1();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 100);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");
	}
	
	@Test(priority=6)
	public void Clickbookpass() throws IOException, InterruptedException {
		Thread.sleep(2000);
		lp.Clickbookpass();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll from top to bottom
        System.out.println("Scrolling from Top to Bottom...");
        js.executeScript("window.scrollTo(0,2400);");

        // Wait for a few seconds to observe the scroll effect (this is for demonstration)
        try {
            Thread.sleep(3000); // wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Scroll back from bottom to top
        System.out.println("Scrolling from Bottom to Top...");
        js.executeScript("window.scrollTo(0, 0);");

        // Wait for a few seconds to observe the scroll effect (this is for demonstration)
        try {
            Thread.sleep(3000); // wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	@Test(priority=7)
	public void Clickback1() throws IOException, InterruptedException {
		lp.Clickback();
		Thread.sleep(2000);
	}
	@Test(priority=8)
	public void ClickPopup2() throws IOException, InterruptedException {
		lp.ClickPopup1();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 800);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");
	}
	@Test(priority=9)
	public void ClickCGroad() throws IOException, InterruptedException {
		Thread.sleep(3000);
		lp.ClickCGroad();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll incrementally down the page
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 1000);"); // scroll down by 250px
            try {
                Thread.sleep(500); // wait 0.5 seconds between each scroll
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Scroll incrementally up the page
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, -1000);"); // scroll up by 250px
            try {
                Thread.sleep(500); // wait 0.5 seconds between each scroll
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
	@Test(priority=10)
	public void Clickback2() throws IOException, InterruptedException {
		lp.Clickback2();
		Thread.sleep(2000);
	}
	
	@Test(priority=11)
	public void ClickPopup3() throws IOException, InterruptedException {
		lp.ClickPopup1();
		Thread.sleep(2000);
	}
	@Test(priority=12)
	public void ClickManinagar() throws IOException, InterruptedException {
		lp.ClickManinagar();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll incrementally down the page
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 1000);"); // scroll down by 250px
            try {
                Thread.sleep(500); // wait 0.5 seconds between each scroll
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Scroll incrementally up the page
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, -1000);"); // scroll up by 250px
            try {
                Thread.sleep(500); // wait 0.5 seconds between each scroll
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
	@Test(priority=13)
	public void Clickback3() throws IOException, InterruptedException {
		lp.Clickback2();
		Thread.sleep(2000);
	}
	@Test(priority=14)
	public void ClickPopup4() throws IOException, InterruptedException {
		lp.ClickPopup1();
		Thread.sleep(2000);
	}
	@Test(priority=15)
	public void ClickNikol() throws IOException, InterruptedException {
		lp.ClickNikol();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll incrementally down the page
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 1000);"); // scroll down by 250px
            try {
                Thread.sleep(500); // wait 0.5 seconds between each scroll
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Scroll incrementally up the page
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, -1000);"); // scroll up by 250px
            try {
                Thread.sleep(500); // wait 0.5 seconds between each scroll
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
	@Test(priority=16)
	public void Clickback4() throws IOException, InterruptedException {
		lp.Clickback2();
		Thread.sleep(2000);
	}
	@Test(priority=17)
	public void ClickPopup5() throws IOException, InterruptedException {
		lp.ClickPopup1();
		Thread.sleep(2000);
	}
	@Test(priority=18)
	public void ClickSindhuBhavan() throws IOException, InterruptedException {
		lp.ClickSindhuBhavan();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll incrementally down the page
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 1000);"); // scroll down by 250px
            try {
                Thread.sleep(500); // wait 0.5 seconds between each scroll
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Scroll incrementally up the page
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, -1000);"); // scroll up by 250px
            try {
                Thread.sleep(500); // wait 0.5 seconds between each scroll
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
	@Test(priority=19)
	public void Clickback5() throws IOException, InterruptedException {
		lp.Clickback2();
		Thread.sleep(2000);
	}
	@Test(priority=20)
	public void ClickPopup6() throws IOException, InterruptedException {
		lp.ClickPopup1();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 900);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");
	}
	@Test(priority=21)
	public void Clickvideo() throws IOException, InterruptedException {
		lp.Clickvideo();
		Thread.sleep(2000);
	}
	@Test(priority=22)
	public void ClickVideoplay() throws IOException, InterruptedException {
		Thread.sleep(2000);
		lp.ClickVideoplay();
	}
	@Test(priority=23)
	public void ClickVideoclose() throws IOException, InterruptedException {
		Thread.sleep(10000);
		lp.ClickVideoclose();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 270);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");
	}
	@Test(priority=24)
	public void Clickpartner1() throws IOException, InterruptedException {
		Thread.sleep(2000);
		lp.Clickpartner1();
	}
	@Test(priority=25)
	public void Clickback6() throws IOException, InterruptedException {
		lp.Clickback();
		Thread.sleep(2000);
	}
	@Test(priority=26)
	public void ClickPopup7() throws IOException, InterruptedException {
		lp.ClickPopup1();
		Thread.sleep(2000);
	}
	@Test(priority=27)
	public void Clickbookpass1() throws IOException, InterruptedException {
		Thread.sleep(2000);
		lp.Clickbookpass1();
	}
	@Test(priority=28)
	public void Clickback7() throws IOException, InterruptedException {
		lp.Clickback();
		Thread.sleep(2000);
	}
	@Test(priority=29)
	public void ClickPopup8() throws IOException, InterruptedException {
		lp.ClickPopup1();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 3500);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");
	}
	@Test(priority=30)
	public void ClickSponsors() throws IOException, InterruptedException {
		lp.ClickSponsors();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 

		js.executeScript("window.scrollBy(0, 700);"); 

		 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");
	}
	@Test(priority=30)
	public void Clicklogo() throws IOException, InterruptedException {
		lp.Clicklogo();
		Thread.sleep(2000);		
      }
	
}
	
	
	
