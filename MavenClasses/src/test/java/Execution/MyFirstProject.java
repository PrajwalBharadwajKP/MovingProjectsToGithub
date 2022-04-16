package Execution;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import FirstProgram.HomePageTest;
import FirstProgram.MainPageTest;
public class MyFirstProject {
	@Test
	void program() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		HomePageTest hpt= new HomePageTest(driver);
		FileInputStream file=new FileInputStream("./src/test/resources/TestData/Login.properties");
		Properties property=new Properties();
		property.load(file);
		hpt.getUserName().sendKeys(property.getProperty("username"));
		hpt.getPassword().sendKeys(property.getProperty("password"));
		hpt.getLoginButton().click();
		MainPageTest mpt=new MainPageTest();
		mpt.getLogout().click();
	}
}