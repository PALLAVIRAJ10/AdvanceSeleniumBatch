package objectRepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class computers extends BaseClass {


	public computers()
	{
	 PageFactory.initElements(driver, this);	
	}
	public WebElement getComputer() {
		return computer;
	}

	public WebElement getDesktops() {
		return desktops;
	}
	@FindBy(xpath = "//h1[text()='Computers']")
	private WebElement computer;
	
	@FindBy(xpath = "//h1[text()='Desktops']")
	private WebElement desktops;
	
}
