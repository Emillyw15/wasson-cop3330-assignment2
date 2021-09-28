import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ex28.prog28;

import java.util.ArrayList;
import java.util.Arrays;

public class addingNumbersTest {
    @Test
    public void addNum() {
        prog28 add = new prog28();

        Integer[] testArray = new Integer[] {1, 2, 3, 4, 5};
        ArrayList<Integer> testList = new ArrayList(Arrays.asList(testArray));
        assertEquals(15, add.addNumber(testList));
    }
}
