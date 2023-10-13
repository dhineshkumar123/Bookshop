package testCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.GiftCard;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccount;
import testBase.WebTestBase;

public class Tc extends WebTestBase {

	HomePage homePage;
	LoginPage loginPage;
	MyAccount myAccount;
	GiftCard giftCard;
	
	public Tc()
	{
		super();
	}
	@BeforeMethod
	public void beforeMethod()
	{
		initialization();
		homePage =new HomePage();
		loginPage=new LoginPage();
		myAccount=new MyAccount();
		giftCard=new GiftCard();
	}
	@Test(priority = 0)
	public void verifyUrl()
	{
		SoftAssert softAssert = new SoftAssert();
		homePage.userSearchClick();
		softAssert.assertAll();
	}
	
	 @Test(priority = 1)
	 public void verifyLoginWithValidCredential(){
	     SoftAssert softAssert = new SoftAssert();
	     loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	     //softAssert.assertEquals(myaccount.getTextOFMYAccountPage(), "My Account", "My Account text should be match");
	     softAssert.assertAll();
	 }
	 @Test(priority = 2)
	    public void verifyScrollDown(){
	        SoftAssert softAssert = new SoftAssert();
	        myAccount.scrollDownMethod();
	        softAssert.assertAll();
	    }
	//clicking instagram option and switching to that window
	    @Test(priority = 3)
	    public void verifyGetWindowHandle(){
	        SoftAssert softAssert = new SoftAssert();
	        myAccount.windowHandle();
	        softAssert.assertAll();
	    }
	
	 @Test(priority = 5,enabled=false)
	 public void giftcardpage(){
	        SoftAssert softAssert = new SoftAssert();
	        giftCard.opengift();
	        softAssert.assertAll();
	 } 
	 
	 
	 
	 @Test(priority = 4)
	    public void verifyCookiesHandle(){
	        SoftAssert softAssert = new SoftAssert();
	        myAccount.getCookiesHandle();
	        softAssert.assertAll();
	    }
	
	  
	/*@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}*/
	
}
