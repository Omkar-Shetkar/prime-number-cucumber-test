package com.number;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrimeNumberCheckStepDefs {

	private Integer input;
	private boolean isPrime = true;

	@Given("input is {int}")
	public void input_is(Integer input) {
		this.input = input;
	}

	@When("I ask whether input is a prime number")
	public void i_ask_whether_input_is_a_prime_number() {
		if (input > 1) {
			for (int i = 2; i <= input / 2; i++) {
				if (input % i == 0)
					isPrime = false;
			}
		} else {
			isPrime = false;
		}
	}

	@Then("I should be told {string}")
	public void i_should_be_told(String expected) {
		assertEquals(Boolean.valueOf(expected), isPrime);
	}

}
