package shouty.step_definitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import shouty.Person;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Stepdefs {
    private Person lucy;
    private Person sean;
    private String messageFromSean;

    @Given("Lucy is {int}m from Sean")
    public void lucyIsMFromSean(int distance) {
      lucy = new Person();
      sean = new Person();

        lucy.setLocation(distance);
        sean.setLocation(0);
    }

    @When("Sean shouts {string}")
    public void seanShouts(String message) {
        sean.shout(message);
        messageFromSean = message;

        
    }

    @Then("Lucy should hear Sean's message")
    public void lucyShouldHearSeanSMessage() {
        assertEquals(asList(messageFromSean), lucy.getMessagesHeard());
    }
}
