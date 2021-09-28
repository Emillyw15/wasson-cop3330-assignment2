import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ex38.filterValues;

public class filterValuesTest {
    @Test
    public void testFilter() {
        filterValues filter = new filterValues();
        assertEquals(true, filter.filterEvenNumbers(2));
        assertEquals(false, filter.filterEvenNumbers(3));
    }
}
