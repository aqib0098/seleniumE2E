package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewObject {

	
WebDriver driver;
	
	public NewObject(WebDriver driver)
	{
		this. driver = driver;
		
	}
	By ClickSearchDirectorybutton=By.id("searchEmployeeForm:searchDirectory");
	By FirstName=By.id("searchEmployeeForm:searchTerm");
	By LastName=By.id("searchEmployeeForm:searchTerm");
	By OfficeCode=By.id("searchEmployeeForm:searchTerm");
	By Email=By.id("searchEmployeeForm:searchTerm");
	By New=By.id("employeeListForm:searchemployeeid");
	By Add= By.id("searchEmployeeForm:searchresult:0:j_idt44");
	By AddButton= By.id("searchEmployeeForm:j_idt54");
	public WebElement Add_Button()
	{
		return driver.findElement(AddButton);
	}
	
	public WebElement Addbutton()
	{
		return driver.findElement(Add);
	}
	
	public WebElement New()
	{
		return driver.findElement(New);
	}
	public WebElement FirstName()
	{
		return driver.findElement(FirstName);
	}

	public WebElement LastName()
	{
		return driver.findElement(LastName);
	}


	public WebElement OfficeCode()
	{
		return driver.findElement(OfficeCode);
	}

	
	
	public WebElement ClickSearchDirectorybutton()
	{
		return driver.findElement(ClickSearchDirectorybutton);
	}
	public WebElement Email()
	{
		return driver.findElement(Email);
	}





}