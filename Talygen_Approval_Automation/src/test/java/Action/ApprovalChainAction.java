package Action;

import org.openqa.selenium.WebDriver;

import pageobjects.ApprovalChainPage;

public class ApprovalChainAction {
	WebDriver driver;
	ApprovalChainPage approvalChainPage;

	public ApprovalChainAction(WebDriver driver) {
		this.driver = driver;
		approvalChainPage = new ApprovalChainPage(driver);
	}

	public void GoToapprovalChainPage() {
		approvalChainPage.clickFullMenuDropDown();
		approvalChainPage.clickOnApprovalLink();
		approvalChainPage.clickOnApprovalChain();
	}

	public void validationMessageCheck() {
		approvalChainPage.clickOnPageTour();
		approvalChainPage.clickOnNextButton();
		approvalChainPage.clickOnEndTour();
		approvalChainPage.clickOnAddApprovalChain();
		approvalChainPage.clickOnsaveButton();
		approvalChainPage.VerifyMandatoryFieldValidation();
		approvalChainPage.clickOnCancelButton();
	}

	public void addNewApprovalChain() {
		approvalChainPage.clickOnAddApprovalChain();
		approvalChainPage.clickOnEnterApprovalChainName();
		approvalChainPage.selectApprovalUser();
		approvalChainPage.clickOnEnterApprovalChainDescription();
		approvalChainPage.clickOnsaveButton();
		approvalChainPage.clickOnsaveButton();
		approvalChainPage.notifymessagePopup();

	}
	public void addNewApprovalChainForReport() {
		approvalChainPage.clickOnAddApprovalChain();
		approvalChainPage.clickOnEnterApprovalChainNameForReport();
		approvalChainPage.selectApprovalUser();
		approvalChainPage.clickOnEnterApprovalChainDescription();
		approvalChainPage.clickOnsaveButton();
		approvalChainPage.clickOnsaveButton();
		approvalChainPage.notifymessagePopup();

	}

	public void ValidateApprovalChainByApprovalGroupName() {
		approvalChainPage.clickOnExpandButton();
		approvalChainPage.enterApprovalGroupName();
		approvalChainPage.clickOnSearchButton();
		approvalChainPage.searchApprovalGroupName();

	}

	public void ValidateApprovalChainByUsername() {
		approvalChainPage.clickOnExpandButton();
		approvalChainPage.enterUserName();
		approvalChainPage.selectUsercheckBox();
		approvalChainPage.clickOnSearchButton();
		approvalChainPage.searchApprovalGroupName();

	}
	public void ValidateApprovalChainWitStatusFunctionality() {
		approvalChainPage.clickOnExpandButton();
		approvalChainPage.clickOnActiveCheckBox();
		approvalChainPage.clickOnSearchButton();
		approvalChainPage.validateActiveApprovalChain();

	}
	

	public void changeStatusFromActiveToInactive() {
		approvalChainPage.clickOnExpandButton();
		approvalChainPage.enterApprovalGroupName();
		approvalChainPage.clickOnSearchButton();
		approvalChainPage.clickOnStatusButton();
		approvalChainPage.clickOKButton();

	}

	public void ValidateApprovalChainWitInactiveStatusFunctionality() {
		approvalChainPage.clickOnExpandButton();
		approvalChainPage.clickOnInActiveCheckBox();
		approvalChainPage.clickOnSearchButton();
		approvalChainPage.validateInActiveApprovalChain();

	}
	public void ValidateApprovalChainByApprovalchainName() {
		approvalChainPage.clickOnExpandButton();
		approvalChainPage.enterApprovalChainName();
		
		approvalChainPage.clickOnSearchButton();
		approvalChainPage.searchApprovalGroupName();

	}
	public void validateActionButtonFunctionality() {
		approvalChainPage.clickOnExpandButton();
		approvalChainPage.enterApprovalChainName();
		approvalChainPage.clickOnSearchButton();
		approvalChainPage.clickOnActionButton();
		approvalChainPage.clickOnActionDeleteButton();
		approvalChainPage.clickOnCancel();
		approvalChainPage.clickOnPageTour();
		approvalChainPage.clickOnNextButton();
		approvalChainPage.clickOnEndTour();
		approvalChainPage.clickOnBackToListButton();

	}
	public void validateUpdateFunctionality() {
		approvalChainPage.clickOnExpandButton();
		approvalChainPage.enterApprovalChainName();
		approvalChainPage.clickOnSearchButton();
		approvalChainPage.clickOnApprovalChainName();
		approvalChainPage.clickOnSaveButton();
		approvalChainPage.updateNotifyMessage();
		

	}
	public void ValidateDeleteButtonWitCancelFunctionality() {
		approvalChainPage.clickOnExpandButton();
		approvalChainPage.enterApprovalGroupName();
		approvalChainPage.selectGroupNamecheckBox();
		approvalChainPage.clickOnSearchButton();
		approvalChainPage.clickOncheckBox();
		approvalChainPage.clickOnDeleteButton();
		approvalChainPage.clickOnCancel();

	}
	
	public void ValidateDeleteButtonWitOkFunctionality() {
		approvalChainPage.clickOnExpandButton();
		approvalChainPage.enterApprovalGroupName();
		approvalChainPage.selectGroupNamecheckBox();
		approvalChainPage.clickOnSearchButton();
		approvalChainPage.clickOncheckBox();
		approvalChainPage.clickOnDeleteButton();
		approvalChainPage.clickOKButton();
		approvalChainPage.deleteNotifymessagePopup();
		
		
		

	}

}
