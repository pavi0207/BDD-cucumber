package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommentDefintion {

	@Given("user is logged in")
	public void user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("comment Given");
			 
	}
	@When("user enters comment")
	public void user_enters_comment() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("comment when");
			
	}
	@Then("comment must be posted")
	public void comment_must_be_posted() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("comment then");
			
	}
	
	@Given("user is logged in two")
	public void user_is_logged_in_two() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("comment Given two");
			 
	}
	@When("user enters comment two")
	public void user_enters_comment_two() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("comment when two");
			
	}
	@Then("comment must be posted two")
	public void comment_must_be_posted_two() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("comment then two");
			
	}
	
	 




}
