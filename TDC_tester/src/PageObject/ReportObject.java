package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportObject {


	WebDriver driver;
	
	public ReportObject(WebDriver driver)
	{
		this. driver = driver;
		
	}
	
By Report=By.id("employeeListForm:exportId");
By First_name=By.id("trainingListForm:trainingexportinfo:j_idt37:filter");
By Last_name=By.id("trainingListForm:trainingexportinfo:j_idt39:filter");
By Title=By.id("trainingListForm:trainingexportinfo:j_idt41:filter");
By Vendor=By.xpath("//*[@id='trainingListForm:trainingexportinfo:j_idt43']/span[1]");
By Training_Cost=By.xpath("//*[@id='trainingListForm:trainingexportinfo:j_idt45']/span[1]");
By Training_Start_Date=By.xpath("//*[@id='trainingListForm:trainingexportinfo:j_idt47']/span[1]");
By Training_End_Date=By.xpath("///*[@id='trainingListForm:trainingexportinfo:j_idt49']/span[1]");
By Supervisor_Name =By.id("trainingListForm:trainingexportinfo:j_idt51:filter");
By Accountability_Office =By.id("trainingListForm:trainingexportinfo:j_idt53:filter");
By Department =By.id("trainingListForm:trainingexportinfo:j_idt55:filter");
By Training_Start =By.id("trainingListForm:trainingstartdatetimeId_input");
By Training_end =By.id("trainingListForm:trainingenddatetimeId_input");
By Search =By.id("trainingListForm:searchTrainings");
By Reset =By.id("trainingListForm:trainingDataWizardIdFooter");


public WebElement ResetButton()
{
	return driver.findElement(Reset);
}
public WebElement Department()
{
	return driver.findElement(Department);
}

public WebElement SearchButton()
{
	return driver.findElement(Search);
}

public WebElement Report()
{
	return driver.findElement(Report);
}
	
	
public WebElement First_name()
{
	return driver.findElement(First_name);
}

public WebElement Last_name()
{
	return driver.findElement(Last_name);
}

public WebElement Title()
{
	return driver.findElement(Title);
}
public WebElement Vendor()
{
	return driver.findElement(Vendor);
}
public WebElement Training_Cost()
{
	return driver.findElement(Training_Cost);
}
		
public WebElement Training_Start_Date()
{
	return driver.findElement(Training_Start_Date);
}
	
public WebElement Training_End_Date()
{
	return driver.findElement(Training_End_Date);
}
	
public WebElement Supervisor_Name()
{
	return driver.findElement(Supervisor_Name);
}
		
public WebElement Accountability_Office()
{
	return driver.findElement(Accountability_Office);
}
		
public WebElement Training_Start()
{
	return driver.findElement(Training_Start);
}

public WebElement Training_end()
{
	return driver.findElement(Training_end);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
