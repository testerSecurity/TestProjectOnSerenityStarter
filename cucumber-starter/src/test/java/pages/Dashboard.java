package pages;

import net.thucydides.core.annotations.Step;

public class Dashboard {
	LTSDashboard dashboard;
	
    @Step
	public void verfyAdmin() {
		
    	dashboard.loginVerify();
		
	}
}
