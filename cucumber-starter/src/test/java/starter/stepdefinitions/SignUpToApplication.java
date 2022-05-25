package starter.stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpToApplication {
	
	public WebDriver driver=null;
	
	@Given("User opens browser")
	public void user_opens_browser() {
		
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	   
	}
	
	@When("The user navigate to the URL {string}")
	public void the_user_navigate_to_the_url(String string) {
		driver.get("https://exppackage.shiptobox.com/registration");        
	}
	
	@When("Select country from drop-down menu")
	public void select_country_from_drop_down_menu() {
		
		Select dropSelect = new Select(driver.findElement(By.name("country")));
		dropSelect.selectByVisibleText("Bangladesh");
	   
	}

	@And("The user need to enter valid and unique email")
	public void the_user_need_to_enter_valid_and_unique_email() {
		String email =JOptionPane.showInputDialog("Enter email address");
		driver.findElement(By.id("email")).sendKeys(email);
	   
	}

	@And("The user need to enter first name at least {int} characters")
	public void the_user_need_to_enter_first_name_at_least_characters(Integer int1) {
		driver.findElement(By.id("first_name")).sendKeys("Testing");
	   
	}

	@And("The user need to enter last name at least {int} characters")
	public void the_user_need_to_enter_last_name_at_least_characters(Integer int1) {
		driver.findElement(By.id("last_name")).sendKeys("Stater");
	    
	}

	@Then("The user need to enter password at least {int} characters")
	public void the_user_need_to_enter_password_at_least_characters(Integer int1) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
	    
	}

	@Then("The user need to marked the checklist for agree with terms and policy")
	public void the_user_need_to_marked_the_checklist_for_agree_with_terms_and_policy() {
		driver.findElement(By.xpath("//*[@id=\"accept\"]")).click();
	    
	}

	@Then("The user clicks on create account button")
	public void the_user_clicks_on_create_account_button() {
		
		driver.findElement(By.id("signup")).click();
	}

	@Then("The user must register to the LTS account successfully")
	public void the_user_must_register_to_the_lts_account_successfully() {
			String textAccount = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/ul/li[2]")).getText();
		    assertEquals(true, textAccount.contains("Account No:"));
		
	    
	}

}
