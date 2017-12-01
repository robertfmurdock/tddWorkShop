import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralConverterTest {

	@Test
    public void shouldReturn1ForI() {
		Integer actualResult = RomanNumeralConverter.convert("I");
		Integer expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }
}
