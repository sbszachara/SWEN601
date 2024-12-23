package activities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SumTest {
    
    @Test
    public void create() {
        // setup - none

        //invoke
        Operation op = new Sum();

        //assert
        assertNotNull(op);
    }

    @Test
    public void matchesTrue() {
        //setup

        String operator = "+";
        Operation op = new Sum();

        //invoke
        boolean actual = op.matches(operator);

        //assert
        assertTrue(actual);
    }

    @Test
    public void matchesFalse() {
        //setup
        String operator = "-";
        Operation op = new Sum();

        //invoke
        boolean actual = op.matches(operator);

        //assert
        assertFalse(actual);
    }

    @Test
    public void operationZero() {
        //given an empty array of operands
        //operation should return zero
        //setup
        Operation op = new Sum();
        double [] operands = {};
        double expected = 0;

        //invoke
        double actual = op.operation(operands);

        //assert
        assertEquals(expected, actual, 0.000001d);
    }
    
    @Test
    public void operationOne() {
        //given an array of 1 value
        //setup
        Operation op = new Sum();
        double expected = 7.5;
        double [] operands = {7.5};

        //invoke
        double actual = op.operation(operands);

        //assert
        assertEquals(expected, actual, 0.000001d);
    }

    @Test
    public void operationThree() {
        //given an empty array of operands
        //operation should return zero
        //setup
        Operation op = new Sum();
        double expected = 15.5;
        double [] operands = {7.5, 5.7, 2.3};

        //invoke
        double actual = op.operation(operands);

        //assert
        assertEquals(expected, actual, 0.000001d);
    }


}
