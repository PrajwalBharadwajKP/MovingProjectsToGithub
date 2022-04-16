package FirstProgram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageTest {
	@FindBy(id="logoutLink")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
}