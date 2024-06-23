package com.step;

import com.base.BaseClass;
import com.object.ObjectManger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_FirstPageStep extends BaseClass {

	ObjectManger object = new ObjectManger();

	@Given("User select to the chrome browser")
	public void user_select_to_the_chrome_browser() {
		launchBrowser();

	}

	@When("User navigate to the URL")
	public void user_navigate_to_the_url() {
		loadUrl();

	}

	@Then("User should verify the message {string}")
	public void user_should_verify_the_message(String string) {
		object.getFirstPage().firstMessageMethod();

	}

	@When("User enter the value of required fields {string} and {string}")
	public void user_enter_the_value_of_required_fields_and(String Name, String Password) {
		object.getFirstPage().loginInputs(Name, Password);

	}

	@Then("User click the login button after enter  all the fields")
	public void user_click_the_login_button_after_enter_all_the_fields() {

	object.getFirstPage().loginClick();
}

}
