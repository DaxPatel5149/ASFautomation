package com.Amc.PageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.codehaus.groovy.control.io.AbstractReaderSource;
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

public class About_Us extends TestBase {

	public About_Us() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//a[@class='startBtn d-block mx-auto mb-2']//*[name()='svg']")
	WebElement Start;
	
	// advertisement pop-up close
	@FindBy(css = "button[class='close-btn']")
	WebElement Popup;
	
	// advertisement pop-up close
	@FindBy(xpath = "//a[@class='menuItem'][normalize-space()='About Us']")
	WebElement About_us;
	
	// play video
	@FindBy(xpath = "//img[@title='asf video']")
	WebElement Play;
		
	//click play video
	@FindBy(xpath = "//video[@id='modal-video']")
	WebElement Playvideo;
	
	// close video
	@FindBy(xpath = "//button[@aria-label='Close']")
	WebElement close;
	
	public void StartButton() throws InterruptedException {
		Thread.sleep(1000);
		Start.click();
		}
	public void ClickPopup() throws InterruptedException {	
		Popup.click();
		Thread.sleep(2000);
		}
	public void ClickAbout_us() throws InterruptedException {	
		About_us.click();
		}
	public void ClickPlay() throws InterruptedException {	
		Play.click();
		}
	public void ClickPlayvideo() throws InterruptedException {	
		Playvideo.click();
		}
	public void ClickVideoclose()throws InterruptedException {
		Thread.sleep(1000);
		close.click();
		}
}
