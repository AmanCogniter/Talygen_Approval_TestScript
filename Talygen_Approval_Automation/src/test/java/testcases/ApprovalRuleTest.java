package testcases;

import static reporting.ComplexReportFactory.getTest;

import java.text.ParseException;

import org.testng.annotations.Test;

import Action.ApprovalChainAction;
import Action.ApprovalGroupAction;
import Action.ApprovalRuleAction;
import Action.CompanySetupUserAction;
import Action.LoginAction;
import Action.ProjectListingAction;
import utils.WebTestBase;

public class ApprovalRuleTest extends WebTestBase {
	static String Screenname = "<b>Approval</b>";

	/* First check the validation then add Approval rule */
	@Test(priority = 1, enabled = true)
	public void ValidationCheck() {
		test = getTest(Screenname + ": Validation message on Add Approval Rule");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.validationMessageCheck();

	}

	@Test(priority = 2)
	public void addApprovalRulePageWithExpenseModule() throws ParseException {
		test = getTest(Screenname + ": Add New Approval Rule Page");
		new LoginAction(driver).logoutLogin();
		ProjectListingAction projectListingAction = new ProjectListingAction(driver);
		projectListingAction.navigateToProject();
		projectListingAction.addProject();
		projectListingAction.addChannel();
		projectListingAction.selectPriority();
		projectListingAction.enterPurchaseNumber();
		projectListingAction.selectLocation();
		projectListingAction.enterProjectDescription();
		projectListingAction.clickNextButton();

		new LoginAction(driver).logoutLogin();

		CompanySetupUserAction companySetupUserAction = new CompanySetupUserAction(driver);
		// companySetupUserAction.addSkillSettings();
		companySetupUserAction.navigateToCompanySetup();

		// companySetupUserAction.selectcheckbox();
		// companySetupUserAction.deleteUser();
		companySetupUserAction.createUserForRuleWiseReport();
		/*
		 * companySetupUserAction.settingsForCreatedUser();
		 * companySetupUserAction.addFeedbackSetting();
		 * companySetupUserAction.addGoalSettings();
		 * companySetupUserAction.addNoteSettings();
		 * 
		 * companySetupUserAction.clickPerformanceReviewTab();
		 * companySetupUserAction.addReview();
		 * 
		 * companySetupUserAction.addSkillforCreatedUser();
		 */
		// companySetupUserAction.addSkillSettings();
		/*
		 * companySetupUserAction.clickPerformanceReviewTab();
		 * companySetupUserAction.addReview();
		 */
		// new LoginAction(driver).logoutLoginNewUser();
//		companySetupUserAction.clickPerformanceReviewTab();
//		companySetupUserAction.addReview();

		new LoginAction(driver).logoutLogin();
		ApprovalGroupAction approvalGroupAction = new ApprovalGroupAction(driver);
		approvalGroupAction.GoToApprovalGroupPage();
		approvalGroupAction.addNewApprovalgroup();

		new LoginAction(driver).logoutLogin();
		ApprovalChainAction approvalChainAction = new ApprovalChainAction(driver);
		approvalChainAction.GoToapprovalChainPage();
		approvalChainAction.addNewApprovalChain();

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.addNewApprovalRuleWithExpenseModule();

	}

	@Test(priority = 3)
	public void validateSearchFunctionalitythroughRuleNmae() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Rule Nmae");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingRuleName();

	}

	@Test(priority = 4)
	public void validateSearchFunctionalitythroughModuleName() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Module Nmae");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingExpenseModuleName();

	}

	@Test(priority = 5)
	public void validateSearchFunctionalitythroughApprovalChainName() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Approval Chain Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingApprovalChainName();

	}

	@Test(priority = 6)
	public void validateSearchFunctionalitythroughUserName() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through User Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingUserName();

	}

	@Test(priority = 7)
	public void validateSearchFunctionalitythroughApproverName() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Approver Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingApprovarName();

	}

	@Test(priority = 8)
	public void validateSearchFunctionalitythroughActiveStatus() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Active Status");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingActiveStatus();

	}

	@Test(priority = 9)
	public void ValidateSarchfunctionalityThroughINActiveStatus() {
		test = getTest(Screenname + ": Validate Sarch functionality Through InActive Status");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.changeStatusFromActiveToInactive();
		new LoginAction(driver).logoutLogin();
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingInActiveStatus();

	}

	@Test(priority = 10)
	public void validateUpdateFunctionalityOfApprovalRulePage() throws ParseException {
		test = getTest(Screenname + ": validate Update Functionality Of Approval Rule Page");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.checkUpdateFunctionality();

	}

	@Test(priority = 11)
	public void validateDeleteFunctionalityOfApprovalRulePage() throws ParseException {
		test = getTest(Screenname + ": validate Delete Functionality Of Approval Rule Page");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.deleteRuleNameByUsingRuleName();

	}

	@Test(priority = 12)
	public void addApprovalRulePageWithLeaveModule() throws ParseException {
		test = getTest(Screenname + ": Add New Approval Rule Page");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.addNewApprovalRuleWithLeaveModule();

	}

	@Test(priority = 13)
	public void validateSearchFunctionalitythroughLeaveName() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Leave Nmae");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingLeaveModuleName();

	}

	@Test(priority = 14)
	public void validateSearchFunctionalitythroughApprovalChainNameForLeaveRuleName() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Approval Chain Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingApprovalChainName();

	}

	@Test(priority = 15)
	public void validateSearchFunctionalitythroughUserNameForLeaveRuleName() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through User Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingUserName();

	}

	@Test(priority = 16)
	public void validateSearchFunctionalitythroughApproverNameforLeaveRuleName() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Approver Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingApprovarName();

	}

	@Test(priority = 17)
	public void validateSearchFunctionalitythroughActiveStatusForLeaveRuleName() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Active Status");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingActiveStatus();

	}

	@Test(priority = 18)
	public void validateDeleteFunctionalityOfApprovalRulePageForLeaveModule() throws ParseException {
		test = getTest(Screenname + ": validate Delete Functionality Of Approval Rule Page For leave module");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.deleteRuleNameByUsingRuleName();

	}

	@Test(priority = 19)
	public void addApprovalRulePageWithTimeSheetModule() throws ParseException {
		test = getTest(Screenname + ": Add New Approval Rule Page");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.addNewApprovalRuleWithTimeSheetModule();

	}

	@Test(priority = 20)
	public void validateSearchFunctionalitythroughTimesheetModuleForTimeSheetRule() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Timesheet Module");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingTimeSheetModule();

	}

	@Test(priority = 21)
	public void validateSearchFunctionalitythroughApprovalChainNameForTimeSheetRule() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Approval Chain Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingApprovalChainName();

	}

	@Test(priority = 22)
	public void validateSearchFunctionalitythroughUserNameForTimeSheetRule() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through User Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingUserName();

	}

	@Test(priority = 23)
	public void validateSearchFunctionalitythroughApproverNameForTimeSheetRule() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Approver Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingApprovarName();

	}

	@Test(priority = 24)
	public void validateSearchFunctionalitythroughActiveStatusForTimeSheetRule() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Active Status");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingActiveStatus();

	}

	@Test(priority = 25)
	public void validateDeleteFunctionalityOfApprovalRulePageForTimeSheetModule() throws ParseException {
		test = getTest(Screenname + ": validate Delete Functionality Of Approval Rule Page For TimeSheet module");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.deleteRuleNameByUsingRuleName();

	}

	@Test(priority = 26)
	public void addApprovalRulePageWithAttendanceModule() throws ParseException {
		test = getTest(Screenname + ": Add New Approval Rule Page");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.addNewApprovalRuleWithAttendanceModule();

	}

	@Test(priority = 27)
	public void validateSearchFunctionalitythroughAttendanceModule() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Attendance Module");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingAttendanceModule();

	}

	@Test(priority = 28)
	public void validateSearchFunctionalitythroughApprovalChainNameForAttendanceRule() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Approval Chain Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingApprovalChainName();

	}

	@Test(priority = 29)
	public void validateSearchFunctionalitythroughUserNameForAttendanceRule() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through User Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingUserName();

	}

	@Test(priority = 30)
	public void validateSearchFunctionalitythroughApproverNameForAttendanceRule() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Approver Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingApprovarName();

	}

	@Test(priority = 31)
	public void validateSearchFunctionalitythroughActiveStatusForAttendanceRule() throws ParseException {
		test = getTest(Screenname + ": validate Search Functionality through Active Status");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.searchRuleNameByUsingActiveStatus();

	}

	@Test(priority = 32)
	public void validateDeleteFunctionalityOfApprovalRulePageForAttendanceModule() throws ParseException {
		test = getTest(Screenname + ": validate Delete Functionality Of Approval Rule Page For Attendance module");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.deleteRuleNameByUsingRuleName();

	}

	@Test(priority = 33)
	public void addApprovalRulePageWithLimitedDurationAndUseSequence() throws ParseException {
		test = getTest(Screenname + ": Add New Approval Rule Page");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.addNewApprovalRuleWithUseSequenseAndLimitedDuration();

	}

}
