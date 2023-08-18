package Action;

import org.openqa.selenium.WebDriver;

import pageobjects.ApprovalChainPage;
import pageobjects.ApprovalRulePage;

public class ApprovalRuleAction {
	WebDriver driver;
	ApprovalRulePage approvalRulePage;

	public ApprovalRuleAction(WebDriver driver) {
		this.driver = driver;
		approvalRulePage = new ApprovalRulePage(driver);
	}

	public void GoToapprovalRulePage() {
		approvalRulePage.clickFullMenuDropDown();
		approvalRulePage.clickOnApprovalLink();
		approvalRulePage.clickOnApprovalRule();
	}

	public void validationMessageCheck() {
		approvalRulePage.clickOnPageTour();
		approvalRulePage.clickOnNextButton();
		approvalRulePage.clickOnEndTour();
		approvalRulePage.clickOnAddApprovalRule();
		approvalRulePage.clickOnPageTourOfAddApprovalRule();
		approvalRulePage.clickOnNextButton();
		approvalRulePage.clickOnEndTour();
		approvalRulePage.clickOnsave();
		approvalRulePage.VerifyMandatoryFieldValidation();
		approvalRulePage.clickOnCancel();
	}
	

	public void addNewApprovalRuleWithExpenseModule() {
		approvalRulePage.clickOnAddApprovalRule();
		approvalRulePage.enterRuleName();
		approvalRulePage.selectProject();
		approvalRulePage.selectUser();
		approvalRulePage.selectApprovalChain();
		approvalRulePage.enterDescription();
		approvalRulePage.clickOnsave();
		approvalRulePage.notifymessagePopup();

	}

	public void addNewApprovalRuleWithUseSequenseAndLimitedDuration() {
		approvalRulePage.clickOnAddApprovalRule();
		approvalRulePage.enterRuleName();
		approvalRulePage.selectProject();
		approvalRulePage.selectUser();
		approvalRulePage.clickOnLimitedDuration();
		approvalRulePage.clickOnSelectDate();
		
		approvalRulePage.selectApprovalChain();
		approvalRulePage.clickOnUseSequence();
		approvalRulePage.enterDescription();
		approvalRulePage.clickOnsave();
		approvalRulePage.notifymessagePopup();

	}
	public void addNewApprovalRuleWithLeaveModule() {
		approvalRulePage.clickOnAddApprovalRule();
		approvalRulePage.enterRuleName();
		approvalRulePage.selectLeaveModule();
		approvalRulePage.selectUser();
		approvalRulePage.selectApprovalChain();
		approvalRulePage.enterDescription();
		approvalRulePage.clickOnsave();
		approvalRulePage.notifymessagePopup();

	}
	public void addNewApprovalRuleWithTimeSheetModule() {
		approvalRulePage.clickOnAddApprovalRule();
		approvalRulePage.enterRuleName();
		approvalRulePage.selectTimeSheetModule();
		approvalRulePage.selectProject();
		approvalRulePage.selectUser();
		approvalRulePage.selectApprovalChain();
		approvalRulePage.enterDescription();
		approvalRulePage.clickOnsave();
		approvalRulePage.notifymessagePopup();

	}
	public void addNewApprovalRuleWithAttendanceModule() {
		approvalRulePage.clickOnAddApprovalRule();
		approvalRulePage.enterRuleName();
		approvalRulePage.selectAttedenceModule();
		approvalRulePage.selectUser();
		approvalRulePage.selectApprovalChain();
		approvalRulePage.enterDescription();
		approvalRulePage.clickOnsave();
		approvalRulePage.notifymessagePopup();

	}
	public void searchRuleNameByUsingRuleName() {
		approvalRulePage.clickOnExpandButton();
		approvalRulePage.enterRuleNameInSearchField();
		approvalRulePage.clickOnSearchButton();
		approvalRulePage.validateRuleNameInApprovalRulePage();


	}
	public void searchRuleNameByUsingExpenseModuleName() {
		approvalRulePage.clickOnExpandButton();
		approvalRulePage.enterRuleNameInSearchField();
		approvalRulePage.selectExpenseModule();
		approvalRulePage.clickOnSearchButton();
		approvalRulePage.validateRuleNameInApprovalRulePage();


	}
	public void searchRuleNameByUsingLeaveModuleName() {
		approvalRulePage.clickOnExpandButton();
		approvalRulePage.enterRuleNameInSearchField();
		approvalRulePage.selectLeaveModulecheckBox();
		approvalRulePage.clickOnSearchButton();
		approvalRulePage.validateRuleNameInApprovalRulePage();


	}
	public void searchRuleNameByUsingTimeSheetModule() {
		approvalRulePage.clickOnExpandButton();
		approvalRulePage.enterRuleNameInSearchField();
		approvalRulePage.selectTimeSheetModulecheckBox();
		approvalRulePage.clickOnSearchButton();
		approvalRulePage.validateRuleNameInApprovalRulePage();


	}
	public void searchRuleNameByUsingAttendanceModule() {
		approvalRulePage.clickOnExpandButton();
		approvalRulePage.enterRuleNameInSearchField();
		approvalRulePage.selectAttendanceModulecheckBox();
		approvalRulePage.clickOnSearchButton();
		approvalRulePage.validateRuleNameInApprovalRulePage();


	}
	public void searchRuleNameByUsingApprovalChainName() {
		approvalRulePage.clickOnExpandButton();
		approvalRulePage.enterRuleNameInSearchField();
		//approvalRulePage.selectExpenseModule();
		approvalRulePage.enterApprovalChainInSearchField();
		approvalRulePage.clickOnSearchButton();
		approvalRulePage.validateRuleNameInApprovalRulePage();


	}
	public void searchRuleNameByUsingUserName() {
		approvalRulePage.clickOnExpandButton();
		approvalRulePage.enterRuleNameInSearchField();
		//approvalRulePage.selectExpenseModule();
		approvalRulePage.enterApprovalChainInSearchField();
		approvalRulePage.enterUserNameInSearchField();
		approvalRulePage.clickOnSearchButton();
		approvalRulePage.validateRuleNameInApprovalRulePage();


	}
	public void searchRuleNameByUsingApprovarName() {
		approvalRulePage.clickOnExpandButton();
		approvalRulePage.enterRuleNameInSearchField();
		//approvalRulePage.selectExpenseModule();
		approvalRulePage.enterApprovalChainInSearchField();
		approvalRulePage.enterUserNameInSearchField();
		approvalRulePage.enterApproverNameInSearchField();
		approvalRulePage.clickOnSearchButton();
		approvalRulePage.validateRuleNameInApprovalRulePage();


	}
	public void searchRuleNameByUsingActiveStatus() {
		approvalRulePage.clickOnExpandButton();
		approvalRulePage.enterRuleNameInSearchField();
		//approvalRulePage.selectExpenseModule();
		approvalRulePage.enterApprovalChainInSearchField();
		approvalRulePage.enterUserNameInSearchField();
		approvalRulePage.clickOnActiveCheckBox();
		approvalRulePage.clickOnSearchButton();
		approvalRulePage.validateRuleNameInApprovalRulePage();


	}
	public void searchRuleNameByUsingInActiveStatus() {
		approvalRulePage.clickOnExpandButton();
		approvalRulePage.enterRuleNameInSearchField();
		approvalRulePage.selectExpenseModule();
		approvalRulePage.enterApprovalChainInSearchField();
		approvalRulePage.enterUserNameInSearchField();
		approvalRulePage.clickOnInActiveCheckBox();
		approvalRulePage.clickOnSearchButton();
		approvalRulePage.validateRuleNameInApprovalRulePage();


	}
	public void deleteRuleNameByUsingRuleName() {
		approvalRulePage.clickOnExpandButton();
		approvalRulePage.enterRuleNameInSearchField();
		approvalRulePage.clickOnSearchButton();
		approvalRulePage.validateRuleNameInApprovalRulePage();
		approvalRulePage.clickOncheckBox();
		approvalRulePage.clickOnDeleteButton();
		approvalRulePage.clickOKButton();
		approvalRulePage.deleteNotifymessagePopup();


	}
	public void checkUpdateFunctionality() {
		approvalRulePage.clickOnExpandButton();
		approvalRulePage.enterRuleNameInSearchField();
		approvalRulePage.clickOnSearchButton();
		approvalRulePage.clickOnRuleName();
		approvalRulePage.clickOnsave();
		approvalRulePage.updateRuleNameNotifymessagePopup();


	}


	public void changeStatusFromActiveToInactive() {
		approvalRulePage.clickOnExpandButton();
		approvalRulePage.enterRuleNameInSearchField();
		approvalRulePage.clickOnSearchButton();
		approvalRulePage.clickOnStatusButton();
		approvalRulePage.clickOKButton();

	}
}
