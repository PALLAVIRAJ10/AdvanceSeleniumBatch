package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class REgisterPage extends BaseClass{
public REgisterPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(linkText = "Register")
private WebElement reg;

public WebElement getReg() {
	return reg;
}

public WebElement getFirstname() {
	return firstname;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPwd() {
	return pwd;
}

public WebElement getCfmpwd() {
	return cfmpwd;
}

public WebElement getRegbutton() {
	return regbutton;
}
@FindBy(id = "FirstName")
private WebElement firstname;

@FindBy(id = "LastName")
private WebElement lastname;

@FindBy(id = "Email")
private WebElement email;

@FindBy(id = "Password")
private WebElement pwd;

@FindBy(id = "ConfirmPassword")
private WebElement cfmpwd;

@FindBy(id = "register-button")
private WebElement regbutton;

}
