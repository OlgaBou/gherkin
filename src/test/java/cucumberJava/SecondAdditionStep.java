package cucumberJava;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondAdditionStep {
	
List<Integer> listeValeurs = new ArrayList<Integer>();
	
	
	@Given("I have entered {int} into the calculator")
	public void i_have_entered_into_the_calculator(Integer int1) {
		System.out.println("Nombre : " + int1);
		listeValeurs.add(int1);
	
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I press add")
	public void i_press_add() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("And I get the following numbers in my list: " + listeValeurs);
	}

	@Then("the result should be {int} on the screen")
	public void the_result_should_be_on_the_screen(Integer resultat) {
	    // Write code here that turns the phrase above into concrete actions
		
		
	    System.out.println("My result is: " + Calcul.calculatrice(listeValeurs));
	    assertTrue("The expected total was 120 but actually is: " + Calcul.calculatrice(listeValeurs), Calcul.calculatrice(listeValeurs) == resultat);
	}


}
