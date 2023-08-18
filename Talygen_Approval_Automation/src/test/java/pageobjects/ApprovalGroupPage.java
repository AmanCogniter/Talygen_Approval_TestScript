package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import utils.PropertiesLoader;
import utils.WebBasePage;

public class ApprovalGroupPage extends WebBasePage {
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
	static String approvalGroupNmae;
	static String userName = companySetupUserPage.userNAame;

	public ApprovalGroupPage(WebDriver driver) {
		super(driver, "ApprovalGroupPage");
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

	public void clickOnApprovalGroup() {
		staticWait(2000);

		try {
			click(By.xpath("//div/ul/li/a[@data-original-title='Approval Group']"), "Approval Group", 30);
			staticWait(1000);
			WebElement approvalGroupPage = driver
					.findElement(By.xpath("//div/span[contains(text(),'Approval Group')]"));
			if (approvalGroupPage.isDisplayed()) {
				logger.info("Approval Group page opened successfully");
			}

		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Group page not opened successfully");
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

	public void clickOnNextButton() {
		staticWait(2000);
		click(By.xpath("//div/span/p[contains(text(),'Next')]"), "Naxt", 30);

	}

	public void clickOnEndTour() {
		staticWait(2000);
		click(By.xpath("//div/span/p[contains(text(),'End Tour')]"), "End Tour", 30);

	}

	public void clickOnAddApprovalGroup() {
		staticWait(2000);

		try {
			click(By.xpath("//div/span/a[@data-original-title='Add Approval Group']"), "Add Approval Group", 30);
			staticWait(1000);
			WebElement addApprovalPage = driver.findElement(By.xpath("//div/span[text()='Add Approval Group']"));
			if (addApprovalPage.isDisplayed()) {
				logger.info("Add Approval page opened successfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Approval page not opened successfully");
		}

	}

	public void clickOnEnterApprovalGroupName() {
		staticWait(2000);
		approvalGroupNmae = prop.getProperty("enterGroupName") + datevalue;
		enter(By.xpath("//div/tg-input/input[@id='ApprovalGroupName']"), approvalGroupNmae, "Approval Group Name", 30);

	}
	public void clickOnEnterApprovalGroupNameForReport() {
		staticWait(2000);
		approvalGroupNmae = prop.getProperty("enterGroupNameForReport") + datevalue;
		enter(By.xpath("//div/tg-input/input[@id='ApprovalGroupName']"), approvalGroupNmae, "Approval Group Name", 30);

	}

	public void selectUser() {
		staticWait(2000);

		click(By.xpath("//div/button/span[text()='Select']"), "select dropdown", 30);
		staticWait(1000);
		enter(By.xpath("//div/input[@placeholder='Enter Keywords']"),
				prop.getProperty("userFirstName") + " " + companySetupUserPage.userNAame, "Approval User Name", 30);
		staticWait(1000);
		click(By.xpath("//li/a /label[contains(text(),'" + companySetupUserPage.userNAame + "')]"), "User name", 30);
	}

	public void clickOnEnterApprovalGroupDescription() {
		staticWait(2000);
		String approvalGroupDescription = prop.getProperty("Description");
		enter(By.xpath("//div/textarea[@id='Description']"), approvalGroupDescription, "Approval Group Name", 30);

	}

	public void clickOnsaveButton() {
		staticWait(1000);
		clickByJavascript(By.xpath("//div/a[@data-original-title='Save']"), "Save Button", 30);

	}

	public void notifymessagePopup() {
		staticWait(2000);
		try {
			WebElement notifyMessagePopUp = driver
					.findElement(By.xpath("//div/span[contains(text(),'Approval Group successfully added')]"));
			if (notifyMessagePopUp.isDisplayed()) {
				logger.info(notifyMessagePopUp.getText());
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Group not added");
			e.printStackTrace();
		}

	}

	public void clickOnCancelButton() {
		staticWait(2000);
		clickByJavascript(By.xpath("//div/a[@data-original-title='Cancel']"), "Cancel Button", 30);

	}

	public void VerifyMandatoryFieldValidation() {
		int i = 0;
		String actualText;
		String expectedText;

		List<WebElement> errorMessageLocator = findMultipleElement(
				By.xpath("//div[@class='form-group']//span[contains(@class,'invalid-feedback')]"), 15);
		String[] expectedValue = { "Approval Group Name", "Users" };
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

	public void clickOnExpandButton() {
		staticWait(2000);
		WebElement expandButton = driver.findElement(By.xpath("//span[@class='ancExpandAllCollapseAll']"));
		Actions action = new Actions(driver);
		action.moveToElement(expandButton).perform();
		click(By.xpath("//span[@class='ancExpandAllCollapseAll']"), "Expand Button", 30);
	}

	public void enterApprovalGroupName() {
		staticWait(2000);
		enter(By.xpath("//div/input[@id='search']"), approvalGroupNmae, "Approval Group Name", 30);

	}
	public void clickOnSearchButton() {
		staticWait(2000);
		clickByJavascript(By.xpath("//span/a[@id='Go']"), "Search Button", 30);
	}
	public void searchApprovalGroupName() {
		staticWait(2000);
		
		try {
			WebElement approvalGroupName = driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+approvalGroupNmae+"')]"));
			if (approvalGroupName.isDisplayed()) {
				logger.info(approvalGroupName.getText()+" is displayed On approval group listing page");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Group name is displayed On approval group listing page");
		}
	}
	public void enterUserName() {
		staticWait(2000);
		enter(By.xpath("//div/input[@placeholder='Search']"), prop.getProperty("userFirstName") + " " + companySetupUserPage.userNAame, "User Name", 30);

	}
	public void selectUsercheckBox() {
		staticWait(2000);
		click(By.xpath("//div/label[contains(text(),'"+companySetupUserPage.userNAame+"')]"), prop.getProperty("userFirstName") + " " + companySetupUserPage.userNAame, 30);

	}
	public void clickOncheckBox() {
		staticWait(2000);
		click(By.xpath("//table/tbody/tr/td/div[@class='custom-control custom-checkbox']"), "CheckBox", 30);

	}
	public void clickOnApprovalGroupcheckBox() {
		staticWait(2000);
		click(By.xpath("//table/thead/tr/th/div[@class='custom-control custom-checkbox']"), "CheckBox", 30);

	}
	public void clickOnDeleteButton() {
		staticWait(2000);
		clickByJavascript(By.xpath("//div/span/a[@id='DeleteMultiple']"), "Delete Button", 30);

	}
	public void clickOnCancel() {
		staticWait(2000);
		click(By.xpath("//div/button[contains(text(),'Cancel')]"), "Cancel button", 30);

	}
	public void clickOKButton() {
		staticWait(2000);
		click(By.xpath("//div/button[contains(text(),'OK')]"), "Ok button", 30);

	}
	public void deleteNotifymessagePopup() {
		staticWait(2000);
		try {
			WebElement notifyMessagePopUp = driver
					.findElement(By.xpath("//div/span[contains(text(),'Approval Group has been successfully deleted')]"));
			if (notifyMessagePopUp.isDisplayed()) {
				logger.info(notifyMessagePopUp.getText());
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Group hasn't been successfully deleted");
			e.printStackTrace();
		}

	}
	public void clickOnStatusButton() {
		staticWait(2000);
		click(By.xpath("//table/tbody/tr/td/div/select"), "Status Dropdown", 30);
		staticWait(1000);
		selectValueWithText(By.xpath("//table/tbody/tr/td/div/select"), "Inactive", "Inactive status", 30);

	}
	public void clickOnActiveCheckBox() {
		staticWait(2000);
		click(By.xpath("//div/label[text()='Active']"), "Active CheckBox", 30);

	}
	public void clickOnInActiveCheckBox() {
		staticWait(2000);
		click(By.xpath("//div/label[text()='Inactive']"), "InActive CheckBox", 30);

	}
	public void validateActiveApprovalGroup() {
		staticWait(3000);
		//WebElement select = driver.findElement(By.xpath("//table/tbody/tr/td/div/select/option[text()='Active']"));
		List<WebElement> allOptions = driver.findElements(By.xpath("//table/tbody/tr/td/div/select/option[text()='Active']"));
		for (WebElement option : allOptions) {
			System.out.println( option.getText());
		    //option.click();
		    staticWait(1000);
		    String vaLue = "Active";
		    if (option.getText().contains(vaLue)) {
		    	  staticWait(1000);
		        logger.info("Active Approval group name displayed");
		    } else {
		    	logger.info("Active Approval group name not displayed");
		    }
		}

	}
	public void validateInActiveApprovalGroup() {
		staticWait(3000);
		//WebElement select = driver.findElement(By.xpath("//table/tbody/tr/td/div/select/option[text()='Active']"));
		List<WebElement> allOptions = driver.findElements(By.xpath("//table/tbody/tr/td/div/select/option[text()='Inactive']"));
		for (WebElement option : allOptions) {
			System.out.println( option.getText());
		    //option.click();
		    staticWait(1000);
		    String vaLue = "Inactive";
		    if (option.getText().contains(vaLue)) {
		    	  staticWait(1000);
		        logger.info("InActive Approval group name displayed");
		    } else {
		    	logger.info("InActive Approval group name not displayed");
		    }
		}

	}
	public void clickOnApprovalGroupName() {
		staticWait(2000);
		click(By.xpath("//table/tbody/tr/td/a[contains(text(),'"+approvalGroupNmae+"')]"), "Approval group name", 30);
		try {
			WebElement updateApprovalPage = driver.findElement(By.xpath("//div/span[text()='Update Approval Group']"));
			if (updateApprovalPage.isDisplayed()) {
				logger.info("Update Approval group page opened successfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Update Approval group page not opened successfully");
		}

	}
	public void clickOnSaveButton() {
		staticWait(2000);
		clickByJavascript(By.xpath("//div/a[text()='Save']"), "Save Button", 30);

	}
	public void updateNotifyMessage() {
		staticWait(2000);
		
		try {
			WebElement updateNotifyMessage = driver.findElement(By.xpath("//div/span[contains(text(),'Approval Group has been successfully deleted')]"));
			if (updateNotifyMessage.isDisplayed()) {
				logger.info(updateNotifyMessage.getText());
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval group hasn't been successfully updated");
		}

	}


}
