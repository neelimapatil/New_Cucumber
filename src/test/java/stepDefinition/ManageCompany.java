package stepDefinition;

import cucumber.ScenarioContext;
import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.ManageCompanyPage;
import enums.Context;

public class ManageCompany {
	ManageCompanyPage objManageCompanyPage;
	TestContext testContext;
	ScenarioContext scenarioContext;
	
	public ManageCompany(TestContext context) {
		testContext = context;
		objManageCompanyPage = testContext.getPageObjectManager().getManageCompanyPage();
	}

	@When("^user clicks on New button$")
	public void user_clicks_on_New_button() throws InterruptedException {
		objManageCompanyPage.ClickonNewButton();
	}

	@And("^User enters Company name as \"([^\"]*)\"$")
	public void user_enters_Company_name_as(String strCompanyName) throws InterruptedException {
		objManageCompanyPage.EnterComName(strCompanyName);
	}

	@And("^User selects Company type as \"([^\"]*)\"$")
	public void user_selects_Company_type_as(String strCompanytype) {
		objManageCompanyPage.SelectComType(strCompanytype);
	}

	@And("^User Company Subtype as \"([^\"]*)\"$")
	public void user_Company_Subtype_as(String strCompanySubtype) throws InterruptedException {
		objManageCompanyPage.SelectCComSubType(strCompanySubtype);
	}

	@And("^User enters Address as \"([^\"]*)\"$")
	public void user_enters_Address_as(String strcoAddr) {
		objManageCompanyPage.EnterAddress(strcoAddr);
	}

	@And("^User enters Phone as \"([^\"]*)\"$")
	public void user_enters_Phone_as(String strCoPhoneNo) {
		objManageCompanyPage.EnterPhone(strCoPhoneNo);
	}

	@And("^User enters Email as \"([^\"]*)\"$")
	public void user_enters_Email_as(String strCoEmail) {
		objManageCompanyPage.EnterEmail(strCoEmail);
	}

	@And("^User enters Pan Details as \"([^\"]*)\"$")
	public void user_enters_Pan_Details_as(String strCoPan) throws InterruptedException {
		objManageCompanyPage.EnterPan(strCoPan);
	}

	@And("^User enters Tin details as \"([^\"]*)\"$")
	public void user_enters_Tin_details_as(String strCoTin) throws InterruptedException {
		objManageCompanyPage.EnterTin(strCoTin);
	}

	@And("^User enters Country as \"([^\"]*)\"$")
	public void user_enters_Country_as(String strCountry) throws InterruptedException {
		objManageCompanyPage.SelectCountry(strCountry);
	}

	@And("^User enters State as \"([^\"]*)\"$")
	public void user_enters_State_as(String strState) throws InterruptedException {
		objManageCompanyPage.SelectState(strState);
	}

	@And("^User enters City name as \"([^\"]*)\"$")
	public void user_enters_City_name_as(String strCity) throws InterruptedException {
		objManageCompanyPage.SelectCity(strCity);
	}

	@And("^User enters Total Employee as \"([^\"]*)\"$")
	public void user_enters_Total_Employee_as(String strTotalEmp) throws InterruptedException {
		objManageCompanyPage.EnterTotalEmp(strTotalEmp);
	}

	@And("^User clicks on Save button$")
	public void user_clicks_on_Save_button() {
		objManageCompanyPage.ClickOnSaveButton();
	}
	@When("^user deletes the company$")
	public void user_deletes_the_company()
	{
		objManageCompanyPage.ClickOnDeleteButton();
		
	}
	
}
