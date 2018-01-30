
package net.allround.tapsol.collator.jenkinsproject;

import org.junit.Test;
import static org.junit.Assert.*;
import net.allround.tapsol.collator.jenkinsproject.Main;

/**
 *
 * @author hegedusp
 */
public class MainTest {
    

    @Test
    public void testDivideGood() {
        assertEquals(0.5,Main.divide(1, 2),0);
    }
    
}
