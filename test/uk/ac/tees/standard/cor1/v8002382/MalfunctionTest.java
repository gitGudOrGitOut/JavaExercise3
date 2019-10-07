package uk.ac.tees.standard.cor1.v8002382;

import uk.ac.tees.standard.cor1.username.Malfunction;
import uk.ac.tees.standard.cor1.username.Severity;
import org.junit.Test;
import uk.ac.tees.standard.cor1.username.Malfunction;
import uk.ac.tees.standard.cor1.username.Malfunction;
import uk.ac.tees.standard.cor1.username.Malfunction;
import uk.ac.tees.standard.cor1.username.Severity;
import uk.ac.tees.standard.cor1.username.Severity;
import uk.ac.tees.standard.cor1.username.Severity;
import static org.junit.Assert.*;

/** A set of unit tests to check the Malfunction class.
 *
 * Based on work created by Mark Truran.
 */
public class MalfunctionTest {
    
    /**
     * No-args constructor.
     */
    public MalfunctionTest() {
    }

    /**
     * Testing constructor, should assign default description if null.
     */
    @Test
    public void testNullDescription() {
        final Malfunction m = new Malfunction(Severity.HIGH, null);
        final String expectedOutcome = "No description available. Probably serious.";
        final String actualOutcome = m.getDescription();
        assertEquals(expectedOutcome, actualOutcome);
    }

    /**
     * Testing constructor, should assign default description if empty string.
     */
    @Test
    public void testEmptyDescription() {
        final Malfunction m = new Malfunction(Severity.HIGH, "");
        final String expectedOutcome = "No description available. Probably serious.";
        final String actualOutcome = m.getDescription();
        assertEquals(expectedOutcome, actualOutcome);
    }
}
