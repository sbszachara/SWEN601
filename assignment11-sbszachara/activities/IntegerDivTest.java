package activities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class IntegerDivTest {
    
    @Test
    public void create() {
        //setup - none

        //invoke
        Operation op = new IntegerDiv();

        //assert
        assertNotNull(op);
    }

    @Test
    public void matchesTrue() {
        //setup
        String operator = "//";
        Operation op = new IntegerDiv();

        //invoke
        boolean actual = op.matches(operator);

        //assert
        assertTrue(actual);
    }

    @Test
    public void matchesFalse() {
        //setup
        String operator = "-";
        Operation op = new IntegerDiv();

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
        Operation op = new IntegerDiv();
        double [] operands = {};
        double expected = 0;

        //invoke
        double actual = op.operation(operands);

        //assert
        assertEquals(expected, actual, 0.000001d);
    }
    
    @Test
    public void operationOne() {
        //given one value in multiply
        //setup
        Operation op = new IntegerDiv();
        double expected = 7.5;
        double [] operands = {7.5};

        //invoke
        double actual = op.operation(operands);

        //assert
        assertEquals(expected, actual, 0.000001d);
    }

    @Test
    public void operationThreeWZero() {
       //given multiple values in multiply and a zero
        //setup
        Operation op = new IntegerDiv();
        double expected = 0;
        double [] operands = {7.5, 6.7, 0};

        //invoke
        double actual = op.operation(operands);

        //assert
        assertEquals(expected, actual, 0.000001d);
    }

    @Test
    public void operationTwo() {
       //given a value is 0 in multiple array
       Operation op = new IntegerDiv();
       double expected = 5;
       double [] operands = {7.5, 1.4};

       //invoke
       double actual = op.operation(operands);

       //assert
       assertEquals(expected, actual, 0.000001d);
    }

    @Test
    public void operationThree() {
        //given a value is 0 in multiple array
        Operation op = new IntegerDiv();
        double expected = 0;
        double [] operands = {7.5, -1.4, 3.5, 10.76};

        //invoke
        double actual = op.operation(operands);

        //assert
        assertEquals(expected, actual, 0.000001d);
    }

    @Test
    public void operationFour() {
        //given a value is 0 in multiple array
        Operation op = new IntegerDiv();
        double expected = 1;
        double [] operands = {1000.0, 23.54, 5.34, 4.23};

        //invoke
        double actual = op.operation(operands);

        //assert
        assertEquals(expected, actual, 0.000001d);
    }
}
