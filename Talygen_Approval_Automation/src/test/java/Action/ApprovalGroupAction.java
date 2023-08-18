package Action;

import org.openqa.selenium.WebDriver;
import pageobjects.ApprovalGroupPage;

public class ApprovalGroupAction {
	WebDriver driver;
	ApprovalGroupPage approvalGroupPage;

	public ApprovalGroupAction(WebDriver driver) {
		this.driver = driver;
		approvalGroupPage = new ApprovalGroupPage(driver);
	}

	public void GoToApprovalGroupPage() {
		approvalGroupPage.clickFullMenuDropDown();
		approvalGroupPage.clickOnApprovalLink();
		approvalGroupPage.clickOnApprovalGroup();
	}

	public void validationMessageCheck() {
		approvalGroupPage.clickOnPageTour();
		approvalGroupPage.clickOnNextButton();
		approvalGroupPage.clickOnEndTour();
		approvalGroupPage.clickOnAddApprovalGroup();
		approvalGroupPage.clickOnsaveButton();
		approvalGroupPage.VerifyMandatoryFieldValidation();
		approvalGroupPage.clickOnCancelButton();
	}

	public void addNewApprovalgroup() {
		approvalGroupPage.clickOnAddApprovalGroup();
		approvalGroupPage.clickOnEnterApprovalGroupName();
		approvalGroupPage.selectUser();
		approvalGroupPage.clickOnEnterApprovalGroupDescription();
		approvalGroupPage.clickOnsaveButton();
		approvalGroupPage.clickOnsaveButton();
		approvalGroupPage.notifymessagePopup();

	}
	public void addNewApprovalgroupForReport() {
		approvalGroupPage.clickOnAddApprovalGroup();
		approvalGroupPage.clickOnEnterApprovalGroupNameForReport();
		approvalGroupPage.selectUser();
		approvalGroupPage.clickOnEnterApprovalGroupDescription();
		approvalGroupPage.clickOnsaveButton();
		approvalGroupPage.clickOnsaveButton();
		approvalGroupPage.notifymessagePopup();

	}

	public void ValidateApprovalGroupByApprovalGroupName() {
		approvalGroupPage.clickOnExpandButton();
		approvalGroupPage.enterApprovalGroupName();
		approvalGroupPage.clickOnSearchButton();
		approvalGroupPage.searchApprovalGroupName();

	}

	public void ValidateApprovalGroupByUsername() {
		approvalGroupPage.clickOnExpandButton();
		approvalGroupPage.enterUserName();
		approvalGroupPage.selectUsercheckBox();
		approvalGroupPage.clickOnSearchButton();
		approvalGroupPage.searchApprovalGroupName();

	}

	public void ValidateDeleteButtonWitCancelFunctionality() {
		approvalGroupPage.clickOnExpandButton();
		approvalGroupPage.enterApprovalGroupName();
		approvalGroupPage.clickOnSearchButton();
		approvalGroupPage.clickOncheckBox();
		approvalGroupPage.clickOnDeleteButton();
		approvalGroupPage.clickOnCancel();

	}

	public void ValidateApprovalGroupWitStatusFunctionality() {
		approvalGroupPage.clickOnExpandButton();
		approvalGroupPage.clickOnActiveCheckBox();
		approvalGroupPage.clickOnSearchButton();
		approvalGroupPage.validateActiveApprovalGroup();

	}

	public void ValidateDeleteButtonWitOkFunctionality() {
		approvalGroupPage.clickOnExpandButton();
		approvalGroupPage.enterApprovalGroupName();
		approvalGroupPage.clickOnSearchButton();
		approvalGroupPage.clickOnApprovalGroupcheckBox();
		approvalGroupPage.clickOnDeleteButton();
		approvalGroupPage.clickOKButton();
		approvalGroupPage.deleteNotifymessagePopup();

	}

	public void changeStatusFromActiveToInactive() {
		approvalGroupPage.clickOnExpandButton();
		approvalGroupPage.enterApprovalGroupName();
		approvalGroupPage.clickOnSearchButton();
		approvalGroupPage.clickOnStatusButton();
		approvalGroupPage.clickOKButton();

	}

	public void ValidateApprovalGroupWitInactiveStatusFunctionality() {
		approvalGroupPage.clickOnExpandButton();
		approvalGroupPage.clickOnInActiveCheckBox();
		approvalGroupPage.clickOnSearchButton();
		approvalGroupPage.validateInActiveApprovalGroup();

	}

	public void ValidateUpdateFunctionality() {
		approvalGroupPage.clickOnExpandButton();
		approvalGroupPage.enterApprovalGroupName();
		approvalGroupPage.clickOnSearchButton();
		approvalGroupPage.clickOnApprovalGroupName();
		approvalGroupPage.clickOnSaveButton();
		approvalGroupPage.updateNotifyMessage();

	}

}
