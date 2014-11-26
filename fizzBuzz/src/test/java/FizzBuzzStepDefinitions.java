import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class FizzBuzzStepDefinitions {

    private int numberGiven;
    private FizzBuzz fizzBuzz;

    @Given("Fizzbuzz exists")
    public void fizzBuzzExists() {
        fizzBuzz = new FizzBuzz();
    }

    @When("the number is (\\d+)")
    public void theNumberIs(int number) {
        numberGiven = number;
    }

    @Then("the result should be (.+)")
    public void theResultShouldBe(String expected) {
        String result = fizzBuzz.process(numberGiven);
        assertEquals(result, expected);
    }
}
