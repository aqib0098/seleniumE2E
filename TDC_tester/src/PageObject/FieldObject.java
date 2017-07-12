package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FieldObject {

WebDriver driver;
	
	public FieldObject(WebDriver driver)
	{
		this. driver = driver;
		
	}
	
By firstname=By.xpath("//*[@id='employeeListForm:employeeListinfo:j_idt25:filter']");
By LastName=By.xpath("//*[@id='employeeListForm:employeeListinfo:j_idt27:filter']");
By Title=By.xpath("//*[@id='employeeListForm:employeeListinfo:j_idt29:filter']");
By Department =By.xpath("//*[@id='employeeListForm:employeeListinfo:j_idt31:filter']");
By Office_Code =By.xpath("//*[@id='employeeListForm:employeeListinfo:j_idt33:filter']");
By Role =By.xpath("//*[@id='employeeListForm:employeeListinfo:j_idt35:filter']");
By Email_Address=By.xpath("//*[@id='employeeListForm:employeeListinfo:j_idt41:filter']");
By Active_Y=By.xpath("//*[@id='employeeListForm:employeeListinfo:j_idt43:filter']");
By Active_N=By.xpath("//*[@id='employeeListForm:employeeListinfo:j_idt43:filter']");
public WebElement firstname()
{
	return driver.findElement(firstname);
}

public WebElement LastName()
{
	return driver.findElement(LastName);
}
public WebElement Title()
{
	return driver.findElement(Title);
}
public WebElement Department()
{
	return driver.findElement(Department);
}
public WebElement Office_Code()
{
	return driver.findElement(Office_Code);
}

public WebElement Role()
{
	return driver.findElement(Role);
}
public WebElement Email_Address()
{
	return driver.findElement(Email_Address);
}
public WebElement Active_Y()
{
	return driver.findElement(Active_Y);
}
public WebElement Active_N()
{
	return driver.findElement(Active_N);
}












}
