package Action;

import org.openqa.selenium.WebDriver;

import pageobjects.ApprovalReportPage;

public class ApprovalReportAction {
	WebDriver driver;
	ApprovalReportPage approvalReportPage;

	public ApprovalReportAction(WebDriver driver) {
		this.driver = driver;
		approvalReportPage = new ApprovalReportPage(driver);
	}

	public void GoToapprovalReportPage() {
		approvalReportPage.clickFullMenuDropDown();
		approvalReportPage.clickOnApprovalLink();
		approvalReportPage.clickOnApprovalReport();
	}

	public void searchNonRuleUserWithExpenseApprovalType() {
		approvalReportPage.clickOnSearchButton();
		approvalReportPage.verifyApprovalReport();

	}

	public void searchNonRuleUserWithLeaveApprovalType() {
		approvalReportPage.selectLeaveApprovalType();
		approvalReportPage.clickOnSearchButton();
		approvalReportPage.verifyApprovalReport();

	}

	public void searchNonRuleUserWithTimeSheetApprovalType() {
		approvalReportPage.selectTimeSheetApprovalType();
		approvalReportPage.clickOnSearchButton();
		approvalReportPage.verifyApprovalReport();

	}

	public void searchNonRuleUserWithAttendanceApprovalType() {
		approvalReportPage.selectAttendanceApprovalType();
		approvalReportPage.clickOnSearchButton();
		approvalReportPage.verifyApprovalReport();

	}

	public void searchNonRuleUserWithExpenseApprovalTypeAndUserName() {

		approvalReportPage.enterUserName();
		approvalReportPage.clickOnSearchButton();
		approvalReportPage.verifyApprovalReportWithUserName();

	}

	public void searchNonRuleUserWithLeaveApprovalTypeAndUserName() {

		approvalReportPage.selectLeaveApprovalType();
		approvalReportPage.enterUserName();
		approvalReportPage.clickOnSearchButton();
		approvalReportPage.verifyApprovalReportWithUserName();

	}

	public void searchNonRuleUserWithTimeSheetApprovalTypeAndUserName() {

		approvalReportPage.selectTimeSheetApprovalType();
		approvalReportPage.enterUserName();
		approvalReportPage.clickOnSearchButton();
		approvalReportPage.verifyApprovalReportWithUserName();

	}

	public void searchNonRuleUserWithAttendanceApprovalTypeAndUserName() {

		approvalReportPage.selectAttendanceApprovalType();
		approvalReportPage.enterUserName();
		approvalReportPage.clickOnSearchButton();
		approvalReportPage.verifyApprovalReportWithUserName();

	}

	public void searchUserWiseApprovalRuleInformationWithRuleName() {
		approvalReportPage.refresh();
		approvalReportPage.clickOnUserWiseApprovalRuleInformation();
		approvalReportPage.enterRuleName();
		approvalReportPage.clickOnSearchButtonOfUserWiseApprovalRuleInformation();
		approvalReportPage.verifyApprovalReportWithUserWiseApprovalRuleInformation();
		

	}

	public void searchUserWiseApprovalRuleInformationWithModuleName() {

		approvalReportPage.clickOnUserWiseApprovalRuleInformation();
		approvalReportPage.enterRuleName();
		approvalReportPage.clickOnExpenseModule();
		approvalReportPage.clickOnSearchButtonOfUserWiseApprovalRuleInformation();
		approvalReportPage.verifyApprovalReportWithUserWiseApprovalRuleInformation();

	}

	public void searchUserWiseApprovalRuleInformationWithLeaveModuleName() {

		approvalReportPage.clickOnUserWiseApprovalRuleInformation();
		approvalReportPage.enterRuleName();
		approvalReportPage.clickOnLeaveModule();
		approvalReportPage.clickOnSearchButtonOfUserWiseApprovalRuleInformation();
		approvalReportPage.verifyApprovalReportWithUserWiseApprovalRuleInformation();

	}
	public void searchUserWiseApprovalRuleInformationWithTimesheetModuleName() {

		approvalReportPage.clickOnUserWiseApprovalRuleInformation();
		approvalReportPage.enterRuleName();
		approvalReportPage.clickOnTimesheetModule();
		approvalReportPage.clickOnSearchButtonOfUserWiseApprovalRuleInformation();
		approvalReportPage.verifyApprovalReportWithUserWiseApprovalRuleInformation();

	}
	public void searchUserWiseApprovalRuleInformationWithAttendanceModuleName() {

		approvalReportPage.clickOnUserWiseApprovalRuleInformation();
		approvalReportPage.enterRuleName();
		approvalReportPage.clickOnAttendanceModule();
		approvalReportPage.clickOnSearchButtonOfUserWiseApprovalRuleInformation();
		approvalReportPage.verifyApprovalReportWithUserWiseApprovalRuleInformation();

	}
	
	public void searchUserWiseApprovalRuleInformationWithApprovalChainName() {

		approvalReportPage.clickOnUserWiseApprovalRuleInformation();
		approvalReportPage.enterRuleName();
		approvalReportPage.clickOnExpenseModule();
		approvalReportPage.selectApprovalChainName();
		approvalReportPage.clickOnSearchButtonOfUserWiseApprovalRuleInformation();
		approvalReportPage.verifyApprovalReportWithUserWiseApprovalRuleInformation();

	}
	public void searchUserWiseApprovalRuleInformationWithUserName() {

		approvalReportPage.clickOnUserWiseApprovalRuleInformation();
		approvalReportPage.enterRuleName();
		approvalReportPage.clickOnExpenseModule();
		approvalReportPage.selectApprovalChainName();
		approvalReportPage.selectUserName();
		approvalReportPage.clickOnSearchButtonOfUserWiseApprovalRuleInformation();
		approvalReportPage.verifyApprovalReportWithUserWiseApprovalRuleInformation();

	}

}
