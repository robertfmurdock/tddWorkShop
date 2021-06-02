import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {

    @Test
    public void noNamesShouldReturnNothing() {
        Integration integration = new Integration();
        String actualReturnValue = integration.process("");
        String expectedReturnValue = "";
        assertEquals(expectedReturnValue, actualReturnValue);
    }


    @Test
    public void oneLetterPasswordEncryptsCorrectly() {
        Integration integration = new Integration();
        String actualReturnValue = integration.encryptPassword("z");
        String expectedReturnValue = "z";
        assertEquals(expectedReturnValue, actualReturnValue);
    }
}