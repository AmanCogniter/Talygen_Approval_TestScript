package testcases;

import static reporting.ComplexReportFactory.getTest;

import java.text.ParseException;

import org.testng.annotations.Test;

import Action.ApprovalChainAction;
import Action.ApprovalGroupAction;
import Action.ApprovalReportAction;
import Action.ApprovalRuleAction;
import Action.CompanySetupUserAction;
import Action.LoginAction;
import Action.ProjectListingAction;
import utils.WebTestBase;

public class ApprovalReportTest extends WebTestBase {
	static String Screenname = "<b>Approval Report</b>";

	@Test(priority = 1, enabled = true)
	public void ValidateNonRuleUserswithExpenseApprovalType() {
		test = getTest(Screenname + ": Validate Non Rule Users with Expense Approval Type");

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchNonRuleUserWithExpenseApprovalType();

	}

	@Test(priority = 2)
	public void ValidateNonRuleUserswithLeaveApprovalType() {
		test = getTest(Screenname + ": Validate Non Rule Users with Leave Approval Type");

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchNonRuleUserWithLeaveApprovalType();

	}

	@Test(priority = 3)
	public void ValidateNonRuleUserswithtimesheetApprovalType() {
		test = getTest(Screenname + ": Validate Non Rule Users with TimeSheet Approval Type");

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchNonRuleUserWithTimeSheetApprovalType();

	}

	@Test(priority = 4)
	public void ValidateNonRuleUserswithAttendanceApprovalType() {
		test = getTest(Screenname + ": Validate Non Rule Users with Attendance Approval Type");

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchNonRuleUserWithAttendanceApprovalType();

	}

	@Test(priority = 5)
	public void ValidateNonRuleUserswithExpenseApprovalTypeAndUserName() throws ParseException {
		test = getTest(Screenname + ": Validate Non Rule Users with Expense Approval Type And User Name");
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
		companySetupUserAction.createUserForREport();
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
//			companySetupUserAction.clickPerformanceReviewTab();
//			companySetupUserAction.addReview();
		
		  new LoginAction(driver).logoutLogin(); ApprovalGroupAction
		  approvalGroupAction = new ApprovalGroupAction(driver);
		  approvalGroupAction.GoToApprovalGroupPage();
		  approvalGroupAction.addNewApprovalgroupForReport();
		 
		
		  new LoginAction(driver).logoutLogin(); ApprovalChainAction
		  approvalChainAction = new ApprovalChainAction(driver);
		  approvalChainAction.GoToapprovalChainPage();
		  approvalChainAction.addNewApprovalChainForReport();
		 
		
		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.addNewApprovalRuleWithExpenseModule();

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchNonRuleUserWithExpenseApprovalTypeAndUserName();

	}

	//@Test(priority = 6)
	public void validateDeleteFunctionalityOfApprovalRulePage() throws ParseException {
		test = getTest(Screenname + ": validate Delete Functionality Of Approval Rule Page");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.deleteRuleNameByUsingRuleName();

	}

	@Test(priority = 7)
	public void ValidateNonRuleUserswithLeaveApprovalTypeAndUserName() throws ParseException {
		test = getTest(Screenname + ": Validate Non Rule Users with Leave Approval Type And User Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.addNewApprovalRuleWithLeaveModule();

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchNonRuleUserWithExpenseApprovalTypeAndUserName();
	}

	@Test(priority = 8)
	public void validateDeleteFunctionalityOfApprovalRulePageForLeaveModule() throws ParseException {
		test = getTest(Screenname + ": validate Delete Functionality Of Approval Rule Page For leave module");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.deleteRuleNameByUsingRuleName();

	}

	@Test(priority = 9)
	public void ValidateNonRuleUserswithTimeSheetApprovalTypeAndUserName() throws ParseException {
		test = getTest(Screenname + ": Validate Non Rule Users with TimeSheet Approval Type And User Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.addNewApprovalRuleWithTimeSheetModule();

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchNonRuleUserWithTimeSheetApprovalTypeAndUserName();
	}

	@Test(priority = 10)
	public void validateDeleteFunctionalityOfApprovalRulePageForTimeSheetModule() throws ParseException {
		test = getTest(Screenname + ": validate Delete Functionality Of Approval Rule Page For TimeSheet module");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.deleteRuleNameByUsingRuleName();

	}

	@Test(priority = 11)
	public void ValidateNonRuleUserswithattendanceApprovalTypeAndUserName() throws ParseException {
		test = getTest(Screenname + ": Validate Non Rule Users with Attendance Approval Type And User Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.addNewApprovalRuleWithAttendanceModule();

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchNonRuleUserWithAttendanceApprovalTypeAndUserName();
	}

	//@Test(priority = 12)
	public void validateDeleteFunctionalityOfApprovalRulePageForAttendanceModule() throws ParseException {
		test = getTest(Screenname + ": validate Delete Functionality Of Approval Rule Page For Attendance module");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.deleteRuleNameByUsingRuleName();

	}

	@Test(priority = 13)
	public void ValidateUserWiseApprovalRuleInformationWithRuleName() throws ParseException {
		test = getTest(Screenname + ": Validate User Wise Approval Rule Information With Rule Name");
		/*
		 * new LoginAction(driver).logoutLogin(); ProjectListingAction
		 * projectListingAction = new ProjectListingAction(driver);
		 * projectListingAction.navigateToProject(); projectListingAction.addProject();
		 * projectListingAction.addChannel(); projectListingAction.selectPriority();
		 * projectListingAction.enterPurchaseNumber();
		 * projectListingAction.selectLocation();
		 * projectListingAction.enterProjectDescription();
		 * projectListingAction.clickNextButton();
		 */
		//new LoginAction(driver).logoutLogin();

		CompanySetupUserAction companySetupUserAction = new CompanySetupUserAction(driver);
		// companySetupUserAction.addSkillSettings();
		/* companySetupUserAction.navigateToCompanySetup(); */

		// companySetupUserAction.selectcheckbox();
		// companySetupUserAction.deleteUser();
		/*
		 * companySetupUserAction.createUserForREport();
		 * 
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
//			companySetupUserAction.clickPerformanceReviewTab();
//			companySetupUserAction.addReview();

		/*
		 * new LoginAction(driver).logoutLogin(); ApprovalGroupAction
		 * approvalGroupAction = new ApprovalGroupAction(driver);
		 * approvalGroupAction.GoToApprovalGroupPage();
		 * approvalGroupAction.addNewApprovalgroup();
		 * 
		 * new LoginAction(driver).logoutLogin(); ApprovalChainAction
		 * approvalChainAction = new ApprovalChainAction(driver);
		 * approvalChainAction.GoToapprovalChainPage();
		 * approvalChainAction.addNewApprovalChain();
		 */
		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.addNewApprovalRuleWithExpenseModule();

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchUserWiseApprovalRuleInformationWithRuleName();

	}

	@Test(priority = 14)
	public void ValidateUserWiseApprovalRuleInformationWithModuleName() throws ParseException {
		test = getTest(Screenname + ": Validate User Wise Approval Rule Information With Module Name");

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchUserWiseApprovalRuleInformationWithModuleName();

	}

	@Test(priority = 15)
	public void ValidateUserWiseApprovalRuleInformationWithApprovalChainName() throws ParseException {
		test = getTest(Screenname + ": Validate User Wise Approval Rule Information With Approval Chain Name");

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchUserWiseApprovalRuleInformationWithApprovalChainName();

	}

	@Test(priority = 16)
	public void ValidateUserWiseApprovalRuleInformationWithUserName() throws ParseException {
		test = getTest(Screenname + ": Validate User Wise Approval Rule Information With User Name");

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchUserWiseApprovalRuleInformationWithUserName();

	}

	@Test(priority = 17)
	public void ValidateUserWiseApprovalRuleInformationWithLeaveModuleName() throws ParseException {
		test = getTest(Screenname + ":Validate User Wise Approval Rule Information With Leave Module Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.addNewApprovalRuleWithLeaveModule();

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchUserWiseApprovalRuleInformationWithLeaveModuleName();

	}

	@Test(priority = 18)
	public void ValidateUserWiseApprovalRuleInformationWithTimeSheetModuleName() throws ParseException {
		test = getTest(Screenname + ":Validate User Wise Approval Rule Information With TimeSheet Module Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.addNewApprovalRuleWithTimeSheetModule();

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchUserWiseApprovalRuleInformationWithTimesheetModuleName();

	}

	@Test(priority = 19)
	public void ValidateUserWiseApprovalRuleInformationWithAttendanceModuleName() throws ParseException {
		test = getTest(Screenname + ":Validate User Wise Approval Rule Information With attendance Module Name");

		new LoginAction(driver).logoutLogin();
		ApprovalRuleAction approvalRuleAction = new ApprovalRuleAction(driver);
		approvalRuleAction.GoToapprovalRulePage();
		approvalRuleAction.addNewApprovalRuleWithAttendanceModule();

		new LoginAction(driver).logoutLogin();
		ApprovalReportAction approvalReportAction = new ApprovalReportAction(driver);
		approvalReportAction.GoToapprovalReportPage();
		approvalReportAction.searchUserWiseApprovalRuleInformationWithAttendanceModuleName();

	}
	//@Test(priority = 20)
	public void ValidateApprovalChainDeleteButtonFunctionalityWithOk() {
		test = getTest(Screenname + ": Validate Approval Chain Delete Button Functionality With OK");

		new LoginAction(driver).logoutLogin();
		ApprovalChainAction approvalChainAction = new ApprovalChainAction(driver);
		approvalChainAction.GoToapprovalChainPage();
		approvalChainAction.ValidateDeleteButtonWitOkFunctionality();

	}

	//@Test(priority = 21)
	public void ValidateGroupNmeDeleteButtonFunctionalityWithOk() {
		test = getTest(Screenname + ": Validate Approval Group Delete Button Functionality With OK");

		new LoginAction(driver).logoutLogin();
		ApprovalGroupAction approvalGroupAction = new ApprovalGroupAction(driver);
		approvalGroupAction.GoToApprovalGroupPage();
		approvalGroupAction.ValidateDeleteButtonWitOkFunctionality();

	}
	//@Test(priority = 22)
	public void deleteUserForApprovalReport() {
		test = getTest(Screenname + ": Delete User For Approval Report");

		new LoginAction(driver).logoutLogin();
		CompanySetupUserAction companySetupUserAction = new CompanySetupUserAction(driver);
		
		companySetupUserAction.navigateToCompanySetup();
		companySetupUserAction.deleteUserForApproval();
		

	}
}
