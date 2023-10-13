package pages;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import testBase.WebTestBase;

	public class LoginPage extends WebTestBase
	{
		@FindBy(xpath="//*[@id='header']/div[1]/div[3]/nav/div[2]/div[2]/a")
		WebElement signin;
		
		 @FindBy(id = "spree_user_email")
		    WebElement emailtextbox;

		    @FindBy(id = "spree_user_password")
		    WebElement passwordTextBox;

		    @FindBy(name = "commit")
		    WebElement loginbtn;

		    public LoginPage()
		    {
		        PageFactory.initElements(driver, this);
		    }
	//sending the mobileno and passwrord to the login
		    public void login(String email, String password){
		    	signin.click();
		        emailtextbox.sendKeys(email);
		        passwordTextBox.sendKeys(password);
		        loginbtn.click();
		    }	

	}

