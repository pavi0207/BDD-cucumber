package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlugIn {
	@When("this is when")
	public void this_is_when() {
	    System.out.println("When");
	}
	@Then("this is then")
	public void this_is_then() {
		System.out.println("Then");
	}




}
