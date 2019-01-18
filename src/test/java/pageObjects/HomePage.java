package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 }
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'LOGOUT')]") 
	private WebElement lnk_logout;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Financial Analysis')]/parent::div") 
	private WebElement lnk_FinAnalysis;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Financial Analysis')]/following-sibling::div") 
	private WebElement lnk_FinAnalysis_Sibling;
	@FindBy(how = How.XPATH, using = "//*[@id='_easyui_tree_1']//child::span[1]") 
	private WebElement lnk_Company;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Manage Company')]") 
	private WebElement lnk_ManageCompany;

	public void userIsOnHomePage() {
			Assert.assertEquals(true, lnk_logout.isDisplayed());
		}

	public void ClickonFinAnaLink() throws IOException, InterruptedException
	{
		Thread.sleep(4000);
		try
		{
		// String strReadValue=objLogin.GetParameterValue_again("OBJ_FINANCIAL_ANALYSIS_LINK", "OR.properties");
		
			String strVar = lnk_FinAnalysis.getAttribute("class");
				if (strVar.contains("selected"))
			{
				;
			}	
			else
			{
			
				lnk_FinAnalysis_Sibling.click();
			}
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}

	public void ClickonCompanyLink() throws IOException
	{
		try
		{
	    //	String strReadValue=objLogin.GetParameterValue_again("OBJ_COMPANY_LINK", "OR.properties");
	    //	WebElement objLink=ExplicitWait.WaitForObjectExist(strReadValue);
	    	String strVar = lnk_Company.getAttribute("class");
	    	if (strVar.contains("expanded"))
	    	{
	    		;
	    	}	
	    	else
	    	{
	    		//objLink=ExplicitWait.WaitForObjectExist(strReadValue);//("//*[@id='_easyui_tree_1']//child::span[1]");
	    		lnk_Company.click();
	    	}
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}

	public void ClickonManageCompanyLink() throws IOException
	{
		try
		{
		//	String strReadValue=objLogin.GetParameterValue_again("OBJ_MANAGE_COMPANY_LINK", "OR.properties");
		//	WebElement objLink=Login.driver.findElement(By.xpath(strReadValue));
			lnk_ManageCompany.click();
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}

}
