package testcases;

import static reporting.ComplexReportFactory.getTest;

import java.text.ParseException;

import org.testng.annotations.Test;

import Action.ApprovalChainAction;
import Action.ApprovalGroupAction;
import Action.CompanySetupUserAction;
import Action.LoginAction;
import utils.WebTestBase;

public class ApprovalChainTest extends WebTestBase {
	static String Screenname = "<b>Approval</b>";

	/* First check the validation then add Approval group action */
	@Test(priority = 1, enabled = true)
	public void ValidationCheck() {
		test = getTest(Screenname + ": Validation message on Add Approval Chain");

		new LoginAction(driver).logoutLogin();
		ApprovalChainAction approvalChainAction = new ApprovalChainAction(driver);
		approvalChainAction.GoToapprovalChainPage();
		approvalChainAction.validationMessageCheck();

	}

	@Test(priority = 2)
	public void addApprovalChainPage() throws ParseException {
		test = getTest(Screenname + ": Add New Approval group Page");
		new LoginAction(driver).logoutLogin();

		CompanySetupUserAction companySetupUserAction = new CompanySetupUserAction(driver);
		// companySetupUserAction.addSkillSettings();
		companySetupUserAction.navigateToCompanySetup();

		// companySetupUserAction.selectcheckbox();
		// companySetupUserAction.deleteUser();
		companySetupUserAction.createUser();

		/*
		 * companySetupUserAction.settingsForCreatedUser();
		 * companySetupUserAction.addFeedbackSetting();
		 * companySetupUserAction.addGoalSettings();
		 * companySetupUserAction.addNoteSettings();
		 * 
		 * companySetupUserAction.clickPerformanceReviewTab();
		 * companySetupUserAction.addReview();
		 */
		// companySetupUserAction.addSkillforCreatedUser();
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

	}

	@Test(priority = 3)
	public void ValidateSarchfunctionalityThroughApprovalGroupname() {
		test = getTest(Screenname + ": Validate Sarch functionality Through Approval Group name");

		new LoginAction(driver).logoutLogin();
		ApprovalChainAction approvalChainAction = new ApprovalChainAction(driver);
		approvalChainAction.GoToapprovalChainPage();
		approvalChainAction.ValidateApprovalChainByApprovalGroupName();

	}

	@Test(priority = 4)
	public void ValidateSarchfunctionalityThroughUserName() {
		test = getTest(Screenname + ": Validate Sarch functionality Through user name");

		new LoginAction(driver).logoutLogin();
		ApprovalChainAction approvalChainAction = new ApprovalChainAction(driver);
		approvalChainAction.GoToapprovalChainPage();
		approvalChainAction.ValidateApprovalChainByUsername();

	}

	@Test(priority = 5)
	public void ValidateSarchfunctionalityThroughActiveStatus() {
		test = getTest(Screenname + ": Validate Sarch functionality Through Active Status");

		new LoginAction(driver).logoutLogin();
		ApprovalChainAction approvalChainAction = new ApprovalChainAction(driver);
		approvalChainAction.GoToapprovalChainPage();
		approvalChainAction.ValidateApprovalChainWitStatusFunctionality();

	}

	@Test(priority = 6)
	public void ValidateSarchfunctionalityThroughINActiveStatus() {
		test = getTest(Screenname + ": Validate Sarch functionality Through InActive Status");

		new LoginAction(driver).logoutLogin();
		ApprovalChainAction approvalChainAction = new ApprovalChainAction(driver);
		approvalChainAction.GoToapprovalChainPage();
		approvalChainAction.changeStatusFromActiveToInactive();
		new LoginAction(driver).logoutLogin();
		approvalChainAction.GoToapprovalChainPage();
		approvalChainAction.ValidateApprovalChainWitInactiveStatusFunctionality();

	}

	@Test(priority = 7)
	public void ValidateSarchfunctionalityThroughApprovalChainName() {
		test = getTest(Screenname + ": Validate Sarch functionality Through Approval Chain Name");

		new LoginAction(driver).logoutLogin();
		ApprovalChainAction approvalChainAction = new ApprovalChainAction(driver);
		approvalChainAction.GoToapprovalChainPage();
		approvalChainAction.ValidateApprovalChainByApprovalchainName();

	}

	@Test(priority = 8)
	public void ValidateactionButtonFunctionality() {
		test = getTest(Screenname + ": Validate Action button functionality");

		new LoginAction(driver).logoutLogin();
		ApprovalChainAction approvalChainAction = new ApprovalChainAction(driver);
		approvalChainAction.GoToapprovalChainPage();
		approvalChainAction.validateActionButtonFunctionality();

	}

	@Test(priority = 9)
	public void ValidateUpdateFunctionality() {
		test = getTest(Screenname + ": Validate Update functionality");

		new LoginAction(driver).logoutLogin();
		ApprovalChainAction approvalChainAction = new ApprovalChainAction(driver);
		approvalChainAction.GoToapprovalChainPage();
		approvalChainAction.validateUpdateFunctionality();

	}

	@Test(priority = 10)
	public void ValidateDeleteButtonFunctionalityWithCanceling() {
		test = getTest(Screenname + ": Validate Delete Button Functionality With Cancel");

		new LoginAction(driver).logoutLogin();
		ApprovalChainAction approvalChainAction = new ApprovalChainAction(driver);
		approvalChainAction.GoToapprovalChainPage();
		approvalChainAction.ValidateDeleteButtonWitCancelFunctionality();

	}

	@Test(priority = 11)
	public void ValidateApprovalChainDeleteButtonFunctionalityWithOk() {
		test = getTest(Screenname + ": Validate Approval Chain Delete Button Functionality With OK");

		new LoginAction(driver).logoutLogin();
		ApprovalChainAction approvalChainAction = new ApprovalChainAction(driver);
		approvalChainAction.GoToapprovalChainPage();
		approvalChainAction.ValidateDeleteButtonWitOkFunctionality();

	}

	@Test(priority = 12)
	public void ValidateGroupNmeDeleteButtonFunctionalityWithOk() {
		test = getTest(Screenname + ": Validate Approval Group Delete Button Functionality With OK");

		new LoginAction(driver).logoutLogin();
		ApprovalGroupAction approvalGroupAction = new ApprovalGroupAction(driver);
		approvalGroupAction.GoToApprovalGroupPage();
		approvalGroupAction.ValidateDeleteButtonWitOkFunctionality();

	}
	@Test(priority = 13)
	public void deleteUserForApprovalChain() {
		test = getTest(Screenname + ": Delete User For Approval Chain");

		new LoginAction(driver).logoutLogin();
		CompanySetupUserAction companySetupUserAction = new CompanySetupUserAction(driver);
		
		companySetupUserAction.navigateToCompanySetup();
		companySetupUserAction.deleteUserForApproval();
		

	}

}
