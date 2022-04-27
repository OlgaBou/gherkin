package cucumberJava;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalarySteps {
    Map<String, String> map = new HashMap<String, String>();

    @Given("^the name of the employee$")
    public void the_name_of_the_employee() throws Throwable {
        map.put("bob", "35");
        map.put("bill", "50");
    }

    @When("^it is a bob$")
    public void it_is_a_bob() throws Throwable {
    }
 
    @When("^it is a bill$")
    public void it_is_a_bill() throws Throwable {
    } 

    @Then("the salary should be {string}")
    public void the_salary_should_be(String arg1) throws Throwable {
        System.out.println(map.get("bob"));
        switch (arg1) {
        case "35" : assertEquals("Salaire de bob incorrect",map.get("bob"),arg1); break;
        case "50" : assertEquals("Salaire de bill incorrect",map.get("bill"),arg1); break;
        default : System.out.println("Aucun couple salaire / salarié correspondant n'a été trouvé");
        }
    }
}