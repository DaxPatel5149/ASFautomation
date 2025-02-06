package com.Amc.PageObjects;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amc.Base.TestBase;

public class sidebaroption extends TestBase {

	public sidebaroption() {
		PageFactory.initElements(driver, this);

	}
	
	//click Project section
		@FindBy(xpath = "(//span[@class='mat-list-item-content'])[2]")
		WebElement Clickprojects;
				
		//click user management section
		@FindBy(xpath="(//mat-list-item[@routerlink='user'])[1]")
		WebElement Clickusermanagement;
	   
		//click product management section
		@FindBy(xpath="(//mat-list-item[@routerlink='product'])[1]")
		WebElement Clickproductmanagement;
		
		//click brand link section
	   @FindBy(xpath="(//mat-list-item[@class='mat-list-item mat-focus-indicator menuItems menuItemsExpanded ng-star-inserted'])[3]")
		WebElement Clickbrandlink;
		
		//click switch product
	    @FindBy(xpath="(//span[@class='mat-list-item-content'])[5]")
		WebElement Clickswitchproduct;
	    
	  //click switch product brand
	    @FindBy(xpath="(//p[contains(text(),'Aedes do Bem™')])[1]")
		WebElement Clickswitchproductbrand;
	    
	  //click language
	    @FindBy(xpath="(//app-navigation-panel[@class='ng-star-inserted'])[1]")
		WebElement Clicklanguage;
	    
	  //click switch language brazil
	    @FindBy(xpath="(//div[@class='productDetailDiv d-flex ng-star-inserted productDetailDivSelected'])[1]")
		WebElement Clickswitchlanguage;
	    
	  //click setting option
	    @FindBy(xpath="//img[@src='../../../../../assets/image/menuItems/settingsSvg.webp']")
		WebElement Clicksetting;
		
	  //click profile option
	    @FindBy(xpath="//img[@src='../../../assets/image/defaultProfile.webp']")
		WebElement Clickprofile;
		
	public void ClickprojectsTest() {	
		Clickprojects.click();	
		
	}
	
	public void ClickusermanagementTest() {
		Clickusermanagement.click();
		
	}
	public void ClickproductmanagementTest() {
		Clickproductmanagement.click();
		
	}
	public void ClickbrandlinkTest() throws InterruptedException {
		Clickbrandlink.click();
		Thread.sleep(5000);
		Set<String> handles = driver.getWindowHandles();

		// Switch to the new tab
		for (String handle : handles) {
		    if (!handle.equals(driver.getWindowHandle())) {
		        driver.switchTo().window(handle);
		        break;
		    }
		}
		driver.switchTo().window(handles.iterator().next());
	} 
	public void ClickswitchproductTest() throws InterruptedException {
		Clickswitchproduct.click();
		Thread.sleep(4000);
	}	
	public void ClickswitchproductbrandTest() {
		Clickswitchproductbrand.click();
		
	}
	public void ClicklanguageTest() throws InterruptedException {
		Clicklanguage.click();
		Thread.sleep(3000);
	}	
	public void ClickswitchlanguageTest() throws InterruptedException {
		Clickswitchlanguage.click();
		Thread.sleep(3000);
	}
	public void ClicksettingTest() throws InterruptedException {
		Clicksetting.click();
		Thread.sleep(3000);
	}
	public void ClickprofileTest() throws InterruptedException {
		Clickprofile.click();
		Thread.sleep(3000);
	}
}