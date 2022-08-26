package cucumberPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static WebDriver driver;
@Given("user is on login page")
public void user_is_on_login_page()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demowebshop.tricentis.com/login");
}
@When("^Enter valid (.*) and (.*)$")
public void Enter_valid_username_and_password(String username, String password )
{
	driver.findElement(By.id("Email")).sendKeys("pallavi");
	driver.findElement(By.id("Password")).sendKeys("pallavi12");
}

@When("click on login")
public void Click_on_login()
{
	driver.findElement(By.xpath("//input[@value='Log in']"));
}
@Then("home page is displayed")
public void home_page_is_displayed()
{
	System.out.println("home page is displayed");
}

}
