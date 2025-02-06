package com.Amc.PageObjects;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Amc.Base.TestBase;

import java.time.Duration;

public class Home extends TestBase {

	public Home() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[@class='startBtn d-block mx-auto mb-2']//*[name()='svg']")
	WebElement Start;
	
	// advertisement pop-up close
	@FindBy(xpath = "//button[@class='close-btn']")
	WebElement Popup;
	
	@FindBy(xpath = "//div[@class='d-flex flex-wrap gap-2 justify-content-center justify-content-lg-start flex-column flex-sm-row']//a[@class='btn'][normalize-space()='Partner With Us']")
	WebElement partner;
	
	// Click Back
	@FindBy(xpath = "//a[normalize-space()='Back']")
	WebElement back;
	
	// advertisement pop-up close
	@FindBy(xpath = "//button[@class='close-btn']")
	WebElement Popup1;
	
	// click book pass
	@FindBy(xpath = "//a[@class='btn secondary-btn'][normalize-space()='Book Your Pass']")
	WebElement bookpass;
	
	// click cg road
		@FindBy(xpath = "//p[normalize-space()='C.G. Road']")
		WebElement CGroad;
		
	// Click BACK
	    @FindBy(xpath = "//a[normalize-space()='BACK']")
		WebElement back2;
		
	// click maninagar
		@FindBy(xpath = "//div[@class='contentWrap']//p[contains(text(),'Kankaria')]")
		WebElement maninagar;
		
	// click Nikol
		@FindBy(xpath = "//div[@class='contentWrap']//p[contains(text(),'Modern Street')]")
		WebElement Nikol;		
	
	// click Nikol
		@FindBy(xpath = "//p[normalize-space()='Sindhu Bhavan Road']")
		WebElement SindhuBhavan;
	
	// click Video
		@FindBy(xpath = "//img[@alt='Play']")
		WebElement Video;
		
	// click Video play
		@FindBy(xpath = "//video[@id='modal-video']")
		WebElement Videoplay;
		
	// close video
		@FindBy(xpath = "//button[@class='close']")
		WebElement close;
		
	// click partner
		@FindBy(xpath = "//a[@class='btn secondary-btn'][normalize-space()='Partner With Us']")
		WebElement partner1;	
		
	// click bookpass
		@FindBy(xpath = "//a[@class='btn black-btn']")
		WebElement bookpass1;
		
	// click next
		@FindBy(xpath = "//div[@class='sponsors-next next']")
		WebElement Sponsors;
		
	// click logo
		@FindBy(xpath = "//img[@alt='ASF Logo']")
		WebElement logo;
	
	public void StartButton() throws InterruptedException {
		 Thread.sleep(1000);
		 Start.click();
			} 
	
	public void ClickPopup() throws InterruptedException {
			Thread.sleep(1000);
			Popup.click();
			} 

	public void Clickpartner() {
			partner.click();
		}
	
	public void Clickback() throws InterruptedException {
		Thread.sleep(1000);
		back.click();
	}
	public void ClickPopup1()throws InterruptedException {
		Thread.sleep(1000);
		Popup1.click();
		} 
	public void Clickbookpass()throws InterruptedException {
		Thread.sleep(1000);
		bookpass.click();
		} 
	public void ClickCGroad()throws InterruptedException {
		Thread.sleep(1000);
		CGroad.click();
		}
	public void Clickback2() {
		back2.click();
	}
	public void ClickManinagar()throws InterruptedException {
		Thread.sleep(1000);
		maninagar.click();
		}
	public void ClickNikol()throws InterruptedException {
		Thread.sleep(1000);
		Nikol.click();
		}
	public void ClickSindhuBhavan()throws InterruptedException {
		Thread.sleep(1000);
		SindhuBhavan.click();
		}
	public void Clickvideo()throws InterruptedException {
		Thread.sleep(1000);
		Video.click();
		}
	public void ClickVideoplay()throws InterruptedException {
		Thread.sleep(1000);
		Videoplay.click();
		}
	public void ClickVideoclose()throws InterruptedException {
		Thread.sleep(1000);
		close.click();
		Thread.sleep(2000);
		}
	public void Clickpartner1()throws InterruptedException {
		Thread.sleep(1000);
		partner1.click();
		}
	public void Clickbookpass1()throws InterruptedException {
		Thread.sleep(1000);
		bookpass1.click();
		}
	public void ClickSponsors()throws InterruptedException {
		Thread.sleep(1000);
		Sponsors.click();
		Thread.sleep(1000);
		Sponsors.click();
		Thread.sleep(1000);
		Sponsors.click();
		Thread.sleep(1000);
		Sponsors.click();
		Thread.sleep(1000);
		Sponsors.click();
		}
	public void Clicklogo()throws InterruptedException {
		Thread.sleep(1000);
		logo.click();
		}
	}
	

