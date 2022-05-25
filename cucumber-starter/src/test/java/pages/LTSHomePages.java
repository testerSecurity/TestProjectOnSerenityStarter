package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class LTSHomePages extends PageObject {
	
	public void enterUname(){
		$(By.id("email")).type("iteam.9@aieus.com");
	}
	
	public void enterPassword(){
		$(By.id("password")).type("12345678");
	}
	
	public void clickLogin(){
		$(By.id("login")).click();
	}


}
