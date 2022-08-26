package cucumberPractise;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoForCucumber {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   System.out.println("i want to write a code"); //Write code here that turns the phrase above into concrete actions
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	   System.out.println("from given");
	}

	@When("I complete action")
	public void i_complete_action() {
	   System.out.println("from when");
	}

	@When("some other action")
	public void some_other_action() {
	    System.out.println("demo");
	}

	@When("yet another action")
	public void yet_another_action() {
	   System.out.println("dio");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	System.out.println("i validate the outcomes");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	   System.out.println("checking");
	}


}
