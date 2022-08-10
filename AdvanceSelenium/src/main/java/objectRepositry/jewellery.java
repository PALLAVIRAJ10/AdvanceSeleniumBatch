package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jewellery {
 
	public jewellery(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1[text()='Jewelry']")
	private WebElement jewel;
	
	public WebElement getJewel() {
		return jewel;
	}
	
	
}
