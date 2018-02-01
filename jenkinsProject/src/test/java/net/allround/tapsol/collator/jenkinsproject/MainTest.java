
package net.allround.tapsol.collator.jenkinsproject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hegedusp
 */
public class MainTest {
    
//comment
    //new comment
    @Test
    public void testDivideGood() {
        assertEquals(0.5,Main.divide(1, 2),0);
    }
    
    @Test
    public void testDivideGood2() {
        assertEquals(1,Main.divide(1, 1),0);
    }
    
    @Test (expected = ArithmeticException.class)
    public void testDivideBad() {
        Main.divide(2,0);
    }
    
    @Test
    public void testAddGood(){
        assertEquals(2,Main.add(1, 1),0);
    }
    
}
