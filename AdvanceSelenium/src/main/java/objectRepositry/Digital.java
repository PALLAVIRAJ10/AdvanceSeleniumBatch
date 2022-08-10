package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Digital {
  public Digital(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath = "//h1[text()='Digital downloads']")
  private WebElement digital;

public WebElement getDigital() {
	return digital;
	
	
}
  
}
