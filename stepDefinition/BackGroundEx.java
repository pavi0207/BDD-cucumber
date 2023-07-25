package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGroundEx {
	@Given("First")
	public void first() {
	    System.out.println("First");
	}
	@When("Second")
	public void second() {
	   System.out.println("Second"); 
	}
	@Then("Third")
	public void third() {
		System.out.println("Third");  
	}



	@Given("background given one")
	public void background_given_one() {
	 System.out.println("Given one");   
	}
	@When("background when one")
	public void background_when_one() {
		 System.out.println("When one");    
	}
	@Then("background then one")
	public void background_then_one() {
		 System.out.println("Then one");   
		 
	}
	@Given("background given two")
	public void background_given_two() {
	 System.out.println("Given two");   
	}
	@When("background when two")
	public void background_when_two() {
		 System.out.println("When two");    
	}
	@Then("background then two")
	public void background_then_two() {
		 System.out.println("Then two");    
	}



}
