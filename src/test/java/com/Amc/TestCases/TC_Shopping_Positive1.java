package com.Amc.TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.Amc.Base.TestBase;
import com.Amc.PageObjects.StartPage;
import com.Amc.PageObjects.Shopping;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/*This test case is for Positive Test Scenario*/
public class TC_Shopping_Positive1 extends TestBase {

	public static Shopping lp;
/*
	@Test(priority=1)
	public void ClickStartTest() throws IOException, InterruptedException {
		lp = new Shopping();
		Thread.sleep(3000);
		lp.StartButton();
		} 
	// advertisement pop-up close
	@Test(priority=2)
	public void ClickPopup() throws IOException, InterruptedException {
		lp = new Shopping();
		Thread.sleep(3000);
		lp.ClickPopup();
		}  
	*/
	
	  // itinerary Section
	
	@Test(priority = 3)
	public void ClickShopping() throws IOException, InterruptedException {
		lp = new Shopping();
		Thread.sleep(2000);
		lp.ClickShopping();

	}
	// click first dropdown option 
	@Test(priority = 4)
	public void Clickitinerary() throws IOException, InterruptedException {
		Thread.sleep(1000);
		lp.Clickitinerary();
		Thread.sleep(6000);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver; 

			js.executeScript("window.scrollBy(0, 400);"); 

			 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");

	}

	@Test(priority=5)
	public void ClickSearchShop() throws IOException, InterruptedException {
		lp = new Shopping();
		Thread.sleep(3000);
		lp.ClickSearchShop("Firstcry.com -Naranpura");
	}
	
	@Test(priority = 6)
	public void ClickDiscount() throws IOException, InterruptedException {
		Thread.sleep(2000);
		lp.ClickDiscount();

	}
	
	@Test(priority = 7)
	public void ClickDiscount10() throws IOException, InterruptedException {
		Thread.sleep(2000);
		lp.ClickDiscount10();

	}
	// Discount dropdown closed
	@Test(priority = 8)
	public void ClickDiscount1() throws IOException, InterruptedException {
		Thread.sleep(2000);
		lp.ClickDiscount1();

	}
	// Select area
	@Test(priority = 9)
	public void ClickArea() throws IOException, InterruptedException {
		Thread.sleep(2000);
		lp.ClickArea();

	}
	
	@Test(priority = 10)
	public void ClickAreavisat() throws IOException, InterruptedException {
		Thread.sleep(2000);
		lp.ClickAreavisat();

	}
	// Area dropdown closed
	@Test(priority = 11)
	public void ClickArea1() throws IOException, InterruptedException {
		Thread.sleep(2000);
		lp.ClickArea1();

	}
	// Select Category
		@Test(priority = 12)
		public void ClickCategory() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickCategory();

		}
		
		@Test(priority = 13)
		public void ClickCategoryGift() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickCategoryGift();

		}
		// Category dropdown closed
		@Test(priority = 14)
		public void ClickCategory1() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickCategory1();

		}
		// go inside shopping details (Click Shop-card view)
		@Test(priority = 15)
		public void ClickShopcard() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickShopcard();

		}
		// go back inside shopping details (Click Back)
		@Test(priority = 16)
		public void Clickback() throws IOException, InterruptedException {
			Thread.sleep(5000);
			lp.Clickback();

		}
		
		// Click Clear filter
		@Test(priority = 17)
		public void ClickClearfilters() throws IOException, InterruptedException {
			Thread.sleep(5000);
			lp.ClickClearfilters();
			Thread.sleep(5000);
		 JavascriptExecutor js = (JavascriptExecutor) driver; 

				js.executeScript("window.scrollBy(0, 2400);"); 

				 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");

		}
		@Test(priority=18)
		public void Clicklogo() throws IOException, InterruptedException {
			Thread.sleep(3000);
			lp.Clicklogo();
			Thread.sleep(5000);
		}
		
		
		@Test(priority=19)
		public void ClickPopup1() throws IOException, InterruptedException {
			lp.ClickPopup1();
			Thread.sleep(5000); 
		}

		
		// shopping-destination section
		
		@Test(priority = 20)
		public void ClickShopping1() throws IOException, InterruptedException {
			lp = new Shopping();
			Thread.sleep(2000);
			lp.ClickShopping1();

		}
		// click Second dropdown option 
		@Test(priority=21)
		public void ShoppingDes() throws IOException, InterruptedException {
			Thread.sleep(1000);
			lp.ShoppingDes();
			Thread.sleep(6000);
			
			 JavascriptExecutor js = (JavascriptExecutor) driver; 

				js.executeScript("window.scrollBy(0, 400);"); 

				 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");
          }
		@Test(priority=22)
		public void ClickSearchShop_Des() throws IOException, InterruptedException {
			lp = new Shopping();
			Thread.sleep(3000);
			lp.ClickSearchShop_Des("Dekorate");
		}
		
		@Test(priority = 23)
		public void ClickDiscount_Des() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickDiscount_Des();

		}
		
		@Test(priority = 24)
		public void ClickDiscount40() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickDiscount40();

		}
		// Discount dropdown closed
		@Test(priority = 25)
		public void ClickDiscount_Des1() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickDiscount_Des1();

		}
		// Select area
		@Test(priority = 26)
		public void ClickArea_Des() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickArea_Des();

		}
		
		@Test(priority = 27)
		public void ClickAreavSindhu() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickAreavSindhu();

		}
		// Area dropdown closed
		@Test(priority = 28)
		public void ClickArea_Des1() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickArea_Des1();

		}
		// Select City
			@Test(priority = 29)
		public void ClickCity_Des() throws IOException, InterruptedException {
			Thread.sleep(2000);
		    lp.ClickCity_Des();

			}
					
		@Test(priority = 30)
		public void ClickCityAhmedabad() throws IOException, InterruptedException {
		    Thread.sleep(2000);
			lp.ClickCityAhmedabad();

			}
		// city dropdown closed
		@Test(priority = 31)
		public void ClickCity_Des1() throws IOException, InterruptedException {
			Thread.sleep(2000);
		    lp.ClickCity_Des1();
            }
		// Select Category
		@Test(priority = 32)
		public void ClickCategory_Des() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickCategory_Des();

			}
			
		@Test(priority = 33)
		public void ClickCategoryOther() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickCategoryOther();

			}
		// Category dropdown closed
		@Test(priority = 34)
		public void ClickCategory_Des1() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickCategory_Des1();

			}
		// Click shop card
		@Test(priority = 35)
		public void ClickDekorate() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.ClickDekorate();

			}
	  // click back button
		
		@Test(priority = 36)
		public void Clickback1() throws IOException, InterruptedException {
			Thread.sleep(2000);
			lp.Clickback1();

			}
		// Click Clear filter
		@Test(priority = 37)
		public void ClickClearfilters1() throws IOException, InterruptedException {
					Thread.sleep(5000);
					lp.ClickClearfilters1();
					Thread.sleep(5000);
				 JavascriptExecutor js = (JavascriptExecutor) driver; 

						js.executeScript("window.scrollBy(0, 2400);"); 

						 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");

				}
		@Test(priority=38)
		public void Clicklogo1() throws IOException, InterruptedException {
			Thread.sleep(3000);
			lp.Clicklogo1();
			Thread.sleep(5000);
		}
		
		
		@Test(priority=39)
		public void ClickPopup11() throws IOException, InterruptedException {
			lp.ClickPopup11();
			Thread.sleep(5000); 
			JavascriptExecutor js = (JavascriptExecutor) driver; 

			js.executeScript("window.scrollBy(0, 400);"); 
			Thread.sleep(3000);

			 long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");
		}
}