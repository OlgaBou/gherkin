package cucumberJava;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConnexionJPSSteps {
	WebDriver driver;

	@Given("I have opened new browser")
	public void i_have_opened_new_browser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("I click on signon")
	public void i_click_on_signon() {
		driver.findElement(By.xpath("//div[@id='MenuContent']/a[contains(@href, 'signonForm')]")).click();
	}

	@When("I add {string} and {string}")
	public void i_add_and(String login, String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(login);
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='signon']")).click();
	}

	@Then("I see {string}")
	public void i_see(String welcome) {
		assertEquals((welcome),
				driver.findElement(By.xpath("//div[@id='WelcomeContent' and contains(., 'Welcome ABC!')]")).getText());
		assertTrue(
				driver.findElement(By.xpath("//div[@id='MenuContent']/a[contains(@href, 'signoff')]")).isDisplayed());
		driver.quit();
	}

}
