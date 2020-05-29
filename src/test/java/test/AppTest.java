package test;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest  {

	public WebDriver driver;

	@Test
	public void login() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Shared/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://juice-shop.herokuapp.com/#/");
		Thread.sleep(5000);
		driver.close();
	}
}