import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ex24.anagramChecker;

public class anagramCheckerTest {
    @Test
    public void testAnagram() {
        anagramChecker anagram = new anagramChecker();

        assertEquals(true, anagram.check("peek", "keep"));
        assertEquals(true, anagram.check("pEeK", "keep"));
        assertEquals(true, anagram.check("keep", "pEeK"));
        assertEquals(false, anagram.check("blue", "red"));
    }
}
