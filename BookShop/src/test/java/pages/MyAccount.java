package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import util.Utility;

public class MyAccount extends WebTestBase 
{
	 @FindBy(xpath = "//div//a[text()='Fiction']")
	    WebElement hover;
	 @FindBy(xpath = "//*[@id=\"default\"]/div[2]/footer/div/div/div[1]/div[3]/p/a[3]/img")
	 WebElement instagram;
	 public MyAccount()
		{
		 PageFactory.initElements(driver, this);
	    }
	 public void mouseHover()
	 {
	    	Utility.mouseHover(driver,hover);
	    }
	 public void scrollDownMethod() {
	        Utility.scrollDownByElement(driver, instagram);
	        instagram.click();

	    }

	    public void windowHandle(){
	        Utility.scrollDownByElement(driver, instagram);
	       instagram.click();
	        Utility.switchToWindows(driver);
	    }
	 public void getCookiesHandle()
	 {
	    	Utility.getCookies();
     }
}



