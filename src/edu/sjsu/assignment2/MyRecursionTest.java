package edu.sjsu.assignment2;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRecursionTest {
    @Test
    public void indexOf(){
        assertEquals(6, MyRecursion.indexOf("Mississippi", "sip"));
        assertEquals(0, MyRecursion.indexOf("panda", "pan"));
        assertEquals(-1, MyRecursion.indexOf("Hello world", "wow"));
    }

}