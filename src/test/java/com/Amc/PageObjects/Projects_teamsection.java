package com.Amc.PageObjects;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Amc.Base.TestBase;

public class Projects_teamsection extends TestBase {

	public Projects_teamsection() {
		PageFactory.initElements(driver, this);

	}
	
	//click projects section
	@FindBy(xpath = "//img[@src='../../../assets/image/menuItems/projectSvg.webp']")
	WebElement Clickprojectssection;
		
    //click team projects section
	@FindBy(xpath = "(//div[contains(text(),'Team projects (2)')])[1]")
	WebElement Clickteamprojectssection;
	
	//click results option
	@FindBy(xpath = "(//div[@id='mat-select-value-3'])[1]")
	WebElement Clickresults;
	//click result close option
	@FindBy(xpath = "//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")
	WebElement Clickresults1;
	
	//click edit option
	@FindBy(xpath = "(//button)[6]")
	WebElement Clickedit;	
	
	//click cancel option
	@FindBy(xpath = "(//button[@class='mat-focus-indicator button cancel mat-raised-button mat-button-base'])[1]")
	WebElement Clickcancel;
	
	//click edit1 option
	@FindBy(xpath = "(//button)[6]")
	WebElement Clickedit1;
		
	// Entering the Editname
	@FindBy(css = "#mat-input-7")
	WebElement Editname;
	
	// Entering the Editdescription
	@FindBy(css = "#mat-input-8")
	WebElement Editdescription;
	
	// Click Submit
	@FindBy(xpath = "(//button[@class='mat-focus-indicator button submit mat-raised-button mat-button-base'])[1]")
	WebElement Submit;
		
	// Click dropdown
	@FindBy(css = "body > app-root:nth-child(1) > app-navigation-panel:nth-child(3) > div:nth-child(1) > div:nth-child(2) > app-projects-home:nth-child(2) > mat-tab-group:nth-child(2) > div:nth-child(2) > mat-tab-body:nth-child(2) > div:nth-child(1) > mat-card:nth-child(1) > div:nth-child(3) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > button:nth-child(1)")
	WebElement Clickdropdown;
	
	// Click audit
	@FindBy(xpath = "(//button)[10]")
	WebElement Clickaudit;

	// Click closeaudit
	@FindBy(xpath = "//mat-icon[normalize-space()='close']")
	WebElement Clickcloseaudit;
	
	// Click  define map button
	@FindBy(xpath = "(//span[normalize-space()='Define'])[1]")
	WebElement Clickdefine;
	
	// Click add area button
	@FindBy(xpath = "//button[@class='mat-focus-indicator drawAreaButton mat-raised-button mat-button-base']")
	WebElement Clickaddarea;
	
	// Click one point
	@FindBy(className = "mapboxgl-canvas")
	WebElement Clickpoint1;
	
	// Click two point
	@FindBy(xpath = "mapboxgl-canvas")
	WebElement Clickpoint2;
	
		public void ClickprojectssectionTest() {	
			Clickprojectssection.click();			
		}
		public void ClickteamprojectssectionTest() {
			Clickteamprojectssection.click();	
		}
		public void ClickresultsTest() throws InterruptedException {
			Clickresults.click();
			Thread.sleep(2000);
		}
		public void Clickresults1Test() {
			Clickresults1.click();
			
		}
		public void ClickeditTest() throws InterruptedException {
			Clickedit.click();
			Thread.sleep(2000);
		}
		public void ClickcancelTest() throws InterruptedException {
			Clickcancel.click();
			Thread.sleep(2000);
		}
		public void Clickedit1Test() throws InterruptedException{
			Clickedit1.click();
			Thread.sleep(2000);
		}
		public void Editname(String nm) {
			Editname.clear();
			Editname.sendKeys(nm);
		}
		public void Editdescription(String nm) {
			Editdescription.clear();
			Editdescription.sendKeys(nm);
		}
		public void SubmitTest() throws InterruptedException {
			Submit.click();
			Thread.sleep(5000);
		}
		public void ClickdropdownTest() {
			Clickdropdown.click();		
		}
		public void ClickauditTest() throws InterruptedException {
			Clickaudit.click();	
			Thread.sleep(3000);
		}
		public void ClickcloseauditTest() throws InterruptedException {
			Clickcloseaudit.click();	
		}
		public void ClickdefineTest() throws InterruptedException {
			Clickdefine.click();
			Thread.sleep(3000);
		}
		public void ClickaddareaTest() throws InterruptedException {
			Clickaddarea.click();
			Thread.sleep(3000);
		}
		public void Clickpoint1Test(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }
		public void Clickpoint1Test() throws InterruptedException {
	        Clickpoint1.click();
	        Thread.sleep(3000);
	    }
		 public void Clickpoint2Test(WebDriver driver) {
		        PageFactory.initElements(driver, this);
		    }
		public void Clickpoint2Test() throws InterruptedException {
			Clickpoint2.click();
			Thread.sleep(3000);
		}
		  public void clickOnLocationPoint2(int xOffset, int yOffset) {
		        Actions actions = new Actions(driver);
		        actions.moveToElement(Clickpoint2, xOffset, yOffset).click().perform();
		    }
}