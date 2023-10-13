package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class GiftCard extends WebTestBase{
	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div[2]/div/a")
	WebElement menu;
	
	
	@FindBy(xpath="//a[text()='Gift Cards']")
	WebElement gift;
	
	@FindBy(id="order_gift_card_recipient_email")
	WebElement tomail;
	
	public GiftCard()
	{
	 PageFactory.initElements(driver, this);
    }
	public void opengift(){
		menu.click();
		gift.click();
		tomail.sendKeys("mailid@gmail.com");
		
	}
	

}
