package cucumberJava;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommandeSteps {
	
	private Map<String, Integer> liste_produit;
	private int total_cost;
	
	@Given("Le prix deproduits de cette liste")
	public void le_prix_de_produit_de_cette_liste(Map<String, Integer> liste_produit) {
		 this.liste_produit = liste_produit;
	}

	@When("Je commande {int} {string}")
		public void je_commande(int nombreDeProduit, String produit) {
		int firstPrice = liste_produit.get(produit);
		total_cost += firstPrice * nombreDeProduit;
			}
	
	@Then("Je dois payer {int} euros")
	public void je_dois_payer_euros(int prixAttendu) {
		assertEquals(prixAttendu, total_cost);
	}

}
