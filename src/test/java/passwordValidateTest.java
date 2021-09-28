import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ex25.prog25;

public class passwordValidateTest {
    @Test
    public void passwordValidate() {
        prog25 passwordValidator = new prog25();

        assertEquals(0, passwordValidator.passwordValidator("12345"));
        assertEquals(1, passwordValidator.passwordValidator("abcdef"));
        assertEquals(2, passwordValidator.passwordValidator("abc123xyz"));
        assertEquals(3, passwordValidator.passwordValidator("1337h@xor!"));
    }
}
