package com.Amc.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amc.Base.TestBase;

public class StartPage extends TestBase {

	public StartPage() {
		PageFactory.initElements(driver, this);
    }
	
	
	// click start button
	@FindBy(xpath = "//a[@class='startBtn d-block mx-auto mb-2']//*[name()='svg']")
	WebElement Start;
	
	// advertisement pop-up close
	@FindBy(css = "button[class='close-btn']")
	WebElement Popup;
	
	@FindBy(xpath = "//div[@class='actionWrap']//a[normalize-space()='Events']")
	WebElement Event;
	
	@FindBy(xpath = "//a[normalize-space()='Shopping District']")
	WebElement ShoppingDis;
	
	@FindBy(xpath = "//div[@class='actionWrap']//a[normalize-space()='Hot Spots']")
	WebElement Hotspots;
	
	@FindBy(xpath = "//div[@class='actionWrap']//a[normalize-space()='Visit ASF']")
	WebElement VisitASF;
	
	@FindBy(xpath = "//div[@class='actionWrap']//a[normalize-space()='About Us']")
	WebElement aboutus;
	
	@FindBy(xpath = "//a[normalize-space()='Privacy Notice']")
	WebElement PrivacyNotice;
	
	@FindBy(xpath = "//div[@class='actionWrap']//a[normalize-space()='Itinerary']")
	WebElement inerary;
	
	@FindBy(xpath = "//a[normalize-space()='Shopping Destination']")
	WebElement shopping_desti;
	
	@FindBy(xpath = "//img[@alt='ASF Logo']")
	WebElement logo;
	
	// advertisement pop-up close
	@FindBy(css = "button[class='close-btn']")
	WebElement Popup1;

	
	public void StartButton() throws InterruptedException {
		Thread.sleep(1000);
		Start.click();
		}
	public void ClickPopup() throws InterruptedException {	
		Popup.click();
		Thread.sleep(5000);
		}
	
	public void ClickEvent() throws InterruptedException {
		Thread.sleep(3000);
		Event.click();
		}
	
	public void ClickShoppingDis() throws InterruptedException {
		Thread.sleep(3000);
		ShoppingDis.click();
	    }
	
	public void ClickHotspots() throws InterruptedException {
		Thread.sleep(3000);
		Hotspots.click();
	    }
	
	public void ClickVisitASF() throws InterruptedException {
		Thread.sleep(3000);
		VisitASF.click();
	    }
	
	public void Clickaboutus() throws InterruptedException {
		Thread.sleep(3000);
		aboutus.click();
	    }
	
	public void ClickPrivacyNotice() throws InterruptedException {
		Thread.sleep(3000);
		PrivacyNotice.click();
	    }
	public void Clickitinerary() throws InterruptedException {
		Thread.sleep(3000);
		inerary.click();
	    }
	public void Clickshopping_desti() throws InterruptedException {
		Thread.sleep(3000);
		shopping_desti.click();
	    }
	
	public void Clicklogo() throws InterruptedException {
		Thread.sleep(3000);
		logo.click();
	    }
	public void ClickPopup1() throws InterruptedException {	
		Popup1.click();
		Thread.sleep(5000);
		}
	
   }
