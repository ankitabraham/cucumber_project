package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tagexample {
	

@Given("i am in web browser_SR")
public void i_am_in_web_browser_sr() {
    
	System.out.println("i am in given sr");
}

@When("i clicked a button_SR")
public void i_clicked_a_button_sr() {
	System.out.println("i am in when sr");
}

@Then("i am redirected to it_SR")
public void i_am_redirected_to_it_sr() {
	System.out.println("i am in then sr");
}

@Given("i am in web browser_s")
public void i_am_in_web_browser_s() {
	System.out.println("i am in given s");
}

@When("i clicked a button_s")
public void i_clicked_a_button_s() {

	System.out.println("i am in when s");
}

@Then("i am redirected to it_s")
public void i_am_redirected_to_it_s() {
	System.out.println("i am in then s");
}

@Given("i am in web browser_SD")
public void i_am_in_web_browser_sd() {
	System.out.println("i am in given sd");
}

@When("i clicked a button_SD")
public void i_clicked_a_button_sd() {
	System.out.println("i am in when sd");
}

@Then("i am redirected to it_SD")
public void i_am_redirected_to_it_sd() {
	System.out.println("i am in then sd");
}


	

}


