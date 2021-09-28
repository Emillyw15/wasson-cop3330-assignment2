import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ex27.prog27;

public class validateInputTest {
    @Test
    public void validateTest() {
        prog27 validator = new prog27();
        assertEquals(true, validator.firstname("John"));
        assertEquals(false, validator.firstname("J"));
        assertEquals(false, validator.firstname(""));
        assertEquals(true, validator.lastname("Johnson"));
        assertEquals(false, validator.lastname("J"));
        assertEquals(false, validator.lastname(""));
        assertEquals(true, validator.zip("55555"));
        assertEquals(false, validator.zip("ABCDE"));
        assertEquals(true, validator.id("TK-4321"));
        assertEquals(false, validator.id("A12-1234"));
    }
}
