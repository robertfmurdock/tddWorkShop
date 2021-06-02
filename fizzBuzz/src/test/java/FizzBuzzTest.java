import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

	@Test
    public void shouldReturn1for1() {
		FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(1);
        String expectedReturnValue = "1";
        assertEquals(expectedReturnValue, actualReturnValue);
    }
}