package FirstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageTest {
	WebDriver driver;
	public HomePageTest(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	@FindBy(id="username")
	private WebElement userName;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(id="loginButton")
	private WebElement loginButton;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
}
