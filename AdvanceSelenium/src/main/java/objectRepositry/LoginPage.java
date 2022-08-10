package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class LoginPage  {
 public LoginPage(WebDriver Driver)
 {
	 PageFactory.initElements(Driver, this);
 }
 @FindBy(linkText = "Log in")
 private WebElement login;
 
 @FindBy(id = "Email")
 private WebElement email;
 
 @FindBy(id = "Password")
 private WebElement password;
 
 public WebElement getLogin() {
	return login;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoged() {
	return loged;
}
@FindBy(xpath = "//input[@value='Log in']")
 private WebElement loged;
 
}
