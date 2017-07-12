package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_TrainingObject {

	
	
WebDriver driver;
	
	public Add_TrainingObject(WebDriver driver)
	{
		this. driver = driver;
		
	}
	
	// Employee Personal Information 
	By first =By.id("trainingWizardForm:firstNameId");
	By last =By.id("trainingWizardForm:lastNameId");
	By Middle=By.id("trainingWizardForm:middleNameId");
	By homeaddress=By.id("trainingWizardForm:homeaddressId");
	By homephone=By.id("trainingWizardForm:homephoneId");
	By Organization=By.id("trainingWizardForm:orgmailaddressId");
	By OfficeTele=By.id("trainingWizardForm:officePhoneId");
	By WorkEmail=By.id("trainingWizardForm:workEmailId");
	By Positiontitle=By.id("trainingWizardForm:posTitleId");
	By SAN= By.id("trainingWizardForm:descSpecialAccomNeedsId");
	By DOSA=By.id("trainingWizardForm:descSpecialAccomNeedsId");
	By series=By.id("trainingWizardForm:seriesId");
	By cont =By.id("trainingWizardForm:courseWiz_next");
	
	// Course Information 
	By VendorName= By.id("trainingWizardForm:vednornameId");
	By VendorMail=By.id("trainingWizardForm:vendoraddrId");
	By VendorePhone=By.id("trainingWizardForm:vendorphoneId");
	By VendorEmail=By.id("trainingWizardForm:vendoremailId");
	By TrainingSite =By.id("trainingWizardForm:locationofsiteId");
	By TrainingTitle=By.id("trainingWizardForm:trainingTitleId");
	By CourseNumber=By.id("trainingWizardForm:courscodenumberId");
	By TrainingStartDate= By.id("trainingWizardForm:trainingstartdatetimeId_input");
	By TrainingEndDate =By.id("trainingWizardForm:trainingenddatetimeId_input");
	By DutyHours=By.id("trainingWizardForm:trainingDutyHoursId_input");
	By NonDutyHours=By.id("trainingWizardForm:trainingNonDutyHoursId_input");
	By trainingCredit=By.id("trainingWizardForm:trainingCreditId_input");
	By Exp=By.id("trainingWizardForm:continservagremntdateId_input");
	By TrainingObjective=By.id("//*[@id='trainingWizardForm:trainningobjectivesId']");
	By back=By.id("trainingWizardForm:courseWiz_back");
	
	
	// Cost and Billing Information 
	By Tuition= By.id("trainingWizardForm:trainingTuitionAndFeeCost_input");
	By BooksMaterial = By.id("trainingWizardForm:trainingMaterialsCost_input");
	By TravelCost = By.id("trainingWizardForm:trainingTravelCost_input");
	By PerDiem   = By.id("trainingWizardForm:trainingPerDiemCost_input");
	By NonGovernment= By.id("trainingWizardForm:trainingNonGvContribCost_input");
	By DocumentPurchase= By.id("trainingWizardForm:purchaseNumber");
	By SaveContinue= By.id("trainingWizardForm:courseWiz_next");
	
	// Approval 
	By SupervisorName= By.id("trainingWizardForm:immedsupervnameId_input");
	By SupervisorTitle= By.id("trainingWizardForm:immedsupvtitleId");
	By TelephoneNumber= By.id("trainingWizardForm:immedsupvphoneId");
	By SupervisorEmail = By.id("trainingWizardForm:immedsupvemailId");
	By Submit= By.id("trainingWizardForm:saveCourseId2");
	
	
	
	By delete= By.id("trainingListForm:trainingdatainfo:0:deleteCourseId");
	By Yes =By.id("trainingListForm:j_idt50");
	// Add and training 
	By training =By.xpath("//*[@id='employeeListForm:employeeListinfo:20:courseListId']");
	By Add=By.xpath("//*[@id='trainingListForm:courseId']");
	public WebElement Yes()
	{
		return driver.findElement(Yes);
	}
	public WebElement Training()
	{
		return driver.findElement(training);
	}
	
	
	public WebElement Add()
	{
		return driver.findElement(Add);
	}
	
	public WebElement Delete()
	{
		return driver.findElement(delete);
	}
	public WebElement firstname()
	{
		return driver.findElement(first);
	}
	
	public WebElement Lastname()
	{
		return driver.findElement(last);
	}
	
	public WebElement MiddleInitial()
	{
		return driver.findElement(Middle);
	}
	
	
	public WebElement HomeAddress()
	{
		return driver.findElement(homeaddress);
	}
	
	
	public WebElement MailingAddress()
	{
		return driver.findElement(Organization);
	}
	public WebElement OfficeTelephone()
	{
		return driver.findElement(OfficeTele);
	}


	public WebElement WorkEmail()
	{
		return driver.findElement(WorkEmail);
	}
	
	public WebElement PositionTitle()
	{
		return driver.findElement(Positiontitle);
	}
	public WebElement SpecialAccommodation()
	{
		return driver.findElement(SAN);
	}
	public WebElement DescriptionofSpecialAccommodationNeeded()
	{
		return driver.findElement(DOSA);
	}
	
	public WebElement series()
	{
		return driver.findElement(series);
	}
	


	public WebElement Homephone()
	{
		return driver.findElement(homephone);
	}
	
	// Course Information 
	
	public WebElement VendorName()
	{
		return driver.findElement(VendorName);
	}

	public WebElement VendorMail()
	{
		return driver.findElement(VendorMail);
	}

	public WebElement VendorPhone()
	{
		return driver.findElement(VendorePhone);
	}

	public WebElement VendorEmail()
	{
		return driver.findElement(VendorEmail);
	}

	public WebElement  TrainingSite()
	{
		return driver.findElement(TrainingSite);
	}

	public WebElement TrainingTitle()
	{
		return driver.findElement(TrainingTitle);
	}
	public WebElement CourseNumber()
	{
		return driver.findElement(CourseNumber);
	}
	public WebElement TrainingDateStart()
	{
		return driver.findElement(TrainingStartDate);
		
	}
	public WebElement TrainingDateEnd()
	{
		return driver.findElement(TrainingEndDate);
	}
	public WebElement TrainingDutyHours()
	{
		return driver.findElement(DutyHours);
	}

	public WebElement NonDutyHours()
	{
		return driver.findElement(NonDutyHours);
		
	}

	public WebElement TrainingCredit()
	{
		return driver.findElement(trainingCredit);
		
	}

	public WebElement ExpirationDate()
	{
		return driver.findElement(Exp);
		
	}

	public WebElement TrainingObjective()
	{
		return driver.findElement(TrainingObjective);
		
	}


	

	public WebElement Back()
	{
		return driver.findElement(back);

	}
	public WebElement SaveContinue()
	{
		return driver.findElement(SaveContinue);
	}
	// Cost ANd Billing Information 
	public WebElement TuitionandFees()
	{
		return driver.findElement(Tuition);
	}
	public WebElement BooksMaterial()
	{
		return driver.findElement(BooksMaterial);
	}
		
	public WebElement TravelCost()
	{
		return driver.findElement(TravelCost);
	}
			
	public WebElement PerDiem()
	{
		return driver.findElement(PerDiem);
	}
	public WebElement NonGovernment()
	{
		return driver.findElement(NonGovernment);
	}
	public WebElement DocumentPurchase()
	{
		return driver.findElement(DocumentPurchase);
	}
	
	// Aproval 
	public WebElement SupervisorName()
	{
		return driver.findElement(SupervisorName);
	}
	public WebElement SupervisorTitle()
	{
		return driver.findElement(SupervisorTitle);
	}
	public WebElement TelephoneNumber ()
	{
		return driver.findElement(TelephoneNumber);
	}
	public WebElement SupervisorEmail()
	{
		return driver.findElement(SupervisorEmail);
	}
	public WebElement Submit()
	{
		return driver.findElement(Submit);
	}
	
}
