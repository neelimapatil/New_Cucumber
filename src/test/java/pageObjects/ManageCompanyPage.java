package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.ScenarioContext;
import cucumber.TestContext;
import enums.Context;
import pageObjects.ManageCompanyPage;

public class ManageCompanyPage {
	private WebDriver driver;
	TestContext testContext;
	ScenarioContext scenarioContext;
	
	public ManageCompanyPage(WebDriver driver){
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 }

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'New')]") 
	private WebElement btn_company_new;
	@FindBy(how = How.XPATH, using = "//td[contains(text(), 'Company Name')]/following-sibling::td[1]//child::input") 
	private WebElement OBJ_COMPANY_NAME;
	@FindBy(how = How.XPATH, using = "//select[@id='companytype']") 
	private WebElement OBJ_COMPANY_TYPE;
	@FindBy(how = How.XPATH, using = "//select[@name='subtype']") 
	private WebElement OBJ_COMPANY_SUBTYPE;
	@FindBy(how = How.XPATH, using = "//input[@textboxname='address']//following-sibling::span[1]//child::textarea") 
	private WebElement OBJ_COMPANY_ADDRESS;
	@FindBy(how = How.XPATH, using = "//input[@textboxname='phone']//following-sibling::span[1]//child::input") 
	private WebElement OBJ_COMPANY_PHONE;
	@FindBy(how = How.XPATH, using = "//input[@name='email']") 
	private WebElement OBJ_COMPANY_EMAIL;
	@FindBy(how = How.XPATH, using = "//input[@name='pan']") 
	private WebElement OBJ_COMPANY_PAN;
	@FindBy(how = How.XPATH, using = "//input[@name='tin']") 
	private WebElement OBJ_COMPANY_TIN;
	@FindBy(how = How.XPATH, using = "//input[@textboxname='mobile']//following-sibling::span[1]//child::input") 
	private WebElement OBJ_COMPANY_MOBILE;
	@FindBy(how = How.XPATH, using = "//input[@name='website']") 
	private WebElement OBJ_COMPANY_WEBSITE;
	@FindBy(how = How.XPATH, using = "//select[@name='countryname']") 
	private WebElement OBJ_COUNTRY;
	@FindBy(how = How.XPATH, using = "//select[@name='state']") 
	private WebElement OBJ_STATE;
	@FindBy(how = How.XPATH, using = "//select[@name='city']") 
	private WebElement OBJ_CITY;
	@FindBy(how = How.XPATH, using = "//input[@textboxname='totalemployee']//following-sibling::span[1]//child::input") 
	private WebElement OBJ_TOTAL_EMPLOYEE;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]") 
	private WebElement OBJ_SAVE_BUTTON;
	@FindBy(how = How.XPATH, using = "//div[contains(text(), 'Tester16')]") 
	private WebElement lnk_Newcompany;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Destroy')]") 
	private WebElement lnk_Delcompany;
		
	public void ClickonNewButton() throws InterruptedException
	{
		try
		{
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			btn_company_new.click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void EnterComName(String strName) throws InterruptedException
	{
		Thread.sleep(2000);
		try
		{
			OBJ_COMPANY_NAME.sendKeys(strName);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void SelectComType(String strName) 
	{
		try
		{
			//String strReadValue=objLogin.GetParameterValue_again("OBJ_COMPANY_TYPE", "OR.properties");
			//WebElement objDropDown=Login.driver.findElement(By.xpath(strReadValue));//("//select[@id='companytype']");
			Select objDashBoard = new Select(OBJ_COMPANY_TYPE);
			//strReadValue=objLogin.GetParameterValue_again("COMPANY_TYPE", "parameter.properties");
			objDashBoard.selectByVisibleText(strName);
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}
	public void SelectCComSubType(String strName) throws  InterruptedException
	{
		try
		{
			//String strReadValue=objLogin.GetParameterValue_again("OBJ_COMPANY_SUBTYPE", "OR.properties");
			//WebElement objDropDown=Login.driver.findElement(By.xpath(strReadValue));//("//select[@name='subtype']");
			Select objDashBoard = new Select(OBJ_COMPANY_SUBTYPE);
			//strReadValue=objLogin.GetParameterValue_again("COMPANY_SUBTYPE", "parameter.properties");
			objDashBoard.selectByVisibleText(strName);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}	

	public void EnterAddress(String strName) 
	{
		try
		{
		//("//input[@textboxname='address']//following-sibling::span[1]//child::textarea");
			OBJ_COMPANY_ADDRESS.sendKeys(strName);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void EnterPhone(String strName)  
	{
		try
		{
			OBJ_COMPANY_PHONE.sendKeys(strName);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
	}

	public void EnterEmail(String strName) 
	{
		try
		{
			OBJ_COMPANY_EMAIL.sendKeys(strName);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
	}
	
	public void EnterPan(String strName) throws InterruptedException
	{
		try
		{
			OBJ_COMPANY_PAN.sendKeys(strName);	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
	}

	public void EnterTin(String strName) throws InterruptedException 
	{
		Thread.sleep(1000);
		try
		{
			OBJ_COMPANY_TIN.sendKeys(strName);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
	}

	public void EnterMobile(String strName) throws InterruptedException 
	{
		Thread.sleep(1000);
		try
		{
		OBJ_COMPANY_MOBILE.sendKeys(strName);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void EnterWebsite(String strName) throws InterruptedException
	{
		Thread.sleep(1000);
		try
		{
			OBJ_COMPANY_WEBSITE.sendKeys(strName);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void SelectCountry(String strName) throws InterruptedException
	{
		Thread.sleep(1000);
		try
		{
		Select objDashBoard = new Select(OBJ_COUNTRY);
		objDashBoard.selectByVisibleText(strName);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void SelectState(String strName) throws  InterruptedException
	{
		Thread.sleep(1000);
		try
		{
		Select objDashBoard = new Select(OBJ_STATE);
		objDashBoard.selectByVisibleText(strName);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void SelectCity(String strName) throws InterruptedException
	{
		Thread.sleep(1000);
		try
		{
		Select objDashBoard = new Select(OBJ_CITY);
		objDashBoard.selectByVisibleText(strName);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void EnterTotalEmp(String strName) throws  InterruptedException
	{
		Thread.sleep(1000);
		try
		{
			OBJ_TOTAL_EMPLOYEE.sendKeys(strName);
			System.out.println("test");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void ClickOnSaveButton()
	{
		try
		{
			
			OBJ_SAVE_BUTTON.click();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String getCompanyName() {
			//testContext.getScenarioContext().setContext(Context.COMPANY_NAME,"Tester16");
		 return lnk_Newcompany.getText();
		 }
	public void ClickOnDeleteButton() {
		String strcompanyName = getCompanyName();
		//testContext.getScenarioContext().getContext(Context.COMPANY_NAME);
		lnk_Delcompany.click();
		
	}
}