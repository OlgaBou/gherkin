package cucumberJava;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CasinoSteps {
	private List<Map<String, String>> listePersonne;

	@Given("the following persons")
	public void the_following_persons(List<Map<String, String>> listePersonne) {
		this.listePersonne = listePersonne;

	}

	/*
	 * @When("they ask if they could go in a casino") public void
	 * they_ask_if_they_could_go_in_a_casino() { for(Map<String, String> m :
	 * listePersonne ) { int age = Integer.parseInt(m.get("age")); boolean gambler =
	 * Boolean.parseBoolean(m.get("gambler")); if (age>17 && gambler == false) {
	 * System.out.println("of course come in"); } else {
	 * System.out.println("no way, get out my face !"); } } }
	 */

	@When("they ask if they could go in a casino")
	public void they_ask_if_they_could_go_in_a_casino() {

	}

	@Then("the bouncer should say {string}")
	public void the_bouncer_should_say(String message) {
		for (Map<String, String> m : listePersonne) {
			int age = Integer.parseInt(m.get("age"));
			boolean gambler = Boolean.parseBoolean(m.get("gambler"));
			Client client = new Client(gambler, age);
			String autorisation = Casino.autorisationCient(client);
			System.out.println(autorisation);
			assertEquals(m.get("age")+ " " + m.get("gambler"),message, autorisation);
		}
	}
}