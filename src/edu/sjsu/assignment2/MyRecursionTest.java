package edu.sjsu.assignment2;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is a test class for the MyRecursion class.
 */
public class MyRecursionTest {
    /**
     * This is a test for the indexOf function in the MyRecursion class.
     */
    @Test
    public void indexOf(){
        assertEquals(6, MyRecursion.indexOf("Mississippi", "sip"));
        assertEquals(0, MyRecursion.indexOf("panda", "pan"));
        assertEquals(-1, MyRecursion.indexOf("Hello world", "wow"));
    }

}