
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
    public void testDivideGood_2() {
        assertEquals(0.5,Main.divide(12.23,214.22),0);
    }
    
    @Test
    public void testDivideGood_3() {
        assertEquals(0.5,Main.divide(21312.23,2),0);
    }
    
    @Test
    public void testDivideGood_4() {
        assertEquals(0.5,Main.divide(999.23,23),0);
    }
    
    @Test
    public void testDivideGood_5() {
        assertEquals(0.5,Main.divide(992349.233,23),0);
    }
    
    @Test (expected = ArithmeticException.class)
    public void testDivideBad() {
        Main.divide(2,0);
    }
    
}
