import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeClassTest {

	@Test
    public void shouldFailSometimesAndPassSometimesWhichIsAbsolutelyUseless() {
		SomeClass someClass = new SomeClass();
		assertEquals("Tofu", someClass.someMethod());
    }
}
