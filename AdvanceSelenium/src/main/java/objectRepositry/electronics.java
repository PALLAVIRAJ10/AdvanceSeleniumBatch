package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class electronics 
{
	public electronics(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Electronics")
	private WebElement elect;
	
	public WebElement getElect() {
		return elect;
	}

	public WebElement getCamera() {
		return camera;
	}
	@FindBy(linkText = "Camera, photo")
	private WebElement camera;
	
	
}
