package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicMobile {

	public ElectronicMobile(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
		
	}
	@FindBy(linkText = "Electronics")
	private WebElement elect;
	
	public WebElement getElect() {
		return elect;
	}

	public WebElement getCellphone() {
		return cellphone;
	}
	@FindBy(xpath = "//a[@title='Show products in category Cell phones']")
	private WebElement cellphone;
	
}
