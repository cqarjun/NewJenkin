package CQGenerated;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CQGenerated.types.*;
import static org.junit.Assert.*;

public class DefaultHarnessCodeImpl implements HarnessCode
{
	WebDriver driver = null; 
	
	public void setUp(String testcaseName)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ideabytes-06\\Desktop\\Mobile_Appium_Automation\\chromedriver.exe");
		driver =new ChromeDriver();
		System.out.println("Setup: "  + testcaseName);
	}
	public void tearDown(String testcaseName)
	{
		System.out.println("TearDown: "  + testcaseName);
	}
	public void sleep(double time)
	{
	}
	public void log(String m)
	{
		System.out.println(m);
	}
	/** communication functions for  url interface */

	public void performCQRecordenter_URL_Action(CQRecordenter_URL_Action argCQRecordenter_URL_Action)
	{
		System.out.println("URL : "+argCQRecordenter_URL_Action.url);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(argCQRecordenter_URL_Action.url);
	}
	public void performCQRecordClick_Transaction_Action(CQRecordClick_Transaction_Action argCQRecordClick_Transaction_Action)
	{
	}
	/** GUI verification functions */

	public void verifyCQRecordParabank_Welcome_screen(CQRecordParabank_Welcome_screen argCQRecordParabank_Welcome_screen)
	{
	}
	public void verifyCQRecordAdministration_screen(CQRecordAdministration_screen argCQRecordAdministration_screen)
	{
		
	}
	public void verifyCQRecordRegister_screen(CQRecordRegister_screen argCQRecordRegister_screen)
	{
	}
	public void verifyCQRecordForgot_Login_info_screen(CQRecordForgot_Login_info_screen argCQRecordForgot_Login_info_screen)
	{
	}
	public void verifyCQRecordAccount_Services_screen(CQRecordAccount_Services_screen argCQRecordAccount_Services_screen)
	{
	}
	public void verifyCQRecordBill_Payment_Service_screen(CQRecordBill_Payment_Service_screen argCQRecordBill_Payment_Service_screen)
	{
	}
	public void verifyCQRecordTransfer_Funds_screen(CQRecordTransfer_Funds_screen argCQRecordTransfer_Funds_screen)
	{
	}
	public void verifyCQRecordFind_Transactions_screen(CQRecordFind_Transactions_screen argCQRecordFind_Transactions_screen)
	{
	}
	public void verifyCQRecordUpdate_Profile_screen(CQRecordUpdate_Profile_screen argCQRecordUpdate_Profile_screen)
	{
	}
	public void verifyCQRecordApply_for_a_Loan_screen(CQRecordApply_for_a_Loan_screen argCQRecordApply_for_a_Loan_screen)
	{
	}
	public void verifyCQRecordTransaction_Result_screen(CQRecordTransaction_Result_screen argCQRecordTransaction_Result_screen)
	{
	}
	public void verifyCQRecordOpen_New_Account_screen(CQRecordOpen_New_Account_screen argCQRecordOpen_New_Account_screen)
	{
	}
	/** GUI input functions  */

	public void fillCQRecordFill_Customer_Login_form_Parabank_Welcome_screen(CQRecordFill_Customer_Login_form_Parabank_Welcome_screen argCQRecordFill_Customer_Login_form_Parabank_Welcome_screen)
	{
		driver.findElement(By.name("username")).sendKeys(argCQRecordFill_Customer_Login_form_Parabank_Welcome_screen.Fill_Customer_Login_form.Username);
		driver.findElement(By.name("password")).sendKeys(argCQRecordFill_Customer_Login_form_Parabank_Welcome_screen.Fill_Customer_Login_form.Password);
	}
	public void clickCQRecordLOG_IN_button_Parabank_Welcome_screen_Customer_Login_form(CQRecordLOG_IN_button_Parabank_Welcome_screen_Customer_Login_form argCQRecordLOG_IN_button_Parabank_Welcome_screen_Customer_Login_form)
	{	
		driver.findElement(By.xpath(".//*[@id='loginPanel']/form/div[3]/input")).click();
	}
	public void verifyCQRecordInvalid_Credentials_Action(CQRecordInvalid_Credentials_Action argCQRecordInvalid_Credentials_Action)
	{
		
	}
	public void clickCQRecordAdmin_Page_hyperlink_Parabank_Welcome_screen(CQRecordAdmin_Page_hyperlink_Parabank_Welcome_screen argCQRecordAdmin_Page_hyperlink_Parabank_Welcome_screen)
	{
	}
	public void fillCQRecordFill_Application_Setting_form_Administration_screen(CQRecordFill_Application_Setting_form_Administration_screen argCQRecordFill_Application_Setting_form_Administration_screen)
	{
	}
	public void clickCQRecordSUBMIT_button_Administration_screen(CQRecordSUBMIT_button_Administration_screen argCQRecordSUBMIT_button_Administration_screen)
	{
	}
	public void verifyCQRecordTransaction_Error__Action(CQRecordTransaction_Error__Action argCQRecordTransaction_Error__Action)
	{
	}
	public void clickCQRecordRegister_hyperlink_Parabank_Welcome_screen_Customer_Login_form(CQRecordRegister_hyperlink_Parabank_Welcome_screen_Customer_Login_form argCQRecordRegister_hyperlink_Parabank_Welcome_screen_Customer_Login_form)
	{
	}
	public void fillCQRecordFill_Signup_form_Register_screen(CQRecordFill_Signup_form_Register_screen argCQRecordFill_Signup_form_Register_screen)
	{
	}
	public void clickCQRecordRIGISTER_button_Register_screen_Signup_form(CQRecordRIGISTER_button_Register_screen_Signup_form argCQRecordRIGISTER_button_Register_screen_Signup_form)
	{
	}
	public void verifyCQRecordAccount_Created_Action(CQRecordAccount_Created_Action argCQRecordAccount_Created_Action)
	{
	}
	public void verifyCQRecordReject_Register_Action(CQRecordReject_Register_Action argCQRecordReject_Register_Action)
	{
	}
	public void verifyCQRecordInvalid_Register_Action(CQRecordInvalid_Register_Action argCQRecordInvalid_Register_Action)
	{
	}
	public void clickCQRecordForgot_login_info__hyperlink_Parabank_Welcome_screen_Customer_Login_form(CQRecordForgot_login_info__hyperlink_Parabank_Welcome_screen_Customer_Login_form argCQRecordForgot_login_info__hyperlink_Parabank_Welcome_screen_Customer_Login_form)
	{
		driver.findElement(By.xpath(".//*[@id='loginPanel']/p[1]/a")).click();
	}
	public void fillCQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen(CQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen argCQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen)
	{
		driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys(argCQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen.Fill_Forgot_Login_info_form.First_Name);
		driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys(argCQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen.Fill_Forgot_Login_info_form.Last_Name);
		driver.findElement(By.xpath(".//*[@id='address.street']")).sendKeys(argCQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen.Fill_Forgot_Login_info_form.Address);
		driver.findElement(By.xpath(".//*[@id='address.city']")).sendKeys(argCQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen.Fill_Forgot_Login_info_form.City);
		driver.findElement(By.xpath(".//*[@id='address.state']")).sendKeys(argCQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen.Fill_Forgot_Login_info_form.State);
		String zipcode= Integer.toString(argCQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen.Fill_Forgot_Login_info_form.Zip_Code);
		driver.findElement(By.xpath(".//*[@id='address.zipCode']")).sendKeys(zipcode);
		driver.findElement(By.xpath(".//*[@id='ssn']")).sendKeys(argCQRecordFill_Forgot_Login_info_form_Forgot_Login_info_screen.Fill_Forgot_Login_info_form.SSN);

	}
	public void clickCQRecordFIND_MY_LOGIN_INFO_button_Forgot_Login_info_screen_Forgot_Login_info_form(CQRecordFIND_MY_LOGIN_INFO_button_Forgot_Login_info_screen_Forgot_Login_info_form argCQRecordFIND_MY_LOGIN_INFO_button_Forgot_Login_info_screen_Forgot_Login_info_form)
	{
		driver.findElement(By.xpath(".//*[@id='lookupForm']/table/tbody/tr[8]/td[2]/input")).click();
	}
	public void verifyCQRecordAccounts_Overview_Action(CQRecordAccounts_Overview_Action argCQRecordAccounts_Overview_Action)
	{
	}
	public void clickCQRecordAccount_Overview_hyperlink_Account_Services_screen(CQRecordAccount_Overview_hyperlink_Account_Services_screen argCQRecordAccount_Overview_hyperlink_Account_Services_screen)
	{
	}
	public void clickCQRecordBill_Pay_hyperlink_Account_Services_screen(CQRecordBill_Pay_hyperlink_Account_Services_screen argCQRecordBill_Pay_hyperlink_Account_Services_screen)
	{
	}
	public void fillCQRecordFill_Payee_Information_form_Bill_Payment_Service_screen(CQRecordFill_Payee_Information_form_Bill_Payment_Service_screen argCQRecordFill_Payee_Information_form_Bill_Payment_Service_screen)
	{
	}
	public void verifyCQRecordBill_Payment_Complete_Action(CQRecordBill_Payment_Complete_Action argCQRecordBill_Payment_Complete_Action)
	{
	}
	public void clickCQRecordTransfer_Funds_hyperlink_Account_Services_screen(CQRecordTransfer_Funds_hyperlink_Account_Services_screen argCQRecordTransfer_Funds_hyperlink_Account_Services_screen)
	{
	}
	public void fillCQRecordFill_Transfer_Funds_form_Transfer_Funds_screen(CQRecordFill_Transfer_Funds_form_Transfer_Funds_screen argCQRecordFill_Transfer_Funds_form_Transfer_Funds_screen)
	{
	}
	public void clickCQRecordTRANSFER_button_Transfer_Funds_screen(CQRecordTRANSFER_button_Transfer_Funds_screen argCQRecordTRANSFER_button_Transfer_Funds_screen)
	{
	}
	public void clickCQRecordFind_Transactions_hyperlink_Account_Services_screen(CQRecordFind_Transactions_hyperlink_Account_Services_screen argCQRecordFind_Transactions_hyperlink_Account_Services_screen)
	{
	}
	public void fillCQRecordFill_Transaction_form_Find_Transactions_screen(CQRecordFill_Transaction_form_Find_Transactions_screen argCQRecordFill_Transaction_form_Find_Transactions_screen)
	{
	}
	public void fillCQRecordFill_Date_Range_form_Find_Transactions_screen(CQRecordFill_Date_Range_form_Find_Transactions_screen argCQRecordFill_Date_Range_form_Find_Transactions_screen)
	{
	}
	public void clickCQRecordFind_Transactions_button_Find_Transactions_screen_Date_Range_form(CQRecordFind_Transactions_button_Find_Transactions_screen_Date_Range_form argCQRecordFind_Transactions_button_Find_Transactions_screen_Date_Range_form)
	{
	}
	public void fillCQRecordFill_Transaction_ID_form_Find_Transactions_screen(CQRecordFill_Transaction_ID_form_Find_Transactions_screen argCQRecordFill_Transaction_ID_form_Find_Transactions_screen)
	{
	}
	public void clickCQRecordFind_Transactions_button_Find_Transactions_screen_Transaction_ID_form(CQRecordFind_Transactions_button_Find_Transactions_screen_Transaction_ID_form argCQRecordFind_Transactions_button_Find_Transactions_screen_Transaction_ID_form)
	{
	}
	public void fillCQRecordFill_Transaction_By_Date_form_Find_Transactions_screen(CQRecordFill_Transaction_By_Date_form_Find_Transactions_screen argCQRecordFill_Transaction_By_Date_form_Find_Transactions_screen)
	{
	}
	public void clickCQRecordFind_Transactions_button_Find_Transactions_screen_Transaction_By_Date_form(CQRecordFind_Transactions_button_Find_Transactions_screen_Transaction_By_Date_form argCQRecordFind_Transactions_button_Find_Transactions_screen_Transaction_By_Date_form)
	{
	}
	public void fillCQRecordFill_Find_By_Amount_form_Find_Transactions_screen(CQRecordFill_Find_By_Amount_form_Find_Transactions_screen argCQRecordFill_Find_By_Amount_form_Find_Transactions_screen)
	{
	}
	public void clickCQRecordFind_Transactions_button_Find_Transactions_screen_Find_By_Amount_form(CQRecordFind_Transactions_button_Find_Transactions_screen_Find_By_Amount_form argCQRecordFind_Transactions_button_Find_Transactions_screen_Find_By_Amount_form)
	{
	}
	public void clickCQRecordUpdate_Contact_Info_hyperlink_Account_Services_screen(CQRecordUpdate_Contact_Info_hyperlink_Account_Services_screen argCQRecordUpdate_Contact_Info_hyperlink_Account_Services_screen)
	{
	}
	public void fillCQRecordFill_Profile_form_Update_Profile_screen(CQRecordFill_Profile_form_Update_Profile_screen argCQRecordFill_Profile_form_Update_Profile_screen)
	{
	}
	public void clickCQRecordUPDATE_PROFILE_button_Update_Profile_screen(CQRecordUPDATE_PROFILE_button_Update_Profile_screen argCQRecordUPDATE_PROFILE_button_Update_Profile_screen)
	{
	}
	public void verifyCQRecordProfile_Updated_Action(CQRecordProfile_Updated_Action argCQRecordProfile_Updated_Action)
	{
	}
	public void clickCQRecordLog_Out_hyperlink_Account_Services_screen(CQRecordLog_Out_hyperlink_Account_Services_screen argCQRecordLog_Out_hyperlink_Account_Services_screen)
	{
	}
	public void clickCQRecordRequest_Loan_hyperlink_Account_Services_screen(CQRecordRequest_Loan_hyperlink_Account_Services_screen argCQRecordRequest_Loan_hyperlink_Account_Services_screen)
	{
	}
	public void fillCQRecordFill_Loan_form_Apply_for_a_Loan_screen(CQRecordFill_Loan_form_Apply_for_a_Loan_screen argCQRecordFill_Loan_form_Apply_for_a_Loan_screen)
	{
	}
	public void clickCQRecordApply_Now_button_Apply_for_a_Loan_screen(CQRecordApply_Now_button_Apply_for_a_Loan_screen argCQRecordApply_Now_button_Apply_for_a_Loan_screen)
	{
	}
	public void verifyCQRecordLoan_Request_Processed_Action(CQRecordLoan_Request_Processed_Action argCQRecordLoan_Request_Processed_Action)
	{
	}
	public void clickCQRecordAccount_Overview_hyperlink_Apply_for_a_Loan_screen(CQRecordAccount_Overview_hyperlink_Apply_for_a_Loan_screen argCQRecordAccount_Overview_hyperlink_Apply_for_a_Loan_screen)
	{
	}
	public void verifyCQRecordAccount_Overviews_for_Loan_Action(CQRecordAccount_Overviews_for_Loan_Action argCQRecordAccount_Overviews_for_Loan_Action)
	{
	}
	public void verifyCQRecordTransaction_Details_Action(CQRecordTransaction_Details_Action argCQRecordTransaction_Details_Action)
	{
	}
	public void clickCQRecordOpen_New_Account_hyperlink_Account_Services_screen(CQRecordOpen_New_Account_hyperlink_Account_Services_screen argCQRecordOpen_New_Account_hyperlink_Account_Services_screen)
	{
	}
	public void fillCQRecordFill_New_Account_form_Open_New_Account_screen(CQRecordFill_New_Account_form_Open_New_Account_screen argCQRecordFill_New_Account_form_Open_New_Account_screen)
	{
	}
	public void clickCQRecordOpen_New_Account_button_Open_New_Account_screen(CQRecordOpen_New_Account_button_Open_New_Account_screen argCQRecordOpen_New_Account_button_Open_New_Account_screen)
	{
	}
	public void verifyCQRecordNew_Account_Action(CQRecordNew_Account_Action argCQRecordNew_Account_Action)
	{
	}
	public void clickCQRecordAccount_Overview_hyperlink_Open_New_Account_screen(CQRecordAccount_Overview_hyperlink_Open_New_Account_screen argCQRecordAccount_Overview_hyperlink_Open_New_Account_screen)
	{
	}
	public void verifyCQRecordAccount_Overviews_Action(CQRecordAccount_Overviews_Action argCQRecordAccount_Overviews_Action)
	{
	}
}