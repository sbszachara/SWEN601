package activities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class DifferenceTest {

    @Test
    public void create() {
        // setup - none

        //invoke
        Operation op = new Difference();

        //assert
        assertNotNull(op);
    }

    @Test
    public void matchesTrue() {
        //setup

        String operator = "-";
        Operation op = new Difference();

        //invoke
        boolean actual = op.matches(operator);

        //assert
        assertTrue(actual);
    }

    @Test
    public void matchesFalse() {
        //setup
        String operator = "+";
        Operation op = new Difference();

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
        Operation op = new Difference();
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
        Operation op = new Difference();
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
        Operation op = new Difference();
        double expected = -0.5;
        double [] operands = {7.5, 5.7, 2.3};

        //invoke
        double actual = op.operation(operands);

        //assert
        assertEquals(expected, actual, 0.000001d);
    }
    
}
