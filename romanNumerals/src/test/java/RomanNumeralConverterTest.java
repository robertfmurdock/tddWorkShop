import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralConverterTest {

	@Test
    public void shouldReturn1ForI() {
		Integer actualResult = RomanNumeralConverter.convert("I");
		Integer expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }
}
