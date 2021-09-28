import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ex26.PaymentCalculator;

public class PaymentCalculatorTest {
    @Test
    public void calculateTest() {
        PaymentCalculator pc = new PaymentCalculator();
        assertEquals(70, pc.calculateMonthsUntilPaidOff(5000, 12, 100));
    }
}
