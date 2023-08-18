package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import utils.PropertiesLoader;
import utils.WebBasePage;

public class ApprovalRulePage extends WebBasePage {
	WebDriver driver;

	String TitleName;
	String pattern = "yyMMddHHmmss";
	Date date = new Date();
	SimpleDateFormat dateformat = new SimpleDateFormat(pattern);

	String datevalue = dateformat.format(date);
	static String TitleRandomValue;
	static String CreatedTitleRandomValue;
	String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\testfiles\\";
	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";
	private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	static CompanySetupUserPage companySetupUserPage;
	static ApprovalGroupPage approvalGroupPage;
	static ApprovalChainPage approvalChainPage;
	static String approvalChainNmae;
	static String approvalRulename;
	static String userName = companySetupUserPage.userNAame;
	static ProjectListingPage projectListingPage;

	public ApprovalRulePage(WebDriver driver) {
		super(driver, "ApprovalRulePage");
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public void clickFullMenuDropDown() {
		staticWait(2000);
		click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);

	}

	public void clickOnApprovalLink() {
		staticWait(2000);
		clickByJavascript(By.xpath("//li[@data-name='Approval']/span"), "Approval", 30);

	}

	public void clickOnApprovalRule() {
		staticWait(2000);

		try {
			click(By.xpath("//div/ul/li/a[@data-original-title='Approval Rule']"), "Approval Rule", 30);
			staticWait(1000);
			WebElement approvalRulePage = driver.findElement(By.xpath("//div/span[contains(text(),'Approval Rule')]"));
			if (approvalRulePage.isDisplayed()) {
				logger.info("Approval Rule page opened successfully");
			}

		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Rule page not opened successfully");
		}
	}

	public void clickOnPageTour() {
		staticWait(2000);
		try {
			clickByJavascript(By.xpath("//div/span/a[@data-original-title='Page Tour']"), "Page Tour", 30);
			staticWait(1000);
			WebElement searchfilters = driver.findElement(By.xpath("//div[contains(text(),'Search Filters')]"));
			if (searchfilters.isDisplayed()) {
				logger.info("Page Tour guide opened successfully");
			}

		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Page Tour guide not opened successfully");
		}
	}

	public void clickOnPageTourOfAddApprovalRule() {
		staticWait(2000);
		try {
			clickByJavascript(By.xpath("//div/span/a[@data-original-title='Page Tour']"), "Page Tour", 30);
			staticWait(1000);
			WebElement searchfilters = driver
					.findElement(By.xpath("//div[contains(text(),'Choose the module to create the rule')]"));
			if (searchfilters.isDisplayed()) {
				logger.info("Page Tour guide opened successfully");
			}

		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Page Tour guide not opened successfully");
		}
	}

	public void clickOnNextButton() {
		staticWait(2000);
		click(By.xpath("//div/span/p[contains(text(),'Next')]"), "Naxt", 30);

	}

	public void clickOnEndTour() {
		staticWait(2000);
		click(By.xpath("//div/span/p[contains(text(),'End Tour')]"), "End Tour", 30);

	}

	public void clickOnAddApprovalRule() {
		staticWait(2000);

		try {
			click(By.xpath("//div/span/a[@data-original-title='Add New Rule']"), "Add Approval Rule", 30);
			staticWait(1000);
			WebElement approvalRulePage = driver
					.findElement(By.xpath("//div/span[contains(text(),'Add Approval Rule')]"));
			if (approvalRulePage.isDisplayed()) {
				logger.info("Add Approval Rule page opened successfully");
			}

		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Approval Rule page not opened successfully");
		}
	}

	public void clickOnsave() {
		staticWait(2000);
		clickByJavascript(By.xpath("//div/a[text()='Save']"), "Save Button", 30);

	}

	public void clickOnCancel() {
		staticWait(2000);
		clickByJavascript(By.xpath("//div/a[text()='Cancel']"), "Cancel Button", 30);

	}

	public void VerifyMandatoryFieldValidation() {
		int i = 0;
		String actualText;
		String expectedText;

		List<WebElement> errorMessageLocator = findMultipleElement(
				By.xpath("//div[@class='form-group']//span[contains(@class,'invalid-feedback')]"), 15);
		String[] expectedValue = { "Rule Name", "Select Module", "Please Select Project ", "Users", "Approval Type",
				"Select Approval Chain", "Status" };
		for (Object expected : expectedValue) {
			WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'" + expected
					+ "')]/ancestor::div[@class='form-group']/descendant::span[text()='*']"), 20);
			if (AsteriskField != null) {
				getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
				logger.info("The Asterisk symbol is displayed for " + expected + " field");
			} else {
				getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
				logger.info("The Asterisk symbol is not displayed for " + expected + " field");
				takeScreenshot(expected.toString());
			}

			List<WebElement> expectedElements = errorMessageLocator;
			for (WebElement element : expectedElements) {
				i++;
				actualText = element.getText();
				expectedText = expected.toString();

				if (actualText.indexOf(expectedText) != -1) {
					getTest().log(LogStatus.PASS,
							"Error message for \"" + expected + "\" field is displayed as expected");
					logger.info("Error message for \"" + expected + "\" field is displayed as expected");
					i = 0;
					break;
				} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
					getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
					logger.info("Error message for \"" + expected + "\" field is displayed as expected");
					takeScreenshot(expectedText);
				}
			}
		}
	}

	public void enterRuleName() {
		staticWait(2000);
		approvalRulename = prop.getProperty("enterRuleName") + datevalue;
		enter(By.xpath("//tg-input/input[@id='RuleName']"), approvalRulename, "Rule Name", 30);

	}

	public void selectProject() {
		staticWait(2000);
		click(By.xpath("//div/tg-select/select[@id='ProjectId']"), "Select project dropdown", 30);
		staticWait(1000);
		selectValueWithText(By.xpath("//div/tg-select/select[@id='ProjectId']"), projectListingPage.projectName,
				"Rule Name", 30);

	}

	public void selectUser() {
		staticWait(2000);
		click(By.xpath("//div/button/span[contains(text(),'Select Users')]"), "Select Users dropdown", 30);
		staticWait(1000);
		click(By.xpath("//div/ul/li/a/label[contains(text(),'ginny')]"), "User name", 30);

	}

	public void selectApprovalChain() {
		staticWait(2000);
		selectValueWithText(By.xpath("//div/tg-select/select[@id='ApprovalChainId']"),
				ApprovalChainPage.approvalChainNmae, "Approval Chain Name", 30);

	}

	public void enterDescription() {
		staticWait(2000);

		enter(By.xpath("//div/textarea[@id='RuleDescription']"), prop.getProperty("Description"), "Description", 30);

	}

	public void notifymessagePopup() {
		staticWait(2000);
		try {
			WebElement notifyMessagePopUp = driver
					.findElement(By.xpath("//div/span[contains(text(),'Approval Rule successfully added')]"));
			if (notifyMessagePopUp.isDisplayed()) {
				logger.info(notifyMessagePopUp.getText());
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Rule not added");
			e.printStackTrace();
		}
	}

	public void selectLeaveModule() {
		staticWait(2000);
		WebElement leaveModule = driver.findElement(By.xpath("//div/input[@id='rdo_1']"));
		Actions action = new Actions(driver);

		action.moveToElement(leaveModule).click().perform();

	}

	public void selectTimeSheetModule() {
		staticWait(2000);
		WebElement timesheetModule = driver.findElement(By.xpath("//div/input[@id='rdo_2']"));
		// click(By.xpath("//div/input[@id='rdo_2']"), "TimeSheet Module", 30);
		Actions action = new Actions(driver);

		action.moveToElement(timesheetModule).click().perform();

	}

	public void selectAttedenceModule() {
		staticWait(2000);
		WebElement attendanceModule = driver.findElement(By.xpath("//div/input[@id='rdo_3']"));
		// click(By.xpath("//div/input[@id='rdo_3']"), "Attendance Module", 30);
		Actions action = new Actions(driver);

		action.moveToElement(attendanceModule).click().perform();

	}

	public void clickOnExpandButton() {
		staticWait(3000);
		WebElement expandButton = driver.findElement(By.xpath("//span[contains(@class,'ancExpandAllCollapseAll')]"));
		Actions action = new Actions(driver);
		action.moveToElement(expandButton).perform();
		staticWait(1000);
		click(By.xpath("//span[contains(@class,'ancExpandAllCollapseAll')]"), "Expand Button", 30);
	}

	public void enterRuleNameInSearchField() {
		staticWait(2000);

		enter(By.xpath("//div/input[@id='txtRuleName']"), approvalRulename, "Rule Name", 30);

	}

	public void clickOnSearchButton() {
		staticWait(2000);
		clickByJavascript(By.xpath("//span/a[@id='Go']"), "Search Button", 30);

	}
	public void clickOnRuleName() {
		staticWait(2000);
		click(By.xpath("//table/tbody/tr/td/a[contains(text(),'" + approvalRulename +"')]"), "Approval Rule Name", 30);

	}

	public void validateRuleNameInApprovalRulePage() {
		staticWait(2000);
		try {
			WebElement ruleName = driver
					.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'" + approvalRulename + "')]"));
			if (ruleName.isDisplayed()) {
				logger.info(ruleName.getText()+"Is displayed in approval rule page");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Rule Name not present in Approval rule listing page ");
			e.printStackTrace();
		}
	}

	public void selectExpenseModule() {
		staticWait(2000);

		click(By.xpath("//div/label[text()='Expense']"), "Expense", 30);

	}
	public void selectLeaveModulecheckBox() {
		staticWait(2000);

		click(By.xpath("//div/label[text()='Leave']"), "Leave", 30);

	}
	public void selectTimeSheetModulecheckBox() {
		staticWait(2000);

		click(By.xpath("//div/label[text()='Timesheet']"), "TimeSheet", 30);

	}
	public void selectAttendanceModulecheckBox() {
		staticWait(2000);

		click(By.xpath("//div/label[text()='Attendance']"), "Attendance", 30);

	}


	public void enterApprovalChainInSearchField() {
		staticWait(2000);

		enter(By.xpath("(//div/input[@placeholder='Search'])[2]"), approvalChainPage.approvalChainNmae, "Approval chain Name", 30);
		staticWait(1000);
		click(By.xpath("//div/label[contains(text(),'"+approvalChainPage.approvalChainNmae+"')]"), "Approval chain Name", 30);

	}
	public void enterApproverNameInSearchField() {
		staticWait(2000);

		enter(By.xpath("(//div/input[@placeholder='Search'])[4]"), prop.getProperty("userFirstName") + " " + companySetupUserPage.userNAame, "Approver Name", 30);
		staticWait(1000);
		click(By.xpath("(//div/label[contains(text(),'"+companySetupUserPage.userNAame+"')])[last()]"), "Approver Name", 30);

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	

	}
	public void enterUserNameInSearchField() {
		staticWait(2000);

		enter(By.xpath("(//div/input[@placeholder='Search'])[3]"), prop.getProperty("usernaMe"), "User Name", 30);
		staticWait(1000);
		click(By.xpath("//div/label[contains(text(),'"+prop.getProperty("usernaMe")+"')]"), "User Name", 30);

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	

	}
	public void selectStatusAsActive() {
		staticWait(2000);

		click(By.xpath("//div/label[text()='Active']"), "Active", 30);
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}
	public void clickOncheckBox() {
		staticWait(2000);
		click(By.xpath("//table/tbody/tr/td/div[@class='custom-control custom-checkbox']"), "CheckBox", 30);

	}
	public void clickOnDeleteButton() {
		staticWait(2000);
		clickByJavascript(By.xpath("//div/span/a[@id='DeleteMultiple']"), "Delete Button", 30);

	}

	public void clickOnCancelDelete() {
		staticWait(2000);
		click(By.xpath("(//div/button[contains(text(),'Cancel')])[last()]"), "Cancel button", 30);

	}

	public void clickOKButton() {
		staticWait(2000);
		click(By.xpath("//div/button[contains(text(),'OK')]"), "Ok button", 30);

	}
	public void updateRuleNameNotifymessagePopup() {
		staticWait(2000);
		try {
			WebElement notifyMessagePopUp = driver.findElement(
					By.xpath("//div/span[contains(text(),'Approval Rule has been successfully updated')]"));
			if (notifyMessagePopUp.isDisplayed()) {
				logger.info(notifyMessagePopUp.getText());
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Rule hasn't been successfully updated')]");
			e.printStackTrace();
		}

	}

	public void deleteNotifymessagePopup() {
		staticWait(2000);
		try {
			WebElement notifyMessagePopUp = driver.findElement(
					By.xpath("//div/span[contains(text(),'Approval Rule has been successfully deleted')]"));
			if (notifyMessagePopUp.isDisplayed()) {
				logger.info(notifyMessagePopUp.getText());
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Rule hasn't been successfully deleted')]");
			e.printStackTrace();
		}

	}
	public void clickOnStatusButton() {
		staticWait(2000);
		click(By.xpath("//table/tbody/tr/td/div/select"), "Status Dropdown", 30);
		staticWait(1000);
		selectValueWithText(By.xpath("//table/tbody/tr/td/div/select"), "Inactive", "Inactive status", 30);

	}

	public void clickOnInActiveCheckBox() {
		staticWait(2000);
		click(By.xpath("//div/label[text()='Inactive']"), "InActive CheckBox", 30);

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}

	public void clickOnActiveCheckBox() {
		staticWait(2000);
		click(By.xpath("//div/label[text()='Active']"), "Active CheckBox", 30);

	}
	public void clickOnLimitedDuration() {
		staticWait(2000);
		click(By.xpath("(//label/input[@id='IsLimitDurationN']/ancestor::div[@class='form-group']/descendant::span)[last()]"), "Limited Duration", 30);

	}
	public void clickOnSelectDate() {
		staticWait(2000);
		click(By.xpath("//tg-input/div[@data-original-title='Select Date']"), "Date", 30);

	}
	public void clickOnUseSequence() {
		staticWait(2000);
		click(By.xpath("(//label/input[@id='UseSequenceN']/ancestor::div[@class='form-group']/descendant::span)[last()]"), "Use Sequence", 30);

	}
}
