package com.revature.simple01;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class TestMain {
    
    @Test
    public void testInputIsEven(){
        System.out.println("Executing test");
        assertTrue(Main.checkIfInputIsAnEvenNumber(22)); // Assertion
    }
}
