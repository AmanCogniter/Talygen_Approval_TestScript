package testcases;

import static reporting.ComplexReportFactory.getTest;

import java.text.ParseException;

import org.testng.annotations.Test;
import Action.ApprovalGroupAction;
import Action.CompanySetupUserAction;
import Action.LoginAction;

import utils.WebTestBase;

public class ApprovalGroupTest extends WebTestBase {
	static String Screenname = "<b>Approval</b>";

	/* First check the validation then add Approval group action */
	@Test(priority = 1, enabled = true)
	public void ValidationCheck() {
		test = getTest(Screenname + ": Validation message on Add Approval Group");

		new LoginAction(driver).logoutLogin();
		ApprovalGroupAction approvalGroupAction = new ApprovalGroupAction(driver);
		approvalGroupAction.GoToApprovalGroupPage();
		approvalGroupAction.validationMessageCheck();

	}

	@Test(priority = 2)
	public void addApprovalGroupPage() throws ParseException {
		test = getTest(Screenname + ": Add New Approval group Page");
		new LoginAction(driver).logoutLogin();

		CompanySetupUserAction companySetupUserAction = new CompanySetupUserAction(driver);
		// companySetupUserAction.addSkillSettings();
		companySetupUserAction.navigateToCompanySetup();

		// companySetupUserAction.selectcheckbox();
		// companySetupUserAction.deleteUser();
		companySetupUserAction.createUserForGroup();
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

	}

	@Test(priority = 3)
	public void ValidateSarchfunctionalityThroughApprovalGroupname() {
		test = getTest(Screenname + ": Validate Sarch functionality Through Approval Group name");

		new LoginAction(driver).logoutLogin();
		ApprovalGroupAction approvalGroupAction = new ApprovalGroupAction(driver);
		approvalGroupAction.GoToApprovalGroupPage();
		approvalGroupAction.ValidateApprovalGroupByApprovalGroupName();

	}

	@Test(priority = 4)
	public void ValidateSarchfunctionalityThroughUserName() {
		test = getTest(Screenname + ": Validate Sarch functionality Through user name");

		new LoginAction(driver).logoutLogin();
		ApprovalGroupAction approvalGroupAction = new ApprovalGroupAction(driver);
		approvalGroupAction.GoToApprovalGroupPage();
		approvalGroupAction.ValidateApprovalGroupByUsername();

	}

	@Test(priority = 5)
	public void ValidateDeleteButtonFunctionalityWithCanceling() {
		test = getTest(Screenname + ": Validate Delete Button Functionality With Cancel");

		new LoginAction(driver).logoutLogin();
		ApprovalGroupAction approvalGroupAction = new ApprovalGroupAction(driver);
		approvalGroupAction.GoToApprovalGroupPage();
		approvalGroupAction.ValidateDeleteButtonWitCancelFunctionality();

	}

	@Test(priority = 9)
	public void ValidateDeleteButtonFunctionalityWithOk() {
		test = getTest(Screenname + ": Validate Delete Button Functionality With OK");

		new LoginAction(driver).logoutLogin();
		ApprovalGroupAction approvalGroupAction = new ApprovalGroupAction(driver);
		approvalGroupAction.GoToApprovalGroupPage();
		approvalGroupAction.ValidateDeleteButtonWitOkFunctionality();

	}

	@Test(priority = 6)
	public void ValidateSarchfunctionalityThroughActiveStatus() {
		test = getTest(Screenname + ": Validate Sarch functionality Through Active Status");

		new LoginAction(driver).logoutLogin();
		ApprovalGroupAction approvalGroupAction = new ApprovalGroupAction(driver);
		approvalGroupAction.GoToApprovalGroupPage();
		approvalGroupAction.ValidateApprovalGroupWitStatusFunctionality();

	}

	@Test(priority = 8)
	public void ValidateSarchfunctionalityThroughINActiveStatus() {
		test = getTest(Screenname + ": Validate Sarch functionality Through InActive Status");

		new LoginAction(driver).logoutLogin();
		ApprovalGroupAction approvalGroupAction = new ApprovalGroupAction(driver);
		approvalGroupAction.GoToApprovalGroupPage();
		approvalGroupAction.changeStatusFromActiveToInactive();
		new LoginAction(driver).logoutLogin();
		approvalGroupAction.GoToApprovalGroupPage();
		approvalGroupAction.ValidateApprovalGroupWitInactiveStatusFunctionality();

	}

	@Test(priority = 7)
	public void ValidateUpdateFunctionality() {
		test = getTest(Screenname + ": Validate Update Functionality");

		new LoginAction(driver).logoutLogin();
		ApprovalGroupAction approvalGroupAction = new ApprovalGroupAction(driver);
		approvalGroupAction.GoToApprovalGroupPage();
		approvalGroupAction.ValidateUpdateFunctionality();

	}
	@Test(priority = 10)
	public void deleteUserForApprovalGroup() {
		test = getTest(Screenname + ": Delete User For Approval Group");

		new LoginAction(driver).logoutLogin();
		CompanySetupUserAction companySetupUserAction = new CompanySetupUserAction(driver);
		
		companySetupUserAction.navigateToCompanySetup();
		companySetupUserAction.deleteUserForApproval();
		

	}
}
