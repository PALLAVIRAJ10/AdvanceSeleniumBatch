package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computer1
{
  public Computer1(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(linkText = "Computers")
  private WebElement comp;
  
  public WebElement getComp() {
	return comp;
}

public WebElement getNotbook() {
	return notbook;
}

@FindBy(xpath = "//a[@title='Show products in category Notebooks']")
  private WebElement notbook;
  
  
}
