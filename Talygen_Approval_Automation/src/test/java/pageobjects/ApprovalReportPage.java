package pageobjects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.PropertiesLoader;
import utils.WebBasePage;

public class ApprovalReportPage extends WebBasePage {
	WebDriver driver;
	String pattern = "yyMMddHHmmss";
	Date date = new Date();
	SimpleDateFormat dateformat = new SimpleDateFormat(pattern);

	String datevalue = dateformat.format(date);
	String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\testfiles\\";
	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";
	private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	static CompanySetupUserPage companySetupUserPage;
	static ApprovalRulePage approvalRulePage;
	static ApprovalChainPage approvalChainPage;

	public ApprovalReportPage(WebDriver driver) {
		super(driver, "ApprovalReportPage");
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

	public void clickOnApprovalReport() {
		staticWait(2000);

		try {
			click(By.xpath("//div/ul/li/a[@data-original-title='Approval Report']"), "Approval Report", 30);
			staticWait(1000);
			WebElement approvalReportPage = driver
					.findElement(By.xpath("//div/span[contains(text(),'Approval Reports')]"));
			if (approvalReportPage.isDisplayed()) {
				logger.info("Approval Report page opened successfully");
			}

		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Report page not opened successfully");
		}
	}

	public void clickOnSearchButton() {
		staticWait(2000);
		clickByJavascript(By.xpath("//div/a[@id='Search']"), "Search Button", 30);

	}

	public void selectLeaveApprovalType() {
		staticWait(2000);
		selectValueWithText(By.xpath("//div/select[@id='moduleId']"), "Leave", "Leave Approval Type", 30);

	}

	public void selectTimeSheetApprovalType() {
		staticWait(2000);
		selectValueWithText(By.xpath("//div/select[@id='moduleId']"), "Timesheet", "Timesheet Approval Type", 30);

	}

	public void selectAttendanceApprovalType() {
		staticWait(2000);
		selectValueWithText(By.xpath("//div/select[@id='moduleId']"), "Attendance", "Attendance Approval Type", 30);

	}

	public void verifyApprovalReport() {
		staticWait(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		switchToFrame();
		logger.info("Switch to reports frame");

		try {
			staticWait(5000);
			WebElement username = driver.findElement(By.xpath("//table/tbody/tr[3]/td"));
			if (username.isDisplayed()) {
				logger.info("Non-Rule Users report displayed successfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Non-Rule Users report not displayed successfully");
		}
		driver.navigate().refresh();
	}

	public void enterUserName() {
		staticWait(2000);
		enter(By.xpath("//div/input[@id='search']"),
				prop.getProperty("userFirstName") + " " + companySetupUserPage.userNAame, "User Name", 30);

	}

	public void verifyApprovalReportWithUserName() {
		staticWait(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		switchToFrame();
		logger.info("Switch to reports frame");

		try {
			staticWait(5000);
			WebElement username = driver.findElement(By.xpath(
					"//table/tbody/tr[3]/td/div/div/div[contains(text(),'" + companySetupUserPage.userNAame + "')]"));
			if (username.isDisplayed()) {
				logger.info(username.getText() + " is displayed successfully on Non-Rule Users report");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("User name is not displayed successfully on Non-Rule Users report");
		}
		driver.navigate().refresh();
	}

	public void verifyApprovalReportWithUserWiseApprovalRuleInformation() {
		staticWait(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		switchToFrame();
		logger.info("Switch to reports frame");

		try {
			staticWait(5000);
			WebElement username = driver.findElement(By.xpath("//table/tbody/tr[3]/td/div/div/div[contains(text(),'ginny .')]"));    
			if (username.isDisplayed()) {
				logger.info("Approval report displayed successfully");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			logger.info("Approval report not displayed successfully");
		}
		driver.navigate().refresh();
	}

	public void clickOnUserWiseApprovalRuleInformation() {
		staticWait(2000);
		click(By.xpath("//div/ul/li/a[contains(text(),'User Wise Approval Rule Information')]"),
				"User Wise Approval Rule Information", 30);

	}
	public void refresh() {
		staticWait(1000);
		driver.navigate().refresh();
	}

	public void enterRuleName() {
		staticWait(2000);
		enter(By.xpath("//div/input[@id='ruleName']"), approvalRulePage.approvalRulename, "Rule Name", 30);

	}

	public void clickOnSearchButtonOfUserWiseApprovalRuleInformation() {
		staticWait(2000);
		clickByJavascript(By.xpath("//div/a[@id='aSearch']"), "Search Button", 30);

	}

	public void clickOnExpenseModule() {
		staticWait(2000);
		click(By.xpath("//div/button[@title='Select']"), "select Module dropdown", 30);
		staticWait(1000);
		click(By.xpath("//ul/li/a/label[contains(text(),' Expense')]"), "Expense", 30);

	}

	public void clickOnLeaveModule() {
		staticWait(2000);
		click(By.xpath("//div/button[@title='Select']"), "Select Module dropdown", 30);
		staticWait(1000);
		click(By.xpath("//ul/li/a/label[contains(text(),'Leave')]"), "Leave", 30);

	}

	public void clickOnTimesheetModule() {
		staticWait(2000);
		click(By.xpath("//div/button[@title='Select']"), "Select Module dropdown", 30);
		staticWait(1000);
		click(By.xpath("//ul/li/a/label[contains(text(),'Timesheet')]"), "TimeSheet", 30);

	}

	public void clickOnAttendanceModule() {
		staticWait(2000);
		click(By.xpath("//div/button[@title='Select']"), "Select Module dropdown", 30);
		staticWait(1000);
		click(By.xpath("//ul/li/a/label[contains(text(),'Attendance')]"), "Attendance", 30);

	}

	public void selectApprovalChainName() {
		staticWait(2000);
		click(By.xpath(
				"//label[contains(text(),'Approval Chain')]/ancestor::div[@class='form-group']/descendant::button/span"),
				"Select Approval Chain Name dropdown", 30);
		staticWait(1000);
		enter(By.xpath("(//ul/li/div/input[@type='text'])[2]"), approvalChainPage.approvalChainNmae,
				"Approval Chain Name", 30);
		staticWait(1000);
		click(By.xpath("//li/a/label[contains(text(),'" + approvalChainPage.approvalChainNmae + "')]"),
				"Approval Chain Name", 30);

	}

	public void selectUserName() {
		staticWait(2000);
		click(By.xpath("//label[contains(text(),'Users')]/ancestor::div[@class='form-group']/descendant::button/span"),
				"Select User Name dropdown", 30);
		staticWait(1000);
		enter(By.xpath("(//ul/li/div/input[@type='text'])[last()]"),
				prop.getProperty("userFirstName") + " " + companySetupUserPage.userNAame, "User Name", 30);
		staticWait(1000);
		click(By.xpath("//li/a/label[contains(text(),'" + prop.getProperty("userFirstName") + " "
				+ companySetupUserPage.userNAame + "')]"), "User Name", 30);

	}
}
