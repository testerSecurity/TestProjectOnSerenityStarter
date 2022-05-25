package pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	LTSHomePages homePage;
	
	@Step
	public void openApplication() {
		
		homePage.open();
	}
	@Step
	public void enterUsername() {
		 homePage.enterUname();
	}
	@Step
	public void enterpassword() {
		homePage.enterPassword();
		
	}
	@Step
	public void clickOnLoginButton() {
		
		homePage.clickLogin();
	}

}
