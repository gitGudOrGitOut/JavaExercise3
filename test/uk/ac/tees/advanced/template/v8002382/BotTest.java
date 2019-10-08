package uk.ac.tees.advanced.template.v8002382;

import uk.ac.tees.advanced.template.v8002382.Bot;
import uk.ac.tees.advanced.template.v8002382.AerialBot;
import uk.ac.tees.advanced.template.v8002382.RadiationLevel;
import uk.ac.tees.advanced.template.v8002382.FileUtility;
import uk.ac.tees.advanced.template.v8002382.Environment;
import uk.ac.tees.advanced.template.v8002382.ScannerBot;
import uk.ac.tees.advanced.template.v8002382.DiggerBot;
import java.io.File;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/** Unit tests to test the solution to AJP-P3-ADVANCED, template method task.
 *
 * Based on work created by Mark Truran.
 */
public class BotTest {
    
    /**
     * No-args constructor.
     */
    public BotTest() {
    }

    /**
     * Testing all concrete Bot subclasses, no adverse environmental conditions.
     */
    @Test
    public void testBotSimple() {
        
        // Purge the log file
        FileUtility.resetFile(new File("log-advanced.txt"));
        
        // Create an empty collection
        ArrayList<Bot> bots = new ArrayList<Bot>();
        
        // Create some robots and add them to the collection
        bots.add(new DiggerBot("DB1"));
        bots.add(new ScannerBot("SC1"));
        bots.add(new AerialBot("AR1"));
        bots.add(new ScannerBot("SC2"));
        bots.add(new AerialBot("AR2"));
        bots.add(new DiggerBot("DB2"));
        
        // Iterate through collection, invoking template method
        for (Bot b : bots) {
            b.executeTask();
        }
        
        // Check  log file
        final String actualOutput = FileUtility.readFile(new File("log-advanced.txt"));
        final String expectedOutput = FileUtility.readFile(new File("expected-advanced.txt"));
        assertEquals(actualOutput, expectedOutput);
    }
    
    /**
     * Testing all concrete Bot subclasses, adverse environmental conditions.
     */
    @Test
    public void testBotComplex() {
        
        // Purge the log file
        FileUtility.resetFile(new File("log-advanced.txt"));
        
        // Create an empty collection
        ArrayList<Bot> bots = new ArrayList<Bot>();
        
        // Create some robots and add them to the collection
        bots.add(new DiggerBot("DB1"));
        bots.add(new ScannerBot("SC1"));
        bots.add(new AerialBot("AR1"));
        bots.add(new DiggerBot("DB1"));
        bots.add(new ScannerBot("SC1"));
        bots.add(new AerialBot("AR1"));
        
        // Change the environment
        Environment.setDustStorm(true);
        Environment.setRadiationLevel(RadiationLevel.CRITICAL);
        
        // Iterate through collection, invooking template method
        for (Bot b : bots) {
            b.executeTask();
        }
        
        // Restore environment
        Environment.setDustStorm(false);
        Environment.setRadiationLevel(RadiationLevel.LOW);
        
        // Check  log file
        final String actualOutput = FileUtility.readFile(new File("log-advanced.txt"));
        final String expectedOutput = FileUtility.readFile(new File("expected-advanced2.txt"));
        assertEquals(actualOutput, expectedOutput);
    }  
}
