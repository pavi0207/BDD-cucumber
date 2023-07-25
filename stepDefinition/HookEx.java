package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookEx {
	
	@Before("@websitetest")
	public void beforewebsitetest()
	{
		System.out.println("**********Before website test*************");
	}
	@After("@websitetest")
	public void afterwebsitetest()
	{
		System.out.println("**********After website test**********");
	}
	@Before("@smoketest")
	public void beforesmoketest()
	{
		System.out.println("==============Before test==============");
	}
	@After("@smoketest")
	public void aftersmoketest()
	{
		System.out.println("==============After test===========");
	}
	@Before("@mobiletest")
	public void beforemobiletest()
	{
		System.out.println("**********Before mobile test*************");
	}
	@After("@mobiletest")
	public void aftermobiletest()
	{
		System.out.println("**********After mobile test**********");
	}
	
	@Given("Example of given one")
	public void example_of_given_one() {
	   System.out.println("Given one mobiletest");
	}
	@When("Example of when one")
	public void example_of_when_one() {
		System.out.println("When one mobiletest");
	}
	@Then("Example of then one")
	public void example_of_then_one() {
		System.out.println("Then one mobiletest");
	}
	@Given("Example of given two")
	public void example_of_given_two() {
	   System.out.println("Given two websitetest");
	}
	@When("Example of when two")
	public void example_of_when_two() {
		System.out.println("When two websitetest");
	}
	@Then("Example of then two")
	public void example_of_then_two() {
		System.out.println("Then two websitetest");
	}






}
